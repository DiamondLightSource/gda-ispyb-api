package uk.ac.diamond.ispyb.api;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

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
		helper.run(api -> api.upsertDataCollectionMain(new DataCollectionMain()));
	}
	
	@Test
	public void testUpsertDataCollectionGroup() throws SQLException, FileNotFoundException, IOException, InterruptedException {
		helper.run(api -> api.upsertDataCollectionGroup(new DataCollectionGroup()));
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
