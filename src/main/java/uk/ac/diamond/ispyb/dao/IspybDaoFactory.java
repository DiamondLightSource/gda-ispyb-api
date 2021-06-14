/*-
 *******************************************************************************
 * Copyright (c) 2011, 2016 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    See git history
 *******************************************************************************/
package uk.ac.diamond.ispyb.dao;

import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import uk.ac.diamond.ispyb.api.IspybFactoryService;
import uk.ac.diamond.ispyb.api.Schema;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;
import java.util.function.BiFunction;

import java.util.logging.Level;
import java.util.logging.Logger;

public class IspybDaoFactory<T> implements IspybFactoryService<T>{
	private final BiFunction<TemplateWrapper, BeanTemplateWrapper, T> daoFactory;  
	
	public IspybDaoFactory(BiFunction<TemplateWrapper, BeanTemplateWrapper, T> daofactory) {
		this.daoFactory = daofactory;
	}
	
	@Override
	public T buildIspybApi(String url, Optional<String> username, Optional<String> password, Optional<String> schema) throws SQLException {
		TemplateWrapper templateWrapper = buildTemplateWrapper(url, username, password, Optional.empty(), schema);
		BeanTemplateWrapper beanTemplateWrapper = new BeanTemplateWrapper(templateWrapper, new ResultMapParser());
		return daoFactory.apply(templateWrapper, beanTemplateWrapper);
	}

	@Override
	public T buildIspybApi(String url, Properties properties, Optional<String> schema) throws SQLException {
		TemplateWrapper templateWrapper = buildTemplateWrapper(url, Optional.empty(), Optional.empty(), Optional.of(properties), schema);
		BeanTemplateWrapper beanTemplateWrapper = new BeanTemplateWrapper(templateWrapper, new ResultMapParser());
		return daoFactory.apply(templateWrapper, beanTemplateWrapper);
	}

	private TemplateWrapper buildTemplateWrapper(String url, Optional<String> username, Optional<String> password, Optional<Properties> properties, Optional<String> schema) throws SQLException {
		JdbcTemplate template = makeTemplate(url, username, password, properties);
		return new TemplateWrapper(template, schema.orElse(Schema.ISPYB.toString()), new ResultMapParser());
	}

	private JdbcTemplate makeTemplate(String url, Optional<String> username, Optional<String> password, Optional<Properties> properties) throws SQLException{
		return makeJdbcTemplateFromConnection(connectToDatabase(url, username, password, properties));
	}
	
	private Connection connectToDatabase(String url, Optional<String> username, Optional<String> password, Optional<Properties> properties) throws SQLException {
		Connection connection = null;
		if (url.contains("mariadb")) {
			MariaDbDataSource source = new MariaDbDataSource();

			if (url.toString().contains("?"))
				source.setUrl(url + "&useMysqlMetadata=true");
			else
				source.setUrl(url + "?useMysqlMetadata=true");

			username.ifPresent(t -> {
				try {
					source.setUserName(t);
				} catch (SQLException e) {
					Logger logger = Logger.getLogger(IspybDaoFactory.class.getName());
					logger.log(Level.SEVERE, "Unable to set database username");
				}
			});
			password.ifPresent(t -> {
				try {
					source.setPassword(t);
				} catch (SQLException e) {
					Logger logger = Logger.getLogger(IspybDaoFactory.class.getName());
					logger.log(Level.SEVERE, "Unable to set database password");
				}
			});
			connection = source.getConnection();
		} else {
			SingleConnectionDataSource ds = new SingleConnectionDataSource(url, false);
			properties.ifPresent(ds::setConnectionProperties);
			username.ifPresent(ds::setUsername);
			password.ifPresent(ds::setPassword);
			connection = ds.getConnection();
		}
		return connection;
	}

	private static JdbcTemplate makeJdbcTemplateFromConnection(Connection connection) {
		return new JdbcTemplate(new SingleConnectionDataSource(connection, false));
	}

}
