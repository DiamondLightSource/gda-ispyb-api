package uk.ac.diamond.ispyb.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import uk.ac.diamond.ispyb.dao.IspybPdfDaoFactory;
import uk.ac.diamond.ispyb.dao.IspybPlateDaoFactory;

public class PdfIntegrationTest extends TestCase{
	private final IntegrationTestHelper<IspybPdfApi> helper = new IntegrationTestHelper<>(new IspybPdfDaoFactory());
	
	@Test
	public void testDataCollectionPlanInfo() throws SQLException, FileNotFoundException, IOException, InterruptedException {
		Collection<DataCollectionPlanInfo> plans = new ArrayList<>(helper.execute(api -> api.retrieveDcPlanInfo(4)));
		
		DataCollectionPlanInfo plan = new DataCollectionPlanInfo();
		plan.setEnergy(150.0);
		plan.setPreferredBeamSizeX(160.0);
		plan.setPreferredBeamSizeY(100.0);
		plan.setExposureTime(10.0);
		plan.setDistance(162.5);
		plan.setOrientation(45.0);
		plan.setMonoBandwidth(330.6);
		plan.setDetectorType("Photon counting");
		plan.setDetectorManufacturer("In-house");
		plan.setDetectorModel("Excalibur");
		plan.setDetectorDistanceMin(100.0);
		plan.setDetectorDistanceMax(300.0);
		plan.setDensity(55.0);
		plan.setComposition("CrO3Br5Sr10");
		
		plan.addScanParameter(
				createTemperatureScan(1, 0.0, 90.0, 10.0),
				createTemperatureScan(2, 90.0, 180.0, 5.0),
				createTemperatureScan(3, 180.0, 270.0, 1.0),
				createTemperatureScan(3, 270.0, 360.0, 0.5),
				createPressureScan(4, 20.0, 120.0, 10.0)
			);
		
		assertThat(plans, is(Arrays.asList(plan)));
	}
	
	public ScanParameters createPressureScan(int number, double start, double stop, double step){
		return createScan("Pressure","Pressure in pascal (Pa)", number, start, stop, step);
	}
	
	public ScanParameters createTemperatureScan(int number, double start, double stop, double step){
		return createScan("Temperature", "Temperature in Celsius", number, start, stop, step);
	}
	
	public ScanParameters createScan(String name, String desc, int number, double start, double stop, double step){
		ScanParameters scanParameters = new ScanParameters();
		scanParameters.setScanParamServiceName(name);
		scanParameters.setScanParamServiceDesc(desc);
		scanParameters.setScanParamModelNumber(number);
		scanParameters.setScanParamModelStart(start);
		scanParameters.setScanParamModelStop(stop);
		scanParameters.setScanParamModelStep(step);
		return scanParameters;
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
