package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.IspybXpdfApi;
import uk.ac.diamond.ispyb.api.IspybXpdfFactoryService;

public class IspybXpdfDaoFactory extends IspybDaoFactory<IspybXpdfApi> implements IspybXpdfFactoryService{
	public IspybXpdfDaoFactory() {
		super(IspybXpdfDAO::new);
	}
}
