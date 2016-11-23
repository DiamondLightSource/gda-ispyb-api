package uk.ac.diamond.ispyb.api;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public interface IspybPdfApi extends Closeable {
	public List<Integer> retrieveDcPlanGroups(String session) throws SQLException;

	public Collection<DataCollectionPlanInfo> retrieveDcPlanInfo(int id) throws SQLException;
}
