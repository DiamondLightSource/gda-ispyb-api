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
import java.util.concurrent.Future;

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
 * and always use the various API objects.
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
	
	@FunctionalInterface
	interface ISPyBOperation<T> {
		public Id operate(T bean) throws Exception;
	}

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
	 * @param sampleId
	 * @return
	 */
	SampleInformation getSampleInformation(String proposalCode, long proposalNumber, long sampleId) ;
	
	/**
	 * 
	 * @param proposalCode
	 * @param proposalNumber
	 * @param sampleIds
	 * @return Map{sampleId->SampleInformation}
	 */
	Map<Long,SampleInformation> getSampleInformation(String proposalCode, long proposalNumber, long... sampleIds) ;

    /**
     * This action is used to insert a record. Currently only a BeamlineAction may be inserted:
	 <code><pre>
		BeamlineAction beamlineAction = new BeamlineAction();
		beamlineAction.setProposalCode("cm");
		beamlineAction.setProposalNumber(14451L);
		beamlineAction.setSessionNumber(55167L);
		beamlineAction.setStartTime(new Timestamp(System.currentTimeMillis()));
		beamlineAction.setEndTime(new Timestamp(System.currentTimeMillis()));
		beamlineAction.setMessage("message");
		beamlineAction.setParameter("parameter");
		beamlineAction.setValue("value");
		beamlineAction.setLogLevel("DEBUG");
		beamlineAction.setStatus("PAUSED");
		long code = service.insert(beamlineAction, true);
	 </pre></code>
     * 
     * 
     * @param action
     * @param blocking
 	 * @return insert code or -1 if the upsert was asynchronous (non-blocking)
     * @throws IllegalArgumentException
     * @throws Exception
     */
    <T> Future<Id> insert(T action, boolean blocking)  throws IllegalArgumentException, Exception;
 
    /**
	 * The method can be used to create new records for instance:
	 
	 <code><pre>
	    DataCollectionGroup grp = new DataCollectionGroup();
		grp.setProposalCode("cm");
		grp.setProposalNumber(14451);
		grp.setSessionNumber(1);
		grp.setSampleId(11550L);
		Long dataCollectionGrpId = service.upsert(grp, true);
	 </pre></code>
		
	   This method can be used to update records for instance:
	 <code><pre>
	   	DataCollectionGroup grp = new DataCollectionGroup();
		grp.setId(dataCollectionGrpId); // We know the id which we are upserting
		grp.setComments("Hello World");
		long code = service.upsert(grp, false); // Add the job to a queue to be processed later.
	 </pre></code>

	 * 
	 * @param entry
	 * @param blocking - true if operation should be blocking. If false 
	 * @return upsert code or -1 if the upsert was asynchronous (non-blocking)
     * @throws IllegalArgumentException
     * @throws Exception
	 */
    <T> Future<Id> upsert(T entry, boolean blocking) throws IllegalArgumentException, Exception;
	
	/**
	 * The method cannot be used to create new records.		
	   This method can be used to update records for instance:
	 <code><pre>
		DataCollectionExperiment experiment = new DataCollectionExperiment();
		experiment.setId(eid); // We know the id which we are updating
		experiment.setSlipGapVertical(0.01);
		long code = service.upsert(grp, false); // Add the job to a queue to be processed later.
	 </pre></code>

	 * 
	 * @param entry
	 * @param blocking - true if operation should be blocking. If false 
	 * @return upsert code or -1 if the upsert was asynchronous (non-blocking)
     * @throws IllegalArgumentException
     * @throws Exception
	 */
    <T> Future<Id> update(T entry, boolean blocking) throws IllegalArgumentException, Exception;
	
   
    /**
     * This action allows several operations to be completed in one action.
     * The other operations allow one or more actions of the same type but 
     * this 'composite' operation allows one or more upsert/update/insert
     * to be completed. The order of processing is insert/upsert/update 
     * for a composite operation list because this allows an insert and
     * update of a record (similar to upsert!).
     * 
     * @param action
     * @param blocking
     * @return
     * @throws IllegalArgumentException
     * @throws Exception
     */
    <T> Future<Id> composite(T action, boolean blocking)  throws IllegalArgumentException, Exception;

}
