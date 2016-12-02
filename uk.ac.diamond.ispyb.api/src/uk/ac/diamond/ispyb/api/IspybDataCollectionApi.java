package uk.ac.diamond.ispyb.api;

import java.io.Closeable;

public interface IspybDataCollectionApi extends Closeable {
	public long upsertDataCollectionMain(DataCollectionMain dataCollectionMain);
	public void updateDataCollectionExperiment(DataCollectionExperiment dataCollectionExperiment);
	public void updateDataCollectionMachine(DataCollectionMachine dataCollectionMachine);
	public long upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup);
}
