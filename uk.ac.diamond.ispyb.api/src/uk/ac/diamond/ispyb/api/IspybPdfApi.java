package uk.ac.diamond.ispyb.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;

public interface IspybPdfApi {
	public List<Integer> retrieveDcPlanGroups(String session) throws DataAccessException;

	public List<DataCollectionPlanInfo> retrieveDcPlanInfo(int id) throws DataAccessException;

	public void closeConnection() throws SQLException;
}
