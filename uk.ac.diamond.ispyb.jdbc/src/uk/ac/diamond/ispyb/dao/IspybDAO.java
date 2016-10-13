package uk.ac.diamond.ispyb.dao;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.StringUtils;

import uk.ac.diamond.ispyb.api.ContainerInfo;
import uk.ac.diamond.ispyb.api.ContainerLSQueueEntry;
import uk.ac.diamond.ispyb.api.ContainerStatus;
import uk.ac.diamond.ispyb.api.ContainerSubsample;
import uk.ac.diamond.ispyb.api.IspybApi;
import uk.ac.diamond.ispyb.api.Schema;

public class IspybDAO implements IspybApi{
	private JdbcTemplate template;
	private Schema schema;

	public IspybDAO(JdbcTemplate template, Schema schema) {
		this.template = template;
		this.schema = schema;
	}

	@Override
	public int retrieveContainerLSPosition(String barcode) throws DataAccessException {
		List<Long> list = callIspybForList("retrieve_container_ls_position", Long.class, barcode);
		if (list.size() > 0) {
			return list.get(0).intValue();
		}
		return -1;
	}

	@Override
	public ContainerInfo retrieveContainerInfo(String barcode) throws DataAccessException {
		return callIspybForBean("retrieve_container_info", ContainerInfo.class, barcode);
	}

	@Override
	public void updateContainerLSPosition(String barcode, int position) throws DataAccessException {
		updateIspyb("update_container_ls_position", barcode, position);
	}

	@Override
	public void updateContainerStatus(String barcode, ContainerStatus status) throws DataAccessException {
		updateIspyb("update_container_status", barcode, status.getStatus());
	}

	@Override
	public void finishContainer(String barcode) throws DataAccessException {
		updateIspyb("finish_container", barcode);
	}

	@Override
	public List<ContainerLSQueueEntry> retrieveContainerLSQueue(String beamline) throws DataAccessException {
		return callIspybForListBeans("retrieve_container_ls_queue", ContainerLSQueueEntry.class, beamline);
	}

	@Override
	public Date retrieveContainerQueueTimestamp(String barcode) throws DataAccessException {
		return callIspyb("retrieve_container_queue_timestamp", Timestamp.class, barcode);
	}

	@Override
	public List<ContainerSubsample> retrieveContainerSubsamples(String barcode) throws DataAccessException {
		return callIspybForListBeans("retrieve_container_subsamples", ContainerSubsample.class, barcode);
	}

	@Override
	public void insertContainerError(String barcode, String error, int severity, String stackTrace) throws DataAccessException {
		updateIspyb("insert_container_error", barcode, error, severity, stackTrace);
	}

	@Override
	public void clearContainerError(String barcode) throws DataAccessException {
		callIspybForList("clear_container_error", String.class, barcode);
	}

//  TODO: not a store procedure yet
//	@Override
//	public String retrieveContainersSubmittedNonLs(String barcode) throws 	DataAccessException {
//		return callIspyb("retrieve_containers_submitted_non_ls", String.class, barcode);
//	}

	@Override
	public Map<String, Object>  retrieveTest() throws DataAccessException {
		return callIspybForMap("retrieve_test");
	}

	private Map<String, Object> callIspybForMap(String procedure, Object... params) {
		return template.queryForMap(buildQuery(procedure, params), params);
	}

	private void updateIspyb(String procedure, Object... params) {
		template.update(buildQuery(procedure, params), params);
	}

	private <T> List<T> callIspybForList(String procedure, Class<T> clazz, Object... params) {
		return template.queryForList(buildQuery(procedure, params), params, clazz);
	}

	private <T> List<T> callIspybForListBeans(String procedure, Class<T> clazz, Object... params) {
		return template.query(buildQuery(procedure, params), params, new BeanPropertyRowMapper<>(clazz));
	}

	private <T> T callIspyb(String procedure, Class<T> clazz, Object... params) {
		return template.queryForObject(buildQuery(procedure, params), params, clazz);
	}

	private <T> T callIspybForBean(String procedure, Class<T> clazz, Object... params) {
		return template.queryForObject(buildQuery(procedure, params), params, new BeanPropertyRowMapper<>(clazz));
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
