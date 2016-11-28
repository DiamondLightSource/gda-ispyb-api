package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.IspybPdfApi;
import uk.ac.diamond.ispyb.api.IspybPdfFactoryService;

public class IspybPdfDaoFactory extends IspybDaoFactory<IspybPdfApi> implements IspybPdfFactoryService{
	public IspybPdfDaoFactory() {
		super(templateWrapper -> new IspybPdfDAO(templateWrapper));
	}
}
