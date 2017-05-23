import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import uk.ac.diamond.ispyb.api.*;
import uk.ac.diamond.ispyb.mapper.ApiToWebServiceMapper;
import uk.ac.diamond.ispyb.soapclientsample.DataCollectionWS3VO;
import uk.ac.diamond.ispyb.soapclientsample.Exception_Exception;
import uk.ac.diamond.ispyb.soapclientsample.IspybWS;
import uk.ac.diamond.ispyb.soapclientsample.ToolsForCollectionWebService;

import java.io.IOException;

public class IspybDataCollectionWebServiceDAO implements IspybDataCollectionApi {
    @Override
    public Long upsertDataCollectionMain(DataCollectionMain dataCollectionMain)  {
        ToolsForCollectionWebService port = new IspybWS().getToolsForCollectionWebServicePort();

        Client cxfClient = ClientProxy.getClient(port);
        cxfClient.getOutInterceptors().add(new BasicAuthOutInterceptor());

        DataCollectionWS3VO dataCollectionWS3VO = new ApiToWebServiceMapper().map(dataCollectionMain);

        try {
            return port.storeOrUpdateDataCollection(dataCollectionWS3VO).longValue();
        } catch (Exception_Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateDataCollectionExperiment(DataCollectionExperiment dataCollectionExperiment) {
        ToolsForCollectionWebService port = new IspybWS().getToolsForCollectionWebServicePort();

        Client cxfClient = ClientProxy.getClient(port);
        cxfClient.getOutInterceptors().add(new BasicAuthOutInterceptor());

        DataCollectionWS3VO dataCollectionWS3VO = new ApiToWebServiceMapper().map(dataCollectionExperiment);

        try {
            port.storeOrUpdateDataCollection(dataCollectionWS3VO);
        } catch (Exception_Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateDataCollectionMachine(DataCollectionMachine dataCollectionMachine) {

    }

    @Override
    public Long upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup) {
        return null;
    }

    @Override
    public Long upsertDataCollectionGroupGrid(DataCollectionGroupGrid dataCollectionGroupGrid) {
        return null;
    }

    @Override
    public void close() throws IOException {

    }
}
