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
import uk.ac.diamond.ispyb.api.IspybXpdfApi;
import uk.ac.diamond.ispyb.dao.IspybXpdfDaoFactory;
import uk.ac.diamond.ispyb.scanning.ExperimentCommunicationService;
import uk.ac.diamond.ispyb.test.IntegrationTestHelper;

public class ExperimentCommunicationServiceTest {

	private final IntegrationTestHelper<IspybXpdfApi> helper = new IntegrationTestHelper<>(new IspybXpdfDaoFactory());

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
