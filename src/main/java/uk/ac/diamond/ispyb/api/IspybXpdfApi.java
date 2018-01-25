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
import java.util.List;
import java.util.Optional;

/**
 * Database access methods for XPDF specific sample handling
 */
public interface IspybXpdfApi extends Closeable {
    List<Sample> retrieveSamplesAssignedForProposal(String proposalCode, Long proposalNumber);
    List<SampleGroup> retrieveSampleGroupsForSample(Long sampleId);
    List<Sample> retrieveSamplesForSampleGroup(Long sampleGroupId);
    List<Component> retrieveComponentsForSampleType(Long sampleTypeId);
    List<DataCollectionPlan> retrieveDataCollectionPlansForSample(Long sampleId);
    Optional<DataCollectionPlanInfo> retrieveDataCollectionPlanInfoForSample(Long sampleId);
    List<ComponentLattice> retrieveComponentLatticesForComponent(Long componentId);
    Optional<ContainerInfo> retrieveContainerInfoForId(Long containerId) throws SQLException;
    Optional<SampleType> retrieveSampleTypeForSample(Long sampleId) throws SQLException;
    List<PDB> retrievePDBsForComponent(Long componentId) throws SQLException;
}
