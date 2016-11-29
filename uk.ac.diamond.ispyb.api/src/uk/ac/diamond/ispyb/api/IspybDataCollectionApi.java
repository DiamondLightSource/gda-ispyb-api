package uk.ac.diamond.ispyb.api;

import java.io.Closeable;
import java.util.List;
import java.util.Optional;

public interface IspybDataCollectionApi extends Closeable {
	public int upsertDataCollection(DataCollection dataCollection);
	public int upsertDataCollectionMain(DataCollectionMain dataCollectionMain);
	public int upsertDataCollectionExperiment(DataCollectionExperiment dataCollectionExperiment);
	public int upsertDataCollectionMachine(DataCollectionMachine dataCollectionMachine);
	public int upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup);
	public Optional<DataCollection> retrieveDataCollectionForSubsample(int id);
	public List<DataCollectionInfo> retrieveDataCollectionInfosForSubsample(int id);
}
