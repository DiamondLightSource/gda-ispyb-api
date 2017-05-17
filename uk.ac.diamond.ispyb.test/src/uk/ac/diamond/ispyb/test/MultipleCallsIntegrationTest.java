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

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import uk.ac.diamond.ispyb.api.ContainerInfo;
import uk.ac.diamond.ispyb.api.IspybPlateApi;
import uk.ac.diamond.ispyb.dao.IspybPlateDaoFactory;

public class MultipleCallsIntegrationTest {
	
	private final static IntegrationTestHelper<IspybPlateApi> helper = new IntegrationTestHelper<>(new IspybPlateDaoFactory());
	
	@BeforeClass
	public static void connect() throws Exception {
		helper.setUp();
	};
	
	@AfterClass
	public static void disconnect() throws Exception {
		helper.tearDown();
	};

	
	@Test
	public void testRetrieve() throws SQLException, FileNotFoundException, IOException, InterruptedException {
		ContainerInfo containerInfo = helper.execute(api -> {
			api.retrieveContainerInfo("test_plate3");
			return api.retrieveContainerInfo("test_plate3").get();
		});
		
		assertThat(containerInfo, is(notNullValue()));
		assertThat(containerInfo.getName(), is(equalTo("test_plate3")));
	}
}
