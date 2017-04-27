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
package uk.ac.diamond.ispyb.scanning.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import uk.ac.diamond.ispyb.api.IExperimentCommunicationService;
import uk.ac.diamond.ispyb.api.IspybXpdfApi;
import uk.ac.diamond.ispyb.api.IspybXpdfFactoryService;
import uk.ac.diamond.ispyb.api.Sample;
import uk.ac.diamond.ispyb.dao.IspybXpdfDaoFactory;
import uk.ac.diamond.ispyb.scanning.ExperimentCommunicationService;
import uk.ac.diamond.ispyb.test.IntegrationTestHelper;

public class ExperimentCommunicationServiceTest {

	private static IExperimentCommunicationService     service;
	private static IntegrationTestHelper<IspybXpdfApi> helper;
	
	@BeforeClass
	public static void create() throws SQLException, IOException, InterruptedException {
		IspybXpdfFactoryService factory = new IspybXpdfDaoFactory();
		helper  = new IntegrationTestHelper<>(factory);
		service = new ExperimentCommunicationService(factory);
		helper.setUp(); // Runs system command and takes a while.
	}
	
	@AfterClass
	public static void dispose() throws Exception {
		helper.tearDown();
	}
	
	@Before
	public void open() throws SQLException {
		service.open();
	}

	@After
	public void close() throws IOException {
		service.close();
	}
	
	@Test(expected=IllegalAccessError.class)
	public void twoOpens() throws SQLException {
		service.open();
	}
	
	@Test
	public void closeAndReopen() throws SQLException, IOException {
		service.close();
		service.open();
	}

	@Test(expected=IllegalArgumentException.class)
	public void checkArgs1() {
		service.getSamples(null, Long.MAX_VALUE);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void checkArgs2() {
		service.getSamples("cm", Long.MIN_VALUE);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void checkArgs3() {
		service.getSamples("cm", 0);
	}
	
	@Test
	public void checkCM14451NotNull() {
		List<Sample> samples = service.getSamples("cm", 14451L);
		assertNotNull(samples);
	}
	
	@Test
	public void checkCM14451NotEmpty() {
		List<Sample> samples = service.getSamples("cm", 14451L);
		assertFalse(samples.isEmpty());
	}
	
	@Test
	public void checkCM14451AsExpected() {
		List<Sample> samples = service.getSamples("cm", 14451L);
		Sample sample1 = new Sample();
		sample1.setSampleId(398824L);
		sample1.setSampleName("XPDF-1");
		sample1.setSampleCode("XPDF-0001");
		sample1.setSampleComments("Test sample for XPDF");
		sample1.setDimension1(0.0);
		sample1.setDimension2(0.0);
		sample1.setDimension3(0.0);
		sample1.setSampleTypeId(333308L);
		sample1.setSampleTypeName("SampleType01");
		sample1.setSampleTypeComments("sample type comments ...");
		sample1.setSampleTypeSpaceGroup("P12121");

		Sample sample2 = new Sample();
		sample2.setSampleId(398827L);
		sample2.setSampleName("XPDF-2");
		sample2.setSampleCode("XPDF-0002");
		sample2.setSampleComments("Test sample for XPDF");
		sample2.setDimension1(0.0);
		sample2.setDimension2(0.0);
		sample2.setDimension3(0.0);
		sample2.setSampleTypeId(333308L);
		sample2.setSampleTypeName("SampleType01");
		sample2.setSampleTypeComments("sample type comments ...");
		sample2.setSampleTypeSpaceGroup("P12121");

		assertThat(samples, is(equalTo(Arrays.asList(sample1, sample2))));
	}

}
