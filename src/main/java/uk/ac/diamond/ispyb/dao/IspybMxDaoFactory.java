/*-
 *******************************************************************************
 * Copyright (c) 2011, 2020 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    See git history
 *******************************************************************************/
package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.IspybMxApi;
import uk.ac.diamond.ispyb.api.IspybMxFactoryService;

public class IspybMxDaoFactory extends IspybDaoFactory<IspybMxApi> implements IspybMxFactoryService{
	public IspybMxDaoFactory() {
		super(IspybMxDAO::new);
	}
}
