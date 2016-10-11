package uk.ac.diamond.ispyb.api;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface IspybApi {
	List<String> retrieveContainerLsPosition(String barcode) throws DataAccessException;

	Map<String, Object> retrieveContainerInfo(String barcode) throws DataAccessException;

	// TODO do this return anything?
	String updateContainerLsPosition(String barcode, int position) throws DataAccessException;

	// TODO do this return anything?
	String updateContainerStatus(String barcode, int position) throws DataAccessException;

	// TODO do this return anything?
	String finishContainer(String barcode) throws DataAccessException;

	Map<String, Object> retrieveContainerLsQueue(String barcode) throws DataAccessException;

	String retrieveContainerQueueTimestamp(String barcode) throws DataAccessException;

	Map<String, Object> retrieveContainerSubsamples(String barcode) throws DataAccessException;

	// TODO do this return anything?
	String insertContainerError(String barcode, String error, int severity, String stackTrace) throws DataAccessException;

	// TODO do this return anything?
	String clearContainerError(String barcode) throws DataAccessException;

	// TODO not a stored procedure yet
//	String retrieveContainersSubmittedNonLs(String barcode) throws DataAccessException;

	void closeConnection() throws SQLException;
}