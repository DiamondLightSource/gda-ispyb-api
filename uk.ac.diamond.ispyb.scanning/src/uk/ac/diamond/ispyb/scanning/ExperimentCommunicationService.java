package uk.ac.diamond.ispyb.scanning;

import java.util.List;

import uk.ac.diamond.ispyb.api.IExperimentCommunicationService;
import uk.ac.diamond.ispyb.api.Sample;

/**
 * 
 * Concrete class of IExperimentCommunicationService
 * OSGi service 
 * 
 * @author Matthew Gerring
 *
 */
public class ExperimentCommunicationService implements IExperimentCommunicationService {

	@Override
	public List<Sample> getSamples(String proposalCode, long proposalNumber) {
		if (proposalCode==null) throw new IllegalArgumentException("The proposal code must not be null!");
		
		throw new IllegalArgumentException("getSamples has not been implemented!");
	}

}
