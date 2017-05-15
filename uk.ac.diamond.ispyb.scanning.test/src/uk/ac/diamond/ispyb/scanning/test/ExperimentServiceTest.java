package uk.ac.diamond.ispyb.scanning.test;

import java.io.IOException;
import java.sql.SQLException;

import org.eclipse.scanning.api.database.IExperimentDatabaseService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import uk.ac.diamond.ispyb.api.IspybDataCollectionApi;
import uk.ac.diamond.ispyb.api.IspybXpdfApi;
import uk.ac.diamond.ispyb.dao.IspybDataCollectionDaoFactory;
import uk.ac.diamond.ispyb.dao.IspybXpdfDaoFactory;
import uk.ac.diamond.ispyb.scanning.XPDFDatabaseService;
import uk.ac.diamond.ispyb.test.IntegrationTestHelper;

public abstract class ExperimentServiceTest {
	
	protected static IExperimentDatabaseService               service;
	protected static IntegrationTestHelper<IspybXpdfApi>           xhelper;
	protected static IntegrationTestHelper<IspybDataCollectionApi> chelper;
	
	@BeforeClass
	public static void create() throws SQLException, IOException, InterruptedException {
		IspybXpdfDaoFactory xfactory = new IspybXpdfDaoFactory();
		IspybDataCollectionDaoFactory cfactory = new IspybDataCollectionDaoFactory();
		xhelper  = new IntegrationTestHelper<>(xfactory);
		chelper  = new IntegrationTestHelper<>(cfactory);
		service = new XPDFDatabaseService(xfactory, cfactory);
		xhelper.setUp(); // Runs system command and takes a while.
	}
	
	@AfterClass
	public static void dispose() throws Exception {
		xhelper.tearDown();
		chelper.tearDown();
	}
	
	@Before
	public void open() throws SQLException {
		service.open();
	}

	@After
	public void close() throws IOException {
		service.close();
	}
}
