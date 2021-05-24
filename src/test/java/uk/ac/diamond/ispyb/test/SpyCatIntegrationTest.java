package uk.ac.diamond.ispyb.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import uk.ac.diamond.ispyb.api.IspybSpyCatApi;
import uk.ac.diamond.ispyb.dao.IspybSpyCatDaoFactory;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class SpyCatIntegrationTest {
    private final static IntegrationTestHelper<IspybSpyCatApi> helper = new IntegrationTestHelper<>(new IspybSpyCatDaoFactory());

    @BeforeClass
    public static void connect() throws Exception {
        helper.setUp();
    }

    @AfterClass
    public static void disconnect() throws Exception {
        helper.tearDown();
    }

    @Test
    public void testRetrieveVisitsForUser() throws SQLException, IOException, InterruptedException {
        List<String> visits = helper.execute(api -> api.retrieveVisitsForUser("i03", "boaty", 147483647));
        List<String> expected = Arrays.asList("cm14451-1", "cm14451-2");

        assertThat(visits, is(equalTo(expected)));
    }

    @Test
    public void testRetrieveLatestVisitWithPrefix() throws  SQLException, IOException, InterruptedException {
        String visit = helper.execute(api -> api.retrieveLatestVisitWithPrefix("i02-2", "cm")).get();
        String expected = "cm14451-99";

        assertThat(visit, is(equalTo(expected)));
    }

    @Test
    public void testRetrieveTitleForVisit() throws  SQLException, IOException, InterruptedException{
        String title = helper.execute(api -> api.retrieveTitleForVisit("cm", 1)).get();
        String expected = "Test Proposal cm-0001";

        assertThat(title, is(equalTo(expected)));
    }
}
