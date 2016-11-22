package uk.ac.diamond.ispyb.dao;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import uk.ac.diamond.ispyb.api.DataCollectionPlanInfo;
import uk.ac.diamond.ispyb.api.IspybPdfApi;

public class IspybPdfDAO implements IspybPdfApi {
	private final TemplateWrapper templateWrapper;

	public IspybPdfDAO(TemplateWrapper templateWrapper) {
		this.templateWrapper = templateWrapper;
	}

	@Override
	public List<Integer> retrieveDcPlanGroups(String session) throws SQLException {
		return templateWrapper.callIspybForList("retrieve_dc_plan_groups", Integer.class, session);
	}

	@Override
	public Collection<DataCollectionPlanInfo> retrieveDcPlanInfo(int id) throws SQLException {
		return templateWrapper.callIspybForAllRows("retrieve_dc_plan_info", new DataCollectionPlanInfoListExtractor(), id);
	}
	
	@Override
	public void closeConnection() throws SQLException {
		templateWrapper.closeConnection();
	}
}
