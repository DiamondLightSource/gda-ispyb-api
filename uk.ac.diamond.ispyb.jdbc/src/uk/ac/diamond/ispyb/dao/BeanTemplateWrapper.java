package uk.ac.diamond.ispyb.dao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;

public class BeanTemplateWrapper {
	private TemplateWrapper templateWrapper;

	public BeanTemplateWrapper(TemplateWrapper templateWrapper){
		this.templateWrapper = templateWrapper;
	}
	
	public void updateIspyb(String procedure, Object bean) {
		templateWrapper.updateIspyb(procedure, convertToMap(bean));
	}

	<T> List<T> callIspybForList(String procedure, Class<T> clazz, Object bean) {
		return templateWrapper.callIspybForList(procedure, clazz, convertToMap(bean));
	}
	
	void callIspyb(String procedure, Object bean) {
		templateWrapper.callIspyb(procedure, convertToMap(bean));
	}

	private Map<String, Object> convertToMap(Object bean) {
		BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(bean);
		return Arrays.asList(beanWrapper.getPropertyDescriptors())
			.stream()
			.filter(propertyDescriptor -> !propertyDescriptor.getName().equals("class"))
			.collect(
					HashMap::new, 
					(m,p) -> m.put(p.getName(), beanWrapper.getPropertyValue(p.getName())), 
					HashMap::putAll
				);
	}
	
}
