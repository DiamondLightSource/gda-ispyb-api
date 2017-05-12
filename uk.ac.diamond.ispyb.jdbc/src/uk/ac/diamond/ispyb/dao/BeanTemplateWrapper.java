/*-
 *******************************************************************************
 * Copyright (c) 2011, 2016 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    See git history
 *******************************************************************************/
package uk.ac.diamond.ispyb.dao;

import java.beans.PropertyDescriptor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class BeanTemplateWrapper {
	private TemplateWrapper templateWrapper;
	private ResultMapParser parser;

	public BeanTemplateWrapper(TemplateWrapper templateWrapper, ResultMapParser parser){
		this.templateWrapper = templateWrapper;
		this.parser = parser;
	}
	
	public void updateIspyb(String procedure, Object bean) {
		templateWrapper.updateIspyb(procedure, convertToMap(bean));
	}

	<T> List<T> callIspybForList(String procedure, Class<T> clazz, Object bean) {
		return templateWrapper.callIspybForList(procedure, clazz, convertToMap(bean));
	}
	
	@SuppressWarnings("unchecked")
	<T> Optional<T> callIspybForKey(String procedure, Class<T> clazz, Object bean, String key) {
		Map<String, Object> map = execute(procedure, bean);
		if (!map.containsKey(key) || map.get(key) == null){
			String message = "could not return parameter " + key + " from map with keys" + map.keySet();
			throw new UnsupportedOperationException(message);
		}
		return Optional.of((T) map.get(key));
	}

	<T> Optional<T> callIspyb(String procedure, Class<T> clazz, Object bean) {
		Map<String, Object> map = execute(procedure, bean);
		List<T> list = parser.parse(map, templateWrapper::firstValue);
		return list.isEmpty() ? Optional.empty() : Optional.of(list.get(0));
	}
	
	<T> Optional<T> callIspybForBean(String procedure, Class<T> clazz, Object params) {
		Map<String, Object> map = execute(procedure, params);
		List<T> list = parser.parse(map, new MapToBeanFunction<T>(clazz));
		return list.isEmpty() ? Optional.empty() : Optional.of(list.get(0));
	}
	
	void callIspyb(String procedure, Object bean) {
		templateWrapper.callIspyb(procedure, convertToMap(bean));
	}
	
	<T> List<T> callIspybForListBeans(String procedure, Class<T> clazz, Object bean) {
		SimpleJdbcCall simpleJdbcCall = templateWrapper.createCall(procedure);
		MapSqlParameterSource in = createInParameters(bean);
		
		return parser.parse(simpleJdbcCall.execute(in), new MapToBeanFunction<T>(clazz));
	}
	
	private Map<String, Object> execute(String procedure, Object bean) {
		SimpleJdbcCall simpleJdbcCall = templateWrapper.createCall(procedure);
		MapSqlParameterSource in = createInParameters(bean);
		return simpleJdbcCall.execute(in);
	}
	
	private MapSqlParameterSource createInParameters(Object bean) {
		MapSqlParameterSource in = new MapSqlParameterSource();
		BeanWrapper wrapper = PropertyAccessorFactory.forBeanPropertyAccess(bean);
        for (PropertyDescriptor propertyDescriptor : wrapper.getPropertyDescriptors()) {
        	if (!"class".equals(propertyDescriptor.getName())){
           		in.addValue("p_" + propertyDescriptor.getName(), wrapper.getPropertyValue(propertyDescriptor.getName()));        		
        	}
		}
		return in;
	}

	private Map<String, Object> convertToMap(Object bean) {
		BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(bean);
		return Arrays.asList(beanWrapper.getPropertyDescriptors())
			.stream()
			.filter(propertyDescriptor -> !"class".equals(propertyDescriptor.getName()))
			.collect(
					HashMap::new, 
					(m,p) -> m.put(p.getName(), beanWrapper.getPropertyValue(p.getName())), 
					HashMap::putAll
				);
	}
	
}
