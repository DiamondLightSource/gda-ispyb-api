package uk.ac.diamond.ispyb.scanning.test;

import java.io.IOException;
import java.sql.SQLException;

import org.eclipse.scanning.api.database.IExperimentDatabaseService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;

import uk.ac.diamond.ispyb.api.IspybDataCollectionApi;
import uk.ac.diamond.ispyb.api.IspybXpdfApi;
import uk.ac.diamond.ispyb.dao.IspybDataCollectionDaoFactory;
import uk.ac.diamond.ispyb.dao.IspybXpdfDaoFactory;
import uk.ac.diamond.ispyb.scanning.XPDFDatabaseService;
import uk.ac.diamond.ispyb.test.IntegrationTestHelper;

/**
 * 
 * @author Matthew Gerring
 *
 * @param <T>
 */
public abstract class ExperimentServiceTest {
	
	protected static IExperimentDatabaseService                    service;
	protected static IntegrationTestHelper<IspybXpdfApi>           xhelper;
	protected static IntegrationTestHelper<IspybDataCollectionApi> chelper;
	
	protected static void create(boolean connectXPDF, boolean connectDC) throws SQLException, IOException, InterruptedException {
		
		IspybXpdfDaoFactory xfactory = null;
		if (connectXPDF) {
			xfactory = new IspybXpdfDaoFactory();
			xhelper  = new IntegrationTestHelper<>(xfactory);
			xhelper.setUp(); // Runs system command and takes a while.
		}
		IspybDataCollectionDaoFactory cfactory=null;
		if (connectDC) {
			cfactory = new IspybDataCollectionDaoFactory();
			chelper  = new IntegrationTestHelper<>(cfactory);
			chelper.setUp(); // Runs system command and takes a while.
		}
		service  = new XPDFDatabaseService(xfactory, cfactory);
	}
	
	protected static void dispose() throws Exception {
		if (xhelper!=null) xhelper.tearDown();
		if (chelper!=null) chelper.tearDown();
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
