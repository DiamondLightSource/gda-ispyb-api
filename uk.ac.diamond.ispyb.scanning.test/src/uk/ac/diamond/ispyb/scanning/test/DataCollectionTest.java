package uk.ac.diamond.ispyb.scanning.test;

import static org.junit.Assert.assertTrue;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.junit.Test;

import uk.ac.diamond.ispyb.api.BeamlineAction;
import uk.ac.diamond.ispyb.api.DataCollectionExperiment;
import uk.ac.diamond.ispyb.api.DataCollectionGroup;
import uk.ac.diamond.ispyb.api.DataCollectionGroupGrid;
import uk.ac.diamond.ispyb.api.DataCollectionMachine;
import uk.ac.diamond.ispyb.api.DataCollectionMain;
import uk.ac.diamond.ispyb.api.Id;
import uk.ac.diamond.ispyb.api.Orientation;

public class DataCollectionTest extends ExperimentServiceTest {

	
	@Test
	public void testUpdateDataCollectionExperiment() throws Exception {
		DataCollectionExperiment experiment = new DataCollectionExperiment();
		service.update(experiment, true);
	}
	
	@Test
	public void testUpdateDataCollectionMachine() throws Exception {
		DataCollectionMachine machine = new DataCollectionMachine();
		service.update(machine, true);
	}


	@Test
	public void testUpsertDataCollectionMain() throws Exception {
		DataCollectionMain main = new DataCollectionMain();
		main.setDetectorId(4);
		main.setGroupId(988855L);
		Id id = service.upsert(main, true).get();
		assertTrue(id.is());
	}
	
	@Test
	public void testUpsertDataCollectionGroup() throws Exception {
		DataCollectionGroup dataCollectionGroup = new DataCollectionGroup();
		dataCollectionGroup.setProposalCode("cm");
		dataCollectionGroup.setProposalNumber(14451);
		dataCollectionGroup.setSessionNumber(1);
		dataCollectionGroup.setSampleId(11550L);
		Id id = service.upsert(dataCollectionGroup, true).get();
		assertTrue(id.is());
	}

	@Test
	public void testUpsertDataCollectionGroupWithoutAllFields() throws Exception {
		DataCollectionGroup dataCollectionGroup = new DataCollectionGroup();
		dataCollectionGroup.setProposalNumber(14451);
		dataCollectionGroup.setSessionNumber(1);
		dataCollectionGroup.setSampleId(11550L);
		try{
			Id id = service.upsert(dataCollectionGroup, true).get();
			assertTrue(id.is());
		} catch (UnsupportedOperationException e){
			// do nothing, expecting a sql exception
		}
	}
	
	@Test
	public void testUpsertDataCollectionGroupWithTimestamp() throws Exception {
		DataCollectionGroup dataCollectionGroup = new DataCollectionGroup();
		dataCollectionGroup.setProposalCode("cm");
		dataCollectionGroup.setProposalNumber(14451);
		dataCollectionGroup.setSessionNumber(1);
		dataCollectionGroup.setSampleId(11550L);
		dataCollectionGroup.setStarttime(Timestamp.valueOf(LocalDateTime.now()));
		dataCollectionGroup.setEndtime(Timestamp.valueOf(LocalDateTime.now()));
		Id id = service.upsert(dataCollectionGroup, true).get();
		assertTrue(id.is());
	}

	@Test
	public void testUpsertDataCollectionGroupGrid() throws Exception {
		DataCollectionGroup group = new DataCollectionGroup();
		group.setProposalCode("cm");
		group.setProposalNumber(14451);
		group.setSessionNumber(1);
		group.setSampleId(11550L);
		
		Id id = service.upsert(group, true).get();
		assertTrue(id.is());
		
		DataCollectionGroupGrid grid = new DataCollectionGroupGrid();
		grid.setDcgId(id.get());
		grid.setOrientation(Orientation.HORIZONTAL.name());
		
		id = service.upsert(grid, true).get();
		assertTrue(id.is());
	}

	@Test
	public void testInsertBeamlineAction() throws Exception {
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

		Id id = service.insert(beamlineAction, true).get();
		assertTrue(id.is());
	}

}
