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
package uk.ac.diamond.ispyb.test;

import java.io.Closeable;
import java.io.File;
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

import uk.ac.diamond.ispyb.api.ConnectionData;
import uk.ac.diamond.ispyb.api.IspybFactoryService;

public class IntegrationTestHelper<S extends Closeable>{
	

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
		ConnectionData data = new ConnectionData();
		S api = factory.buildIspybApi(data.getUrl(), data.getUser(),  data.getPassword(), Optional.of(data.getSchema()));
		try {
			T result = f.apply(api);
			return result;
		} finally {
			api.close();
		}
	}
	
	public void setUp() throws IOException, SQLException, InterruptedException{
		ConnectionData data = new ConnectionData();
		Connection connection = connectToDatabase(data.getUrl(), data.getUser(),  data.getPassword(), Optional.empty());
		try {
			JdbcTemplate jdbcTemplate = new JdbcTemplate(new SingleConnectionDataSource(connection, true));
			jdbcTemplate.execute(String.format("drop database if exists %s;", data.getSchema()));
			jdbcTemplate.execute(String.format("create database %s;", data.getSchema()));
			try{
				jdbcTemplate.execute("SET GLOBAL log_bin_trust_function_creators = 1;");
			} catch (Exception e){
				// internally we use row logging, but this should work on travis
			}
			try{
				jdbcTemplate.execute("SET GLOBAL max_connections = 1000;");
			} catch (Exception e){
				// internally we do not allow connection set non-admin, but this should work on travis
			}
		} finally {
		    connection.close();
		}
		
		executeScript("schema.sql", data.getSchema());
	}

	public void tearDown() throws IOException, SQLException, InterruptedException{
		ConnectionData data = new ConnectionData();
		Connection connection = connectToDatabase(data.getUrl(), data.getUser(),  data.getPassword(), Optional.empty());
		try {
			JdbcTemplate jdbcTemplate = new JdbcTemplate(new SingleConnectionDataSource(connection, true));
			jdbcTemplate.execute(String.format("drop database if exists %s;", data.getSchema()));
		} finally {
		    connection.close();
		}
	}

	private void executeScript(String filename, String database) throws IOException, SQLException, InterruptedException {
		
		final String orig = System.getProperty("user.dir");
		try {
			// The test might be from another bundle
			File dir = new File("../uk.ac.diamond.ispyb.test");
			System.setProperty("user.dir", dir.getCanonicalPath());
			
			Resource resource = new DefaultResourceLoader().getResource(filename);
			String absolutePath = resource.getFile().getAbsolutePath();
	
			ConnectionData data = new ConnectionData();
			String command = String.format(" %s %s %s %s %s %s", data.getHost(), data.getUser().orElse("UNKNOWN"), data.getPassword().orElse(""), data.getPort().orElse("3306"), database, absolutePath);
			CommandLine commandLine;
			if (isWindows()) {
				commandLine = new CommandLine("cmd");
				commandLine.addArgument("/c");
				commandLine.addArgument("rundbscript.bat"+command);
			} else {
				commandLine = CommandLine.parse("./rundbscript.sh"+command);
			}
			DefaultExecutor executor = new DefaultExecutor();
			executor.setWorkingDirectory(dir);
			executor.execute(commandLine);
			
		} finally {
			System.setProperty("user.dir", orig);
		}
	}
	static private final boolean isWindows() {
		return (System.getProperty("os.name").indexOf("Windows") == 0);
	}

	private Connection connectToDatabase(String url, Optional<String> username, Optional<String> password, Optional<Properties> properties) throws SQLException {
		SingleConnectionDataSource ds = new SingleConnectionDataSource(url, false);
		properties.ifPresent(ds::setConnectionProperties);
		username.ifPresent(ds::setUsername);
		password.ifPresent(ds::setPassword);
		return ds.getConnection();
	}

	@FunctionalInterface
	interface CheckedFunction<S,T>{
		public S apply(T t) throws SQLException;
	}
	@FunctionalInterface
	interface CheckedSupplier<T>{
		public void apply(T t) throws SQLException;
	}
	public IspybFactoryService<S> getFactory() {
		return factory;
	}
}
