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
import java.util.List;
import java.util.Optional;

/**
 * Database access methods for SCM
 */
public interface IspybScmApi extends Closeable {
	public Optional<ScmSample> retrieveSample(Long sampleId, boolean useContainerSession, String authLogin) throws SQLException;
	public Optional<ScmSample> retrieveSample(String barcode, boolean useContainerSession, String authLogin) throws SQLException;
	public List<ScmSample> retrieveSamples(Long containerId, boolean useContainerSession, String authLogin) throws SQLException;
	public Optional<ScmContainer> retrieveContainer(Long containerId, boolean useContainerSession, String authLogin) throws SQLException;
	public Optional<ScmContainer> retrieveContainer(String barcode, boolean useContainerSession, String authLogin) throws SQLException;
	public List<ScmContainer> retrieveContainers(String proposalCode, String proposalNumber, Long sessionNumber, String status, String authLogin) throws SQLException;
}
