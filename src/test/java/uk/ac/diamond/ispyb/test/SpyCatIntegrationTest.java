package uk.ac.diamond.ispyb.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import uk.ac.diamond.ispyb.api.IspybSpyCatApi;
import uk.ac.diamond.ispyb.api.Session;
import uk.ac.diamond.ispyb.api.SessionPerson;
import uk.ac.diamond.ispyb.dao.IspybSpyCatDaoFactory;

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
    public void testRetrieveLatestVisitWithPrefix() throws SQLException, IOException, InterruptedException {
        String visit = helper.execute(api -> api.retrieveLatestVisitWithPrefix("i02-2", "cm")).get();
        String expected = "cm14451-99";

        assertThat(visit, is(equalTo(expected)));
    }

    @Test
    public void testRetrieveTitleForProposal() throws SQLException, IOException, InterruptedException{
        String title = helper.execute(api -> api.retrieveTitleForProposal("cm", 1)).get();
        String expected = "Test Proposal cm-0001";

        assertThat(title, is(equalTo(expected)));
    }

    @Test
    public void retrieveCurrentSessions() throws SQLException, IOException, InterruptedException {
        List<Session> sessions = helper.execute(api -> api.retrieveCurrentSessions("i03", 26280000));
        String expected = "cm14451-1";

        String foundSession = "";
        Iterator<Session> it = sessions.iterator();
		while (it.hasNext()) {
			Session s = it.next();
			if (s.getSession().equals(expected)) {
				foundSession = s.getSession();
                break;
			}
		}

        assertThat(foundSession, is(equalTo(expected)));
    }

    @Test
    public void testRetrievePersonsForSession() throws SQLException, IOException, InterruptedException {
        List<SessionPerson> persons = helper.execute(api -> api.retrievePersonsForSession("cm", 14451, 1));
        String expected = "boaty";

        String foundLogin = "";
        Iterator<SessionPerson> it = persons.iterator();
		while (it.hasNext()) {
			SessionPerson p = it.next();
			if (p.getLogin().equals(expected)) {
				foundLogin = p.getLogin();
                break;
			}
		}

        assertThat(foundLogin, is(equalTo(expected)));
    }

    
}
