package uk.ac.diamond.ispyb.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.stream.Stream;

import org.apache.commons.beanutils.PropertyUtils;

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
		Object[] parameters = getParameters(dataCollection);
		return templateWrapper.callIspyb("upsert_dc", Integer.class, parameters);
	}

	@Override
	public int upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup) {
		Object[] parameters = getParameters(dataCollectionGroup);
		return templateWrapper.callIspyb("upsert_dc_group", Integer.class, parameters);
	}

	@Override
	public DataCollection retrieveDataCollectionForSubsample(int id) {
		return templateWrapper.callIspybForBean("retrieve_dcs_for_subsample", DataCollection.class, id);
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
		return getParameters(bean, 
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
		return getParameters(dataCollectionGroup, 
				"id","session","sampleId","experimentType","starttime","endtime","crystalClass",
				"detectorMode","actualSampleBarcode","actualSampleSlotInContainer","actualContainerBarcode",
				"actualContainerSlotInSC","comments");
	}

	private Object[] getParameters(Object bean, String... order) {
		return Stream.of(order)
			.map(property -> {
				try {
					return PropertyUtils.getProperty(bean, property);
				} catch (Exception e) {
					throw new IllegalStateException(e);
				}
			}).toArray();
	}
}
