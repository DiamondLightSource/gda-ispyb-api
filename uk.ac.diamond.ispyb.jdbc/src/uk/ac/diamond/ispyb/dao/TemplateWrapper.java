package uk.ac.diamond.ispyb.dao;

import java.beans.PropertyDescriptor;
import java.sql.SQLException;
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

class TemplateWrapper {
	private JdbcTemplate template;
	private String schema;

	public TemplateWrapper(JdbcTemplate template, String schema) {
		this.template = template;
		this.schema = schema;
	}

	Map<String, Object> callIspybForMap(String procedure, Object... params) {
		return template.queryForMap(buildQuery(procedure, params), params);
	}

	void updateIspyb(String procedure, Object... params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params);
		
        simpleJdbcCall.execute(in);
	}

	<T> List<T> callIspybForList(String procedure, Class<T> clazz, Object params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params);
		
		SqlReturnResultSet resultSet = new SqlReturnResultSet("output", new SingleColumnRowMapper<T>(clazz));
		simpleJdbcCall.addDeclaredParameter(resultSet);
        Object object = simpleJdbcCall.execute(in).get("output");
        
		return (List<T>) object;
	}

	<T> List<T> callIspybForListBeans(String procedure, Class<T> clazz, Object params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params);
		
		SqlReturnResultSet resultSet = new SqlReturnResultSet("output", new BeanPropertyRowMapper<>(clazz));
		simpleJdbcCall.addDeclaredParameter(resultSet);
        Object object = simpleJdbcCall.execute(in).get("output");
        
		return (List<T>) object;
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

	<T> T callIspybForAllRows(String procedure, ResultSetExtractor<T> extractor, Object... params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params);
		
		SqlReturnResultSet resultSet = new SqlReturnResultSet("output", extractor);
		simpleJdbcCall.addDeclaredParameter(resultSet);
        Object object = simpleJdbcCall.execute(in).get("output");
        
		return (T) object;
	}

	<T> Optional<T> callIspyb(String procedure, Function<String, T> converter, Object... params) {
		return convertEmptyToOption(() -> {
			SimpleJdbcCall simpleJdbcCall = createCall(procedure);
			MapSqlParameterSource in = createInParameters(params[0]);
			Map<String, Object> map = simpleJdbcCall.execute(in);
			
			Set<Entry<String,Object>> entrySet = map.entrySet();
			for (Entry<String,Object> entry : entrySet) {
				if (entry.getKey().contains("result")){
					List<Map<String,Object>> results = (List<Map<String, Object>>) entry.getValue();
					return converter.apply((String)results.get(0).values().iterator().next());
				}
			}
			
			return null;
		});
	}

	
	<T> Optional<T> callIspyb(String procedure, Class<T> clazz, Object... params) {
		return convertEmptyToOption(() -> {
			SimpleJdbcCall simpleJdbcCall = createCall(procedure);
			MapSqlParameterSource in = createInParameters(params[0]);
			Map<String, Object> map = simpleJdbcCall.execute(in);
			
			Set<Entry<String,Object>> entrySet = map.entrySet();
			for (Entry<String,Object> entry : entrySet) {
				if (entry.getKey().contains("result")){
					List<Map<String,Object>> results = (List<Map<String, Object>>) entry.getValue();
					return (T)results.get(0).values().iterator().next();
				}
			}
			for (Entry<String,Object> entry : entrySet) {
				if (!entry.getKey().contains("update")){
					return (T) entry.getValue();
				}
			}
			
			return null;
		});
	}

	void callIspyb(String procedure, Object... params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params[0]);
		simpleJdbcCall.executeObject(Void.class, in);
	}

	<T> Optional<T> callIspybForBean(String procedure, Class<T> clazz, Object... params) {
		return convertEmptyToOption(() -> {
			SimpleJdbcCall simpleJdbcCall = createCall(procedure);
			MapSqlParameterSource in = createInParameters(params[0]);
			Map<String, Object> map = simpleJdbcCall.execute(in);
			Set<Entry<String,Object>> entrySet = map.entrySet();
			for (Entry<String,Object> entry : entrySet) {
				if (entry.getKey().contains("result")){
					try{
						T instance = clazz.newInstance();
						BeanUtils.populate(instance, ((List<Map<String,Object>>)entry.getValue()).get(0));
						return instance;
					} catch (Exception e) {
					}
				}
			}
			return null;
		});
	}
	
	private <T> Optional<T> convertEmptyToOption(ErroringSupplier<T> supplier){
		try {
			return Optional.of(supplier.get());
		} catch (EmptyResultDataAccessException ex) {
			return Optional.empty();
		}
	}

	String buildQuery(String procedure, Object... params) {
		List<String> questionMarks = IntStream.rangeClosed(1, params.length).mapToObj((x) -> "?")
				.collect(Collectors.toList());
		String args = StringUtils.collectionToCommaDelimitedString(questionMarks);
		return String.format("CALL %s.%s(%s)", schema, procedure, args);
	}

	void closeConnection() throws SQLException {
		template.getDataSource().getConnection().close();
	}
}
