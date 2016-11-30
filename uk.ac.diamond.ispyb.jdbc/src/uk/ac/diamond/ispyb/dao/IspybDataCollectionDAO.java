package uk.ac.diamond.ispyb.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.stream.Stream;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;

import uk.ac.diamond.ispyb.api.DataCollection;
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
	public int upsertDataCollection(DataCollection dataCollection) {
		Object[] parameters = getParameters(dataCollection);
		return templateWrapper.callIspyb("upsert_dc", Integer.class, parameters).get();
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
	public int upsertDataCollectionExperiment(DataCollectionExperiment dataCollectionExperiment) {
		Object[] parameters = getParameters(dataCollectionExperiment);
		return templateWrapper.callIspyb("upsert_dc_main", Integer.class, parameters).get();
	}

	@Override
	public int upsertDataCollectionMachine(DataCollectionMachine dataCollectionMachine) {
		Object[] parameters = getParameters(dataCollectionMachine);
		return templateWrapper.callIspyb("upsert_dc_main", Integer.class, parameters).get();
	}
	
	@Override
	public void close() throws IOException {
		try {
			templateWrapper.closeConnection();
		} catch (SQLException e) {
			throw new IOException(e);
		}
	}

	public Object[] getParameters(DataCollection bean) {
		return getParametersInOrder(bean, 
				"id","groupId","subSampleId","detectorId","positionId","apertureId","dcNumber",
				"startTime","endTime","runStatus","axisStart","axisEnd","axisRange","overlap",
				"numberOfImages","startImageNumber","numberOfPasses","exposureTime",
				"imageDirectory","imagePrefix","imageSuffix","fileTemplate","wavelength",
				"resolution","detectorDistance","xBeam","yBeam","comments","slitgapVertical",
				"slitgapHorizontal","transmission","synchrotronMode","xtalSnapshotFullPath1",
				"xtalSnapshotFullPath2","xtalSnapshotFullPath3","xtalSnapshotFullPath4",
				"rotationAxis","phistart","kappastart","omegastart","resolutionAtCorner",
				"detector2theta","undulatorGap1","undulatorGap2","undulatorGap3","beamSizeAtSampleX",
				"beamSizeAtSampleY","averageTemperature","actualCenteringPosition","beamShape",
				"focalSpotSizeAtSampleX","focalSpotSizeAtSampleY","polarisation","flux","fluxEnd",
				"processedDataFile","datFullPath","magnification","totalAbsorbedDose","binning",
				"particleDiameter","boxSize_CTF","minResolution","minDefocus","maxDefocus",
				"defocusStepSize","amountAstigmatism","extractSize","bgRadius","voltage",
				"objAperture","c1aperture","c2aperture","c3aperture","c1lens","c2lens","c3lens"
			);
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
