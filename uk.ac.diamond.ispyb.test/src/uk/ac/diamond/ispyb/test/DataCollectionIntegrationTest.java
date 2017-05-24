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

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;
import uk.ac.diamond.ispyb.api.Detector;
import uk.ac.diamond.ispyb.api.BeamlineAction;
import uk.ac.diamond.ispyb.api.DataCollectionExperiment;
import uk.ac.diamond.ispyb.api.DataCollectionGroup;
import uk.ac.diamond.ispyb.api.DataCollectionGroupGrid;
import uk.ac.diamond.ispyb.api.DataCollectionMachine;
import uk.ac.diamond.ispyb.api.DataCollectionMain;
import uk.ac.diamond.ispyb.api.IspybDataCollectionApi;
import uk.ac.diamond.ispyb.api.Orientation;
import uk.ac.diamond.ispyb.dao.IspybDataCollectionDaoFactory;

public class DataCollectionIntegrationTest{
	@Test
	public void testRetrieveDetector() throws SQLException, IOException, InterruptedException {
		Detector detector = helper.execute(api -> api.retrieveDetector("1109-434")).get();
		
		Detector expected = new Detector();
		expected.setDetectorId(4L);
		expected.setType("Photon counting");
		expected.setManufacturer("In-house");
		expected.setModel("Excalibur");
		//expected.setPixelSizeHorizontal(null);
		//expected.setPixelSizeVertical(null);
		expected.setDistanceMin(100.0);
		expected.setDistanceMax(300.0);
		//expected.setTrustedPixelValueRangeLower(null);
		//expected.setTrustedPixelValueRangeUpper(null);
		//expected.setSensorThickness(null);
		//expected.setOverload(null);
		
		assertThat(detector, is(equalTo(expected)));
	}

	private final static IntegrationTestHelper<IspybDataCollectionApi> helper = new IntegrationTestHelper<>(new IspybDataCollectionDaoFactory());
	
	@BeforeClass
	public static void connect() throws Exception {
		helper.setUp();
	};
	
	@AfterClass
	public static void disconnect() throws Exception {
		helper.tearDown();
	};

	@Test
	public void testUpdateDataCollectionExperiment() throws SQLException, IOException, InterruptedException {
		DataCollectionExperiment experiment = new DataCollectionExperiment();
		helper.run(api -> api.updateDataCollectionExperiment(experiment));
	}
	
	@Test
	public void testUpdateDataCollectionMachine() throws SQLException, IOException, InterruptedException {
		DataCollectionMachine machine = new DataCollectionMachine();
		helper.run(api -> api.updateDataCollectionMachine(machine));
	}

	@Test
	public void testUpsertDataCollectionMain() throws SQLException, IOException, InterruptedException {
		DataCollectionMain main = new DataCollectionMain();
		main.setDetectorId(4);
		main.setGroupId(988855L);
		helper.run(api -> api.upsertDataCollectionMain(main));
	}
	
	@Test
	public void testUpsertDataCollectionGroup() throws SQLException, IOException, InterruptedException {
		DataCollectionGroup dataCollectionGroup = new DataCollectionGroup();
		dataCollectionGroup.setProposalCode("cm");
		dataCollectionGroup.setProposalNumber(14451);
		dataCollectionGroup.setSessionNumber(1);
		dataCollectionGroup.setSampleId(11550L);
		helper.run(api -> api.upsertDataCollectionGroup(dataCollectionGroup));
	}

	@Test
	public void testUpsertDataCollectionGroupWithoutAllFields() throws SQLException, IOException, InterruptedException {
		DataCollectionGroup dataCollectionGroup = new DataCollectionGroup();
		dataCollectionGroup.setProposalNumber(14451);
		dataCollectionGroup.setSessionNumber(1);
		dataCollectionGroup.setSampleId(11550L);
		try{
			Long id = helper.execute(api -> api.upsertDataCollectionGroup(dataCollectionGroup));
			assertThat(id, notNullValue());
		} catch (UnsupportedOperationException e){
			// do nothing, expecting a sql exception
		}
	}
	
	@Test
	public void testUpsertDataCollectionGroupWithTimestamp() throws SQLException, IOException, InterruptedException {
		DataCollectionGroup dataCollectionGroup = new DataCollectionGroup();
		dataCollectionGroup.setProposalCode("cm");
		dataCollectionGroup.setProposalNumber(14451);
		dataCollectionGroup.setSessionNumber(1);
		dataCollectionGroup.setSampleId(11550L);
		dataCollectionGroup.setStarttime(Timestamp.valueOf(LocalDateTime.now()));
		dataCollectionGroup.setEndtime(Timestamp.valueOf(LocalDateTime.now()));
		helper.run(api -> api.upsertDataCollectionGroup(dataCollectionGroup));		
	}

	@Test
	public void testUpsertDataCollectionGroupGrid() throws SQLException, IOException, InterruptedException {
		DataCollectionGroup group = new DataCollectionGroup();
		group.setProposalCode("cm");
		group.setProposalNumber(14451);
		group.setSessionNumber(1);
		group.setSampleId(11550L);
		
		Long groupId = helper.execute(api -> api.upsertDataCollectionGroup(group));
		
		DataCollectionGroupGrid grid = new DataCollectionGroupGrid();
		grid.setDcgId(groupId);
		grid.setOrientation(Orientation.HORIZONTAL.name());
		
		Long id = helper.execute(api -> api.upsertDataCollectionGroupGrid(grid));
		assertNotNull(id);
	}

	@Test
	public void testInsertBeamlineAction() throws SQLException, IOException, InterruptedException {
		BeamlineAction beamlineAction = new BeamlineAction();

		beamlineAction.setProposalCode("cm");
		beamlineAction.setProposalNumber(14451L);
		beamlineAction.setSessionNumber(55167L);
		beamlineAction.setStartTime(new Timestamp(System.currentTimeMillis()));
		beamlineAction.setEndTime(new Timestamp(System.currentTimeMillis()));
		beamlineAction.setMessage("message");
		beamlineAction.setParameter("parameter");
		beamlineAction.setValue("value");
		beamlineAction.setLogLevel("DEBUG");
		beamlineAction.setStatus("PAUSED");

		Long id = helper.execute(api -> api.insertBeamlineAction(beamlineAction));

		assertNotNull(id);
	}
	
}
