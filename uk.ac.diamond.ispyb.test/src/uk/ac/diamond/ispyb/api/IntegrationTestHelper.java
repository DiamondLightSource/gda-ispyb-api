package uk.ac.diamond.ispyb.api;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

public class IntegrationTestHelper<S extends Closeable>{
	private final String host = System.getProperty("ispyb.host");
	private final String url = System.getProperty("ispyb.url");
	private final Optional<String> user = Optional.ofNullable(System.getProperty("ispyb.user"));
	private final Optional<String> password = Optional.ofNullable(System.getProperty("ispyb.pw"));
	private final String systemUser = System.getProperty("user.name");
	private final String schema = "maven_" + systemUser;
	

	private final IspybFactoryService<S> factory;
	
	public IntegrationTestHelper(IspybFactoryService<S> factory) {
		this.factory = factory;
	}

	public void run(CheckedSupplier<S> f) throws SQLException, IOException {
		execute(api -> {
			f.apply(api);
			return null;
		});
	}
	
	public <T> T execute(CheckedFunction<T, S> f) throws SQLException, IOException {
		S api = factory.buildIspybApi(url, user,  password, Optional.of(schema));
		T result = f.apply(api);
		api.close();
		return result;
	}
	
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
	interface CheckedSupplier<T>{
		public void apply(T t) throws SQLException;
	}
}
