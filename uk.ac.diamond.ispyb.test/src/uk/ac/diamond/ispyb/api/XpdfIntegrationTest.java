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
		List<Sample> samples = helper.execute(api -> api.retrieveSamplesAssignedForProposal("cm", 14451L));

		Sample sample1 = new Sample();
		sample1.setSampleId(398824L);
		sample1.setSampleName("XPDF-1");
		sample1.setSampleCode("XPDF-0001");
		sample1.setSampleComments("Test sample for XPDF");
		sample1.setDimension1(0.0);
		sample1.setDimension2(0.0);
		sample1.setDimension3(0.0);
		sample1.setSampleTypeId(333308L);
		sample1.setSampleTypeName("SampleType01");
		sample1.setSampleTypeComments("sample type comments ...");
		sample1.setSampleTypeSpaceGroup("P12121");

		Sample sample2 = new Sample();
		sample2.setSampleId(398827L);
		sample2.setSampleName("XPDF-2");
		sample2.setSampleCode("XPDF-0002");
		sample2.setSampleComments("Test sample for XPDF");
		sample2.setDimension1(0.0);
		sample2.setDimension2(0.0);
		sample2.setDimension3(0.0);
		sample2.setSampleTypeId(333308L);
		sample2.setSampleTypeName("SampleType01");
		sample2.setSampleTypeComments("sample type comments ...");
		sample2.setSampleTypeSpaceGroup("P12121");

		assertThat(samples, is(equalTo(Arrays.asList(sample1, sample2))));
	}

	@Test
	public void testRetrieveSampleGroupsForSample()throws SQLException, IOException, InterruptedException {
		List<SampleGroup> groups = helper.execute(api -> api.retrieveSampleGroupsForSample(398824L));
		SampleGroup sampleGroup = new SampleGroup();
		sampleGroup.setSampleGroupId(5L);
		sampleGroup.setOrder(0L);
		assertThat(groups , is(equalTo(Arrays.asList(sampleGroup))));
	}

//	@Test
//	public void testRetrieveComponentsForSampleType()throws SQLException, IOException, InterruptedException {
//		List<Component> components = helper.execute(api -> api.retrieveComponentsForSampleType(333308));
//		assertThat(components, is(equalTo(Arrays.asList(new Component()))));
//	}
//
//	@Test
//	public void testRetrieveDataCollectionPlansForSample()throws SQLException, IOException, InterruptedException {
//		List<DataCollectionPlan> components = helper.execute(api -> api.retrieveDataCollectionPlansForSample(398824));
//		assertThat(components, is(equalTo(Arrays.asList(new DataCollectionPlan()))));
//	}
//
//	@Test
//	public void testRetrieveComponentLatticesForComponent()throws SQLException, IOException, InterruptedException {
//		List<ComponentLattice> lattices = helper.execute(api -> api.retrieveComponentLatticesForComponent(398824));
//		assertThat(lattices , is(equalTo(Arrays.asList(new ComponentLattice()))));
//	}

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