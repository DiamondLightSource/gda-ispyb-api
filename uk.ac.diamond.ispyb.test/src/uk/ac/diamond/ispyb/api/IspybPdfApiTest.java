package uk.ac.diamond.ispyb.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.h2.tools.SimpleResultSet;
import org.junit.Test;

import uk.ac.diamond.ispyb.dao.IspybPdfDaoFactory;

public class IspybPdfApiTest {
	private final IspybPdfFactoryService factory = new IspybPdfDaoFactory();

	@Test
	public void testShouldCreateApi() throws SQLException, IOException {
		String url = new H2UrlBuilder().build();
		IspybPdfApi api = factory.buildIspybApi(url, Optional.empty(), Optional.empty(),
				Optional.of(Schema.ISPYB.toString()));

		assertThat(api, is(notNullValue()));

		api.close();
	}

	@Test
	public void testShouldRetrieveContainerLsPosition() throws Exception {
		String url = new H2UrlBuilder().withSchema("ispyb").withAlias("retrieve_dc_plan_groups", "groups").build();
		IspybPdfApi api = factory.buildIspybApi(url, Optional.empty(), Optional.empty(),
				Optional.of(Schema.ISPYB.toString()));

		List<Integer> pos = api.retrieveDcPlanGroups("sessionid");
		assertThat(pos, is(equalTo(Arrays.asList(1, 2, 3, 4))));

		api.close();
	}

	@Test
	public void testShouldRetrieveBean() throws Exception {
		String url = new H2UrlBuilder().withSchema("ispyb").withAlias("retrieve_dc_plan_info", "info").build();

		IspybPdfApi api = factory.buildIspybApi(url, Optional.empty(), Optional.empty(),
				Optional.of(Schema.ISPYB.toString()));

			List<DataCollectionPlanInfo> infos = new ArrayList<>(api.retrieveDcPlanInfo(12345));

		DataCollectionPlanInfo expectedInfo1 = createDataCollectionPlanInfo(createScanParams(1.0, 10), createScanParams(2.0, 20));
		DataCollectionPlanInfo expectedInfo2 = createDataCollectionPlanInfo(createScanParams(3.0, 30));

		assertThat(infos, is(equalTo(Arrays.asList(expectedInfo1, expectedInfo2))));

		api.close();
	}

	private DataCollectionPlanInfo createDataCollectionPlanInfo(ScanParameters... scanParameters) {
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
		expectedInfo.setOrientation(1.0);
		expectedInfo.setPreferredBeamSizeX(1.0);
		expectedInfo.setPreferredBeamSizeY(1.0);
		expectedInfo.addScanParameter(scanParameters);
		expectedInfo.setEnergy(1.0);
		return expectedInfo;
	}
	
	private ScanParameters createScanParams(double doubleParam, int intParam){
		ScanParameters expectedInfo = new ScanParameters();
		expectedInfo.setScanParamModelArray("scanParamModelArray");
		expectedInfo.setScanParamModelNumber(intParam);
		expectedInfo.setScanParamModelStart(doubleParam);
		expectedInfo.setScanParamModelStep(doubleParam);
		expectedInfo.setScanParamModelStop(doubleParam);
		expectedInfo.setScanParamServiceDesc("scanParamServiceDesc");
		expectedInfo.setScanParamServiceName("scanParamServiceName");
		return expectedInfo;
	}

	public static final ResultSet groups(String s) {
		SimpleResultSet result = new SimpleResultSet();
		result.addColumn("id", Types.INTEGER, 10, 0);
		result.addRow(1);
		result.addRow(2);
		result.addRow(3);
		result.addRow(4);
		return result;
	}

	public static final ResultSet info(String s) {
		SimpleResultSet result = new SimpleResultSet();
		result.addColumn("id", Types.INTEGER, 15, 0);

		List<String> stringFields = Arrays.asList("detectorType", "detectorManufacturer",
				"detectorModel", "composition", "scanParamServiceName", "scanParamServiceDesc", "scanParamModelArray");
		stringFields.forEach(field -> result.addColumn(field, Types.VARCHAR, 255, 0));

		List<String> doubleFields = Arrays.asList("orientation", "energy", "preferredBeamSizeX", "preferredBeamSizeY", "exposureTime",
				"distance", "monoBandwidth", "detectorDistanceMin", "detectorDistanceMax", "density",
				"scanParamModelStart", "scanParamModelStop", "scanParamModelStep");
		doubleFields.forEach(field -> result.addColumn(field, Types.DOUBLE, 15, 0));
		
		result.addColumn("scanParamModelNumber", Types.INTEGER, 15, 0);

		result.addRow(1, "detectorType", "detectorManufacturer", "detectorModel", "composition",
				"scanParamServiceName", "scanParamServiceDesc", "scanParamModelArray", 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 10);

		result.addRow(1, "detectorType", "detectorManufacturer", "detectorModel", "composition",
				"scanParamServiceName", "scanParamServiceDesc", "scanParamModelArray", 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, 1.0, 1.0, 2.0, 2.0, 2.0, 20);

		result.addRow(2, "detectorType", "detectorManufacturer", "detectorModel", "composition",
				"scanParamServiceName", "scanParamServiceDesc", "scanParamModelArray", 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, 1.0, 1.0, 3.0, 3.0, 3.0, 30);

		return result;
	}
}
