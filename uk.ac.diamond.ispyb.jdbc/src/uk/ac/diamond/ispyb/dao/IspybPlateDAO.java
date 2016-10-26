package uk.ac.diamond.ispyb.dao;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import uk.ac.diamond.ispyb.api.ContainerInfo;
import uk.ac.diamond.ispyb.api.ContainerLSQueueEntry;
import uk.ac.diamond.ispyb.api.ContainerStatus;
import uk.ac.diamond.ispyb.api.ContainerSubsample;
import uk.ac.diamond.ispyb.api.IspybPlateApi;

public class IspybPlateDAO implements IspybPlateApi{
	private final TemplateWrapper templateWrapper;

	public IspybPlateDAO(TemplateWrapper templateWrapper) {
		this.templateWrapper = templateWrapper;
	}

	@Override
	public int retrieveContainerLSPosition(String barcode) throws SQLException {
		List<Long> list = templateWrapper.callIspybForList("retrieve_container_ls_position", Long.class, barcode);
		if (list.size() > 0) {
			return list.get(0).intValue();
		}
		return -1;
	}

	@Override
	public ContainerInfo retrieveContainerInfo(String barcode) throws SQLException {
		return templateWrapper.callIspybForBean("retrieve_container_info", ContainerInfo.class, barcode);
	}

	@Override
	public void updateContainerLSPosition(String barcode, int position) throws SQLException {
		templateWrapper.updateIspyb("update_container_ls_position", barcode, position);
	}

	@Override
	public void updateContainerStatus(String barcode, ContainerStatus status) throws SQLException {
		templateWrapper.updateIspyb("update_container_status", barcode, status.getStatus());
	}

	@Override
	public void finishContainer(String barcode) throws SQLException {
		templateWrapper.updateIspyb("finish_container", barcode);
	}

	@Override
	public List<ContainerLSQueueEntry> retrieveContainerLSQueue(String beamline) throws SQLException {
		return templateWrapper.callIspybForListBeans("retrieve_container_ls_queue", ContainerLSQueueEntry.class, beamline);
	}

	@Override
	public Date retrieveContainerQueueTimestamp(String barcode) throws SQLException {
		return templateWrapper.callIspyb("retrieve_container_queue_timestamp", Timestamp.class, barcode);
	}

	@Override
	public List<ContainerSubsample> retrieveContainerSubsamples(String barcode) throws SQLException {
		return templateWrapper.callIspybForListBeans("retrieve_container_subsamples", ContainerSubsample.class, barcode);
	}

	@Override
	public void insertContainerError(String barcode, String error, int severity, String stackTrace) throws SQLException {
		templateWrapper.updateIspyb("insert_container_error", barcode, error, severity, stackTrace);
	}

	@Override
	public void clearContainerError(String barcode) throws SQLException {
		templateWrapper.callIspybForList("clear_container_error", String.class, barcode);
	}

//  TODO: not a store procedure yet
//	@Override
//	public String retrieveContainersSubmittedNonLs(String barcode) throws 	DataAccessException {
//		return callIspyb("retrieve_containers_submitted_non_ls", String.class, barcode);
//	}

	@Override
	public Map<String, Object>  retrieveTest() throws SQLException {
		return templateWrapper.callIspybForMap("retrieve_test");
	}

	@Override
	public void closeConnection() throws SQLException {
		templateWrapper.closeConnection();
	}
}
