package uk.ac.diamond.ispyb.api;

import java.sql.SQLException;

public interface IspybDataCollectionApi {
	public int upsertDataCollection(DataCollection dataCollection);
	public int upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup);
	public DataCollection retrieveDataCollectionForSubsample(int id);
	public void closeConnection() throws SQLException;	
}
