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

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.h2.tools.SimpleResultSet;
import org.junit.Test;

import uk.ac.diamond.ispyb.api.ContainerStatus;
import uk.ac.diamond.ispyb.api.IspybPlateApi;
import uk.ac.diamond.ispyb.api.IspybPlateFactoryService;
import uk.ac.diamond.ispyb.api.Schema;
import uk.ac.diamond.ispyb.dao.IspybPlateDaoFactory;

public class IspybPlateApiTest {
	private final IspybPlateFactoryService factory = new IspybPlateDaoFactory();

	@Test
	public void testShouldCreateApi() throws SQLException, IOException {
		String url = new H2UrlBuilder().build();
		IspybPlateApi api = factory.buildIspybApi(url, Optional.empty(), Optional.empty(),
				Optional.of(Schema.ISPYB.toString()));

		assertThat(api, is(notNullValue()));

		api.close();
	}


	public static final Long reverse(String s) {
		return Long.valueOf(new StringBuilder(s).reverse().toString());
	}

	public static final ResultSet containerInfo(String s) {
		return containerInfos(s, 1);
	}

	public static final ResultSet listOfContainerInfo(String s) {
		return containerInfos(s, 10);
	}
	
	public static final ResultSet retrieve(int id) {
		SimpleResultSet result = new SimpleResultSet();
		result.addColumn("id", Types.INTEGER, 15, 0);
		result.addRow(id);
		return result;
	}

	public static final ResultSet retrieveNoData(int id) {
		SimpleResultSet result = new SimpleResultSet();
		result.addColumn("id", Types.INTEGER, 15, 0);
		return result;
	}	

	public static final ResultSet containerInfos(String s, int rowCount) {
		SimpleResultSet result = new SimpleResultSet();
		List<String> fields = Arrays.asList("name", "type", "barcode", "beamline", "location", "imagerName",
				"imagerSerialNumber", "status");
		fields.forEach(field -> result.addColumn(field, Types.VARCHAR, 255, 0));
		result.addColumn("capacity", Types.INTEGER, 10, 0);
		result.addColumn("storageTemperature", Types.FLOAT, 10, 0);
		for (int i = 0; i < rowCount; i++) {
			result.addRow("name", "type", "barcode", "beamline", "location", "imagerName", "imagerSerialNumber",
					ContainerStatus.IN_LOCALSTORAGE.getStatus(), 5, 0.5);
		}
		return result;
	}
}
