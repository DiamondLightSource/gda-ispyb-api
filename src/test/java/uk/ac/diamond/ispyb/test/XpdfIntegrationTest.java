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
import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

import java.nio.file.Files;
import java.nio.file.Paths;

import uk.ac.diamond.ispyb.api.*;
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
		sample1.setContainerId(34883L);
		sample1.setSampleName("XPDF-1");
		sample1.setSampleCode("XPDF-0001");
		sample1.setSampleComments("Test sample for XPDF");
		sample1.setSampleTypeId(333308L);
		sample1.setSampleTypeName("SampleType01");
		sample1.setSampleTypeComments("sample type comments ...");
		sample1.setSampleTypeSpaceGroup("P12121");

		Sample sample2 = new Sample();
		sample2.setSampleId(398827L);
		sample2.setContainerId(34883L);
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
	public void testRetrieveSamplesForSampleGroup()throws SQLException, IOException, InterruptedException {
		List<Sample> samples = helper.execute(api -> api.retrieveSamplesForSampleGroup(5L));
		List<Sample> expected = new ArrayList<Sample>();

		Sample sample1 = new Sample();
		sample1.setSampleId(398824L);
		sample1.setContainerId(34883L);
		sample1.setSampleTypeId(333308L);
		sample1.setSampleName("XPDF-1");
		sample1.setSampleCode("XPDF-0001");
		sample1.setSampleComments("Test sample for XPDF");

		sample1.setSampleTypeName("SampleType01");
		sample1.setSampleTypeComments("sample type comments ...");
		sample1.setSampleTypeSpaceGroup("P12121");

		sample1.setTypeInGroup("background");
		sample1.setOrderInGroup(1L);
		expected.add(sample1);

		Sample sample2 = new Sample();
		sample2.setSampleId(398827L);
		sample2.setContainerId(34883L);
		sample2.setSampleTypeId(333308L);
		sample2.setSampleName("XPDF-2");
		sample2.setSampleCode("XPDF-0002");
		sample2.setSampleComments("Test sample for XPDF");

		sample2.setSampleTypeName("SampleType01");
		sample2.setSampleTypeComments("sample type comments ...");
		sample2.setSampleTypeSpaceGroup("P12121");

		sample2.setTypeInGroup("sample");
		sample2.setOrderInGroup(2L);
		expected.add(sample2);

		assertThat(samples , is(equalTo(expected)));
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
	public void testRetrieveSampleTypeForSample() throws SQLException, IOException, InterruptedException {
		Optional<SampleType> sampleType = helper.execute(api -> api.retrieveSampleTypeForSample(398827L));

		SampleType expected = new SampleType();
		expected.setSampleTypeId(333308L);
		expected.setComponentId(123497L);
		expected.setName("SampleType01");
		expected.setComments("sample type comments ...");

		assertThat(sampleType.get(), is(equalTo(expected)));
	}

	@Test
	public void testRetrievePDBsForComponent()throws SQLException, IOException, InterruptedException {
		List<PDB> pdbs = helper.execute(api -> api.retrievePDBsForComponent(123497L));

		PDB pdb = new PDB();
		pdb.setPdbId(6L);
		pdb.setName("ceo2");
		pdb.setContents(new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir").toString(), "src", "test", "resources", "ceo2.cif"))));

		assertThat(pdbs, is(equalTo(Arrays.asList(pdb))));
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
	public void testRetrieveDataCollectionPlansForSampleWithScans()throws SQLException, IOException, InterruptedException {
		Optional<DataCollectionPlanInfo> result = helper.execute(api -> api.retrieveDataCollectionPlanInfoForSample(398824L));

		DataCollectionPlanInfo expected = new DataCollectionPlanInfo();
		expected.setName("XPDF-1");

		DetectorConfiguration configuration = new DetectorConfiguration();
		configuration.setExposureTime(5.4);
		configuration.setDistance(136.86);
		configuration.setRoll(45.0);

		expected.addDetectorConfiguration(configuration);

		ScanParameters scanParameters1 = new ScanParameters();
		scanParameters1.setScanParamServiceName("Pressure");
		scanParameters1.setScanParamSequenceNumber(1);
		scanParameters1.setScanParamModelStart(0.0);
		scanParameters1.setScanParamModelStop(90.0);
		scanParameters1.setScanParamModelStep(5.0);

		ScanParameters scanParameters2 = new ScanParameters();
		scanParameters2.setScanParamServiceName("Pressure");
		scanParameters2.setScanParamSequenceNumber(2);
		scanParameters2.setScanParamModelStart(90.0);
		scanParameters2.setScanParamModelStop(120.0);
		scanParameters2.setScanParamModelStep(1.0);

		expected.addScanParameter(scanParameters1, scanParameters2);

		assertThat(result.get(), is(equalTo(expected)));
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

	@Test
	public void testRetrieveContainerInfoForId()throws SQLException, IOException, InterruptedException {
		ContainerInfo containerInfo = helper.execute(api -> api.retrieveContainerInfoForId(34877L)).get();

		ContainerInfo expected = new ContainerInfo();
    expected.setDewarId(8572L);
		expected.setName("test_plate3");
		expected.setType("CrystalQuickX");
		expected.setBarcode("test_plate3");
		expected.setBeamline("i03");
		expected.setLocation("3");
		expected.setImagerName("Imager1 20c");
		expected.setImagerSerialNumber("Z125434");
		expected.setStatus(ContainerStatus.IN_STORAGE.getStatus());
		expected.setCapacity(192);
		expected.setStorageTemperature(20.0f);
		expected.setProposalCode(null);

		assertThat(containerInfo, is(equalTo(expected)));
  }

}
