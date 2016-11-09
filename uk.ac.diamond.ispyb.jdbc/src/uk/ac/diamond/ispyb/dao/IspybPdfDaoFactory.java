package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.IspybPdfApi;

public class IspybPdfDaoFactory extends IspybDaoFactory<IspybPdfApi>{
	public IspybPdfDaoFactory() {
		super(templateWrapper -> new IspybPdfDAO(templateWrapper));
	}
}
