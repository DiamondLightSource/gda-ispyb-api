package uk.ac.diamond.ispyb.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import uk.ac.diamond.ispyb.api.DataCollectionPlanInfo;
import uk.ac.diamond.ispyb.api.IspybPdfApi;
import uk.ac.diamond.ispyb.api.Schema;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.StringUtils;


public class IspybPdfDAO implements IspybPdfApi {
	private JdbcTemplate template;
	private Schema schema;

	public IspybPdfDAO(JdbcTemplate template, Schema schema) {
		this.template = template;
		this.schema = schema;
	}

	@Override
	public List<Integer> retrieveDcPlanGroups(String session) throws DataAccessException {
		return callIspybForList("retrieve_dc_plan_groups", Integer.class, session);
	}

	@Override
	public List<DataCollectionPlanInfo> retrieveDcPlanInfo(int id) throws DataAccessException {
		return callIspybForListBeans("retrieve_dc_plan_info", DataCollectionPlanInfo.class, id);
	}
	
	private <T> List<T> callIspybForListBeans(String procedure, Class<T> clazz, Object... params) {
		return template.query(buildQuery(procedure, params), params, new BeanPropertyRowMapper<>(clazz));
	}
	
	private <T> List<T> callIspybForList(String procedure, Class<T> clazz, Object... params) {
		return template.queryForList(buildQuery(procedure, params), params, clazz);
	}

	private String buildQuery(String procedure, Object... params) {
		List<String> questionMarks = IntStream
				.rangeClosed(1, params.length).mapToObj((x) -> "?")
				.collect(Collectors.toList());
		String args = StringUtils.collectionToCommaDelimitedString(questionMarks);
		return String.format("CALL %s.%s(%s)", schema, procedure, args);
	}
	
	@Override
	public void closeConnection() throws SQLException {
		template.getDataSource().getConnection().close();
	}
}
