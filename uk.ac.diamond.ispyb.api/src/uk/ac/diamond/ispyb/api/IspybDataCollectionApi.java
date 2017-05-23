package uk.ac.diamond.ispyb.api;

import javax.xml.datatype.DatatypeConfigurationException;
import java.io.Closeable;

/**
 * Database access methods for adding data to DataCollectionMain related fields
 */
public interface IspybDataCollectionApi extends Closeable {
	public Long upsertDataCollectionMain(DataCollectionMain dataCollectionMain);
	public void updateDataCollectionExperiment(DataCollectionExperiment dataCollectionExperiment);
	public void updateDataCollectionMachine(DataCollectionMachine dataCollectionMachine);
	public Long upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup);
	public Long upsertDataCollectionGroupGrid(DataCollectionGroupGrid dataCollectionGroupGrid);
}
