import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import uk.ac.diamond.ispyb.api.*;
import uk.ac.diamond.ispyb.mapper.ApiToWebServiceMapper;
import uk.ac.diamond.ispyb.soapclientsample.*;

import java.io.IOException;
import java.lang.Exception;

public class IspybDataCollectionWebServiceDAO implements IspybDataCollectionApi {
    private ApiToWebServiceMapper mapper = new ApiToWebServiceMapper();

    @Override
    public Long upsertDataCollectionMain(DataCollectionMain dataCollectionMain)  {
        return upsertCollection(dataCollectionMain);
    }

    @Override
    public void updateDataCollectionExperiment(DataCollectionExperiment dataCollectionExperiment) {
        upsertCollection(dataCollectionExperiment);
    }

    @Override
    public void updateDataCollectionMachine(DataCollectionMachine dataCollectionMachine) {
        upsertCollection(dataCollectionMachine);
    }

    @Override
    public Long upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup) {
        return upsertGroup(dataCollectionGroup);
    }

    @Override
    public Long upsertDataCollectionGroupGrid(DataCollectionGroupGrid dataCollectionGroupGrid) {
        return upsertCollection(dataCollectionGroupGrid);
    }

    private Long upsertCollection(Object object) {
        DataCollectionWS3VO dataCollectionWS3VO = mapper.map(object, DataCollectionWS3VO.class);

        try {
            return createPort().storeOrUpdateDataCollection(dataCollectionWS3VO).longValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private Long upsertGroupGrid(DataCollectionGroupGrid object) {
        DataCollectionGroupWS3VO groupWS3VO = mapper.map(object, DataCollectionGroupWS3VO.class);

        try {
            return createPort().storeOrUpdateDataCollectionGroup(groupWS3VO).longValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private Long upsertGroup(DataCollectionGroup object) {
        GridInfoWS3VO gridWS3VO = mapper.map(object, GridInfoWS3VO.class);

        try {
            return createPort().storeOrUpdateGridInfo(gridWS3VO).longValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private ToolsForCollectionWebService createPort() {
        ToolsForCollectionWebService port = new IspybWS().getToolsForCollectionWebServicePort();

        Client cxfClient = ClientProxy.getClient(port);
        cxfClient.getOutInterceptors().add(new BasicAuthOutInterceptor());

        return port;
    }

    @Override
    public void close() throws IOException {}
}
