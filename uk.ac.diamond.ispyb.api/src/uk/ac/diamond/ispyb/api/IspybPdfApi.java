package uk.ac.diamond.ispyb.api;

import java.sql.SQLException;
import java.util.List;

public interface IspybPdfApi {
	public List<Integer> retrieveDcPlanGroups(String session) throws SQLException;

	public List<DataCollectionPlanInfo> retrieveDcPlanInfo(int id) throws SQLException;

	public void closeConnection() throws SQLException;
}
