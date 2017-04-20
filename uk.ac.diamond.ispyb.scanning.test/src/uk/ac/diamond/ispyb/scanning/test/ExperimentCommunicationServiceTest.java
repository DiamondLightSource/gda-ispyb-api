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
