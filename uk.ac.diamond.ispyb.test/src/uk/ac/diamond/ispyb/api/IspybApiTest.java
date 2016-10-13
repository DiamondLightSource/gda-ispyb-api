package uk.ac.diamond.ispyb.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Test;

import uk.ac.diamond.ispyb.dao.IspybDaoFactory;

public class IspybApiTest {
	static final public String ispybProperty = "ispyb.config";
	static String dbConfig = null;

	public static void loadDbConfig() {
		dbConfig = System.getProperty(ispybProperty);
		if (dbConfig == null) {
			throw new AssertionError("The Java system property '" + ispybProperty + "' must be defined");
		}
		if (!new File(dbConfig).canRead()) {
			throw new AssertionError("The file '" + dbConfig + "' given by Java system property '" + ispybProperty + "' must exist and be readable");
		}
	}

	private static final String REVERSE = "$$ Long reverse(String s) { return Long.valueOf(new StringBuilder(s).reverse().toString())\\; } $$";

	@Test
	public void testShouldCreateApi() throws SQLException {
		IspybFactoryService service = new IspybDaoFactory();
		IspybApi api = service.build("jdbc:h2:mem:test", Optional.empty(), Optional.empty(), Optional.of(Schema.ISPYB));

		assertThat(api, is(notNullValue()));
		
		api.closeConnection();
	}

	@Test
	public void testShouldRetrieveContainerLsPosition() throws SQLException {
		String dbInit = "INIT=CREATE SCHEMA ispyb\\; CREATE ALIAS ispyb.retrieve_container_ls_position AS " + REVERSE;
		IspybApi api = new IspybDaoFactory().build("jdbc:h2:mem:test;" + dbInit, Optional.empty(), Optional.empty(), Optional.of(Schema.ISPYB));

		int pos = api.retrieveContainerLSPosition("12345");
		assertThat(pos, is(equalTo(54321)));
		
		api.closeConnection();
	}

	@Test
	public void shouldRetrieveForReal() throws SQLException {
		loadDbConfig();
		
		Properties properties = new Properties();
		try {
			/**
			 * url = jdbc:mariadb://dbserver/db
			 * user = joe
			 * password = bloggs
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

		IspybApi api = new IspybDaoFactory().build(properties.getProperty("url"), properties, Optional.of(Schema.ISPYBSTAGE));
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
//		System.out.println(api.retrieveContainersSubmittedNonLs("test_plate2"));

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
}
