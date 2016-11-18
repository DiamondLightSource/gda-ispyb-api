package uk.ac.diamond.ispyb.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

import static org.hamcrest.MatcherAssert.assertThat;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import junit.framework.TestCase;
import uk.ac.diamond.ispyb.dao.IspybPlateDaoFactory;

public class IntegrationTest extends TestCase{
	private final String host = System.getProperty("ispyb.host");
	private final String url = System.getProperty("ispyb.url");
	private final Optional<String> user = Optional.ofNullable(System.getProperty("ispyb.user"));
	private final Optional<String> password = Optional.ofNullable(System.getProperty("ispyb.pw"));
	private final String systemUser = System.getProperty("user.name");
	private final String schema = "maven_" + systemUser;
	
	private final IspybFactoryService<IspybPlateApi> factory = new IspybPlateDaoFactory();
	
	@Test
	public void testRetrieve() throws SQLException, FileNotFoundException, IOException, InterruptedException {
		ContainerInfo containerInfo = execute(api -> api.retrieveContainerInfo("test_plate3"));
		
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
	public void testRetrieveLsPosition() throws SQLException{
		int position = execute(api-> api.retrieveContainerLSPosition("test_plate2"));
		assertThat(position, is(equalTo(3)));
	}

	@Test
	public void testRetrieveTest() throws SQLException{
		Map<String, Object> result = execute(api-> api.retrieveTest());

		assertThat(result.get("2_1"), is(equalTo("2")));
		assertThat(result.get("2_2"), is(equalTo(2L)));
		assertThat(result.get("20_1"), is(equalTo("2.0")));
		assertThat(result.get("20_2"), is(equalTo(2.0f)));
	}
	
	private <T> T execute(CheckedFunction<T, IspybPlateApi> f) throws SQLException {
		IspybPlateApi api = factory.buildIspybApi(url, user,  password, Optional.of(schema));
		T result = f.apply(api);
		assertThat(result, is(notNullValue()));
		api.closeConnection();
		return result;
	}
	
	@Before
	@Override
	public void setUp() throws FileNotFoundException, IOException, SQLException, InterruptedException{
		Connection connection = connectToDatabase(url, user, password, Optional.empty());
		JdbcTemplate jdbcTemplate = new JdbcTemplate(new SingleConnectionDataSource(connection, true));
		jdbcTemplate.execute(String.format("drop database if exists %s;", schema));
		jdbcTemplate.execute(String.format("create database %s;", schema));
		try{
			jdbcTemplate.execute("SET GLOBAL log_bin_trust_function_creators = 1;");
		} catch (Exception e){
			// internally we use row logging, but this should work on travis
		}
		connection.close();
		
		executeScript("schema.sql", schema);
	}

	@After
	@Override
	public void tearDown() throws FileNotFoundException, IOException, SQLException, InterruptedException{
		Connection connection = connectToDatabase(url, user, password, Optional.empty());
		JdbcTemplate jdbcTemplate = new JdbcTemplate(new SingleConnectionDataSource(connection, true));
		jdbcTemplate.execute(String.format("drop database if exists %s;", schema));
		connection.close();
	}

	private void executeScript(String filename, String database) throws FileNotFoundException, IOException, SQLException, InterruptedException {
		Resource resource = new DefaultResourceLoader().getResource(filename);
		String absolutePath = resource.getFile().getAbsolutePath();

		String command = String.format("./rundbscript.sh %s %s %s %s %s", host, user.get(), password.orElse(""), database, absolutePath);
		
		CommandLine commandLine = CommandLine.parse(command);
		DefaultExecutor executor = new DefaultExecutor();
		executor.execute(commandLine);
	}
	
	private Connection connectToDatabase(String url, Optional<String> username, Optional<String> password, Optional<Properties> properties) throws SQLException {
		SingleConnectionDataSource ds = new SingleConnectionDataSource(url, false);
		properties.ifPresent(ds::setConnectionProperties);
		username.ifPresent(ds::setUsername);
		password.ifPresent(ds::setPassword);
		return ds.getConnection();
	}
	
	interface CheckedFunction<S,T>{
		public S apply(T t) throws SQLException;
	}
}
