package uk.ac.diamond.ispyb.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import uk.ac.diamond.ispyb.dao.IspybPlateDaoFactory;

public class PlateIntegrationTest extends TestCase{
	private final IntegrationTestHelper<IspybPlateApi> helper = new IntegrationTestHelper<>(new IspybPlateDaoFactory());
	
	@Test
	public void testRetrieve() throws SQLException, FileNotFoundException, IOException, InterruptedException {
		ContainerInfo containerInfo = helper.execute(api -> api.retrieveContainerInfo("test_plate3")).get();
		
		ContainerInfo expected = new ContainerInfo();
		expected.setName("test_plate3");
		expected.setType("CrystalQuickX");
		expected.setBarcode("test_plate3");
		expected.setBeamline("i03");
		expected.setLocation("3");
		expected.setImagerName("Imager1 20c");
		expected.setImagerSerialNumber("Z125434");
		expected.setStatus(ContainerStatus.IN_STORAGE.getStatus());
		expected.setCapacity(192);
		expected.setStorageTemperature(20.0f);
		
		assertThat(containerInfo, is(equalTo(expected)));
	}

	@Test
	public void testRetrieveLsPosition() throws SQLException, IOException{
		String position = helper.execute(api-> api.retrieveContainerLSPosition("test_plate2")).get();
		assertThat(position, is(equalTo("3")));
	}

	@Test
	public void testRetrieveLsQueue() throws SQLException, IOException{
		List<ContainerLSQueueEntry> entries = helper.execute(api-> api.retrieveContainerLSQueue("i03"));
		
		ContainerLSQueueEntry expected = new ContainerLSQueueEntry();
		expected.setBarcode("test_plate2");
		expected.setLocation("3");
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		c.set(2016, 8, 30, 12, 56, 21);
		c.clear(Calendar.MILLISECOND);
		Date date = c.getTime();
		expected.setAdded(date);
		
		assertThat(entries, is(equalTo(Arrays.asList(expected))));
	}
	
	@Test
	public void testShouldRetrieveContainerOnGonio() throws Exception {
		List<ContainerInfo> beans = helper.execute(api -> api.retrieveContainerOnGonio("notusedinthestoredprocedure!!!"));

		ContainerInfo container = new ContainerInfo();
		container.setName("test_plate4");
		container.setType("CrystalQuickX");
		container.setBarcode("test_plate4");
		container.setBeamline("i02-2");
		container.setLocation("4");
		container.setImagerName("Imager1 20c");
		container.setImagerSerialNumber("Z125434");
		container.setStatus(ContainerStatus.PROCESSING.getStatus());
		container.setCapacity(192);
		container.setStorageTemperature(20.0f);
		container.setProposalCode(null);
		container.setProposalNumber(null);
		container.setSessionNumber(null);
		
		assertThat(beans, is(equalTo(Arrays.asList(container))));
	}
	
	@Test
	public void testShouldRetrieveDataCollection() throws Exception {
		List<DataCollectionInfo> info = helper.execute(api -> api.retrieveDataCollectionInfosForSubsample(2L));
		
		DataCollectionInfo expected = new DataCollectionInfo();
		expected.setId(1066786L);
		expected.setDcNumber(2);
		expected.setStartTime(new Timestamp(2016-1900,4-1,18,11,04,44,0));
		expected.setEndTime(new Timestamp(2016-1900,4-1,18,11,04,57,0));
		expected.setStatus("DataCollection Successful");
		expected.setAxisStart(0.0f);
		expected.setAxisEnd(0.5f);
		expected.setAxisRange(0.5f);
		expected.setOverlap(-44.5f);
		expected.setNumberOfImages(3);
		expected.setStartImageNumber(1);
		expected.setNumberOfPasses(1);
		expected.setExposureTime(0.1f);
		expected.setImageDirectory("/dls/i03/data/2016/cm14451-2/gw/20160418/thau/edna_test/");
		expected.setImagePrefix("thau");
		expected.setImageSuffix("cbf");
		expected.setFileTemplate("thau_2_####.cbf");
		expected.setWavelength(0.976253f);
		expected.setResolution(1.5f);
		expected.setDetectorDistance(266.693f);
		expected.setXBeam(null);
		expected.setYBeam(null);
		expected.setComments("(-345,-241,-185) Aperture: Large");
		expected.setSlitgapVertical(0.059918f);
		expected.setSlitgapHorizontal(0.099937f);
		expected.setTransmission(5.00016f);
		expected.setSynchrotronMode("User");
		expected.setSnapshot1("/dls/i03/data/2016/cm14451-2/jpegs/gw/20160418/thau/edna_test/thau_2_1_90.0.png");
		expected.setSnapshot2("/dls/i03/data/2016/cm14451-2/jpegs/gw/20160418/thau/edna_test/thau_2_1_0.0.png");
		expected.setPhiStart(0.0f);
		expected.setKappaStart(0.0f);
		expected.setOmegaStart(0.0f);
		expected.setRotationAxis("Omega");
		expected.setUndulatorGap1(5.301f);
		expected.setUndulatorGap2(0.0f);
		expected.setUndulatorGap3(0.0f);
		expected.setBeamSizeAtSampleX(0.08f);
		expected.setBeamSizeAtSampleY(0.02f);
		expected.setFocalSpotSizeAtSampleX(80.0f);
		expected.setFocalSpotSizeAtSampleY(20.0f);
		expected.setPolarisation(0.0f);
		expected.setFlux(5.7087013071909134E10);
		expected.setFluxEnd(0.0);

		assertThat(info, is(equalTo(Arrays.asList(expected))));
	}
	
	@Test
	public void testShouldRetrieveNoBean() throws Exception {
		List<DataCollectionInfo> dataCollection = helper.execute(api -> api.retrieveDataCollectionInfosForSubsample(12345L));

		assertThat(dataCollection, is(equalTo(Collections.emptyList())));
	}
	
	@Test
	public void testUpsertSampleImageAnalysis() throws SQLException, FileNotFoundException, IOException, InterruptedException {
		SampleImageAnalysis sampleImageAnalysis = new SampleImageAnalysis();
		helper.run(api -> api.upsertSampleImageAnalysis(sampleImageAnalysis));
	}
	
	@Before
	@Override
	protected void setUp() throws Exception {
		helper.setUp();
	};
	
	@After
	@Override
	protected void tearDown() throws Exception {
		helper.tearDown();
	};
}
