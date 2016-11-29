package uk.ac.diamond.ispyb.api;

import java.io.Closeable;
import java.util.Optional;

public interface IspybDataCollectionApi extends Closeable {
	public int upsertDataCollection(DataCollection dataCollection);
	public int upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup);
	public Optional<DataCollection> retrieveDataCollectionForSubsample(int id);
}
