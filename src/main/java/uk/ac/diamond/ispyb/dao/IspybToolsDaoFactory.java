package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.IspybToolsApi;
import uk.ac.diamond.ispyb.api.IspybToolsFactoryService;

public class IspybToolsDaoFactory extends IspybDaoFactory<IspybToolsApi> implements IspybToolsFactoryService {
    public IspybToolsDaoFactory() {
        super(IspybToolsDAO::new);
    }
}
