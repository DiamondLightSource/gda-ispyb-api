package uk.ac.diamond.ispyb.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.StringUtils;

import uk.ac.diamond.ispyb.api.IspybApi;

public class IspybDAO implements IspybApi{
	private JdbcTemplate template;

	public IspybDAO(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<String> retrieveContainerLsPosition(String barcode) throws DataAccessException{
		return callIspybForList("retrieve_container_ls_position", String.class, barcode);
	}

	@Override
	public String retrieveContainerInfo(String barcode) throws DataAccessException{
		return callIspyb("retrieve_container_info", String.class, barcode);
	}

	@Override
	public String updateContainerLsPosition(String barcode, int position) throws DataAccessException{
		return callIspyb("update_container_ls_position", String.class, barcode, position);
	}

	@Override
	public String updateContainerStatus(String barcode, int position) throws DataAccessException{
		return callIspyb("update_container_status", String.class, barcode, position);
	}

	@Override
	public String finishContainer(String barcode) throws DataAccessException{
		return callIspyb("finish_container", String.class, barcode);
	}

	@Override
	public String retrieveContainerLsQueue(String barcode) throws DataAccessException{
		return callIspyb("retrieve_container_ls_queue", String.class, barcode);
	}

	@Override
	public String retrieveContainerQueueTimestamp(String barcode) throws DataAccessException{
		return callIspyb("retrieve_container_queue_timestamp", String.class, barcode);
	}

	@Override
	public String retrieveContainerSubsamples(String barcode) throws DataAccessException{
		return callIspyb("retrieve_container_subsamples", String.class, barcode);
	}

	@Override
	public String insertContainerError(String barcode, String error, int severity, String stackTrace) throws DataAccessException{
		return callIspyb("insert_container_error", String.class, barcode, error, severity, stackTrace);
	}

	@Override
	public String clearContainerError(String barcode) throws DataAccessException{
		return callIspyb("clear_container_error", String.class, barcode);
	}

	@Override
	public String retrieveContainersSubmittedNonLs(String barcode) throws DataAccessException{
		return callIspyb("retrieve_containers_submitted_non_ls", String.class, barcode);
	}
	
	private <T> List<T> callIspybForList(String procedure, Class<T> clazz, Object... params){
		return template.queryForList(buildQuery(procedure, params), params, clazz);
	}

	private <T> T callIspyb(String procedure, Class<T> clazz, Object... params){
		return template.queryForObject(buildQuery(procedure, params), params, clazz);
	}

	private String buildQuery(String procedure, Object... params) {
		List<String> questionMarks = IntStream
			.rangeClosed(1, params.length)
			.mapToObj((x)-> "?")
			.collect(Collectors.toList());
		String args = StringUtils.collectionToCommaDelimitedString(questionMarks);
		return String.format("CALL ispyb.%s(%s)", procedure, args);
	}
	
	@Override
	public void closeConnection() throws SQLException{
		template.getDataSource().getConnection().close();
	}
}