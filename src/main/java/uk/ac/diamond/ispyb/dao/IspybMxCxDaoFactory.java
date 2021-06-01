package uk.ac.diamond.ispyb.dao;

import uk.ac.diamond.ispyb.api.IspybMxCxApi;
import uk.ac.diamond.ispyb.api.IspybMxCxFactoryService;

public class IspybMxCxDaoFactory extends IspybDaoFactory<IspybMxCxApi> implements IspybMxCxFactoryService {
    public IspybMxCxDaoFactory() {
        super(IspybMxCxDAO::new);
    }
}
