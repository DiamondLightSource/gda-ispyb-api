package uk.ac.diamond.ispyb.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Properties;

import org.h2.tools.SimpleResultSet;
import org.junit.BeforeClass;
import org.junit.Test;

import uk.ac.diamond.ispyb.dao.IspybDaoFactory;

public class IspybApiTest {
	static final public String ispybProperty = "ispyb.config";

	public static String loadDbConfig() {
		String dbConfig = System.getProperty(ispybProperty);
		if (dbConfig == null) {
			throw new AssertionError("The Java system property '" + ispybProperty + "' must be defined");
		}
		if (!new File(dbConfig).canRead()) {
			throw new AssertionError("The file '" + dbConfig + "' given by Java system property '" + ispybProperty
					+ "' must exist and be readable");
		}
		return dbConfig;
	}

	private static final String CREATE_SCHEMA = "CREATE SCHEMA IF NOT EXISTS ispyb \\;";

	@Test
	public void testShouldCreateApi() throws SQLException {
		IspybFactoryService service = new IspybDaoFactory();
		IspybApi api = service.build("jdbc:h2:mem:test", Optional.empty(), Optional.empty(), Optional.of(Schema.ISPYB));

		assertThat(api, is(notNullValue()));

		api.closeConnection();
	}

	@Test
	public void testShouldRetrieveContainerLsPosition() throws SQLException {
		String dbInit = "INIT=" + CREATE_SCHEMA + "CREATE ALIAS ispyb.retrieve_container_ls_position FOR \"uk.ac.diamond.ispyb.api.IspybApiTest.reverse\"";
		IspybApi api = new IspybDaoFactory().build("jdbc:h2:mem:test;" + dbInit, Optional.empty(), Optional.empty(),
				Optional.of(Schema.ISPYB));

		int pos = api.retrieveContainerLSPosition("12345");
		assertThat(pos, is(equalTo(54321)));

		api.closeConnection();
	}

	@Test
	public void testShouldRetrieveBean() throws SQLException {
		String dbInit = "INIT=" + CREATE_SCHEMA + " CREATE ALIAS ispyb.retrieve_container_info FOR \"uk.ac.diamond.ispyb.api.IspybApiTest.containerInfo\"";
		IspybApi api = new IspybDaoFactory()
				.build("jdbc:h2:mem:test;" + dbInit, Optional.empty(), Optional.empty(),Optional.of(Schema.ISPYB));

		ContainerInfo bean = api.retrieveContainerInfo("12345");
		ContainerInfo expectedBean = new ContainerInfo();
		expectedBean.setName_v("name");
		expectedBean.setType_v("type");
		expectedBean.setBarcode_v("barcode");
		expectedBean.setBeamline_v("beamline");
		expectedBean.setLocation_v("location");
		expectedBean.setImagerName_v("imagerName");
		expectedBean.setImagerSerialNumber_v("imagerSerialNumber");
		expectedBean.setStatus_v(ContainerStatus.LOCAL_STORAGE.getStatus());
		expectedBean.setCapacity_i(5);
		expectedBean.setStorageTemperature_f(0.5f);
		
		assertThat(bean, is(equalTo(expectedBean)));

		api.closeConnection();
	}

	@Test
	public void shouldRetrieveForReal() throws SQLException {
		String dbConfig = loadDbConfig();

		Properties properties = new Properties();
		try {
			/**
			 * url = jdbc:mariadb://dbserver/db user = joe password = bloggs
			 */
			properties.load(new FileInputStream(dbConfig));
		} catch (Exception e) {
			throw new SQLException(e);
		}
		if (!properties.containsKey("url")) {
			throw new SQLException("No url defined in " + dbConfig);
		}
		if (!properties.containsKey("user")) {
			throw new SQLException("No user defined in " + dbConfig);
		}
		if (!properties.containsKey("password")) {
			throw new SQLException("No password defined in " + dbConfig);
		}

		IspybApi api = new IspybDaoFactory().build(properties.getProperty("url"), properties,
				Optional.of(Schema.ISPYBSTAGE));
		String barcode = "test_plate2";

		System.out.println("Container info");
		ContainerInfo info = api.retrieveContainerInfo(barcode);
		System.out.println(info);

		System.out.println("Container status");
		api.updateContainerStatus(barcode, ContainerStatus.IMAGER);
		info = api.retrieveContainerInfo(barcode);
		System.out.println(info.getStatus());
		api.updateContainerStatus(barcode, ContainerStatus.TRANSIT);
		info = api.retrieveContainerInfo(barcode);
		System.out.println(info.getStatus());
		api.updateContainerStatus(barcode, ContainerStatus.LOCAL_STORAGE);
		info = api.retrieveContainerInfo(barcode);
		System.out.println(info.getStatus());

		System.out.println("\nLS position");
		System.out.println(api.retrieveContainerLSPosition(barcode));
		api.updateContainerLSPosition(barcode, 3);
		System.out.println(api.retrieveContainerLSPosition(barcode));

		System.out.println("\nLS queue for i03");
		List<ContainerLSQueueEntry> queue = api.retrieveContainerLSQueue("i03");
		for (ContainerLSQueueEntry e : queue) {
			System.out.println(e);
		}

		System.out.println("\nQueue timestamp");
		System.out.println(api.retrieveContainerQueueTimestamp(barcode));

		System.out.println("\nSubsamples");
		List<ContainerSubsample> samples = api.retrieveContainerSubsamples(barcode);
		for (ContainerSubsample c : samples) {
			System.out.println(c);
		}

		System.out.println("\nTest");
		Map<String, Object> map = api.retrieveTest();
		print(map);
		// System.out.println(api.retrieveContainersSubmittedNonLs("test_plate2"));

		api.closeConnection();
	}

	void print(Map<String, Object> map) {
		for (Entry<String, Object> e : map.entrySet()) {
			if (e == null) {
				continue;
			}
			String k = e.getKey();
			Object v = e.getValue();
			System.out.println(k + ": " + (v == null ? "null" : (v + ", " + v.getClass().getTypeName())));
		}
	}

	public static final Long reverse(String s) { 
		return Long.valueOf(new StringBuilder(s).reverse().toString());
	}

	public static final ResultSet containerInfo(String s) { 
		SimpleResultSet result = new SimpleResultSet();
		List<String> fields = Arrays.asList("name_v", "type_v", "barcode_v", "beamline_v", "location_v", "imagerName_v", "imagerSerialNumber_v", "status_v"); 
		fields.forEach(field -> result.addColumn(field, Types.VARCHAR, 255, 0));
		result.addColumn("capacity_i", Types.INTEGER, 10, 0);
		result.addColumn("storageTemperature_f", Types.FLOAT, 10, 0);
		result.addRow("name", "type", "barcode", "beamline", "location", "imagerName", "imagerSerialNumber", ContainerStatus.LOCAL_STORAGE.getStatus(), 5, 0.5);
		return result;
	}
}
