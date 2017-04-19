package uk.ac.diamond.ispyb.api;

import java.util.List;

/**
 * 
 * This is a service to bridge between the needs of 
 * experimental information and the features of the API's.
 * 
 * It does not use the string 'Ispyb' in each type name as
 * this is already included in the package.
 * 
 * It may be that over time, some or all of the features
 * required for experimental information can be moved into
 * the main API. Currently the definition of what should 
 * go into this class are functions which are not readily
 * available as stored procedures but contain logic that
 * we would like to encapsulate into the API.
 * 
 * This service should never talk to the database directly
 * and always use the varuous API objects.
 * 
 * This service is designed to be exposed as a microservice
 * operating over activemq. It may either be incorporated directly
 * as an OSGi service or exposed remotely by using the request-respond
 * features of Eclipse Scanning {@link https://github.com/eclipse/scanning}
 * 
 * @author Matthew Gerring
 *
 * @see {@link http://confluence.diamond.ac.uk/display/I151/GDA-Database+Communications+Concept}
 * @see {@link http://confluence.diamond.ac.uk/display/I151/GDA-Database+Communications+Specification}
 * 
 */
public interface IExperimentCommunicationService {

	/**
	 * This method wraps 'retrieveSamplesAssignedForProposal' without doing further work.
	 * This method is guaranteed to work over JSON text protocol. 
	 * 
	 * @param proposalCode
	 * @param proposalNumber
	 * @return
	 */
	List<Sample> getSamples(String proposalCode, long proposalNumber);
}
