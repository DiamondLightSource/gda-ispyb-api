package uk.ac.diamond.ispyb.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDateTime;
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
				Optional.of(Schema.ISPYB.toString()));

		assertThat(api, is(notNullValue()));

		api.closeConnection();
	}

	@Test
	public void testShouldUpsertDataCollection() throws Exception {
		String url = new H2UrlBuilder().withSchema("ispyb").withAlias("upsert_dc", "upsertDataCollection").build();
		IspybDataCollectionApi api = new IspybDaoFactory().buildIspybDataCollectionApi(url, Optional.empty(),
				Optional.empty(), Optional.of(Schema.ISPYB.toString()));

		DataCollection dataCollection = new DataCollection();
		dataCollection.setNumberOfImages(100);
		int id = api.upsertDataCollection(dataCollection);
		assertThat(id, is(equalTo(5)));

		api.closeConnection();
	}

	@Test
	public void testShouldUpsertDataCollectionGroup() throws Exception {
		String url = new H2UrlBuilder().withSchema("ispyb").withAlias("upsert_dc_group", "upsertDataCollectionGroup")
				.build();
		IspybDataCollectionApi api = new IspybDaoFactory().buildIspybDataCollectionApi(url, Optional.empty(),
				Optional.empty(), Optional.of(Schema.ISPYB.toString()));

		DataCollectionGroup group = new DataCollectionGroup();
		group.setActualSampleSlotInContainer(6);
		int id = api.upsertDataCollectionGroup(group);
		assertThat(id, is(equalTo(100)));

		api.closeConnection();
	}

	@Test
	public void testShouldRetrieveBean() throws Exception {
		String url = new H2UrlBuilder().withSchema("ispyb").withAlias("retrieve_dcs_for_subsample", "retrieve").build();

		IspybDataCollectionApi api = new IspybDaoFactory().buildIspybDataCollectionApi(url, Optional.empty(),
				Optional.empty(), Optional.of(Schema.ISPYB.toString()));

		DataCollection dataCollection = api.retrieveDataCollectionForSubsample(12345);

		DataCollection expected = new DataCollection();
		expected.setId(12345);

		assertThat(dataCollection, is(equalTo(expected)));

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
		if (numberOfImages == 100) {
			return 5;
		}
		return -1;
	}

	public static final int upsertDataCollectionGroup(int id, String session, int sampleId, String experimentType,
			LocalDateTime starttime, LocalDateTime endtime, String crystalClass, String detectorMode,
			String actualSampleBarcode, int actualSampleSlotInContainer, String actualContainerBarcode,
			int actualContainerSlotInSC, String comments) {
		if (actualSampleSlotInContainer == 6){
			return 100;
		}
		return -1;
	}

	public static final ResultSet retrieve(int id) {
		SimpleResultSet result = new SimpleResultSet();
		result.addColumn("id", Types.INTEGER, 15, 0);
		result.addRow(id);
		return result;
	}
}
