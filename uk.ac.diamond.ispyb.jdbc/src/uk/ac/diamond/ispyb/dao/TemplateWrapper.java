package uk.ac.diamond.ispyb.dao;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.util.StringUtils;

public class TemplateWrapper {
	private JdbcTemplate template;
	private String schema;
	private ResultMapParser parser;

	public TemplateWrapper(JdbcTemplate template, String schema, ResultMapParser parser) {
		this.template = template;
		this.schema = schema;
		this.parser = parser;
	}

	public void updateIspyb(String procedure, Map<String, Object> params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params);
		
        simpleJdbcCall.execute(in);
	}

	<T> List<T> callIspybForList(String procedure, Class<T> clazz, Map<String, Object> params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params);
		
		return parser.parse(simpleJdbcCall.execute(in), this::firstValue);
	}
	
	<T> List<T> callIspybForListBeans(String procedure, Class<T> clazz, Object params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params);
		
		return parser.parse(simpleJdbcCall.execute(in), beanFromMap(clazz));
	}

	<T> List<T> callIspybForListBeans(String procedure, Class<T> clazz, Map<String, Object> params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params);
		
		return parser.parse(simpleJdbcCall.execute(in), beanFromMap(clazz));
	}
	
	<T> T callIspybForAllRows(String procedure, ResultSetExtractor<T> extractor, Map<String, Object> params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params);
		
		SqlReturnResultSet resultSet = new SqlReturnResultSet("output", extractor);
		simpleJdbcCall.addDeclaredParameter(resultSet);
        Object object = simpleJdbcCall.execute(in).get("output");
        
		return (T) object;
	}
	
	<T> Optional<T> callIspyb(String procedure, Class<T> clazz, Object params) {
		Map<String, Object> map = execute(procedure, params);
		List<T> list = parser.parse(map, this::firstValue);
		return list.isEmpty() ? Optional.empty() : Optional.of(list.get(0));
	}

	<T> Optional<T> callIspyb(String procedure, Class<T> clazz, Map<String, Object> params) {
		Map<String, Object> map = execute(procedure, params);
		List<T> list = parser.parse(map, this::firstValue);
		return list.isEmpty() ? Optional.empty() : Optional.of(list.get(0));
	}
	
	<T> Optional<T> callIspybForBean(String procedure, Class<T> clazz, Object params) {
		Map<String, Object> map = execute(procedure, params);
		List<T> list = parser.parse(map, beanFromMap(clazz));
		return list.isEmpty() ? Optional.empty() : Optional.of(list.get(0));
	}

	<T> Optional<T> callIspybForBean(String procedure, Class<T> clazz, Map<String, Object> params) {
		Map<String, Object> map = execute(procedure, params);
		List<T> list = parser.parse(map, beanFromMap(clazz));
		return list.isEmpty() ? Optional.empty() : Optional.of(list.get(0));
	}
	
	void callIspyb(String procedure, Map<String, Object> params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params);
		simpleJdbcCall.executeObject(Void.class, in);
	}

	private Map<String, Object> execute(String procedure, Object params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params);
		Map<String, Object> map = simpleJdbcCall.execute(in);
		return map;
	}

	private Map<String, Object> execute(String procedure, Map<String, Object> params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params);
		Map<String, Object> map = simpleJdbcCall.execute(in);
		return map;
	}
	
	private MapSqlParameterSource createInParameters(Map<String, Object> params) {
		MapSqlParameterSource in = new MapSqlParameterSource();
		for (String key: params.keySet()){
       		in.addValue("p_" + key, params.get(key));        		
		}
		return in;
	}
	
	private MapSqlParameterSource createInParameters(Object params) {
		MapSqlParameterSource in = new MapSqlParameterSource();
		BeanWrapper wrapper = PropertyAccessorFactory.forBeanPropertyAccess(params);
        for (PropertyDescriptor propertyDescriptor : wrapper.getPropertyDescriptors()) {
        	if (!propertyDescriptor.getName().equals("class")){
           		in.addValue("p_" + propertyDescriptor.getName(), wrapper.getPropertyValue(propertyDescriptor.getName()));        		
        	}
		}
		return in;
	}

	private SimpleJdbcCall createCall(String procedure) {
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(template.getDataSource())
			.withProcedureName(procedure)
			.withSchemaName(schema);
		return simpleJdbcCall;
	}
	
	private <T> Optional<T> convertEmptyToOption(ErroringSupplier<T> supplier){
		try {
			return Optional.of(supplier.get());
		} catch (EmptyResultDataAccessException ex) {
			return Optional.empty();
		}
	}
	
	private <T> Function<Map<String,Object>, T> beanFromMap(Class<T> beanClass){
		return map -> {
			try{
				T bean = beanClass.newInstance();
				BeanUtils.populate(bean, map);
				return bean;
			} catch (InstantiationException | IllegalAccessException | InvocationTargetException ex){
				return null;
			}
		};
	}
	
	@SuppressWarnings("unchecked")
	private <T> T firstValue(Map<String, Object> map){
		return (T) map.values().iterator().next();
	}

	void closeConnection() throws SQLException {
		template.getDataSource().getConnection().close();
	}
}
