package uk.ac.diamond.ispyb.api;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface IspybApi {
	int retrieveContainerLSPosition(String barcode) throws DataAccessException;

	ContainerInfo retrieveContainerInfo(String barcode) throws DataAccessException;

	void updateContainerLSPosition(String barcode, int position) throws DataAccessException;

	void updateContainerStatus(String barcode, ContainerStatus status) throws DataAccessException;

	void finishContainer(String barcode) throws DataAccessException;

	List<ContainerLSQueueEntry> retrieveContainerLSQueue(String beamline) throws DataAccessException;

	Date retrieveContainerQueueTimestamp(String barcode) throws DataAccessException;

	List<ContainerSubsample> retrieveContainerSubsamples(String barcode) throws DataAccessException;

	void insertContainerError(String barcode, String error, int severity, String stackTrace) throws DataAccessException;

	void clearContainerError(String barcode) throws DataAccessException;

	// TODO not a stored procedure yet
//	String retrieveContainersSubmittedNonLs(String barcode) throws DataAccessException;

	public Map<String, Object> retrieveTest() throws DataAccessException;

	void closeConnection() throws SQLException;
}
