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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.osgi.framework.ServiceReference;
import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.diamond.ispyb.api.BeamlineAction;
import uk.ac.diamond.ispyb.api.Component;
import uk.ac.diamond.ispyb.api.ComponentLattice;
import uk.ac.diamond.ispyb.api.CompositeBean;
import uk.ac.diamond.ispyb.api.ConnectionData;
import uk.ac.diamond.ispyb.api.DataCollectionExperiment;
import uk.ac.diamond.ispyb.api.DataCollectionGroup;
import uk.ac.diamond.ispyb.api.DataCollectionGroupGrid;
import uk.ac.diamond.ispyb.api.DataCollectionMachine;
import uk.ac.diamond.ispyb.api.DataCollectionMain;
import uk.ac.diamond.ispyb.api.IExperimentCommunicationService;
import uk.ac.diamond.ispyb.api.Id;
import uk.ac.diamond.ispyb.api.IspybDataCollectionApi;
import uk.ac.diamond.ispyb.api.IspybDataCollectionFactoryService;
import uk.ac.diamond.ispyb.api.IspybXpdfApi;
import uk.ac.diamond.ispyb.api.IspybXpdfFactoryService;
import uk.ac.diamond.ispyb.api.Operation;
import uk.ac.diamond.ispyb.api.Sample;
import uk.ac.diamond.ispyb.api.beans.composites.SampleInformation;

/**
 * 
 * Concrete class of IExperimentCommunicationService
 * OSGi service 
 * 
 * @author Matthew Gerring
 *
 */
public class ExperimentCommunicationService implements IExperimentCommunicationService, Closeable {
	
	private final static Logger logger = LoggerFactory.getLogger(ExperimentCommunicationService.class);

	// OSGi Services
	private static IspybXpdfFactoryService           ispybXpdfFactoryService;
	private static IspybDataCollectionFactoryService ispybDataCollectionFactoryService;

	// Member Data
	private IspybXpdfApi           xpdfApi;
	private IspybDataCollectionApi collectionApi;
	
	private Map<Operation, Map<Class<?>, ISPyBOperation<?>>>  operations;
	private BlockingQueue<OperationAction<?>> queue; // No need for this in the remote version.

	/** 
	 * OSGi
	 */
	public ExperimentCommunicationService() {
		operations = new HashMap<>();
		queue      = new ArrayBlockingQueue<>(37);
	}
	
	/**
	 * Testing only
	 * @param xpdfApi
	 */
	public ExperimentCommunicationService(IspybXpdfFactoryService xservice, IspybDataCollectionFactoryService cservice) {
		this();
		ispybXpdfFactoryService = xservice;
		ispybDataCollectionFactoryService = cservice;
	}
	
	@Override
	public synchronized void open() throws SQLException {
		if (xpdfApi!=null) throw new IllegalAccessError();
		ConnectionData data = new ConnectionData();		
		this.xpdfApi = getIspybXpdfFactoryService().buildIspybApi(data.getUrl(), data.getUser(),  data.getPassword(), Optional.of(data.getSchema()));
	    this.collectionApi = getIspybDataCollectionFactoryService().buildIspybApi(data.getUrl(), data.getUser(),  data.getPassword(), Optional.of(data.getSchema()));
		createOperations();
		createWorkerThead(); // TODO This would be a remote queue for the AMQ version of the service.
	}

	@Override
	public synchronized void close() throws IOException {
		if (xpdfApi!=null) xpdfApi.close();
		xpdfApi=null;
		if (collectionApi!=null) collectionApi.close();
		collectionApi=null;
		operations.clear();
		queue.clear();
		queue.add(OperationAction.EMPTY);
	}

	/**
	 * For some reason known only to the original developer, the IspybDataCollectionApi pushes 
	 * types into the method names rather than using Java types. We stop this happening here by
	 * wrapping the gorey details in generic upsert/update/insert methods. This allows the 
	 * non-blocking code to be written once for an abstracted operation.
	 */
	private void createOperations() {
		
		Map<Class<?>, ISPyBOperation<?>> inserts    = new HashMap<>();
		inserts.put(BeamlineAction.class,           (grp)->new Id(collectionApi.insertBeamlineAction((BeamlineAction)grp)));
		inserts.put(CompositeBean.class,             new CompositeOperation(this, Operation.INSERT));
		
		Map<Class<?>, ISPyBOperation<?>> upserts    = new HashMap<>();
		upserts.put(DataCollectionGroup.class,      (grp)->new Id(collectionApi.upsertDataCollectionGroup((DataCollectionGroup)grp)));
		upserts.put(DataCollectionMain.class,       (grp)->new Id(collectionApi.upsertDataCollectionMain((DataCollectionMain)grp)));
		upserts.put(DataCollectionGroupGrid.class,  (grp)->new Id(collectionApi.upsertDataCollectionGroupGrid((DataCollectionGroupGrid)grp)));
		upserts.put(CompositeBean.class,             new CompositeOperation(this, Operation.UPSERT));
		
		Map<Class<?>, ISPyBOperation<?>> updates    = new HashMap<>();
		updates.put(DataCollectionExperiment.class, (grp)->{collectionApi.updateDataCollectionExperiment((DataCollectionExperiment)grp);return Id.NONE;});
		updates.put(DataCollectionMachine.class,    (grp)->{collectionApi.updateDataCollectionMachine((DataCollectionMachine)grp);return Id.NONE;});
		updates.put(CompositeBean.class,             new CompositeOperation(this, Operation.UPDATE));

		Map<Class<?>, ISPyBOperation<?>> composites    = new HashMap<>();
		composites.put(CompositeBean.class,          new CompositeOperation(this));

		operations.put(Operation.INSERT, inserts);
		operations.put(Operation.UPSERT, upserts);
		operations.put(Operation.UPDATE, updates);
		operations.put(Operation.COMPOSITE, composites);
	}
	@Override
    public <T> Future<Id> insert(T entry, boolean blocking) throws IllegalArgumentException, Exception {
    	return execute(getOperation(Operation.INSERT, entry), entry, blocking);
    }
	@Override
    public <T> Future<Id> upsert(T entry, boolean blocking) throws IllegalArgumentException, Exception {
    	return execute(getOperation(Operation.UPSERT, entry), entry, blocking);
    }
	@Override
    public <T> Future<Id> update(T entry, boolean blocking) throws IllegalArgumentException, Exception {
    	return execute(getOperation(Operation.UPDATE, entry), entry, blocking);
    }
	@Override
    public <T> Future<Id> composite(T entry, boolean blocking) throws IllegalArgumentException, Exception {
    	return execute(getOperation(Operation.COMPOSITE, entry), entry, blocking);
    }

	@SuppressWarnings("unchecked")
	protected <T> ISPyBOperation<T> getOperation(Operation type, T bean) {
		Map<?,?> map  = operations.get(type);
		if (map==null||!map.containsKey(bean.getClass())) throw new IllegalArgumentException("No operation for "+bean.getClass());
		return (ISPyBOperation<T>)map.get(bean.getClass());
	}

    /**
     * Method executes the ISPyB operation 
     * @param isPyBOperation
     * @param entry
     * @param blocking
     * @return
     */
	protected <T> Future<Id> execute(ISPyBOperation<T> operation, T entry, boolean blocking)  throws Exception {
		if (blocking) return CompletableFuture.completedFuture(operation.operate(entry));
		
		CompletableFuture<Id> future = new CompletableFuture<>();
		queue.add(new OperationAction<>(operation, entry, future));
		return future;
	}
	
	
	private void createWorkerThead() {
		Thread asynchWorker = new Thread(()->process(), getClass().getSimpleName()+" Worker Thread");
		asynchWorker.setPriority(Thread.NORM_PRIORITY-2);
		asynchWorker.setDaemon(true);
		asynchWorker.start();
		logger.debug("Worker thread started '{}'", asynchWorker.getName());
	}
	
	private CountDownLatch workerLatch;
	
	/**
	 * Spends 50ms (maximum) waiting to see if the worker stops.
	 * @return true if worker still going, false if it really has stopped.
	 * @throws InterruptedException
	 */
	public boolean isWorkerActive() throws InterruptedException {
		return !workerLatch.await(50, TimeUnit.MILLISECONDS);
	}

	private void process() {
		try {
			workerLatch = new CountDownLatch(1);
			OperationAction<?> action;
			while((action = queue.take())!=null) {
				if (action==OperationAction.EMPTY) break;
				try {
				    action.operate();
				} catch (Exception ne) { // They do not kill our worker
					logger.error("Unabled to process operation {} with entry {}", action.operation, action.bean);
					logger.error("Original Exception:", ne);
				}
			}
		} catch (InterruptedException ne) {
			logger.debug("Worker thread interrupted!", ne);
		} finally {
			workerLatch.countDown();
		}
	}

	@Override
	public List<Sample> getSamples(String proposalCode, long proposalNumber) {
		
		if (proposalCode==null) throw new IllegalArgumentException("The proposal code must not be null!");
		if (proposalNumber<1)   throw new IllegalArgumentException("The proposal number must not be greater than 0!");
		
		return xpdfApi.retrieveSamplesAssignedForProposal(proposalCode, proposalNumber);
	}


	@Override
	public SampleInformation getSampleInformation(String proposalCode, long proposalNumber, long sampleId) {
		return getSampleInformation(proposalCode, proposalNumber, new long[]{sampleId}).values().iterator().next();
	}

	@Override
	public Map<Long, SampleInformation> getSampleInformation(String proposalCode, long proposalNumber, long... sampleIds) {
		
		if (sampleIds==null || sampleIds.length<1) throw new IllegalArgumentException("At least one sampleId must be provided");
		
		List<Long>   requiredIds = Arrays.stream(sampleIds).boxed().collect(Collectors.toList());
		List<Sample> samples     = getSamples(proposalCode, proposalNumber);
		List<Sample> rsamples    = samples.stream().filter(sample->requiredIds.contains(sample.getSampleId())).collect(Collectors.toList());
		
		Map<Long, SampleInformation> ret = new HashMap<>();
		rsamples.forEach(sample->ret.put(sample.getSampleId(), extractInformation(sample)));
			
		return ret;
	}

	private SampleInformation extractInformation(Sample sample) {
		
		SampleInformation info = new SampleInformation(sample.getSampleId());
	    info.setPlans(xpdfApi.retrieveDataCollectionPlansForSample(sample.getSampleId()));
	    
	    List<Component> components = xpdfApi.retrieveComponentsForSampleType(sample.getSampleTypeId());
	    info.setComponents(components);

	    // We flat map assuming that the component : lattices is 1:1
	    List<ComponentLattice> lattices = components.stream()
	    		                                    .flatMap(c->xpdfApi.retrieveComponentLatticesForComponent(c.getComponentId()).stream())
	    		                                    .collect(Collectors.toList());
	    info.setLattices(lattices);
	    return info;
	}

	private static class OperationAction<T> {
		
		public static final OperationAction<Object> EMPTY = new OperationAction<>(null, null, null);
		private final ISPyBOperation<T> operation;
		private final T                 bean;
		private final CompletableFuture<Id> future;
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((bean == null) ? 0 : bean.hashCode());
			result = prime * result + ((future == null) ? 0 : future.hashCode());
			result = prime * result + ((operation == null) ? 0 : operation.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OperationAction other = (OperationAction) obj;
			if (bean == null) {
				if (other.bean != null)
					return false;
			} else if (!bean.equals(other.bean))
				return false;
			if (future == null) {
				if (other.future != null)
					return false;
			} else if (!future.equals(other.future))
				return false;
			if (operation == null) {
				if (other.operation != null)
					return false;
			} else if (!operation.equals(other.operation))
				return false;
			return true;
		}

		OperationAction(ISPyBOperation<T> operation, T bean, CompletableFuture<Id> future) {
			this.operation = operation;
			this.bean      = bean;
			this.future    = future;
		}
		
		public Id operate() throws Exception {
			Id id = operation.operate(bean);
			boolean isComplete = future.complete(id);
			if (!isComplete) throw new IllegalArgumentException("The future should now be complete!");
			return id;
		}
	}
	
	
	// OSGi Services Stuff
	
	private static ComponentContext context;

	public void start(ComponentContext c) {
		context = c;
	}
	
	public void stop() {
		context = null;
	}
	
	public static IspybXpdfFactoryService getIspybXpdfFactoryService() {
		if (ispybXpdfFactoryService==null) ispybXpdfFactoryService = getService(IspybXpdfFactoryService.class);
		return ispybXpdfFactoryService;
	}
	public static void setIspybXpdfFactoryService(IspybXpdfFactoryService ispybXpdfFactoryService) {
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
	
	public static IspybDataCollectionFactoryService getIspybDataCollectionFactoryService() {
		if (ispybDataCollectionFactoryService==null) ispybDataCollectionFactoryService = getService(IspybDataCollectionFactoryService.class);
		return ispybDataCollectionFactoryService;
	}

	public static void setIspybDataCollectionFactoryService(IspybDataCollectionFactoryService ispybDataCollectionFactoryService) {
		ExperimentCommunicationService.ispybDataCollectionFactoryService = ispybDataCollectionFactoryService;
	}

}
