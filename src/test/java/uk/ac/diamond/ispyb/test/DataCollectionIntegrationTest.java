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

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import uk.ac.diamond.ispyb.api.*;
import uk.ac.diamond.ispyb.dao.IspybDataCollectionDaoFactory;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.dao.TransientDataAccessResourceException;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;

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
		main.setDetectorId(4L);
		main.setGroupId(988855L);
		main.setBlSubsampleId(2);
		helper.run(api -> api.upsertDataCollectionMain(main));
	}

	@Test
	public void testUpsertDataCollectionGroup() throws SQLException, IOException, InterruptedException {
		DataCollectionGroup dataCollectionGroup = new DataCollectionGroup();
		dataCollectionGroup.setProposalCode("cm");
		dataCollectionGroup.setProposalNumber(14451L);
		dataCollectionGroup.setSessionNumber(1L);
		dataCollectionGroup.setSampleId(11550L);
		helper.run(api -> api.upsertDataCollectionGroup(dataCollectionGroup));
	}

	@Test
	public void testUpsertDataCollectionGroupWithoutAllFields() throws SQLException, IOException, InterruptedException {
		DataCollectionGroup dataCollectionGroup = new DataCollectionGroup();
		dataCollectionGroup.setProposalNumber(14451L);
		dataCollectionGroup.setSessionNumber(1L);
		dataCollectionGroup.setSampleId(11550L);
		try{
			Long id = helper.execute(api -> api.upsertDataCollectionGroup(dataCollectionGroup));
			assertThat(id, notNullValue());
		} catch (UnsupportedOperationException | UncategorizedSQLException | TransientDataAccessResourceException e){
			// do nothing, expecting a sql exception
		}
	}

	@Test
	public void testUpsertDataCollectionGroupWithTimestamp() throws SQLException, IOException, InterruptedException {
		DataCollectionGroup dataCollectionGroup = new DataCollectionGroup();
		dataCollectionGroup.setProposalCode("cm");
		dataCollectionGroup.setProposalNumber(14451L);
		dataCollectionGroup.setSessionNumber(1L);
		dataCollectionGroup.setSampleId(11550L);
		dataCollectionGroup.setStarttime(Timestamp.valueOf(LocalDateTime.now()));
		dataCollectionGroup.setEndtime(Timestamp.valueOf(LocalDateTime.now()));
		helper.run(api -> api.upsertDataCollectionGroup(dataCollectionGroup));
	}

	@Test
	public void testUpsertDataCollectionGroupWithScanParameters() throws SQLException, IOException, InterruptedException {
		DataCollectionGroup dataCollectionGroup = new DataCollectionGroup();
		dataCollectionGroup.setProposalCode("cm");
		dataCollectionGroup.setProposalNumber(14451L);
		dataCollectionGroup.setSessionNumber(1L);
		dataCollectionGroup.setSampleId(11550L);
		String json = String.join("\n",
	"{\"menu\": {",
  "\"id\": \"file\",",
  "\"value\": \"File\",",
  "\"popup\": {",
  "  \"menuitem\": [",
  "    {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},",
  "    {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},",
  "    {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}",
  "  ]",
  "}",
  "}}");
		dataCollectionGroup.setScanParameters(json);
		helper.run(api -> api.upsertDataCollectionGroup(dataCollectionGroup));
	}

	@Test
	public void testRetrieveDataCollectionGroup() throws SQLException, IOException, InterruptedException {
		DataCollectionGroup group = new DataCollectionGroup();
		group.setProposalCode("cm");
		group.setProposalNumber(14451L);
		group.setSessionNumber(1L);
		group.setSampleId(11550L);
		Timestamp ts = Timestamp.valueOf(LocalDateTime.now().withNano(0));
		group.setStarttime(ts);
		group.setEndtime(ts);
		group.setExperimenttype("OSC");
		Long groupId = helper.execute(api -> api.upsertDataCollectionGroup(group));

		DataCollectionGroup dcg = helper.execute(api -> api.retrieveDataCollectionGroup(groupId)).get();

		DataCollectionGroup expected = new DataCollectionGroup();
		expected.setProposalCode("cm");
		expected.setProposalNumber(14451L);
		expected.setSessionNumber(1L);
		expected.setSessionId(55167L);
		expected.setSampleId(11550L);
		expected.setStarttime(ts);
		expected.setEndtime(ts);
		expected.setExperimenttype("OSC");

		assertThat(dcg, is(equalTo(expected)));
	}

	@Test
	public void testUpsertDataCollectionGrid() throws SQLException, IOException, InterruptedException {
		DataCollectionMain main = new DataCollectionMain();
		main.setDetectorId(4L);
		main.setGroupId(988855L);
		main.setBlSubsampleId(2);
		Long dcId = helper.execute(api -> api.upsertDataCollectionMain(main));

		DataCollectionGrid grid = new DataCollectionGrid();
		grid.setDcId(dcId);
		grid.setOrientation(Orientation.HORIZONTAL.name());

		Long id = helper.execute(api -> api.upsertDataCollectionGrid(grid));
		assertNotNull(id);
	}

	@Test
	public void testUpsertDataCollectionPosition() throws SQLException, IOException, InterruptedException {
		Position position = new Position();
		position.setPosX(1.0);
		position.setPosY(2.0);
		position.setPosZ(3.0);
		position.setScale(1.0);
		position.setDCId(993677L);

          helper.run(api -> api.updateDataCollectionPosition(position));
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

	@Test
	public void testUpsertRobotAction() throws SQLException, IOException, InterruptedException {
		RobotAction robotAction = new RobotAction();

		robotAction.setSessionId(339525L);
		robotAction.setSampleId(398810L);
		robotAction.setActionType("LOAD");
		robotAction.setStartTimestamp(new Timestamp(System.currentTimeMillis()));
		robotAction.setEndTimestamp(new Timestamp(System.currentTimeMillis()));
		robotAction.setStatus("SUCCESS");
		robotAction.setMessage("message");
		robotAction.setContainerLocation(3);
		robotAction.setDewarLocation(5);
		robotAction.setSampleBarcode("");
		robotAction.setSnapshotBefore("");
		robotAction.setsnapshotAfter("");

		Long id = helper.execute(api -> api.upsertRobotAction(robotAction));

		assertNotNull(id);
	}

}
