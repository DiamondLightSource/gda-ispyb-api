package uk.ac.diamond.ispyb.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;
import java.util.function.Function;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import uk.ac.diamond.ispyb.api.IspybFactoryService;
import uk.ac.diamond.ispyb.api.Schema;


public class IspybDaoFactory<T> implements IspybFactoryService<T>{
	private final Function<TemplateWrapper, T> daoFactory;  
	
	public IspybDaoFactory(Function<TemplateWrapper, T> daofactory) {
		this.daoFactory = daofactory;
	}
	
	@Override
	public T buildIspybApi(String url, Optional<String> username, Optional<String> password, Optional<String> schema) throws SQLException {
		TemplateWrapper templateWrapper = buildTemplateWrapper(url, username, password, Optional.empty(), schema);
		return daoFactory.apply(templateWrapper);
	}

	@Override
	public T buildIspybApi(String url, Properties properties, Optional<String> schema) throws SQLException {
		TemplateWrapper templateWrapper = buildTemplateWrapper(url, Optional.empty(), Optional.empty(), Optional.of(properties), schema);
		return daoFactory.apply(templateWrapper);
	}

	private TemplateWrapper buildTemplateWrapper(String url, Optional<String> username, Optional<String> password, Optional<Properties> properties, Optional<String> schema) throws SQLException {
		JdbcTemplate template = makeTemplate(url, username, password, properties);
		TemplateWrapper templateWrapper = new TemplateWrapper(template, schema.orElse(Schema.ISPYB.toString()));
		return templateWrapper;
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
