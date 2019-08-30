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
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Database access methods handling plates
 */
public interface IspybPlateApi extends Closeable {
	Optional<String> retrieveContainerLSPosition(String barcode) throws SQLException;

	Optional<ContainerInfo> retrieveContainerInfo(String barcode) throws SQLException;

	List<ContainerInfo> retrieveContainerOnGonio(String beamline) throws SQLException;

	void updateContainerLSPosition(String barcode, int position) throws SQLException;

	void updateContainerStatus(String barcode, ContainerStatus status) throws SQLException;

	void finishContainer(String barcode) throws SQLException;

	List<ContainerLSQueueEntry> retrieveContainerLSQueue(String beamline) throws SQLException;

        List<ContainerForBeamlineAndStatusEntry> retrieveContainersOnBeamlineWithStatus(String beamline, ContainerStatus status) throws SQLException;

	Optional<Timestamp> retrieveContainerQueueWithMostRecentCompletedTimestamp(String barcode) throws SQLException;

	Optional<Date> retrieveContainerQueueTimestamp(String barcode) throws SQLException;

	List<ContainerSubsample> retrieveContainerSubsamples(String barcode) throws SQLException;

	void insertContainerError(String barcode, String error, int severity, String stackTrace) throws SQLException;

	List<DataCollectionInfo> retrieveDataCollectionInfosForSubsample(long id);

	void clearContainerError(String barcode) throws SQLException;

	Long upsertSampleImageAnalysis(SampleImageAnalysis sampleImageAnalysis);

	List<Sleeve> retrieveSleeves() throws SQLException;

	Byte upsertSleeve(Sleeve sleeve) throws SQLException;



	boolean isConnected();
}
