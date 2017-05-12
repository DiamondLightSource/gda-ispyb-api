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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import uk.ac.diamond.ispyb.api.Sample;
import uk.ac.diamond.ispyb.api.beans.composites.SampleInformation;

public class SampleInformationTest extends ExperimentServiceTest {
	
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
	public void checkSampleArgs1() {
		service.getSamples(null, Long.MAX_VALUE);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void checkSampleArgs2() {
		service.getSamples("cm", Long.MIN_VALUE);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void checkSampleArgs3() {
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

	@Test(expected=IllegalArgumentException.class)
	public void checkSampleInformationArgs1() {
		service.getSampleInformation(null, Long.MAX_VALUE, 398824L);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void checkSampleInformationArgs2() {
		service.getSampleInformation("cm", Long.MIN_VALUE, 398824L);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void checkSampleInformationArgs3() {
		service.getSampleInformation("cm", 0, 398824L);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void checkSampleInformationArgs4() {
		service.getSampleInformation("cm", 0, null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void checkSampleInformationArgs5() {
		service.getSampleInformation("cm", 0, new long[]{});
	}

	@Test
	public void checkCM14451InfoNotNull() {
		SampleInformation info = service.getSampleInformation("cm", 14451L, 398824L);
		assertNotNull(info);
	}
	
	@Test
	public void checkCM14451InfoSize() {
		Map<Long, SampleInformation> info = service.getSampleInformation("cm", 14451L, 398824L, 398827L);
		assertFalse(info.isEmpty());
		assertEquals(2, info.size());
	}

	@Test
	public void checkCM14451InfoComponentSize() {
		Map<Long, SampleInformation> info = service.getSampleInformation("cm", 14451L, 398824L, 398827L);
		assertEquals(1, info.get(398824L).getComponents().size());
		assertEquals(1, info.get(398824L).getLattices().size());
		assertEquals(1, info.get(398827L).getComponents().size());
		assertEquals(1, info.get(398827L).getLattices().size());
	}

}
