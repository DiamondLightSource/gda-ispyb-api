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
import java.sql.SQLException;
import java.util.Optional;

import org.junit.Test;

import uk.ac.diamond.ispyb.api.IspybDataCollectionApi;
import uk.ac.diamond.ispyb.api.IspybDataCollectionFactoryService;
import uk.ac.diamond.ispyb.api.Schema;
import uk.ac.diamond.ispyb.dao.IspybDataCollectionDaoFactory;

public class IspybDataCollectionApiTest {
	private final IspybDataCollectionFactoryService factory = new IspybDataCollectionDaoFactory();

	@Test
	public void testShouldCreateApi() throws SQLException, IOException {
		String url = new H2UrlBuilder().build();
		IspybDataCollectionApi api = factory.buildIspybApi(url, Optional.empty(), Optional.empty(),
				Optional.of(Schema.ISPYB.toString()));

		assertThat(api, is(notNullValue()));

		api.close();
	}
}
