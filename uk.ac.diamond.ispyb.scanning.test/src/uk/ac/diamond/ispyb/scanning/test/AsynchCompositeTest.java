package uk.ac.diamond.ispyb.scanning.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import uk.ac.diamond.ispyb.api.Id;
import uk.ac.diamond.ispyb.scanning.ExperimentCommunicationService;

public class AsynchCompositeTest extends AbstractCompositeTest {

	@Override
	protected boolean isBlocking() {
		return false;
	}

	@Test(expected=IllegalArgumentException.class)
	public void testTwoUpdatesCompositeServiceOff() throws Exception {
		try {
			service.close();
			Id id = service.composite(prepare2Updates(), false).get(); // Force use of thread
			assertEquals(2, id.size()); // Two Id.NONE
		} finally {
			service.open(); // Force thread to start
		}
	}

	@Test
	public void testStoppedWorker() throws Exception {
		try {
			service.close(); // Force thread to stop
			assertFalse(((ExperimentCommunicationService)service).isWorkerActive());
			
			service.open(); // Force thread to start
			assertTrue(((ExperimentCommunicationService)service).isWorkerActive());
			Id id = service.composite(prepare2Updates(), false).get(); // Force use of thread
			assertEquals(2, id.size()); // Two Id.NONE
			
			service.close(); // Force thread to stop
			assertFalse(((ExperimentCommunicationService)service).isWorkerActive());
		} finally {
			service.open(); // Force thread to start
		}
	}

}
