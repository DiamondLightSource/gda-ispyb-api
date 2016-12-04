package uk.ac.diamond.ispyb.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

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
		expected.setCapacity(192L);
		expected.setStorageTemperature(20.0f);
		
		assertThat(containerInfo, is(equalTo(expected)));
	}

	@Test
	public void testRetrieveLsPosition() throws SQLException, IOException{
		int position = helper.execute(api-> api.retrieveContainerLSPosition("test_plate2")).get();
		assertThat(position, is(equalTo(3)));
	}

	@Test
	public void testRetrieveTest() throws SQLException, IOException{
		Map<String, Object> result = helper.execute(api-> api.retrieveTest());

		assertThat(result.get("2_1"), is(equalTo("2")));
		assertThat(result.get("2_2"), is(equalTo(2L)));
		assertThat(result.get("20_1"), is(equalTo("2.0")));
	}

	@Test
	public void testShouldRetrieveList() throws Exception {
		List<ContainerInfo> beans = helper.execute(api -> api.retrieveContainerOnGonio("notusedinthestoredprocedure!!!"));

		ContainerInfo expectedBean = new ContainerInfo();
		expectedBean.setName("name");
		expectedBean.setType("type");
		expectedBean.setBarcode("barcode");
		expectedBean.setBeamline("beamline");
		expectedBean.setLocation("location");
		expectedBean.setImagerName("imagerName");
		expectedBean.setImagerSerialNumber("imagerSerialNumber");
		expectedBean.setStatus(ContainerStatus.IN_LOCALSTORAGE.getStatus());
		expectedBean.setCapacity(5);
		expectedBean.setStorageTemperature(0.5f);

		assertThat(beans, is(equalTo(Collections.nCopies(10, expectedBean))));
	}
	
	@Test
	public void testShouldRetrieveDataCollection() throws Exception {
		List<DataCollectionInfo> info = helper.execute(api -> api.retrieveDataCollectionInfosForSubsample(2));
		
		DataCollectionInfo expected = new DataCollectionInfo();
		expected.setId(12345);

		assertThat(info, is(equalTo(Arrays.asList(expected))));
	}
	
	@Test
	public void testShouldRetrieveNoBean() throws Exception {
		List<DataCollectionInfo> dataCollection = helper.execute(api -> api.retrieveDataCollectionInfosForSubsample(12345));

		assertThat(dataCollection, is(equalTo(Collections.emptyList())));
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
