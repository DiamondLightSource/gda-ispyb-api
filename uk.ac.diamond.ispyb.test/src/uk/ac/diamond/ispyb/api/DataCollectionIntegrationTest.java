package uk.ac.diamond.ispyb.api;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

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
