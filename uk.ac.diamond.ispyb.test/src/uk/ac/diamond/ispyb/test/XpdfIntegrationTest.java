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
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import uk.ac.diamond.ispyb.api.Component;
import uk.ac.diamond.ispyb.api.ComponentLattice;
import uk.ac.diamond.ispyb.api.DataCollectionPlan;
import uk.ac.diamond.ispyb.api.IspybXpdfApi;
import uk.ac.diamond.ispyb.api.Sample;
import uk.ac.diamond.ispyb.api.SampleGroup;
import uk.ac.diamond.ispyb.api.SampleGroupType;
import uk.ac.diamond.ispyb.dao.IspybXpdfDaoFactory;

public class XpdfIntegrationTest {
	private final static IntegrationTestHelper<IspybXpdfApi> helper = new IntegrationTestHelper<>(new IspybXpdfDaoFactory());
	
	@BeforeClass
	public static void connect() throws Exception {
		helper.setUp();
	};
	
	@AfterClass
	public static void disconnect() throws Exception {
		helper.tearDown();
	};
	
	@Test
	public void testRetrieveSamplesAssignedForSession() throws SQLException, IOException, InterruptedException {
		List<Sample> samples = helper.execute(api -> api.retrieveSamplesAssignedForProposal("cm", 14451L));

		Sample sample1 = new Sample();
		sample1.setSampleId(398824L);
		sample1.setSampleName("XPDF-1");
		sample1.setSampleCode("XPDF-0001");
		sample1.setSampleComments("Test sample for XPDF");
		sample1.setSampleTypeId(333308L);
		sample1.setSampleTypeName("SampleType01");
		sample1.setSampleTypeComments("sample type comments ...");
		sample1.setSampleTypeSpaceGroup("P12121");

		Sample sample2 = new Sample();
		sample2.setSampleId(398827L);
		sample2.setSampleName("XPDF-2");
		sample2.setSampleCode("XPDF-0002");
		sample2.setSampleComments("Test sample for XPDF");
		sample2.setSampleTypeId(333308L);
		sample2.setSampleTypeName("SampleType01");
		sample2.setSampleTypeComments("sample type comments ...");
		sample2.setSampleTypeSpaceGroup("P12121");

		assertThat(samples, is(equalTo(Arrays.asList(sample1, sample2))));
	}

	@Test
	public void testRetrieveSampleGroupsForSample()throws SQLException, IOException, InterruptedException {
		List<SampleGroup> samples = helper.execute(api -> api.retrieveSampleGroupsForSample(398824L));
		SampleGroup sampleGroup = new SampleGroup();
		sampleGroup.setSampleGroupId(5L);
		sampleGroup.setOrder(1L);
		sampleGroup.setType(SampleGroupType.BACKGROUND.name());
		
		assertThat(samples , is(equalTo(Arrays.asList(sampleGroup))));
	}

	@Test
	public void testRetrieveSamplesForSampleGroups()throws SQLException, IOException, InterruptedException {
		List<SampleGroup> groups = helper.execute(api -> api.retrieveSamplesForSampleGroup(5L));
		List<SampleGroup> sampleGroups = new ArrayList<SampleGroup>();

		SampleGroup sampleGroup1 = new SampleGroup();
		sampleGroup1.setSampleId(398824L);
		sampleGroup1.setOrder(1L);
		sampleGroup1.setType(SampleGroupType.BACKGROUND.name());
		sampleGroups.add(sampleGroup1);

		SampleGroup sampleGroup2 = new SampleGroup();
		sampleGroup2.setSampleId(398827L);
		sampleGroup2.setOrder(2L);
		sampleGroup2.setType(SampleGroupType.SAMPLE.name());
		sampleGroups.add(sampleGroup2);
		
		assertThat(groups , is(equalTo(sampleGroups)));
	}

	@Test
	public void testRetrieveComponentsForSampleType()throws SQLException, IOException, InterruptedException {
		List<Component> components = helper.execute(api -> api.retrieveComponentsForSampleType(333308L));

		Component component = new Component();
		component.setComponentId(123497L);
		component.setComponentName("XPDF comp1");

		assertThat(components, is(equalTo(Arrays.asList(component))));
	}

	@Test
	public void testRetrieveDataCollectionPlansForSample()throws SQLException, IOException, InterruptedException {
		List<DataCollectionPlan> components = helper.execute(api -> api.retrieveDataCollectionPlansForSample(398824L));
		DataCollectionPlan dataCollectionPlan1 = new DataCollectionPlan();
		dataCollectionPlan1.setDcPlanId(197792L);
		dataCollectionPlan1.setName("XPDF-1");
		dataCollectionPlan1.setDetectorId(8L);
		dataCollectionPlan1.setExposureTime(5.4);
		dataCollectionPlan1.setDistance(136.86);
		dataCollectionPlan1.setRoll(45.0);
		dataCollectionPlan1.setScanParamModelId(20L);
		dataCollectionPlan1.setScanParamServiceName("Pressure");
		dataCollectionPlan1.setScanParamSequenceNumber("1");
		dataCollectionPlan1.setScanParamModelStart(0.0);
		dataCollectionPlan1.setScanParamModelStop(90.0);
		dataCollectionPlan1.setScanParamModelStep(5.0);

		DataCollectionPlan dataCollectionPlan2 = new DataCollectionPlan();
		dataCollectionPlan2.setDcPlanId(197792L);
		dataCollectionPlan2.setName("XPDF-1");
		dataCollectionPlan2.setDetectorId(8L);
		dataCollectionPlan2.setExposureTime(5.4);
		dataCollectionPlan2.setDistance(136.86);
		dataCollectionPlan2.setRoll(45.0);
		dataCollectionPlan2.setScanParamModelId(23L);
		dataCollectionPlan2.setScanParamServiceName("Pressure");
		dataCollectionPlan2.setScanParamSequenceNumber("2");
		dataCollectionPlan2.setScanParamModelStart(90.0);
		dataCollectionPlan2.setScanParamModelStop(120.0);
		dataCollectionPlan2.setScanParamModelStep(1.0);

		assertThat(components, is(equalTo(Arrays.asList(dataCollectionPlan1, dataCollectionPlan2))));
	}

	@Test
	public void testRetrieveComponentLatticesForComponent()throws SQLException, IOException, InterruptedException {
		List<ComponentLattice> lattices = helper.execute(api -> api.retrieveComponentLatticesForComponent(123497L));
		ComponentLattice componentLattice = new ComponentLattice();
		componentLattice.setSpaceGroup("P21");
		componentLattice.setA(10.1);
		componentLattice.setB(11.1);
		componentLattice.setC(12.1);
		componentLattice.setAlpha(90.1);
		componentLattice.setBeta(90.2);
		componentLattice.setGamma(90.3);

		assertThat(lattices , is(equalTo(Arrays.asList(componentLattice))));
	}
}
