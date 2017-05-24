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
package uk.ac.diamond.ispyb.api;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.Optional;

/**
 * Database access methods for adding data to DataCollectionMain related fields
 */
public interface IspybDataCollectionApi extends Closeable {
     public Optional<Detector> retrieveDetector(String serialNumber) throws SQLException;
	public Long upsertDataCollectionMain(DataCollectionMain dataCollectionMain);
	public void updateDataCollectionExperiment(DataCollectionExperiment dataCollectionExperiment);
	public void updateDataCollectionMachine(DataCollectionMachine dataCollectionMachine);
	public Long upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup);
	public Long upsertDataCollectionGroupGrid(DataCollectionGroupGrid dataCollectionGroupGrid);
	public Long insertBeamlineAction(BeamlineAction beamlineAction);
}
