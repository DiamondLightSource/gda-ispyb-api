package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.IspybPlateApi;

public class IspybPlateDaoFactory extends IspybDaoFactory<IspybPlateApi>{
	public IspybPlateDaoFactory() {
		super(templateWrapper -> new IspybPlateDAO(templateWrapper));
	}
}
