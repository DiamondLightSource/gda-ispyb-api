package uk.ac.diamond.ispyb.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import uk.ac.diamond.ispyb.api.IspybFactoryService;
import uk.ac.diamond.ispyb.api.Schema;

import org.mariadb.jdbc.MariaDbDataSource;
import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

public class IspybDaoFactory<T> implements IspybFactoryService<T>{
	private final BiFunction<TemplateWrapper, BeanTemplateWrapper, T> daoFactory;  
	
	public IspybDaoFactory(BiFunction<TemplateWrapper, BeanTemplateWrapper, T> daofactory) {
		this.daoFactory = daofactory;
	}
	
	@Override
	public T buildIspybApi(String url, Optional<String> username, Optional<String> password, Optional<String> schema) throws SQLException {
		TemplateWrapper templateWrapper = buildTemplateWrapper(url, username, password, Optional.empty(), schema);
		BeanTemplateWrapper beanTemplateWrapper = new BeanTemplateWrapper(templateWrapper);
		return daoFactory.apply(templateWrapper, beanTemplateWrapper);
	}

	@Override
	public T buildIspybApi(String url, Properties properties, Optional<String> schema) throws SQLException {
		TemplateWrapper templateWrapper = buildTemplateWrapper(url, Optional.empty(), Optional.empty(), Optional.of(properties), schema);
		BeanTemplateWrapper beanTemplateWrapper = new BeanTemplateWrapper(templateWrapper);
		return daoFactory.apply(templateWrapper, beanTemplateWrapper);
	}

	private TemplateWrapper buildTemplateWrapper(String url, Optional<String> username, Optional<String> password, Optional<Properties> properties, Optional<String> schema) throws SQLException {
		JdbcTemplate template = makeTemplate(url, username, password, properties);
		return new TemplateWrapper(template, schema.orElse(Schema.ISPYB.toString()), new ResultMapParser());
	}

	private JdbcTemplate makeTemplate(String url, Optional<String> username, Optional<String> password, Optional<Properties> properties) throws SQLException{
		return makeJdbcTemplateFromConnection(connectToDatabase(url, username, password, properties));
	}
	
	private DataSource connectToDatabase(String url, Optional<String> username, Optional<String> password, Optional<Properties> properties) throws SQLException {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
		dataSource.setUrl(url);
 		username.ifPresent(dataSource::setUsername);
 		password.ifPresent(dataSource::setPassword);
        dataSource.setValidationQuery("SELECT 1");
        dataSource.setTestOnBorrow(true);
        dataSource.setTestWhileIdle(true);
		return dataSource;
	}

	private static JdbcTemplate makeJdbcTemplateFromConnection(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

}
