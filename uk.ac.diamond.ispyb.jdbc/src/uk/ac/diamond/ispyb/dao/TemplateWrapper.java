package uk.ac.diamond.ispyb.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import uk.ac.diamond.ispyb.api.Schema;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.StringUtils;

class TemplateWrapper {
	private JdbcTemplate template;
	private Schema schema;

	public TemplateWrapper(JdbcTemplate template, Schema schema) {
		this.template = template;
		this.schema = schema;
	}
	
	Map<String, Object> callIspybForMap(String procedure, Object... params) {
		return template.queryForMap(buildQuery(procedure, params), params);
	}

	void updateIspyb(String procedure, Object... params) {
		template.update(buildQuery(procedure, params), params);
	}

	<T> List<T> callIspybForList(String procedure, Class<T> clazz, Object... params) {
		return template.queryForList(buildQuery(procedure, params), params, clazz);
	}

	<T> List<T> callIspybForListBeans(String procedure, Class<T> clazz, Object... params) {
		return template.query(buildQuery(procedure, params), params, new BeanPropertyRowMapper<>(clazz));
	}

	<T> T callIspyb(String procedure, Class<T> clazz, Object... params) {
		return template.queryForObject(buildQuery(procedure, params), params, clazz);
	}

	<T> T callIspybForBean(String procedure, Class<T> clazz, Object... params) {
		return template.queryForObject(buildQuery(procedure, params), params, new BeanPropertyRowMapper<>(clazz));
	}

	String buildQuery(String procedure, Object... params) {
		List<String> questionMarks = IntStream
				.rangeClosed(1, params.length).mapToObj((x) -> "?")
				.collect(Collectors.toList());
		String args = StringUtils.collectionToCommaDelimitedString(questionMarks);
		return String.format("CALL %s.%s(%s)", schema, procedure, args);
	}

	void closeConnection() throws SQLException {
		template.getDataSource().getConnection().close();
	}
}
