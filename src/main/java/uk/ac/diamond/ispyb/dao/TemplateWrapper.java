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

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

	<T> List<T> callIspybForListBeans(String procedure, Class<T> clazz, Map<String, Object> params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params);

		return parser.parse(simpleJdbcCall.execute(in), new MapToBeanFunction<T>(clazz));
	}

	<T> T callIspybForAllRows(String procedure, ResultSetExtractor<T> extractor, Map<String, Object> params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params);

		SqlReturnResultSet resultSet = new SqlReturnResultSet("output", extractor);
		simpleJdbcCall.addDeclaredParameter(resultSet);
        Object object = simpleJdbcCall.execute(in).get("output");

		return (T) object;
	}


	<T> Optional<T> callIspyb(String procedure, Class<T> clazz, Map<String, Object> params) {
		Map<String, Object> map = execute(procedure, params);
		List<T> list = parser.parse(map, this::firstValue);
		return list.isEmpty() ? Optional.empty() : Optional.of(list.get(0));
	}

	<T> Optional<T> callIspybFunction(String function, Class<T> clazz, Map<String, Object> params) {
		Map<String, Object> map = executeFunction(function, params);
		List<T> list = parser.parse(map, this::firstValue);
		return list.isEmpty() ? Optional.empty() : Optional.of(list.get(0));
	}

	<T> Optional<T> callIspybForBean(String procedure, Class<T> clazz, Map<String, Object> params) {
		Map<String, Object> map = execute(procedure, params);
		List<T> list = parser.parse(map, new MapToBeanFunction<T>(clazz));
		return list.isEmpty() ? Optional.empty() : Optional.of(list.get(0));
	}

	void callIspyb(String procedure, Map<String, Object> params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params);
		simpleJdbcCall.executeObject(Void.class, in);
	}

	private Map<String, Object> execute(String procedure, Map<String, Object> params) {
		SimpleJdbcCall simpleJdbcCall = createCall(procedure);
		MapSqlParameterSource in = createInParameters(params);
		return simpleJdbcCall.execute(in);
	}

	private Map<String, Object> executeFunction(String function, Map<String, Object> params) {
		SimpleJdbcCall simpleJdbcCall = createCall(function);
		MapSqlParameterSource in = createInParameters(params);
		return simpleJdbcCall.withoutProcedureColumnMetaDataAccess().execute(in);
	}

	private MapSqlParameterSource createInParameters(Map<String, Object> params) {
		MapSqlParameterSource in = new MapSqlParameterSource();
		if (params != null)
			for (String key: params.keySet()){
       		in.addValue("p_" + key, params.get(key));
			}
		return in;
	}

	SimpleJdbcCall createCall(String procedure) {
		return new SimpleJdbcCall(template)
			.withProcedureName(procedure)
			.withCatalogName(schema);
	}

	@SuppressWarnings("unchecked")
	<T> T firstValue(Map<String, Object> map){
		return (T) map.values().iterator().next();
	}

	void closeConnection() throws SQLException {
		template.getDataSource().getConnection().close();
	}

	boolean connected(){
		try{
			return template.getDataSource().getConnection().isValid(1);
		} catch (SQLException e){
			return false;
		}
	}
}
