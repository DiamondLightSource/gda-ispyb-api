package uk.ac.diamond.ispyb.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.h2.tools.SimpleResultSet;
import org.junit.Test;

import uk.ac.diamond.ispyb.dao.IspybDaoFactory;

public class IspybDataCollectionApiTest {
	@Test
	public void testShouldCreateApi() throws SQLException {
		String url = new H2UrlBuilder().build();
		IspybFactoryService service = new IspybDaoFactory();
		IspybDataCollectionApi api = service.buildIspybDataCollectionApi(url, Optional.empty(), Optional.empty(),
				Optional.of(Schema.ISPYB));

		assertThat(api, is(notNullValue()));

		api.closeConnection();
	}

	@Test
	public void testShouldUpsertDataCollection() throws Exception {
		String url = new H2UrlBuilder().withSchema("ispyb").withAlias("upsert_dc", "upsertDataCollection").build();
		IspybDataCollectionApi api = new IspybDaoFactory().buildIspybDataCollectionApi(url, Optional.empty(),
				Optional.empty(), Optional.of(Schema.ISPYB));

		DataCollection dataCollection = new DataCollection();
		dataCollection.setNumberOfImages(100);
		int id = api.upsertDataCollection(dataCollection);
		assertThat(id, is(equalTo(5)));

		api.closeConnection();
	}

	@Test
	public void testShouldRetrieveBean() throws Exception {
		String url = new H2UrlBuilder().withSchema("ispyb").withAlias("retrieve_dc_plan_info", "info").build();

		IspybPdfApi api = new IspybDaoFactory().buildIspybPdfApi(url, Optional.empty(), Optional.empty(),
				Optional.of(Schema.ISPYB));

		List<DataCollectionPlanInfo> infos = api.retrieveDcPlanInfo(12345);

		DataCollectionPlanInfo expectedInfo = new DataCollectionPlanInfo();
		expectedInfo.setComposition("composition");
		expectedInfo.setDensity(1.0);
		expectedInfo.setDetectorDistanceMax(1.0);
		expectedInfo.setDetectorDistanceMin(1.0);
		expectedInfo.setDetectorManufacturer("detectorManufacturer");
		expectedInfo.setDetectorModel("detectorModel");
		expectedInfo.setDetectorType("detectorType");
		expectedInfo.setDistance(1.0);
		expectedInfo.setExposureTime(1.0);
		expectedInfo.setMonoBandwidth(1.0);
		expectedInfo.setOrientation("orientation");
		expectedInfo.setPreferredBeamSizeX(1.0);
		expectedInfo.setPreferredBeamSizeY(1.0);
		expectedInfo.setScanParamModelArray("scanParamModelArray");
		expectedInfo.setScanParamModelNumber(10);
		expectedInfo.setScanParamModelStart(1.0);
		expectedInfo.setScanParamModelStep(1.0);
		expectedInfo.setScanParamModelStop(1.0);
		expectedInfo.setScanParamServiceDesc("scanParamServiceDesc");
		expectedInfo.setScanParamServiceName("scanParamServiceName");
		expectedInfo.setEnergy(1.0);

		assertThat(infos, is(equalTo(Arrays.asList(expectedInfo))));

		api.closeConnection();
	}

	public static final int upsertDataCollection(int id, int groupId, int subSampleId, int detectorId, int positionId,
			int apertureId, int dcNumber, LocalDateTime startTime, LocalDateTime endTime, String runStatus,
			double axisStart, double axisEnd, double axisRange, double overlap, int numberOfImages,
			int startImageNumber, int numberOfPasses, double exposureTime, String imageDirectory, String imagePrefix,
			String imageSuffix, String fileTemplate, double wavelength, double resolution, double detectorDistance,
			double xBeam, double yBeam, String comments, double slitgapVertical, double slitgapHorizontal,
			double transmission, String synchrotronMode, String xtalSnapshotFullPath1, String xtalSnapshotFullPath2,
			String xtalSnapshotFullPath3, String xtalSnapshotFullPath4, RotationAxis rotationAxis, double phistart,
			double kappastart, double omegastart, double resolutionAtCorner, double detector2theta,
			double undulatorGap1, double undulatorGap2, double undulatorGap3, double beamSizeAtSampleX,
			double beamSizeAtSampleY, double averageTemperature, double actualCenteringPosition, String beamShape,
			double focalSpotSizeAtSampleX, double focalSpotSizeAtSampleY, double polarisation, double flux,
			double fluxEnd, String processedDataFile, String datFullPath, int magnification, double totalAbsorbedDose,
			int binning, double particleDiameter, double boxSize_CTF, double minResolution, double minDefocus,
			double maxDefocus, double defocusStepSize, double amountAstigmatism, double extractSize, double bgRadius,
			double voltage, double objAperture, double c1aperture, double c2aperture, double c3aperture, double c1lens,
			double c2lens, double c3lens) {
		
		if (numberOfImages == 100){
			return 5;
		}

		return -1;
	}

	public static final ResultSet info(String s) {
		SimpleResultSet result = new SimpleResultSet();
		List<String> stringFields = Arrays.asList("orientation", "detectorType", "detectorManufacturer",
				"detectorModel", "composition", "scanParamServiceName", "scanParamServiceDesc", "scanParamModelArray");
		stringFields.forEach(field -> result.addColumn(field, Types.VARCHAR, 255, 0));

		List<String> doubleFields = Arrays.asList("energy", "preferredBeamSizeX", "preferredBeamSizeY", "exposureTime",
				"distance", "monoBandwidth", "detectorDistanceMin", "detectorDistanceMax", "density",
				"scanParamModelStart", "scanParamModelStop", "scanParamModelStep");
		doubleFields.forEach(field -> result.addColumn(field, Types.DOUBLE, 15, 0));
		result.addColumn("scanParamModelNumber", Types.INTEGER, 15, 0);

		result.addRow("orientation", "detectorType", "detectorManufacturer", "detectorModel", "composition",
				"scanParamServiceName", "scanParamServiceDesc", "scanParamModelArray", 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 10);

		return result;
	}
}
