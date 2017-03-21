package uk.ac.diamond.ispyb.dao;

import java.io.IOException;
import java.sql.SQLException;

import uk.ac.diamond.ispyb.api.DataCollectionExperiment;
import uk.ac.diamond.ispyb.api.DataCollectionGroup;
import uk.ac.diamond.ispyb.api.DataCollectionGroupGrid;
import uk.ac.diamond.ispyb.api.DataCollectionMachine;
import uk.ac.diamond.ispyb.api.DataCollectionMain;
import uk.ac.diamond.ispyb.api.BeamlineAction;
import uk.ac.diamond.ispyb.api.IspybDataCollectionApi;

public class IspybDataCollectionDAO implements IspybDataCollectionApi {

	private TemplateWrapper templateWrapper;
	private BeanTemplateWrapper beanTemplateWrapper;

	public IspybDataCollectionDAO(TemplateWrapper templateWrapper, BeanTemplateWrapper beanTemplateWrapper) {
		this.templateWrapper = templateWrapper;
		this.beanTemplateWrapper = beanTemplateWrapper;
	}

	@Override
	public Long upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup) {
		return beanTemplateWrapper.callIspybForKey("upsert_dc_group", Long.class, dataCollectionGroup, "p_id").get();
	}

	@Override
	public Long upsertDataCollectionMain(DataCollectionMain dataCollectionMain) {
		return beanTemplateWrapper.callIspybForKey("upsert_dc_main", Long.class, dataCollectionMain, "p_id").get();
	}

	@Override
	public void updateDataCollectionExperiment(DataCollectionExperiment dataCollectionExperiment) {
		beanTemplateWrapper.callIspyb("update_dc_experiment", dataCollectionExperiment);
	}

	@Override
	public void updateDataCollectionMachine(DataCollectionMachine dataCollectionMachine) {
		beanTemplateWrapper.callIspyb("update_dc_machine", dataCollectionMachine);
	}

	@Override
	public Long upsertDataCollectionGroupGrid(DataCollectionGroupGrid dataCollectionGroupGrid) {
		return beanTemplateWrapper.callIspybForKey("upsert_dcg_grid", Long.class, dataCollectionGroupGrid, "p_id").get();
	}

	@Override
	public Long insertBeamlineAction(BeamlineAction beamlineAction){
		return beanTemplateWrapper.callIspybForKey("insert_beamline_action", Long.class, beamlineAction, "p_id").get();
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
