package uk.ac.diamond.ispyb.dao;

import java.sql.SQLException;
import java.util.Arrays;

import org.apache.commons.beanutils.PropertyUtils;

import uk.ac.diamond.ispyb.api.DataCollection;
import uk.ac.diamond.ispyb.api.DataCollectionGroup;
import uk.ac.diamond.ispyb.api.IspybDataCollectionApi;

public class IspybDataCollectionDAO implements IspybDataCollectionApi {

	private TemplateWrapper templateWrapper;

	public IspybDataCollectionDAO(TemplateWrapper templateWrapper) {
		this.templateWrapper = templateWrapper;
	}

	@Override
	public int upsertDataCollection(DataCollection dataCollection) {
		return templateWrapper.callIspyb("upsert_dc", Integer.class, getParameters(dataCollection));
	}

	@Override
	public int upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DataCollection retrieveDataCollectionForSubsample(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeConnection() throws SQLException {
		templateWrapper.closeConnection();
	}

	public Object[] getParameters(Object bean) {
		return Arrays.stream(PropertyUtils.getPropertyDescriptors(bean.getClass()))
			.map(property -> {
				try {
					return property.getReadMethod().invoke(bean);
				} catch (Exception e) {
					throw new IllegalStateException(e);
				}
			}).toArray();
	}

}
