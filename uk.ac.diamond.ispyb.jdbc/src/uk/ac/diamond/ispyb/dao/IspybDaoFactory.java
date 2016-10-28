package uk.ac.diamond.ispyb.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;

import uk.ac.diamond.ispyb.api.IspybDataCollectionApi;
import uk.ac.diamond.ispyb.api.IspybFactoryService;
import uk.ac.diamond.ispyb.api.IspybPdfApi;
import uk.ac.diamond.ispyb.api.IspybPlateApi;
import uk.ac.diamond.ispyb.api.Schema;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;


public class IspybDaoFactory implements IspybFactoryService {
	@Override
	public IspybPlateApi buildIspybPlateApi(String url, Properties properties, Optional<Schema> schema) throws SQLException {
		JdbcTemplate template = makeTemplate(url, Optional.empty(), Optional.empty(), Optional.of(properties));
		return new IspybPlateDAO(new TemplateWrapper(template, schema.orElse(Schema.ISPYB)));
	}

	@Override
	public IspybPdfApi buildIspybPdfApi(String url, Properties properties, Optional<Schema> schema) throws SQLException {
		JdbcTemplate template = makeTemplate(url, Optional.empty(), Optional.empty(), Optional.of(properties));
		return new IspybPdfDAO(new TemplateWrapper(template, schema.orElse(Schema.ISPYB)));
	}

	@Override
	public IspybDataCollectionApi buildIspybDataCollectionApi(String url, Properties properties, Optional<Schema> schema) throws SQLException {
		JdbcTemplate template = makeTemplate(url, Optional.empty(), Optional.empty(), Optional.of(properties));
		return new IspybDataCollectionDAO(new TemplateWrapper(template, schema.orElse(Schema.ISPYB)));
	}

	@Override
	public IspybPlateApi buildIspybPlateApi(String url, Optional<String> username, Optional<String> password,
			Optional<Schema> schema) throws SQLException {
		JdbcTemplate template = makeTemplate(url, username, password, Optional.empty());
		return new IspybPlateDAO(new TemplateWrapper(template, schema.orElse(Schema.ISPYB)));
	}

	@Override
	public IspybPdfApi buildIspybPdfApi(String url, Optional<String> username, Optional<String> password,
			Optional<Schema> schema) throws SQLException {
		JdbcTemplate template = makeTemplate(url, username, password, Optional.empty());
		return new IspybPdfDAO(new TemplateWrapper(template, schema.orElse(Schema.ISPYB)));
	}

	@Override
	public IspybDataCollectionApi buildIspybDataCollectionApi(String url, Optional<String> username, Optional<String> password,
			Optional<Schema> schema) throws SQLException {
		JdbcTemplate template = makeTemplate(url, username, password, Optional.empty());
		return new IspybDataCollectionDAO(new TemplateWrapper(template, schema.orElse(Schema.ISPYB)));
	}
	
	private JdbcTemplate makeTemplate(String url, Optional<String> username, Optional<String> password, Optional<Properties> properties) throws SQLException{
		return makeJdbcTemplateFromConnection(connectToDatabase(url, username, password, properties));
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
