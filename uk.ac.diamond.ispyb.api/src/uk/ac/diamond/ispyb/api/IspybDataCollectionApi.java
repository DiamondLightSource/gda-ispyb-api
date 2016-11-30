package uk.ac.diamond.ispyb.api;

import java.io.Closeable;

public interface IspybDataCollectionApi extends Closeable {
	public int upsertDataCollectionMain(DataCollectionMain dataCollectionMain);
	public int upsertDataCollectionExperiment(DataCollectionExperiment dataCollectionExperiment);
	public int upsertDataCollectionMachine(DataCollectionMachine dataCollectionMachine);
	public int upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup);
}
