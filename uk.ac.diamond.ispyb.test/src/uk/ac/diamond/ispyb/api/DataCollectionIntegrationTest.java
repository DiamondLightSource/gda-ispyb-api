package uk.ac.diamond.ispyb.api;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import uk.ac.diamond.ispyb.dao.IspybDataCollectionDaoFactory;

public class DataCollectionIntegrationTest extends TestCase{
	private final IntegrationTestHelper<IspybDataCollectionApi> helper = new IntegrationTestHelper<>(new IspybDataCollectionDaoFactory());
	
	@Test
	public void testUpdateDataCollectionExperiment() throws SQLException, FileNotFoundException, IOException, InterruptedException {
		DataCollectionExperiment experiment = new DataCollectionExperiment();
		helper.run(api -> api.updateDataCollectionExperiment(experiment));
	}
	
	@Test
	public void testUpdateDataCollectionMachine() throws SQLException, FileNotFoundException, IOException, InterruptedException {
		DataCollectionMachine machine = new DataCollectionMachine();
		helper.run(api -> api.updateDataCollectionMachine(machine));
	}

	@Test
	public void testUpsertDataCollectionMain() throws SQLException, FileNotFoundException, IOException, InterruptedException {
		DataCollectionMain main = new DataCollectionMain();
		main.setDetectorId(4);
		main.setGroupId(988855);
		helper.run(api -> api.upsertDataCollectionMain(main));
	}
	
	@Test
	public void testUpsertDataCollectionGroup() throws SQLException, FileNotFoundException, IOException, InterruptedException {
		DataCollectionGroup dataCollectionGroup = new DataCollectionGroup();
		dataCollectionGroup.setProposalCode("cm");
		dataCollectionGroup.setProposalNumber(14451);
		dataCollectionGroup.setSessionNumber(1);
		dataCollectionGroup.setSampleId(11550);
		helper.run(api -> api.upsertDataCollectionGroup(dataCollectionGroup));
	}

	@Test
	public void testUpsertDataCollectionGroupWithTimestamp() throws SQLException, FileNotFoundException, IOException, InterruptedException {
		DataCollectionGroup dataCollectionGroup = new DataCollectionGroup();
		dataCollectionGroup.setProposalCode("cm");
		dataCollectionGroup.setProposalNumber(14451);
		dataCollectionGroup.setSessionNumber(1);
		dataCollectionGroup.setSampleId(11550);
		dataCollectionGroup.setStarttime(Timestamp.valueOf(LocalDateTime.now()));
		dataCollectionGroup.setEndtime(Timestamp.valueOf(LocalDateTime.now()));
		helper.run(api -> api.upsertDataCollectionGroup(dataCollectionGroup));
	}

	@Before
	@Override
	protected void setUp() throws Exception {
		helper.setUp();
	};
	
	@After
	@Override
	protected void tearDown() throws Exception {
		helper.tearDown();
	};
}
