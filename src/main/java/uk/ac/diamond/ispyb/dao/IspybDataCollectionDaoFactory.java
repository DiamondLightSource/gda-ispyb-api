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
package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.IspybDataCollectionApi;
import uk.ac.diamond.ispyb.api.IspybDataCollectionFactoryService;

public class IspybDataCollectionDaoFactory extends IspybDaoFactory<IspybDataCollectionApi> implements IspybDataCollectionFactoryService{
	public IspybDataCollectionDaoFactory() {
		super(IspybDataCollectionDAO::new);
	}
}
