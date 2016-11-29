package uk.ac.diamond.ispyb.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
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
		template.update(buildQuery(procedure, params), params);
	}

	<T> List<T> callIspybForList(String procedure, Class<T> clazz, Object... params) {
		return template.queryForList(buildQuery(procedure, params), params, clazz);
	}

	<T> List<T> callIspybForListBeans(String procedure, Class<T> clazz, Object... params) {
		return template.query(buildQuery(procedure, params), params, new BeanPropertyRowMapper<>(clazz));
	}

	<T> T callIspybForAllRows(String procedure, ResultSetExtractor<T> extractor, Object... params) {
		return template.query(buildQuery(procedure, params), params, extractor);
	}

	<T> Optional<T> callIspyb(String procedure, Class<T> clazz, Object... params) {
		return convertEmptyToOption(() -> 
			template.queryForObject(buildQuery(procedure, params), params, clazz)
		);
	}

	<T> Optional<T> callIspybForBean(String procedure, Class<T> clazz, Object... params) {
		return convertEmptyToOption(() -> 
			template.queryForObject(buildQuery(procedure, params), params, new BeanPropertyRowMapper<>(clazz))
		);
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
