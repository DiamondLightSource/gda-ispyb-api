package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.IspybPlateApi;
import uk.ac.diamond.ispyb.api.IspybPlateFactoryService;

public class IspybPlateDaoFactory extends IspybDaoFactory<IspybPlateApi> implements IspybPlateFactoryService{
	public IspybPlateDaoFactory() {
		super(templateWrapper -> new IspybPlateDAO(templateWrapper));
	}
}
