package uk.ac.diamond.ispyb.api;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.ac.diamond.ispyb.dao.IspybXpdfDaoFactory;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class XpdfIntegrationTest extends TestCase{
	private final IntegrationTestHelper<IspybXpdfApi> helper = new IntegrationTestHelper<>(new IspybXpdfDaoFactory());
	
	@Test
	public void testRetrieveSamplesAssignedForSession() throws SQLException, IOException, InterruptedException {
		List<Sample> sample = helper.execute(api -> api.retrieveSamplesAssignedForProposal("cm", 14451L));
		assertThat(sample, is(equalTo(Arrays.asList(new Sample(), new Sample()))));
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