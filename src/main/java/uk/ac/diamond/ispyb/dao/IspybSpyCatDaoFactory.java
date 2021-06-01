package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.IspybSpyCatApi;
import uk.ac.diamond.ispyb.api.IspybSpyCatFactoryService;

public class IspybSpyCatDaoFactory extends IspybDaoFactory<IspybSpyCatApi> implements IspybSpyCatFactoryService {
    public IspybSpyCatDaoFactory(){ super(IspybSpyCatDAO::new);}
}
