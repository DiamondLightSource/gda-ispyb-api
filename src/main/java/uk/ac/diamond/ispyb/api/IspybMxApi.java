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
package uk.ac.diamond.ispyb.api;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.Optional;

/**
 * Database access methods for MX
 */
public interface IspybMxApi extends Closeable {
	public Optional<MxSample> retrieveSample(Long sampleId, boolean useContainerSession, String authLogin) throws SQLException;
}
