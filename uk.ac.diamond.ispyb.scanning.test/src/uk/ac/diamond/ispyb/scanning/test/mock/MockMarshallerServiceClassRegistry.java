/*-
 * Copyright 2015 Diamond Light Source Ltd.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package uk.ac.diamond.ispyb.scanning.test.mock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.dawnsci.analysis.api.persistence.IClassRegistry;

/**
 *
 * An IClassRegistry that is used to compile all the external extension
 * IClassRegistry's into a single object, using an extension point on this
 * bundle.
 *
 * @author Martin Gaughran
 */
public class MockMarshallerServiceClassRegistry {

	private Map<String, Class<?>> idToClassMap = new HashMap<String, Class<?>>();

	public MockMarshallerServiceClassRegistry(List<IClassRegistry> extraRegistries) throws ClassRegistryDuplicateIdException, Exception {
		List<IClassRegistry> registries = new ArrayList<IClassRegistry>();
		if (extraRegistries!=null) registries.addAll(extraRegistries);

		for (IClassRegistry registry : registries) {
			populateClassMap(registry);
		}
	}

	private void populateClassMap(IClassRegistry registry) throws ClassRegistryDuplicateIdException {
		Map<String, Class<?>> registryIdToClassMap = registry.getIdToClassMap();

		for (Entry<String, Class<?>> entry : registryIdToClassMap.entrySet()) {
			Class<?> prevVal = null;

			prevVal = idToClassMap.put(entry.getKey(), entry.getValue());
			// prevVal stores previous value, if there is one
			if ((prevVal != null) && (prevVal != entry.getValue())){
				String message = "Class id clash with registry: " + registry.toString() +
						". Previous value for id " + entry.getKey() + " is " + prevVal +
						". Overwriting value is: " + entry.getValue() + ".";
				throw new ClassRegistryDuplicateIdException(message);
			}
		}
	}

	public Class<?> getClassFromId(String id) {
		return idToClassMap.get(id);
	}

	public String getIdFromClass(Class<?> clazz) {
		for (Entry<String, Class<?>> entry : idToClassMap.entrySet()) {
			if (entry.getValue().equals(clazz)) {
				return entry.getKey();
			}
		}
		return null;
	}

	public boolean isId(String id) {
		return idToClassMap.containsKey(id);
	}

	public boolean isClass(Class<?> clazz) {
		return idToClassMap.containsValue(clazz);
	}

	public class ClassRegistryDuplicateIdException extends Exception {

		public ClassRegistryDuplicateIdException(String message) {
			super(message);
		}
	}
}
