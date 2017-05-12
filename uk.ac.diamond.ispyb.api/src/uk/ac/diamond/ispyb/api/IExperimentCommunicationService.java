/*-
 *******************************************************************************
 * Copyright (c) 2011, 2016 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    See git history
 *******************************************************************************/
package uk.ac.diamond.ispyb.api;

import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import uk.ac.diamond.ispyb.api.beans.composites.SampleInformation;

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
public interface IExperimentCommunicationService extends Closeable {

	/**
	 * Open the connection. 
	 * A connection must be opened before it may be used
	 * A service may be open and closed multiple times
	 * @throws SQLException
	 */
	public void open() throws SQLException;
	
	/**
	 * Close the connection to the database
	 * A connection must be closed after use
	 * A service may be open and closed multiple times
	 * @throws IOException
	 */
	@Override
	public void close() throws IOException;

	/**
	 * This method wraps 'retrieveSamplesAssignedForProposal' without doing further work.
	 * This method is guaranteed to work over JSON text protocol. 
	 * 
	 * @param proposalCode
	 * @param proposalNumber
	 * @return
	 */
	List<Sample> getSamples(String proposalCode, long proposalNumber);
	
	/**
	 * 
	 * @param proposalCode
	 * @param proposalNumber
	 * @param sampleIds
	 * @return
	 */
	SampleInformation getSampleInformation(String proposalCode, long proposalNumber, long sampleIds) ;
	
	/**
	 * 
	 * @param proposalCode
	 * @param proposalNumber
	 * @param sampleIds
	 * @return Map{sampleId->SampleInformation}
	 */
	Map<Long,SampleInformation> getSampleInformation(String proposalCode, long proposalNumber, long... sampleIds) ;

}
