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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.dawnsci.analysis.api.persistence.IClassRegistry;

public class MarshallingRegistry implements IClassRegistry {
	
	public static final Class<?>[] beanClasses = new Class[]{
			// TODO Hardcoded. If beans all in own package, could use reflection
			// Reflections reflections = new Reflections("uk.ac.diamond.ispyb.api.beans");
			// Set<Class<? extends Object>> allClasses = reflections.getSubTypesOf(Object.class);
			uk.ac.diamond.ispyb.api.BeamlineAction.class,
			uk.ac.diamond.ispyb.api.BeamlineActionStatus.class,
			uk.ac.diamond.ispyb.api.BeamlineLogLevel.class,
			uk.ac.diamond.ispyb.api.Component.class,
			uk.ac.diamond.ispyb.api.ComponentLattice.class,
			uk.ac.diamond.ispyb.api.ContainerInfo.class,
			uk.ac.diamond.ispyb.api.ContainerLSQueueEntry.class,
			uk.ac.diamond.ispyb.api.ContainerStatus.class,
			uk.ac.diamond.ispyb.api.ContainerSubsample.class,
			uk.ac.diamond.ispyb.api.DataCollectionInfo.class,
			uk.ac.diamond.ispyb.api.DataCollectionMachine.class,
			uk.ac.diamond.ispyb.api.DataCollectionMain.class,
			uk.ac.diamond.ispyb.api.DataCollectionPlan.class,
			uk.ac.diamond.ispyb.api.DataCollectionPlanInfo.class,
			uk.ac.diamond.ispyb.api.Orientation.class,
			uk.ac.diamond.ispyb.api.RotationAxis.class,
			uk.ac.diamond.ispyb.api.Sample.class,
			uk.ac.diamond.ispyb.api.SampleGroup.class,
			uk.ac.diamond.ispyb.api.SampleGroupType.class,
			uk.ac.diamond.ispyb.api.SampleImageAnalysis.class,
			uk.ac.diamond.ispyb.api.ScanParameters.class
	};


	private static final Map<String, Class<?>> idToClassMap;
	static {
		Map<String, Class<?>> tmp = new HashMap<String, Class<?>>();
		
		// These classes might not all need to be jsonable.
		// If they were in a single 'beans' package maybe we 
		// could reflect all of uk.ac.diamond.ispyb.api.beans
		// and this hard coded 
		for (Class<?> class1 : beanClasses) {
			registerClass(tmp, class1);
		}
		idToClassMap = tmp;
	}
	
	private static void registerClass(Map<String, Class<?>> map, Class<?> clazz) {
		map.put(clazz.getSimpleName(), clazz);
	}

	@Override
	public Map<String, Class<?>> getIdToClassMap() {
		return idToClassMap;
	}

}
