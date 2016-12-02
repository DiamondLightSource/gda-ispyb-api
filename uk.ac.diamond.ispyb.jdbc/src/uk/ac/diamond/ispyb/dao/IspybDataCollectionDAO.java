package uk.ac.diamond.ispyb.dao;

import java.io.IOException;
import java.sql.SQLException;

import uk.ac.diamond.ispyb.api.DataCollectionExperiment;
import uk.ac.diamond.ispyb.api.DataCollectionGroup;
import uk.ac.diamond.ispyb.api.DataCollectionMachine;
import uk.ac.diamond.ispyb.api.DataCollectionMain;
import uk.ac.diamond.ispyb.api.IspybDataCollectionApi;

public class IspybDataCollectionDAO implements IspybDataCollectionApi {

	private TemplateWrapper templateWrapper;

	public IspybDataCollectionDAO(TemplateWrapper templateWrapper) {
		this.templateWrapper = templateWrapper;
	}

	@Override
	public long upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup) {
		return templateWrapper.callIspyb("upsert_dc_group", Long.class, dataCollectionGroup).get();
	}

	@Override
	public long upsertDataCollectionMain(DataCollectionMain dataCollectionMain) {
		return templateWrapper.callIspyb("upsert_dc_main", Long.class, dataCollectionMain).get();
	}

	@Override
	public void updateDataCollectionExperiment(DataCollectionExperiment dataCollectionExperiment) {
		templateWrapper.callIspyb("update_dc_experiment", dataCollectionExperiment);
	}

	@Override
	public void updateDataCollectionMachine(DataCollectionMachine dataCollectionMachine) {
		templateWrapper.callIspyb("update_dc_machine", dataCollectionMachine);
	}

	@Override
	public void close() throws IOException {
		try {
			templateWrapper.closeConnection();
		} catch (SQLException e) {
			throw new IOException(e);
		}
	}

}
