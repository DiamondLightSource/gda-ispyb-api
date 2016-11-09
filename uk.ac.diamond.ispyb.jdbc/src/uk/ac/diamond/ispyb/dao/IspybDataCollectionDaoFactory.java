package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.IspybDataCollectionApi;

public class IspybDataCollectionDaoFactory extends IspybDaoFactory<IspybDataCollectionApi>{
	public IspybDataCollectionDaoFactory() {
		super(templateWrapper -> new IspybDataCollectionDAO(templateWrapper));
	}
}
