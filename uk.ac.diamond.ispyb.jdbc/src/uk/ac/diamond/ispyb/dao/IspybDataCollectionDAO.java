package uk.ac.diamond.ispyb.dao;

import java.io.IOException;
import java.sql.SQLException;

import uk.ac.diamond.ispyb.api.DataCollectionExperiment;
import uk.ac.diamond.ispyb.api.DataCollectionGroup;
import uk.ac.diamond.ispyb.api.DataCollectionMachine;
import uk.ac.diamond.ispyb.api.DataCollectionMain;
import uk.ac.diamond.ispyb.api.IspybDataCollectionApi;
import uk.ac.diamond.ispyb.api.SampleImageAnalysis;

public class IspybDataCollectionDAO implements IspybDataCollectionApi {

	private TemplateWrapper templateWrapper;
	private BeanTemplateWrapper beanTemplateWrapper;

	public IspybDataCollectionDAO(TemplateWrapper templateWrapper, BeanTemplateWrapper beanTemplateWrapper) {
		this.templateWrapper = templateWrapper;
		this.beanTemplateWrapper = beanTemplateWrapper;
	}

	@Override
	public int upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup) {
		return templateWrapper.callIspyb("upsert_dc_group", Integer.class, dataCollectionGroup).get();
	}

	@Override
	public int upsertDataCollectionMain(DataCollectionMain dataCollectionMain) {
		return templateWrapper.callIspyb("upsert_dc_main", Integer.class, dataCollectionMain).get();
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
	public int upsertSampleImageAnalysis(SampleImageAnalysis sampleImageAnalysis){
		return templateWrapper.callIspyb("upsert_sample_image_analysis", Integer.class, sampleImageAnalysis).get();
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
