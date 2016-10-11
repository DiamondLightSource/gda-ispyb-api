package uk.ac.diamond.ispyb.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import uk.ac.diamond.ispyb.api.IspybApi;
import uk.ac.diamond.ispyb.api.IspybFactoryService;

public class IspybDaoFactory implements IspybFactoryService {
	@Override
	public IspybApi build(String url, Optional<String> username, Optional<String> password) throws SQLException {
		Connection connection = connectToDatabase(url, username, password);
		return new IspybDAO(makeJdbcTemplateFromConnection(connection));
	}
	
	private Connection connectToDatabase(String url, Optional<String> username, Optional<String> password) throws SQLException {
		SingleConnectionDataSource ds = new SingleConnectionDataSource(url, false);
		username.ifPresent(ds::setUsername);
		password.ifPresent(ds::setPassword);
		return ds.getConnection();
	}

	private static JdbcTemplate makeJdbcTemplateFromConnection(Connection connection) {
		return new JdbcTemplate(new SingleConnectionDataSource(connection, true));
	}
}
