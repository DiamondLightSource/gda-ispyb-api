package uk.ac.diamond.ispyb.api;

import java.io.Closeable;

public interface IspybDataCollectionApi extends Closeable {
	public Long upsertDataCollectionMain(DataCollectionMain dataCollectionMain);
	public void updateDataCollectionExperiment(DataCollectionExperiment dataCollectionExperiment);
	public void updateDataCollectionMachine(DataCollectionMachine dataCollectionMachine);
	public Long upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup);
}
