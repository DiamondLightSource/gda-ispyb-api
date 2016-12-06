package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.IspybDataCollectionApi;
import uk.ac.diamond.ispyb.api.IspybDataCollectionFactoryService;

public class IspybDataCollectionDaoFactory extends IspybDaoFactory<IspybDataCollectionApi> implements IspybDataCollectionFactoryService{
	public IspybDataCollectionDaoFactory() {
		super((templateWrapper, beanTemplateWrapper) -> new IspybDataCollectionDAO(templateWrapper, beanTemplateWrapper));
	}
}
