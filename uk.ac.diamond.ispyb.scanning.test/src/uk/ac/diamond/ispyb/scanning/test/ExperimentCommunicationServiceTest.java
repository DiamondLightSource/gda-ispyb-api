package uk.ac.diamond.ispyb.scanning.test;

import org.junit.Before;
import org.junit.Test;

import uk.ac.diamond.ispyb.api.IExperimentCommunicationService;
import uk.ac.diamond.ispyb.scanning.ExperimentCommunicationService;

public class ExperimentCommunicationServiceTest {

	private IExperimentCommunicationService service;
	
	@Before
	public void create() {
		service = new ExperimentCommunicationService();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void checkArgs() {
		service.getSamples(null, Long.MAX_VALUE);
	}
}
