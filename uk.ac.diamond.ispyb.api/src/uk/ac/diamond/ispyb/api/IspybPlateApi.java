package uk.ac.diamond.ispyb.api;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface IspybPlateApi {
	int retrieveContainerLSPosition(String barcode) throws SQLException;

	ContainerInfo retrieveContainerInfo(String barcode) throws SQLException;

	void updateContainerLSPosition(String barcode, int position) throws SQLException;

	void updateContainerStatus(String barcode, ContainerStatus status) throws SQLException;

	void finishContainer(String barcode) throws SQLException;

	List<ContainerLSQueueEntry> retrieveContainerLSQueue(String beamline) throws SQLException;

	Date retrieveContainerQueueTimestamp(String barcode) throws SQLException;

	List<ContainerSubsample> retrieveContainerSubsamples(String barcode) throws SQLException;

	void insertContainerError(String barcode, String error, int severity, String stackTrace) throws SQLException;

	void clearContainerError(String barcode) throws SQLException;

	public Map<String, Object> retrieveTest() throws SQLException;

	void closeConnection() throws SQLException;
}
