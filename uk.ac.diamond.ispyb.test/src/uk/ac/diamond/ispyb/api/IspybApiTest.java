package uk.ac.diamond.ispyb.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Test;

import uk.ac.diamond.ispyb.dao.IspybDaoFactory;

public class IspybApiTest {
	static final public String ispybProperty = "ispyb.config";
	static String dbConfig = null;
	@BeforeClass
	public static void setUp() {
		dbConfig = System.getProperty(ispybProperty);
		if (dbConfig == null) {
			throw new AssertionError("The Java system property '" + ispybProperty + "' must be defined");
		}
		if (!new File(dbConfig).canRead()) {
			throw new AssertionError("The file '" + dbConfig + "' given by Java system property '" + ispybProperty + "' must exist and be readable");
		}
	}

	private static final String REVERSE = "$$ String reverse(String s) { return new StringBuilder(s).reverse().toString()\\; } $$";

	@Test
	public void shouldCreateApi() throws SQLException {
		IspybFactoryService service = new IspybDaoFactory();
		IspybApi api = service.build("jdbc:h2:mem:test", Optional.empty(), Optional.empty());

		assertThat(api, is(notNullValue()));
		
		api.closeConnection();
	}

	@Test
	public void shouldRetrieveContainerInfo() throws SQLException {
		String dbInit = "INIT=CREATE SCHEMA ispyb\\; CREATE ALIAS ispyb.retrieve_container_info AS " + REVERSE;
		IspybApi api = new IspybDaoFactory().build("jdbc:h2:mem:test;" + dbInit, Optional.empty(), Optional.empty());

		Map<String, Object> map = api.retrieveContainerInfo("12345");
		assertThat(map.get("ISPYB.RETRIEVE_CONTAINER_INFO(?1)"), is(equalTo("54321")));		
		
		api.closeConnection();
	}

	@Test
	public void shouldRetrieveContainerInfoForReal() throws SQLException {
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

		IspybApi api = new IspybDaoFactory().build(properties.getProperty("url"), properties);
		
//		assertThat(api.retrieveContainerInfo("12345"), is(equalTo("54321")));
		Map<String, Object> map = api.retrieveContainerInfo("test_plate2");
		System.out.println(map);
		
		System.out.println(api.retrieveContainerLsPosition("test_plate2"));
//		System.out.println(api.retrieveContainerLsQueue("test_plate2"));

//		System.out.println(api.retrieveContainerQueueTimestamp("test_plate2"));

		map = api.retrieveContainerSubsamples("test_plate2");
		System.out.println(map);
//		System.out.println(api.retrieveContainersSubmittedNonLs("test_plate2"));

		api.closeConnection();
	}
}
