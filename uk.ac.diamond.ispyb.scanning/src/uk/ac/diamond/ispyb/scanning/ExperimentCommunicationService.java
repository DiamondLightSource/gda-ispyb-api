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
package uk.ac.diamond.ispyb.scanning;

import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.osgi.framework.ServiceReference;
import org.osgi.service.component.ComponentContext;

import uk.ac.diamond.ispyb.api.ConnectionData;
import uk.ac.diamond.ispyb.api.IExperimentCommunicationService;
import uk.ac.diamond.ispyb.api.IspybXpdfApi;
import uk.ac.diamond.ispyb.api.IspybXpdfFactoryService;
import uk.ac.diamond.ispyb.api.Sample;

/**
 * 
 * Concrete class of IExperimentCommunicationService
 * OSGi service 
 * 
 * @author Matthew Gerring
 *
 */
public class ExperimentCommunicationService implements IExperimentCommunicationService, Closeable {

	// OSGi Services
	private static IspybXpdfFactoryService ispybXpdfFactoryService;
	
	// Member Data
	private IspybXpdfApi api;
	
	/** 
	 * OSGi
	 */
	public ExperimentCommunicationService() {

	}
	
	/**
	 * Testing only
	 * @param api
	 */
	public ExperimentCommunicationService(IspybXpdfFactoryService service) {
		ispybXpdfFactoryService = service;
	}
	
	@Override
	public synchronized void open() throws SQLException {
		if (api!=null) throw new IllegalAccessError();
		ConnectionData data = new ConnectionData();		
		this.api = getIspybXpdfFactoryService().buildIspybApi(data.getUrl(), data.getUser(),  data.getPassword(), Optional.of(data.getSchema()));
	}
	
	@Override
	public synchronized void close() throws IOException {
		if (api!=null) api.close();
		api=null;
	}

	@Override
	public List<Sample> getSamples(String proposalCode, long proposalNumber) {
		
		if (proposalCode==null) throw new IllegalArgumentException("The proposal code must not be null!");
		if (proposalNumber<1)   throw new IllegalArgumentException("The proposal number must not be greater than 0!");
		
		return api.retrieveSamplesAssignedForProposal(proposalCode, proposalNumber);
	}

	public static IspybXpdfFactoryService getIspybXpdfFactoryService() {
		return ispybXpdfFactoryService;
	}
	
	private static ComponentContext context;

	public void start(ComponentContext c) {
		context = c;
	}
	
	public void stop() {
		context = null;
	}
	
	public static void setIspybXpdfFactoryService(IspybXpdfFactoryService ispybXpdfFactoryService) {
		if (ispybXpdfFactoryService==null) ispybXpdfFactoryService = getService(IspybXpdfFactoryService.class);
		ExperimentCommunicationService.ispybXpdfFactoryService = ispybXpdfFactoryService;
	}
	private static <T> T getService(Class<T> clazz) {
		if (context == null) return null;
		try {
			ServiceReference<T> ref = context.getBundleContext().getServiceReference(clazz);
	        return context.getBundleContext().getService(ref);
		} catch (NullPointerException npe) {
			return null;
		}
	}

}
