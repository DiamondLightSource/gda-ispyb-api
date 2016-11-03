package uk.ac.diamond.ispyb.api;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

public class IntegrationTest {
	private final String url = System.getProperty("ispyb.url");
	private final Optional<String> user = Optional.ofNullable(System.getProperty("ispyb.user"));
	private final Optional<String> password = Optional.ofNullable(System.getProperty("ispyb.pw"));

	@Test
	public void testRetrieve() throws SQLException, FileNotFoundException, IOException {
		setUp();
		tearDown();
//		IspybPlateApi api = new IspybDaoFactory().buildIspybPlateApi(url, user, password, Optional.of(Schema.ISPYBSTAGE));
//		api.retrieveContainerInfo("test_plate");
	}
	
	@Before
	public void setUp() throws FileNotFoundException, IOException, SQLException{
		executeScript("schema.sql");
	}

	@After
	public void tearDown() throws FileNotFoundException, IOException, SQLException{
		executeScript("teardown.sql");
	}

	private void executeScript(String filename) throws FileNotFoundException, IOException, SQLException {
		SingleConnectionDataSource ds = new SingleConnectionDataSource(url, false);
		ds.setUrl(url);

		user.ifPresent(ds::setUsername);
		password.ifPresent(ds::setPassword);
		
		Resource resource = new DefaultResourceLoader().getResource(filename);
		BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));

		String sql = reader.lines()
				.map(line -> line.replace("${user.name}", System.getProperty("user.name")))
				.reduce("", (x,y)-> x + '\n' + y);
		
		ByteArrayInputStream stream = new ByteArrayInputStream(sql.getBytes());
		
		ScriptUtils.executeSqlScript(ds.getConnection(), new InputStreamResource(stream));

		ds.getConnection().close();
	}
}
