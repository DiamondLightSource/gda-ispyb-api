package uk.ac.diamond.ispyb.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;

public interface IspybApi {
	List<String> retrieveContainerLsPosition(String barcode) throws DataAccessException;

	String retrieveContainerInfo(String barcode) throws DataAccessException;

	String updateContainerLsPosition(String barcode, int position) throws DataAccessException;

	String updateContainerStatus(String barcode, int position) throws DataAccessException;

	String finishContainer(String barcode) throws DataAccessException;

	String retrieveContainerLsQueue(String barcode) throws DataAccessException;

	String retrieveContainerQueueTimestamp(String barcode) throws DataAccessException;

	String retrieveContainerSubsamples(String barcode) throws DataAccessException;

	String insertContainerError(String barcode, String error, int severity, String stackTrace) throws DataAccessException;

	String clearContainerError(String barcode) throws DataAccessException;

	String retrieveContainersSubmittedNonLs(String barcode) throws DataAccessException;

	void closeConnection() throws SQLException;
}