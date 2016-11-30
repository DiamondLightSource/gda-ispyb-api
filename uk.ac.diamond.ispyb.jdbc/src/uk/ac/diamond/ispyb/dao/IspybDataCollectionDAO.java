package uk.ac.diamond.ispyb.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.stream.Stream;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;

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
	public int upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup) {
		Object[] parameters = getParameters(dataCollectionGroup);
		return templateWrapper.callIspyb("upsert_dc_group", Integer.class, parameters).get();
	}

	@Override
	public int upsertDataCollectionMain(DataCollectionMain dataCollectionMain) {
		Object[] parameters = getParameters(dataCollectionMain);
		return templateWrapper.callIspyb("upsert_dc_main", Integer.class, parameters).get();
	}

	@Override
	public void updateDataCollectionExperiment(DataCollectionExperiment dataCollectionExperiment) {
		Object[] parameters = getParameters(dataCollectionExperiment);
		templateWrapper.callIspyb("update_dc_experiment", Void.class, parameters);
	}

	@Override
	public void updateDataCollectionMachine(DataCollectionMachine dataCollectionMachine) {
		Object[] parameters = getParameters(dataCollectionMachine);
		templateWrapper.callIspyb("update_dc_machine", Void.class, parameters);
	}
	
	@Override
	public void close() throws IOException {
		try {
			templateWrapper.closeConnection();
		} catch (SQLException e) {
			throw new IOException(e);
		}
	}

	private Object[] getParameters(DataCollectionGroup dataCollectionGroup) {
		return getParametersInOrder(dataCollectionGroup, 
				"id","sessionId","sampleId","experimenttype","starttime","endtime","crystalClass",
				"detectorMode","actualSampleBarcode","actualSampleSlotInContainer","actualContainerBarcode",
				"actualContainerSlotInSC","comments");
	}
	
	private Object[] getParameters(DataCollectionMain dataCollectionMain) {
		return getParametersInOrder(dataCollectionMain, 
				"id", "groupId", "detectorId", "dcNumber", "startTime", "endTime", "status", "noImages", 
				"startImgNumber", "noPasses", "imgDir", "imgPrefix", "imgSuffix", "fileTemplate", 
				"snapshot1", "snapshot2", "snapshot3", "snapshot4", "comments"
		);
	}
	
	private Object[] getParameters(DataCollectionExperiment dataCollectionExperiment) {
		return getParametersInOrder(dataCollectionExperiment, 
				"id","slitGapVertical","slitGapHorizontal","transmission","exposureTime","xBeam","yBeam",
				"axisStart","axisEnd","axisRange","overlap","flux","fluxEnd","rotationAxis","phiStart",
				"kappaStart","omegaStart","wavelength","resolution","detectorDistance","bestWilsonPlotPath",
				"beamSizeAtSampleX","beamSizeAtSampleY","focalSpotSizeAtSampleX","focalSpotSizeAtSampleY","apertureSizeX"
		);
	}

	
	private Object[] getParameters(DataCollectionMachine dataCollectionMachine) {
		return getParametersInOrder(dataCollectionMachine, 
			    "id","synchrotronMode","undulatorGap1","undulatorGap2","undulatorGap3"
		);
	}
	
	private Object[] getParametersInOrder(Object bean, String... order) {
		BeanWrapper wrapper = PropertyAccessorFactory.forBeanPropertyAccess(bean);
		return Stream.of(order)
			.map(property -> {
				try {
					return wrapper.getPropertyValue(property);
				} catch (Exception e) {
					throw new IllegalStateException(e);
				}
			}).toArray();
	}
}
