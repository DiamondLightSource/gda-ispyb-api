package uk.ac.diamond.ispyb.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uk.ac.diamond.ispyb.api.DataCollectionPlanInfo;
import uk.ac.diamond.ispyb.api.IspybPdfApi;

public class IspybPdfDAO implements IspybPdfApi {
	private final TemplateWrapper templateWrapper;

	public IspybPdfDAO(TemplateWrapper templateWrapper) {
		this.templateWrapper = templateWrapper;
	}

	@Override
	public List<Integer> retrieveDcPlanGroups(String session) throws SQLException {
		return templateWrapper.callIspybForList("retrieve_dc_plan_groups", Integer.class, map("session", session));
	}

	@Override
	public Collection<DataCollectionPlanInfo> retrieveDcPlanInfo(int id) throws SQLException {
		return templateWrapper.callIspybForAllRows("retrieve_dc_plan_info", new DataCollectionPlanInfoListExtractor(), map("id",id));
	}
	
	@Override
	public void close() throws IOException {
		try {
			templateWrapper.closeConnection();
		} catch (SQLException e) {
			throw new IOException(e);
		}
	}
	
	private Map<String, Object> map(String key, Object value) {
		Map<String, Object> map = new HashMap<>();
		map.put(key, value);
		return map;
	}

}
