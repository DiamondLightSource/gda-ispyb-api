package uk.ac.diamond.ispyb.api;

import java.io.Closeable;
import java.util.List;

public interface IspybXpdfApi extends Closeable {
    List<Sample> retrieveSamplesAssignedForProposal(String proposalCode, Long proposalNumber);
    List<SampleGroup> retrieveSampleGroupsForSample(Long sampleId);
    List<SampleGroup> retrieveSamplesForSampleGroup(Long sampleGroupId);
    List<Component> retrieveComponentsForSampleType(Long sampleTypeId);
    List<DataCollectionPlan> retrieveDataCollectionPlansForSample(Long sampleId);
    List<ComponentLattice> retrieveComponentLatticesForComponent(Long componentId);
}
