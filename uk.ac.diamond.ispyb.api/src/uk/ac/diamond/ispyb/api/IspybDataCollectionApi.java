package uk.ac.diamond.ispyb.api;

import java.io.Closeable;

public interface IspybDataCollectionApi extends Closeable {
	public int upsertDataCollectionMain(DataCollectionMain dataCollectionMain);
	public void updateDataCollectionExperiment(DataCollectionExperiment dataCollectionExperiment);
	public void updateDataCollectionMachine(DataCollectionMachine dataCollectionMachine);
	public int upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup);
	public int upsertSampleImageAnalysis(SampleImageAnalysis sampleImageAnalysis);
}
