/*-
 *******************************************************************************
 * Copyright (c) 2011, 2020 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    See git history
 *******************************************************************************/
package uk.ac.diamond.ispyb.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import uk.ac.diamond.ispyb.api.*;
import uk.ac.diamond.ispyb.dao.IspybMxDaoFactory;

import java.io.IOException;
import java.sql.SQLException;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class MxIntegrationTest {
	private final static IntegrationTestHelper<IspybMxApi> helper = new IntegrationTestHelper<>(new IspybMxDaoFactory());

	@BeforeClass
	public static void connect() throws Exception {
		helper.setUp();
	};

	@AfterClass
	public static void disconnect() throws Exception {
		helper.tearDown();
	};

	@Test
	public void testRetrieveSample() throws SQLException, IOException, InterruptedException {
		MxSample mxSample1 = helper.execute(api -> api.retrieveSample(398828L, false, null)).get();

		MxSample expected = new MxSample();
		expected.setSampleId(398828L);
		expected.setContainerId(34888L);
		expected.setSampleName("hello");
		expected.setSampleCode("hello");
		expected.setSampleLocation("1");
		expected.setSampleStatus(null);
		expected.setProposalId(37027L);
		expected.setProposalCode("cm");
		expected.setProposalNumber("14451");

		assertThat(mxSample1, is(equalTo(expected)));

		MxSample mxSample2 = helper.execute(api -> api.retrieveSample(398828L, true, null)).get();

		expected.setSessionId(339535L);
		expected.setSessionNumber(99L);

		assertThat(mxSample2, is(equalTo(expected)));
	}

}
