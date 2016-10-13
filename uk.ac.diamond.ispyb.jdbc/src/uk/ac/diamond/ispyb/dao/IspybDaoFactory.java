package uk.ac.diamond.ispyb.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import uk.ac.diamond.ispyb.api.IspybApi;
import uk.ac.diamond.ispyb.api.IspybFactoryService;
import uk.ac.diamond.ispyb.api.Schema;

public class IspybDaoFactory implements IspybFactoryService {
	@Override
	public IspybApi build(String url, Optional<String> username, Optional<String> password, Optional<Schema> schema) throws SQLException {
		return build(url, username, password, Optional.empty(), schema);
	}
	
	@Override
	public IspybApi build(String url, Properties properties, Optional<Schema> schema) throws SQLException {
		return build(url, Optional.empty(), Optional.empty(), Optional.of(properties), schema);
	}

	private IspybApi build(String url, Optional<String> username, Optional<String> password, Optional<Properties> properties, Optional<Schema> schema) throws SQLException{
		Connection connection = connectToDatabase(url, username, password, properties);
		return new IspybDAO(makeJdbcTemplateFromConnection(connection), schema.orElse(Schema.ISPYB));
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
