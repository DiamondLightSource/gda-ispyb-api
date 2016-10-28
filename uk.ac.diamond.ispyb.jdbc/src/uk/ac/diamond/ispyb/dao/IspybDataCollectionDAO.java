package uk.ac.diamond.ispyb.dao;

import java.sql.SQLException;

import uk.ac.diamond.ispyb.api.DataCollection;
import uk.ac.diamond.ispyb.api.DataCollectionGroup;
import uk.ac.diamond.ispyb.api.IspybDataCollectionApi;

public class IspybDataCollectionDAO implements IspybDataCollectionApi {

	private TemplateWrapper templateWrapper;

	public IspybDataCollectionDAO(TemplateWrapper templateWrapper) {
		this.templateWrapper = templateWrapper;
	}

	@Override
	public int upsertDataCollection(DataCollection dataCollection) {
		return templateWrapper.callIspyb("upsert_dc", Integer.class, dataCollection.getParameters());
	}

	@Override
	public int upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DataCollection retrieveDataCollectionForSubsample(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeConnection() throws SQLException {
		templateWrapper.closeConnection();
	}

	
}
