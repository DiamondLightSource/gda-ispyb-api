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
