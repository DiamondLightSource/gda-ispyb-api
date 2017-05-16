package uk.ac.diamond.ispyb.scanning.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.eclipse.scanning.api.database.CompositeBean;
import org.eclipse.scanning.api.database.Id;
import org.eclipse.scanning.api.database.Operation;
import org.junit.BeforeClass;
import org.junit.Test;

import uk.ac.diamond.ispyb.api.BeamlineAction;
import uk.ac.diamond.ispyb.api.DataCollectionExperiment;
import uk.ac.diamond.ispyb.api.DataCollectionGroup;
import uk.ac.diamond.ispyb.api.DataCollectionMachine;
import uk.ac.diamond.ispyb.api.DataCollectionMain;

public abstract class AbstractCompositeTest extends ExperimentServiceTest {

	protected abstract boolean isBlocking();

	@Test(expected=IllegalArgumentException.class)
	public void checkIllegalType() {
		new CompositeBean(Operation.COMPOSITE, new Object());
	}

	@Test
	public void testTwoUpdatesComposite() throws Exception {
		Id id = service.composite(prepare2Updates(), isBlocking()).get();
		assertEquals(2, id.size()); // Two Id.NONE
	}

	@Test
	public void testTwoUpdatesUpdate() throws Exception {
		Id id = service.update(prepare2Updates(), isBlocking()).get();
		assertEquals(2, id.size()); // Two Id.NONE
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testTwoUpdatesInsert() throws Exception {
		service.insert(prepare2Updates(), true); // There are no inserts!
	}
	
	protected CompositeBean prepare2Updates() {
		DataCollectionExperiment experiment = new DataCollectionExperiment();
		DataCollectionMachine machine = new DataCollectionMachine();
		return new CompositeBean(Operation.UPDATE, experiment, machine);
	}

	@Test
	public void testTwoUpdatesOneInsertComposite() throws Exception {
		Id id = service.composite(prepare2Updates1Insert(), isBlocking()).get(); // There are no inserts!
		assertEquals(3, id.size()); // Two Id.NONE, One insert id
	}
	
	@Test
	public void testTwoUpdatesOneInsertUpdate() throws Exception {
		Id id = service.update(prepare2Updates1Insert(), isBlocking()).get(); // There are no inserts!
		assertEquals(2, id.size()); // Two Id.NONE
	}
	
	@Test
	public void testTwoUpdatesOneInsertInsert() throws Exception {
		Id id = service.insert(prepare2Updates1Insert(), isBlocking()).get(); // There are no inserts!
		assertEquals(1, id.size()); // Two Id.NONE
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testTwoUpdatesOneInsertUpsert() throws Exception {
		service.upsert(prepare2Updates1Insert(), true); // There are no inserts!
	}
	
	/**
	 * 2x update; 1x insert
	 * @return
	 */
	private CompositeBean prepare2Updates1Insert() {
		DataCollectionExperiment experiment = new DataCollectionExperiment();
		DataCollectionMachine machine = new DataCollectionMachine();
		CompositeBean cbean = new CompositeBean(Operation.UPDATE, experiment, machine);

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
		cbean.set(Operation.INSERT, beamlineAction);
		return cbean;
	}


	@Test
	public void testFourUpsertsComposite() throws Exception {
		Id id = service.composite(prepareFourUpserts(), isBlocking()).get(); // There are no inserts!
		assertEquals(2, id.size()); // Group is repeated so gets overwritten
	}

	@Test
	public void testFourUpsertsUpsert() throws Exception {
		Id id = service.upsert(prepareFourUpserts(), isBlocking()).get(); // There are no inserts!
		assertEquals(2, id.size()); // Group is repeated so gets overwritten
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testFourUpsertsInsert() throws Exception {
		service.insert(prepareFourUpserts(), true); // There are no inserts!
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testFourUpsertsUpdate() throws Exception {
		service.update(prepareFourUpserts(), true); // There are no inserts!
	}

	private CompositeBean prepareFourUpserts() {
		
		DataCollectionMain main = new DataCollectionMain();
		main.setDetectorId(4);
		main.setGroupId(988855L);

		DataCollectionGroup dc1 = new DataCollectionGroup();
		dc1.setProposalCode("cm");
		dc1.setProposalNumber(14451);
		dc1.setSessionNumber(1);
		dc1.setSampleId(11550L);

		DataCollectionGroup dc2 = new DataCollectionGroup();
		dc2.setProposalCode("cm");
		dc2.setProposalNumber(14451);
		dc2.setSessionNumber(1);
		dc2.setSampleId(11550L);
		dc2.setStarttime(Timestamp.valueOf(LocalDateTime.now()));
		dc2.setEndtime(Timestamp.valueOf(LocalDateTime.now()));

		DataCollectionGroup dc3 = new DataCollectionGroup();
		dc3.setProposalCode("cm");
		dc3.setProposalNumber(14451);
		dc3.setSessionNumber(1);
		dc3.setSampleId(11550L);
		
        return new CompositeBean(Operation.UPSERT, main, dc1, dc2, dc3);
	}
	

	@Test
	public void testBigOneComposite() throws Exception {
		Id id = service.composite(prepareBigOne(), isBlocking()).get(); 
		assertEquals(5, id.size()); 
	}
	
	@Test
	public void testBigOneInsert() throws Exception {
		Id id = service.insert(prepareBigOne(), isBlocking()).get(); 
		assertEquals(1, id.size()); 
	}
	
	@Test
	public void testBigOneUpsert() throws Exception {
		Id id = service.upsert(prepareBigOne(), isBlocking()).get(); 
		assertEquals(2, id.size()); 
	}
	
	@Test
	public void testBigOneUpdate() throws Exception {
		Id id = service.update(prepareBigOne(), isBlocking()).get(); 
		assertEquals(2, id.size()); 
	}

	private CompositeBean prepareBigOne() {
		
		DataCollectionMain main = new DataCollectionMain();
		main.setDetectorId(4);
		main.setGroupId(988855L);

		DataCollectionGroup dc1 = new DataCollectionGroup();
		dc1.setProposalCode("cm");
		dc1.setProposalNumber(14451);
		dc1.setSessionNumber(1);
		dc1.setSampleId(11550L);

		DataCollectionGroup dc2 = new DataCollectionGroup();
		dc2.setProposalCode("cm");
		dc2.setProposalNumber(14451);
		dc2.setSessionNumber(1);
		dc2.setSampleId(11550L);
		dc2.setStarttime(Timestamp.valueOf(LocalDateTime.now()));
		dc2.setEndtime(Timestamp.valueOf(LocalDateTime.now()));

		DataCollectionGroup dc3 = new DataCollectionGroup();
		dc3.setProposalCode("cm");
		dc3.setProposalNumber(14451);
		dc3.setSessionNumber(1);
		dc3.setSampleId(11550L);
		CompositeBean cbean = new CompositeBean(Operation.UPSERT, main, dc1, dc2, dc3);
	
		DataCollectionExperiment experiment = new DataCollectionExperiment();
		DataCollectionMachine machine = new DataCollectionMachine();
		cbean.set(Operation.UPDATE, experiment, machine);

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
		cbean.set(Operation.INSERT, beamlineAction);

		return cbean;
	}

}
