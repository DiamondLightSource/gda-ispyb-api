package uk.ac.diamond.ispyb.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import uk.ac.diamond.ispyb.api.IspybApi;
import uk.ac.diamond.ispyb.api.IspybFactoryService;

public class IspybDaoFactory implements IspybFactoryService {
	@Override
	public IspybApi build(String url, Optional<String> username, Optional<String> password) throws SQLException {
		Connection connection = connectToDatabase(url, username, password, Optional.empty());
		return new IspybDAO(makeJdbcTemplateFromConnection(connection));
	}
	
	@Override
	public IspybApi build(String url, Properties properties) throws SQLException {
		Connection connection = connectToDatabase(url, Optional.empty(), Optional.empty(), Optional.of(properties));
		return new IspybDAO(makeJdbcTemplateFromConnection(connection));
	}

	private Connection connectToDatabase(String url, Optional<String> username, Optional<String> password, Optional<Properties> properties) throws SQLException {
		SingleConnectionDataSource ds = new SingleConnectionDataSource(url, false);
		properties.ifPresent(ds::setConnectionProperties);
		username.ifPresent(ds::setUsername);
		password.ifPresent(ds::setPassword);
		return ds.getConnection();
	}

	private static JdbcTemplate makeJdbcTemplateFromConnection(Connection connection) {
		return new JdbcTemplate(new SingleConnectionDataSource(connection, true));
	}
}
