
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.ac.diamond.ispyb.soapclientsample package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Echo_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "echo");
    private final static QName _EchoResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "echoResponse");
    private final static QName _FindDataCollection_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "findDataCollection");
    private final static QName _FindDataCollectionFromFileLocationAndFileName_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "findDataCollectionFromFileLocationAndFileName");
    private final static QName _FindDataCollectionFromFileLocationAndFileNameResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "findDataCollectionFromFileLocationAndFileNameResponse");
    private final static QName _FindDataCollectionFromImageDirectoryAndImagePrefixAndNumber_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "findDataCollectionFromImageDirectoryAndImagePrefixAndNumber");
    private final static QName _FindDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "findDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse");
    private final static QName _FindDataCollectionGroup_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "findDataCollectionGroup");
    private final static QName _FindDataCollectionGroupResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "findDataCollectionGroupResponse");
    private final static QName _FindDataCollectionResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "findDataCollectionResponse");
    private final static QName _FindDetectorByParam_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "findDetectorByParam");
    private final static QName _FindDetectorByParamResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "findDetectorByParamResponse");
    private final static QName _FindSession_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "findSession");
    private final static QName _FindSessionResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "findSessionResponse");
    private final static QName _FindSessionsByProposalAndBeamLine_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "findSessionsByProposalAndBeamLine");
    private final static QName _FindSessionsByProposalAndBeamLineResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "findSessionsByProposalAndBeamLineResponse");
    private final static QName _GetDataCollectionInfo_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "getDataCollectionInfo");
    private final static QName _GetDataCollectionInfoResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "getDataCollectionInfoResponse");
    private final static QName _GetPdbFilePath_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "getPdbFilePath");
    private final static QName _GetPdbFilePathResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "getPdbFilePathResponse");
    private final static QName _GetXDSInfo_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "getXDSInfo");
    private final static QName _GetXDSInfoResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "getXDSInfoResponse");
    private final static QName _GroupDataCollections_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "groupDataCollections");
    private final static QName _GroupDataCollectionsResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "groupDataCollectionsResponse");
    private final static QName _SetBestWilsonPlotPath_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "setBestWilsonPlotPath");
    private final static QName _SetBestWilsonPlotPathResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "setBestWilsonPlotPathResponse");
    private final static QName _SetDataCollectionPosition_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "setDataCollectionPosition");
    private final static QName _SetDataCollectionPositionResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "setDataCollectionPositionResponse");
    private final static QName _SetDataCollectionsPositions_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "setDataCollectionsPositions");
    private final static QName _SetDataCollectionsPositionsResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "setDataCollectionsPositionsResponse");
    private final static QName _SetImageQualityIndicatorsPlot_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "setImageQualityIndicatorsPlot");
    private final static QName _SetImageQualityIndicatorsPlotResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "setImageQualityIndicatorsPlotResponse");
    private final static QName _SetImagesPositions_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "setImagesPositions");
    private final static QName _SetImagesPositionsResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "setImagesPositionsResponse");
    private final static QName _StoreOrUpdateBeamLineSetup_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateBeamLineSetup");
    private final static QName _StoreOrUpdateBeamLineSetupResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateBeamLineSetupResponse");
    private final static QName _StoreOrUpdateDataCollection_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateDataCollection");
    private final static QName _StoreOrUpdateDataCollectionGroup_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateDataCollectionGroup");
    private final static QName _StoreOrUpdateDataCollectionGroupResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateDataCollectionGroupResponse");
    private final static QName _StoreOrUpdateDataCollectionResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateDataCollectionResponse");
    private final static QName _StoreOrUpdateEnergyScan_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateEnergyScan");
    private final static QName _StoreOrUpdateEnergyScanResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateEnergyScanResponse");
    private final static QName _StoreOrUpdateGridInfo_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateGridInfo");
    private final static QName _StoreOrUpdateGridInfoResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateGridInfoResponse");
    private final static QName _StoreOrUpdateImage_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateImage");
    private final static QName _StoreOrUpdateImageResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateImageResponse");
    private final static QName _StoreOrUpdatePosition_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdatePosition");
    private final static QName _StoreOrUpdatePositionResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdatePositionResponse");
    private final static QName _StoreOrUpdateSession_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateSession");
    private final static QName _StoreOrUpdateSessionResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateSessionResponse");
    private final static QName _StoreOrUpdateWorkflow_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateWorkflow");
    private final static QName _StoreOrUpdateWorkflowMesh_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateWorkflowMesh");
    private final static QName _StoreOrUpdateWorkflowMeshResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateWorkflowMeshResponse");
    private final static QName _StoreOrUpdateWorkflowResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateWorkflowResponse");
    private final static QName _StoreOrUpdateXFEFluorescenceSpectrum_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateXFEFluorescenceSpectrum");
    private final static QName _StoreOrUpdateXFEFluorescenceSpectrumResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeOrUpdateXFEFluorescenceSpectrumResponse");
    private final static QName _StoreRobotAction_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeRobotAction");
    private final static QName _StoreRobotActionResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeRobotActionResponse");
    private final static QName _StoreWorkflowStep_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeWorkflowStep");
    private final static QName _StoreWorkflowStepResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "storeWorkflowStepResponse");
    private final static QName _UpdateDataCollectionGroupWorkflowId_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "updateDataCollectionGroupWorkflowId");
    private final static QName _UpdateDataCollectionGroupWorkflowIdResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "updateDataCollectionGroupWorkflowIdResponse");
    private final static QName _UpdateDataCollectionStatus_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "updateDataCollectionStatus");
    private final static QName _UpdateDataCollectionStatusResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "updateDataCollectionStatusResponse");
    private final static QName _UpdateWorkflowStatus_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "updateWorkflowStatus");
    private final static QName _UpdateWorkflowStatusResponse_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "updateWorkflowStatusResponse");
    private final static QName _Exception_QNAME = new QName("http://ispyb.ejb3.webservices.collection", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.ac.diamond.ispyb.soapclientsample
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Echo }
     * 
     */
    public Echo createEcho() {
        return new Echo();
    }

    /**
     * Create an instance of {@link EchoResponse }
     * 
     */
    public EchoResponse createEchoResponse() {
        return new EchoResponse();
    }

    /**
     * Create an instance of {@link FindDataCollection }
     * 
     */
    public FindDataCollection createFindDataCollection() {
        return new FindDataCollection();
    }

    /**
     * Create an instance of {@link FindDataCollectionFromFileLocationAndFileName }
     * 
     */
    public FindDataCollectionFromFileLocationAndFileName createFindDataCollectionFromFileLocationAndFileName() {
        return new FindDataCollectionFromFileLocationAndFileName();
    }

    /**
     * Create an instance of {@link FindDataCollectionFromFileLocationAndFileNameResponse }
     * 
     */
    public FindDataCollectionFromFileLocationAndFileNameResponse createFindDataCollectionFromFileLocationAndFileNameResponse() {
        return new FindDataCollectionFromFileLocationAndFileNameResponse();
    }

    /**
     * Create an instance of {@link FindDataCollectionFromImageDirectoryAndImagePrefixAndNumber }
     * 
     */
    public FindDataCollectionFromImageDirectoryAndImagePrefixAndNumber createFindDataCollectionFromImageDirectoryAndImagePrefixAndNumber() {
        return new FindDataCollectionFromImageDirectoryAndImagePrefixAndNumber();
    }

    /**
     * Create an instance of {@link FindDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse }
     * 
     */
    public FindDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse createFindDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse() {
        return new FindDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse();
    }

    /**
     * Create an instance of {@link FindDataCollectionGroup }
     * 
     */
    public FindDataCollectionGroup createFindDataCollectionGroup() {
        return new FindDataCollectionGroup();
    }

    /**
     * Create an instance of {@link FindDataCollectionGroupResponse }
     * 
     */
    public FindDataCollectionGroupResponse createFindDataCollectionGroupResponse() {
        return new FindDataCollectionGroupResponse();
    }

    /**
     * Create an instance of {@link FindDataCollectionResponse }
     * 
     */
    public FindDataCollectionResponse createFindDataCollectionResponse() {
        return new FindDataCollectionResponse();
    }

    /**
     * Create an instance of {@link FindDetectorByParam }
     * 
     */
    public FindDetectorByParam createFindDetectorByParam() {
        return new FindDetectorByParam();
    }

    /**
     * Create an instance of {@link FindDetectorByParamResponse }
     * 
     */
    public FindDetectorByParamResponse createFindDetectorByParamResponse() {
        return new FindDetectorByParamResponse();
    }

    /**
     * Create an instance of {@link FindSession }
     * 
     */
    public FindSession createFindSession() {
        return new FindSession();
    }

    /**
     * Create an instance of {@link FindSessionResponse }
     * 
     */
    public FindSessionResponse createFindSessionResponse() {
        return new FindSessionResponse();
    }

    /**
     * Create an instance of {@link FindSessionsByProposalAndBeamLine }
     * 
     */
    public FindSessionsByProposalAndBeamLine createFindSessionsByProposalAndBeamLine() {
        return new FindSessionsByProposalAndBeamLine();
    }

    /**
     * Create an instance of {@link FindSessionsByProposalAndBeamLineResponse }
     * 
     */
    public FindSessionsByProposalAndBeamLineResponse createFindSessionsByProposalAndBeamLineResponse() {
        return new FindSessionsByProposalAndBeamLineResponse();
    }

    /**
     * Create an instance of {@link GetDataCollectionInfo }
     * 
     */
    public GetDataCollectionInfo createGetDataCollectionInfo() {
        return new GetDataCollectionInfo();
    }

    /**
     * Create an instance of {@link GetDataCollectionInfoResponse }
     * 
     */
    public GetDataCollectionInfoResponse createGetDataCollectionInfoResponse() {
        return new GetDataCollectionInfoResponse();
    }

    /**
     * Create an instance of {@link GetPdbFilePath }
     * 
     */
    public GetPdbFilePath createGetPdbFilePath() {
        return new GetPdbFilePath();
    }

    /**
     * Create an instance of {@link GetPdbFilePathResponse }
     * 
     */
    public GetPdbFilePathResponse createGetPdbFilePathResponse() {
        return new GetPdbFilePathResponse();
    }

    /**
     * Create an instance of {@link GetXDSInfo }
     * 
     */
    public GetXDSInfo createGetXDSInfo() {
        return new GetXDSInfo();
    }

    /**
     * Create an instance of {@link GetXDSInfoResponse }
     * 
     */
    public GetXDSInfoResponse createGetXDSInfoResponse() {
        return new GetXDSInfoResponse();
    }

    /**
     * Create an instance of {@link GroupDataCollections }
     * 
     */
    public GroupDataCollections createGroupDataCollections() {
        return new GroupDataCollections();
    }

    /**
     * Create an instance of {@link GroupDataCollectionsResponse }
     * 
     */
    public GroupDataCollectionsResponse createGroupDataCollectionsResponse() {
        return new GroupDataCollectionsResponse();
    }

    /**
     * Create an instance of {@link SetBestWilsonPlotPath }
     * 
     */
    public SetBestWilsonPlotPath createSetBestWilsonPlotPath() {
        return new SetBestWilsonPlotPath();
    }

    /**
     * Create an instance of {@link SetBestWilsonPlotPathResponse }
     * 
     */
    public SetBestWilsonPlotPathResponse createSetBestWilsonPlotPathResponse() {
        return new SetBestWilsonPlotPathResponse();
    }

    /**
     * Create an instance of {@link SetDataCollectionPosition }
     * 
     */
    public SetDataCollectionPosition createSetDataCollectionPosition() {
        return new SetDataCollectionPosition();
    }

    /**
     * Create an instance of {@link SetDataCollectionPositionResponse }
     * 
     */
    public SetDataCollectionPositionResponse createSetDataCollectionPositionResponse() {
        return new SetDataCollectionPositionResponse();
    }

    /**
     * Create an instance of {@link SetDataCollectionsPositions }
     * 
     */
    public SetDataCollectionsPositions createSetDataCollectionsPositions() {
        return new SetDataCollectionsPositions();
    }

    /**
     * Create an instance of {@link SetDataCollectionsPositionsResponse }
     * 
     */
    public SetDataCollectionsPositionsResponse createSetDataCollectionsPositionsResponse() {
        return new SetDataCollectionsPositionsResponse();
    }

    /**
     * Create an instance of {@link SetImageQualityIndicatorsPlot }
     * 
     */
    public SetImageQualityIndicatorsPlot createSetImageQualityIndicatorsPlot() {
        return new SetImageQualityIndicatorsPlot();
    }

    /**
     * Create an instance of {@link SetImageQualityIndicatorsPlotResponse }
     * 
     */
    public SetImageQualityIndicatorsPlotResponse createSetImageQualityIndicatorsPlotResponse() {
        return new SetImageQualityIndicatorsPlotResponse();
    }

    /**
     * Create an instance of {@link SetImagesPositions }
     * 
     */
    public SetImagesPositions createSetImagesPositions() {
        return new SetImagesPositions();
    }

    /**
     * Create an instance of {@link SetImagesPositionsResponse }
     * 
     */
    public SetImagesPositionsResponse createSetImagesPositionsResponse() {
        return new SetImagesPositionsResponse();
    }

    /**
     * Create an instance of {@link StoreOrUpdateBeamLineSetup }
     * 
     */
    public StoreOrUpdateBeamLineSetup createStoreOrUpdateBeamLineSetup() {
        return new StoreOrUpdateBeamLineSetup();
    }

    /**
     * Create an instance of {@link StoreOrUpdateBeamLineSetupResponse }
     * 
     */
    public StoreOrUpdateBeamLineSetupResponse createStoreOrUpdateBeamLineSetupResponse() {
        return new StoreOrUpdateBeamLineSetupResponse();
    }

    /**
     * Create an instance of {@link StoreOrUpdateDataCollection }
     * 
     */
    public StoreOrUpdateDataCollection createStoreOrUpdateDataCollection() {
        return new StoreOrUpdateDataCollection();
    }

    /**
     * Create an instance of {@link StoreOrUpdateDataCollectionGroup }
     * 
     */
    public StoreOrUpdateDataCollectionGroup createStoreOrUpdateDataCollectionGroup() {
        return new StoreOrUpdateDataCollectionGroup();
    }

    /**
     * Create an instance of {@link StoreOrUpdateDataCollectionGroupResponse }
     * 
     */
    public StoreOrUpdateDataCollectionGroupResponse createStoreOrUpdateDataCollectionGroupResponse() {
        return new StoreOrUpdateDataCollectionGroupResponse();
    }

    /**
     * Create an instance of {@link StoreOrUpdateDataCollectionResponse }
     * 
     */
    public StoreOrUpdateDataCollectionResponse createStoreOrUpdateDataCollectionResponse() {
        return new StoreOrUpdateDataCollectionResponse();
    }

    /**
     * Create an instance of {@link StoreOrUpdateEnergyScan }
     * 
     */
    public StoreOrUpdateEnergyScan createStoreOrUpdateEnergyScan() {
        return new StoreOrUpdateEnergyScan();
    }

    /**
     * Create an instance of {@link StoreOrUpdateEnergyScanResponse }
     * 
     */
    public StoreOrUpdateEnergyScanResponse createStoreOrUpdateEnergyScanResponse() {
        return new StoreOrUpdateEnergyScanResponse();
    }

    /**
     * Create an instance of {@link StoreOrUpdateGridInfo }
     * 
     */
    public StoreOrUpdateGridInfo createStoreOrUpdateGridInfo() {
        return new StoreOrUpdateGridInfo();
    }

    /**
     * Create an instance of {@link StoreOrUpdateGridInfoResponse }
     * 
     */
    public StoreOrUpdateGridInfoResponse createStoreOrUpdateGridInfoResponse() {
        return new StoreOrUpdateGridInfoResponse();
    }

    /**
     * Create an instance of {@link StoreOrUpdateImage }
     * 
     */
    public StoreOrUpdateImage createStoreOrUpdateImage() {
        return new StoreOrUpdateImage();
    }

    /**
     * Create an instance of {@link StoreOrUpdateImageResponse }
     * 
     */
    public StoreOrUpdateImageResponse createStoreOrUpdateImageResponse() {
        return new StoreOrUpdateImageResponse();
    }

    /**
     * Create an instance of {@link StoreOrUpdatePosition }
     * 
     */
    public StoreOrUpdatePosition createStoreOrUpdatePosition() {
        return new StoreOrUpdatePosition();
    }

    /**
     * Create an instance of {@link StoreOrUpdatePositionResponse }
     * 
     */
    public StoreOrUpdatePositionResponse createStoreOrUpdatePositionResponse() {
        return new StoreOrUpdatePositionResponse();
    }

    /**
     * Create an instance of {@link StoreOrUpdateSession }
     * 
     */
    public StoreOrUpdateSession createStoreOrUpdateSession() {
        return new StoreOrUpdateSession();
    }

    /**
     * Create an instance of {@link StoreOrUpdateSessionResponse }
     * 
     */
    public StoreOrUpdateSessionResponse createStoreOrUpdateSessionResponse() {
        return new StoreOrUpdateSessionResponse();
    }

    /**
     * Create an instance of {@link StoreOrUpdateWorkflow }
     * 
     */
    public StoreOrUpdateWorkflow createStoreOrUpdateWorkflow() {
        return new StoreOrUpdateWorkflow();
    }

    /**
     * Create an instance of {@link StoreOrUpdateWorkflowMesh }
     * 
     */
    public StoreOrUpdateWorkflowMesh createStoreOrUpdateWorkflowMesh() {
        return new StoreOrUpdateWorkflowMesh();
    }

    /**
     * Create an instance of {@link StoreOrUpdateWorkflowMeshResponse }
     * 
     */
    public StoreOrUpdateWorkflowMeshResponse createStoreOrUpdateWorkflowMeshResponse() {
        return new StoreOrUpdateWorkflowMeshResponse();
    }

    /**
     * Create an instance of {@link StoreOrUpdateWorkflowResponse }
     * 
     */
    public StoreOrUpdateWorkflowResponse createStoreOrUpdateWorkflowResponse() {
        return new StoreOrUpdateWorkflowResponse();
    }

    /**
     * Create an instance of {@link StoreOrUpdateXFEFluorescenceSpectrum }
     * 
     */
    public StoreOrUpdateXFEFluorescenceSpectrum createStoreOrUpdateXFEFluorescenceSpectrum() {
        return new StoreOrUpdateXFEFluorescenceSpectrum();
    }

    /**
     * Create an instance of {@link StoreOrUpdateXFEFluorescenceSpectrumResponse }
     * 
     */
    public StoreOrUpdateXFEFluorescenceSpectrumResponse createStoreOrUpdateXFEFluorescenceSpectrumResponse() {
        return new StoreOrUpdateXFEFluorescenceSpectrumResponse();
    }

    /**
     * Create an instance of {@link StoreRobotAction }
     * 
     */
    public StoreRobotAction createStoreRobotAction() {
        return new StoreRobotAction();
    }

    /**
     * Create an instance of {@link StoreRobotActionResponse }
     * 
     */
    public StoreRobotActionResponse createStoreRobotActionResponse() {
        return new StoreRobotActionResponse();
    }

    /**
     * Create an instance of {@link StoreWorkflowStep }
     * 
     */
    public StoreWorkflowStep createStoreWorkflowStep() {
        return new StoreWorkflowStep();
    }

    /**
     * Create an instance of {@link StoreWorkflowStepResponse }
     * 
     */
    public StoreWorkflowStepResponse createStoreWorkflowStepResponse() {
        return new StoreWorkflowStepResponse();
    }

    /**
     * Create an instance of {@link UpdateDataCollectionGroupWorkflowId }
     * 
     */
    public UpdateDataCollectionGroupWorkflowId createUpdateDataCollectionGroupWorkflowId() {
        return new UpdateDataCollectionGroupWorkflowId();
    }

    /**
     * Create an instance of {@link UpdateDataCollectionGroupWorkflowIdResponse }
     * 
     */
    public UpdateDataCollectionGroupWorkflowIdResponse createUpdateDataCollectionGroupWorkflowIdResponse() {
        return new UpdateDataCollectionGroupWorkflowIdResponse();
    }

    /**
     * Create an instance of {@link UpdateDataCollectionStatus }
     * 
     */
    public UpdateDataCollectionStatus createUpdateDataCollectionStatus() {
        return new UpdateDataCollectionStatus();
    }

    /**
     * Create an instance of {@link UpdateDataCollectionStatusResponse }
     * 
     */
    public UpdateDataCollectionStatusResponse createUpdateDataCollectionStatusResponse() {
        return new UpdateDataCollectionStatusResponse();
    }

    /**
     * Create an instance of {@link UpdateWorkflowStatus }
     * 
     */
    public UpdateWorkflowStatus createUpdateWorkflowStatus() {
        return new UpdateWorkflowStatus();
    }

    /**
     * Create an instance of {@link UpdateWorkflowStatusResponse }
     * 
     */
    public UpdateWorkflowStatusResponse createUpdateWorkflowStatusResponse() {
        return new UpdateWorkflowStatusResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link SessionWS3VO }
     * 
     */
    public SessionWS3VO createSessionWS3VO() {
        return new SessionWS3VO();
    }

    /**
     * Create an instance of {@link Session3VO }
     * 
     */
    public Session3VO createSession3VO() {
        return new Session3VO();
    }

    /**
     * Create an instance of {@link BeamLineSetup3VO }
     * 
     */
    public BeamLineSetup3VO createBeamLineSetup3VO() {
        return new BeamLineSetup3VO();
    }

    /**
     * Create an instance of {@link DataCollectionGroup3VO }
     * 
     */
    public DataCollectionGroup3VO createDataCollectionGroup3VO() {
        return new DataCollectionGroup3VO();
    }

    /**
     * Create an instance of {@link BlSample3VO }
     * 
     */
    public BlSample3VO createBlSample3VO() {
        return new BlSample3VO();
    }

    /**
     * Create an instance of {@link BlSubSample3VO }
     * 
     */
    public BlSubSample3VO createBlSubSample3VO() {
        return new BlSubSample3VO();
    }

    /**
     * Create an instance of {@link DiffractionPlan3VO }
     * 
     */
    public DiffractionPlan3VO createDiffractionPlan3VO() {
        return new DiffractionPlan3VO();
    }

    /**
     * Create an instance of {@link ExperimentKindDetails3VO }
     * 
     */
    public ExperimentKindDetails3VO createExperimentKindDetails3VO() {
        return new ExperimentKindDetails3VO();
    }

    /**
     * Create an instance of {@link Position3VO }
     * 
     */
    public Position3VO createPosition3VO() {
        return new Position3VO();
    }

    /**
     * Create an instance of {@link Container3VO }
     * 
     */
    public Container3VO createContainer3VO() {
        return new Container3VO();
    }

    /**
     * Create an instance of {@link Dewar3VO }
     * 
     */
    public Dewar3VO createDewar3VO() {
        return new Dewar3VO();
    }

    /**
     * Create an instance of {@link DewarTransportHistory3VO }
     * 
     */
    public DewarTransportHistory3VO createDewarTransportHistory3VO() {
        return new DewarTransportHistory3VO();
    }

    /**
     * Create an instance of {@link Shipping3VO }
     * 
     */
    public Shipping3VO createShipping3VO() {
        return new Shipping3VO();
    }

    /**
     * Create an instance of {@link Proposal3VO }
     * 
     */
    public Proposal3VO createProposal3VO() {
        return new Proposal3VO();
    }

    /**
     * Create an instance of {@link Person3VO }
     * 
     */
    public Person3VO createPerson3VO() {
        return new Person3VO();
    }

    /**
     * Create an instance of {@link Laboratory3VO }
     * 
     */
    public Laboratory3VO createLaboratory3VO() {
        return new Laboratory3VO();
    }

    /**
     * Create an instance of {@link Protein3VO }
     * 
     */
    public Protein3VO createProtein3VO() {
        return new Protein3VO();
    }

    /**
     * Create an instance of {@link Crystal3VO }
     * 
     */
    public Crystal3VO createCrystal3VO() {
        return new Crystal3VO();
    }

    /**
     * Create an instance of {@link LabContact3VO }
     * 
     */
    public LabContact3VO createLabContact3VO() {
        return new LabContact3VO();
    }

    /**
     * Create an instance of {@link EnergyScan3VO }
     * 
     */
    public EnergyScan3VO createEnergyScan3VO() {
        return new EnergyScan3VO();
    }

    /**
     * Create an instance of {@link DataCollection3VO }
     * 
     */
    public DataCollection3VO createDataCollection3VO() {
        return new DataCollection3VO();
    }

    /**
     * Create an instance of {@link AutoProcIntegration3VO }
     * 
     */
    public AutoProcIntegration3VO createAutoProcIntegration3VO() {
        return new AutoProcIntegration3VO();
    }

    /**
     * Create an instance of {@link AutoProcProgram3VO }
     * 
     */
    public AutoProcProgram3VO createAutoProcProgram3VO() {
        return new AutoProcProgram3VO();
    }

    /**
     * Create an instance of {@link AutoProcProgramAttachment3VO }
     * 
     */
    public AutoProcProgramAttachment3VO createAutoProcProgramAttachment3VO() {
        return new AutoProcProgramAttachment3VO();
    }

    /**
     * Create an instance of {@link AutoProcStatus3VO }
     * 
     */
    public AutoProcStatus3VO createAutoProcStatus3VO() {
        return new AutoProcStatus3VO();
    }

    /**
     * Create an instance of {@link Detector3VO }
     * 
     */
    public Detector3VO createDetector3VO() {
        return new Detector3VO();
    }

    /**
     * Create an instance of {@link Image3VO }
     * 
     */
    public Image3VO createImage3VO() {
        return new Image3VO();
    }

    /**
     * Create an instance of {@link ScreeningStrategySubWedge3VO }
     * 
     */
    public ScreeningStrategySubWedge3VO createScreeningStrategySubWedge3VO() {
        return new ScreeningStrategySubWedge3VO();
    }

    /**
     * Create an instance of {@link ScreeningStrategyWedge3VO }
     * 
     */
    public ScreeningStrategyWedge3VO createScreeningStrategyWedge3VO() {
        return new ScreeningStrategyWedge3VO();
    }

    /**
     * Create an instance of {@link ScreeningStrategy3VO }
     * 
     */
    public ScreeningStrategy3VO createScreeningStrategy3VO() {
        return new ScreeningStrategy3VO();
    }

    /**
     * Create an instance of {@link ScreeningOutput3VO }
     * 
     */
    public ScreeningOutput3VO createScreeningOutput3VO() {
        return new ScreeningOutput3VO();
    }

    /**
     * Create an instance of {@link ScreeningOutputLattice3VO }
     * 
     */
    public ScreeningOutputLattice3VO createScreeningOutputLattice3VO() {
        return new ScreeningOutputLattice3VO();
    }

    /**
     * Create an instance of {@link Screening3VO }
     * 
     */
    public Screening3VO createScreening3VO() {
        return new Screening3VO();
    }

    /**
     * Create an instance of {@link ScreeningRank3VO }
     * 
     */
    public ScreeningRank3VO createScreeningRank3VO() {
        return new ScreeningRank3VO();
    }

    /**
     * Create an instance of {@link ScreeningRankSet3VO }
     * 
     */
    public ScreeningRankSet3VO createScreeningRankSet3VO() {
        return new ScreeningRankSet3VO();
    }

    /**
     * Create an instance of {@link Workflow3VO }
     * 
     */
    public Workflow3VO createWorkflow3VO() {
        return new Workflow3VO();
    }

    /**
     * Create an instance of {@link XfeFluorescenceSpectrum3VO }
     * 
     */
    public XfeFluorescenceSpectrum3VO createXfeFluorescenceSpectrum3VO() {
        return new XfeFluorescenceSpectrum3VO();
    }

    /**
     * Create an instance of {@link RobotActionWS3VO }
     * 
     */
    public RobotActionWS3VO createRobotActionWS3VO() {
        return new RobotActionWS3VO();
    }

    /**
     * Create an instance of {@link RobotAction3VO }
     * 
     */
    public RobotAction3VO createRobotAction3VO() {
        return new RobotAction3VO();
    }

    /**
     * Create an instance of {@link DataCollectionPosition }
     * 
     */
    public DataCollectionPosition createDataCollectionPosition() {
        return new DataCollectionPosition();
    }

    /**
     * Create an instance of {@link ImagePosition }
     * 
     */
    public ImagePosition createImagePosition() {
        return new ImagePosition();
    }

    /**
     * Create an instance of {@link ImageCreation }
     * 
     */
    public ImageCreation createImageCreation() {
        return new ImageCreation();
    }

    /**
     * Create an instance of {@link XfeFluorescenceSpectrumWS3VO }
     * 
     */
    public XfeFluorescenceSpectrumWS3VO createXfeFluorescenceSpectrumWS3VO() {
        return new XfeFluorescenceSpectrumWS3VO();
    }

    /**
     * Create an instance of {@link DataCollectionWS3VO }
     * 
     */
    public DataCollectionWS3VO createDataCollectionWS3VO() {
        return new DataCollectionWS3VO();
    }

    /**
     * Create an instance of {@link GridInfoWS3VO }
     * 
     */
    public GridInfoWS3VO createGridInfoWS3VO() {
        return new GridInfoWS3VO();
    }

    /**
     * Create an instance of {@link GridInfo3VO }
     * 
     */
    public GridInfo3VO createGridInfo3VO() {
        return new GridInfo3VO();
    }

    /**
     * Create an instance of {@link WorkflowMesh3VO }
     * 
     */
    public WorkflowMesh3VO createWorkflowMesh3VO() {
        return new WorkflowMesh3VO();
    }

    /**
     * Create an instance of {@link DataCollectionGroupWS3VO }
     * 
     */
    public DataCollectionGroupWS3VO createDataCollectionGroupWS3VO() {
        return new DataCollectionGroupWS3VO();
    }

    /**
     * Create an instance of {@link XdsInfo }
     * 
     */
    public XdsInfo createXdsInfo() {
        return new XdsInfo();
    }

    /**
     * Create an instance of {@link EnergyScanWS3VO }
     * 
     */
    public EnergyScanWS3VO createEnergyScanWS3VO() {
        return new EnergyScanWS3VO();
    }

    /**
     * Create an instance of {@link DataCollectionInfo }
     * 
     */
    public DataCollectionInfo createDataCollectionInfo() {
        return new DataCollectionInfo();
    }

    /**
     * Create an instance of {@link BlSampleWS3VO }
     * 
     */
    public BlSampleWS3VO createBlSampleWS3VO() {
        return new BlSampleWS3VO();
    }

    /**
     * Create an instance of {@link ImageWS3VO }
     * 
     */
    public ImageWS3VO createImageWS3VO() {
        return new ImageWS3VO();
    }

    /**
     * Create an instance of {@link PositionWS3VO }
     * 
     */
    public PositionWS3VO createPositionWS3VO() {
        return new PositionWS3VO();
    }

    /**
     * Create an instance of {@link WorkflowMeshWS3VO }
     * 
     */
    public WorkflowMeshWS3VO createWorkflowMeshWS3VO() {
        return new WorkflowMeshWS3VO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Echo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "echo")
    public JAXBElement<Echo> createEcho(Echo value) {
        return new JAXBElement<Echo>(_Echo_QNAME, Echo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "echoResponse")
    public JAXBElement<EchoResponse> createEchoResponse(EchoResponse value) {
        return new JAXBElement<EchoResponse>(_EchoResponse_QNAME, EchoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDataCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "findDataCollection")
    public JAXBElement<FindDataCollection> createFindDataCollection(FindDataCollection value) {
        return new JAXBElement<FindDataCollection>(_FindDataCollection_QNAME, FindDataCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDataCollectionFromFileLocationAndFileName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "findDataCollectionFromFileLocationAndFileName")
    public JAXBElement<FindDataCollectionFromFileLocationAndFileName> createFindDataCollectionFromFileLocationAndFileName(FindDataCollectionFromFileLocationAndFileName value) {
        return new JAXBElement<FindDataCollectionFromFileLocationAndFileName>(_FindDataCollectionFromFileLocationAndFileName_QNAME, FindDataCollectionFromFileLocationAndFileName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDataCollectionFromFileLocationAndFileNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "findDataCollectionFromFileLocationAndFileNameResponse")
    public JAXBElement<FindDataCollectionFromFileLocationAndFileNameResponse> createFindDataCollectionFromFileLocationAndFileNameResponse(FindDataCollectionFromFileLocationAndFileNameResponse value) {
        return new JAXBElement<FindDataCollectionFromFileLocationAndFileNameResponse>(_FindDataCollectionFromFileLocationAndFileNameResponse_QNAME, FindDataCollectionFromFileLocationAndFileNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDataCollectionFromImageDirectoryAndImagePrefixAndNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "findDataCollectionFromImageDirectoryAndImagePrefixAndNumber")
    public JAXBElement<FindDataCollectionFromImageDirectoryAndImagePrefixAndNumber> createFindDataCollectionFromImageDirectoryAndImagePrefixAndNumber(FindDataCollectionFromImageDirectoryAndImagePrefixAndNumber value) {
        return new JAXBElement<FindDataCollectionFromImageDirectoryAndImagePrefixAndNumber>(_FindDataCollectionFromImageDirectoryAndImagePrefixAndNumber_QNAME, FindDataCollectionFromImageDirectoryAndImagePrefixAndNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "findDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse")
    public JAXBElement<FindDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse> createFindDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse(FindDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse value) {
        return new JAXBElement<FindDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse>(_FindDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse_QNAME, FindDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDataCollectionGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "findDataCollectionGroup")
    public JAXBElement<FindDataCollectionGroup> createFindDataCollectionGroup(FindDataCollectionGroup value) {
        return new JAXBElement<FindDataCollectionGroup>(_FindDataCollectionGroup_QNAME, FindDataCollectionGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDataCollectionGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "findDataCollectionGroupResponse")
    public JAXBElement<FindDataCollectionGroupResponse> createFindDataCollectionGroupResponse(FindDataCollectionGroupResponse value) {
        return new JAXBElement<FindDataCollectionGroupResponse>(_FindDataCollectionGroupResponse_QNAME, FindDataCollectionGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDataCollectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "findDataCollectionResponse")
    public JAXBElement<FindDataCollectionResponse> createFindDataCollectionResponse(FindDataCollectionResponse value) {
        return new JAXBElement<FindDataCollectionResponse>(_FindDataCollectionResponse_QNAME, FindDataCollectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDetectorByParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "findDetectorByParam")
    public JAXBElement<FindDetectorByParam> createFindDetectorByParam(FindDetectorByParam value) {
        return new JAXBElement<FindDetectorByParam>(_FindDetectorByParam_QNAME, FindDetectorByParam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDetectorByParamResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "findDetectorByParamResponse")
    public JAXBElement<FindDetectorByParamResponse> createFindDetectorByParamResponse(FindDetectorByParamResponse value) {
        return new JAXBElement<FindDetectorByParamResponse>(_FindDetectorByParamResponse_QNAME, FindDetectorByParamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "findSession")
    public JAXBElement<FindSession> createFindSession(FindSession value) {
        return new JAXBElement<FindSession>(_FindSession_QNAME, FindSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "findSessionResponse")
    public JAXBElement<FindSessionResponse> createFindSessionResponse(FindSessionResponse value) {
        return new JAXBElement<FindSessionResponse>(_FindSessionResponse_QNAME, FindSessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSessionsByProposalAndBeamLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "findSessionsByProposalAndBeamLine")
    public JAXBElement<FindSessionsByProposalAndBeamLine> createFindSessionsByProposalAndBeamLine(FindSessionsByProposalAndBeamLine value) {
        return new JAXBElement<FindSessionsByProposalAndBeamLine>(_FindSessionsByProposalAndBeamLine_QNAME, FindSessionsByProposalAndBeamLine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSessionsByProposalAndBeamLineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "findSessionsByProposalAndBeamLineResponse")
    public JAXBElement<FindSessionsByProposalAndBeamLineResponse> createFindSessionsByProposalAndBeamLineResponse(FindSessionsByProposalAndBeamLineResponse value) {
        return new JAXBElement<FindSessionsByProposalAndBeamLineResponse>(_FindSessionsByProposalAndBeamLineResponse_QNAME, FindSessionsByProposalAndBeamLineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataCollectionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "getDataCollectionInfo")
    public JAXBElement<GetDataCollectionInfo> createGetDataCollectionInfo(GetDataCollectionInfo value) {
        return new JAXBElement<GetDataCollectionInfo>(_GetDataCollectionInfo_QNAME, GetDataCollectionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataCollectionInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "getDataCollectionInfoResponse")
    public JAXBElement<GetDataCollectionInfoResponse> createGetDataCollectionInfoResponse(GetDataCollectionInfoResponse value) {
        return new JAXBElement<GetDataCollectionInfoResponse>(_GetDataCollectionInfoResponse_QNAME, GetDataCollectionInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPdbFilePath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "getPdbFilePath")
    public JAXBElement<GetPdbFilePath> createGetPdbFilePath(GetPdbFilePath value) {
        return new JAXBElement<GetPdbFilePath>(_GetPdbFilePath_QNAME, GetPdbFilePath.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPdbFilePathResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "getPdbFilePathResponse")
    public JAXBElement<GetPdbFilePathResponse> createGetPdbFilePathResponse(GetPdbFilePathResponse value) {
        return new JAXBElement<GetPdbFilePathResponse>(_GetPdbFilePathResponse_QNAME, GetPdbFilePathResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetXDSInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "getXDSInfo")
    public JAXBElement<GetXDSInfo> createGetXDSInfo(GetXDSInfo value) {
        return new JAXBElement<GetXDSInfo>(_GetXDSInfo_QNAME, GetXDSInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetXDSInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "getXDSInfoResponse")
    public JAXBElement<GetXDSInfoResponse> createGetXDSInfoResponse(GetXDSInfoResponse value) {
        return new JAXBElement<GetXDSInfoResponse>(_GetXDSInfoResponse_QNAME, GetXDSInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupDataCollections }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "groupDataCollections")
    public JAXBElement<GroupDataCollections> createGroupDataCollections(GroupDataCollections value) {
        return new JAXBElement<GroupDataCollections>(_GroupDataCollections_QNAME, GroupDataCollections.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupDataCollectionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "groupDataCollectionsResponse")
    public JAXBElement<GroupDataCollectionsResponse> createGroupDataCollectionsResponse(GroupDataCollectionsResponse value) {
        return new JAXBElement<GroupDataCollectionsResponse>(_GroupDataCollectionsResponse_QNAME, GroupDataCollectionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBestWilsonPlotPath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "setBestWilsonPlotPath")
    public JAXBElement<SetBestWilsonPlotPath> createSetBestWilsonPlotPath(SetBestWilsonPlotPath value) {
        return new JAXBElement<SetBestWilsonPlotPath>(_SetBestWilsonPlotPath_QNAME, SetBestWilsonPlotPath.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBestWilsonPlotPathResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "setBestWilsonPlotPathResponse")
    public JAXBElement<SetBestWilsonPlotPathResponse> createSetBestWilsonPlotPathResponse(SetBestWilsonPlotPathResponse value) {
        return new JAXBElement<SetBestWilsonPlotPathResponse>(_SetBestWilsonPlotPathResponse_QNAME, SetBestWilsonPlotPathResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDataCollectionPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "setDataCollectionPosition")
    public JAXBElement<SetDataCollectionPosition> createSetDataCollectionPosition(SetDataCollectionPosition value) {
        return new JAXBElement<SetDataCollectionPosition>(_SetDataCollectionPosition_QNAME, SetDataCollectionPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDataCollectionPositionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "setDataCollectionPositionResponse")
    public JAXBElement<SetDataCollectionPositionResponse> createSetDataCollectionPositionResponse(SetDataCollectionPositionResponse value) {
        return new JAXBElement<SetDataCollectionPositionResponse>(_SetDataCollectionPositionResponse_QNAME, SetDataCollectionPositionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDataCollectionsPositions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "setDataCollectionsPositions")
    public JAXBElement<SetDataCollectionsPositions> createSetDataCollectionsPositions(SetDataCollectionsPositions value) {
        return new JAXBElement<SetDataCollectionsPositions>(_SetDataCollectionsPositions_QNAME, SetDataCollectionsPositions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDataCollectionsPositionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "setDataCollectionsPositionsResponse")
    public JAXBElement<SetDataCollectionsPositionsResponse> createSetDataCollectionsPositionsResponse(SetDataCollectionsPositionsResponse value) {
        return new JAXBElement<SetDataCollectionsPositionsResponse>(_SetDataCollectionsPositionsResponse_QNAME, SetDataCollectionsPositionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetImageQualityIndicatorsPlot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "setImageQualityIndicatorsPlot")
    public JAXBElement<SetImageQualityIndicatorsPlot> createSetImageQualityIndicatorsPlot(SetImageQualityIndicatorsPlot value) {
        return new JAXBElement<SetImageQualityIndicatorsPlot>(_SetImageQualityIndicatorsPlot_QNAME, SetImageQualityIndicatorsPlot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetImageQualityIndicatorsPlotResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "setImageQualityIndicatorsPlotResponse")
    public JAXBElement<SetImageQualityIndicatorsPlotResponse> createSetImageQualityIndicatorsPlotResponse(SetImageQualityIndicatorsPlotResponse value) {
        return new JAXBElement<SetImageQualityIndicatorsPlotResponse>(_SetImageQualityIndicatorsPlotResponse_QNAME, SetImageQualityIndicatorsPlotResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetImagesPositions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "setImagesPositions")
    public JAXBElement<SetImagesPositions> createSetImagesPositions(SetImagesPositions value) {
        return new JAXBElement<SetImagesPositions>(_SetImagesPositions_QNAME, SetImagesPositions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetImagesPositionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "setImagesPositionsResponse")
    public JAXBElement<SetImagesPositionsResponse> createSetImagesPositionsResponse(SetImagesPositionsResponse value) {
        return new JAXBElement<SetImagesPositionsResponse>(_SetImagesPositionsResponse_QNAME, SetImagesPositionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateBeamLineSetup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateBeamLineSetup")
    public JAXBElement<StoreOrUpdateBeamLineSetup> createStoreOrUpdateBeamLineSetup(StoreOrUpdateBeamLineSetup value) {
        return new JAXBElement<StoreOrUpdateBeamLineSetup>(_StoreOrUpdateBeamLineSetup_QNAME, StoreOrUpdateBeamLineSetup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateBeamLineSetupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateBeamLineSetupResponse")
    public JAXBElement<StoreOrUpdateBeamLineSetupResponse> createStoreOrUpdateBeamLineSetupResponse(StoreOrUpdateBeamLineSetupResponse value) {
        return new JAXBElement<StoreOrUpdateBeamLineSetupResponse>(_StoreOrUpdateBeamLineSetupResponse_QNAME, StoreOrUpdateBeamLineSetupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateDataCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateDataCollection")
    public JAXBElement<StoreOrUpdateDataCollection> createStoreOrUpdateDataCollection(StoreOrUpdateDataCollection value) {
        return new JAXBElement<StoreOrUpdateDataCollection>(_StoreOrUpdateDataCollection_QNAME, StoreOrUpdateDataCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateDataCollectionGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateDataCollectionGroup")
    public JAXBElement<StoreOrUpdateDataCollectionGroup> createStoreOrUpdateDataCollectionGroup(StoreOrUpdateDataCollectionGroup value) {
        return new JAXBElement<StoreOrUpdateDataCollectionGroup>(_StoreOrUpdateDataCollectionGroup_QNAME, StoreOrUpdateDataCollectionGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateDataCollectionGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateDataCollectionGroupResponse")
    public JAXBElement<StoreOrUpdateDataCollectionGroupResponse> createStoreOrUpdateDataCollectionGroupResponse(StoreOrUpdateDataCollectionGroupResponse value) {
        return new JAXBElement<StoreOrUpdateDataCollectionGroupResponse>(_StoreOrUpdateDataCollectionGroupResponse_QNAME, StoreOrUpdateDataCollectionGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateDataCollectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateDataCollectionResponse")
    public JAXBElement<StoreOrUpdateDataCollectionResponse> createStoreOrUpdateDataCollectionResponse(StoreOrUpdateDataCollectionResponse value) {
        return new JAXBElement<StoreOrUpdateDataCollectionResponse>(_StoreOrUpdateDataCollectionResponse_QNAME, StoreOrUpdateDataCollectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateEnergyScan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateEnergyScan")
    public JAXBElement<StoreOrUpdateEnergyScan> createStoreOrUpdateEnergyScan(StoreOrUpdateEnergyScan value) {
        return new JAXBElement<StoreOrUpdateEnergyScan>(_StoreOrUpdateEnergyScan_QNAME, StoreOrUpdateEnergyScan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateEnergyScanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateEnergyScanResponse")
    public JAXBElement<StoreOrUpdateEnergyScanResponse> createStoreOrUpdateEnergyScanResponse(StoreOrUpdateEnergyScanResponse value) {
        return new JAXBElement<StoreOrUpdateEnergyScanResponse>(_StoreOrUpdateEnergyScanResponse_QNAME, StoreOrUpdateEnergyScanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateGridInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateGridInfo")
    public JAXBElement<StoreOrUpdateGridInfo> createStoreOrUpdateGridInfo(StoreOrUpdateGridInfo value) {
        return new JAXBElement<StoreOrUpdateGridInfo>(_StoreOrUpdateGridInfo_QNAME, StoreOrUpdateGridInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateGridInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateGridInfoResponse")
    public JAXBElement<StoreOrUpdateGridInfoResponse> createStoreOrUpdateGridInfoResponse(StoreOrUpdateGridInfoResponse value) {
        return new JAXBElement<StoreOrUpdateGridInfoResponse>(_StoreOrUpdateGridInfoResponse_QNAME, StoreOrUpdateGridInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateImage")
    public JAXBElement<StoreOrUpdateImage> createStoreOrUpdateImage(StoreOrUpdateImage value) {
        return new JAXBElement<StoreOrUpdateImage>(_StoreOrUpdateImage_QNAME, StoreOrUpdateImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateImageResponse")
    public JAXBElement<StoreOrUpdateImageResponse> createStoreOrUpdateImageResponse(StoreOrUpdateImageResponse value) {
        return new JAXBElement<StoreOrUpdateImageResponse>(_StoreOrUpdateImageResponse_QNAME, StoreOrUpdateImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdatePosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdatePosition")
    public JAXBElement<StoreOrUpdatePosition> createStoreOrUpdatePosition(StoreOrUpdatePosition value) {
        return new JAXBElement<StoreOrUpdatePosition>(_StoreOrUpdatePosition_QNAME, StoreOrUpdatePosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdatePositionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdatePositionResponse")
    public JAXBElement<StoreOrUpdatePositionResponse> createStoreOrUpdatePositionResponse(StoreOrUpdatePositionResponse value) {
        return new JAXBElement<StoreOrUpdatePositionResponse>(_StoreOrUpdatePositionResponse_QNAME, StoreOrUpdatePositionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateSession")
    public JAXBElement<StoreOrUpdateSession> createStoreOrUpdateSession(StoreOrUpdateSession value) {
        return new JAXBElement<StoreOrUpdateSession>(_StoreOrUpdateSession_QNAME, StoreOrUpdateSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateSessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateSessionResponse")
    public JAXBElement<StoreOrUpdateSessionResponse> createStoreOrUpdateSessionResponse(StoreOrUpdateSessionResponse value) {
        return new JAXBElement<StoreOrUpdateSessionResponse>(_StoreOrUpdateSessionResponse_QNAME, StoreOrUpdateSessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateWorkflow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateWorkflow")
    public JAXBElement<StoreOrUpdateWorkflow> createStoreOrUpdateWorkflow(StoreOrUpdateWorkflow value) {
        return new JAXBElement<StoreOrUpdateWorkflow>(_StoreOrUpdateWorkflow_QNAME, StoreOrUpdateWorkflow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateWorkflowMesh }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateWorkflowMesh")
    public JAXBElement<StoreOrUpdateWorkflowMesh> createStoreOrUpdateWorkflowMesh(StoreOrUpdateWorkflowMesh value) {
        return new JAXBElement<StoreOrUpdateWorkflowMesh>(_StoreOrUpdateWorkflowMesh_QNAME, StoreOrUpdateWorkflowMesh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateWorkflowMeshResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateWorkflowMeshResponse")
    public JAXBElement<StoreOrUpdateWorkflowMeshResponse> createStoreOrUpdateWorkflowMeshResponse(StoreOrUpdateWorkflowMeshResponse value) {
        return new JAXBElement<StoreOrUpdateWorkflowMeshResponse>(_StoreOrUpdateWorkflowMeshResponse_QNAME, StoreOrUpdateWorkflowMeshResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateWorkflowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateWorkflowResponse")
    public JAXBElement<StoreOrUpdateWorkflowResponse> createStoreOrUpdateWorkflowResponse(StoreOrUpdateWorkflowResponse value) {
        return new JAXBElement<StoreOrUpdateWorkflowResponse>(_StoreOrUpdateWorkflowResponse_QNAME, StoreOrUpdateWorkflowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateXFEFluorescenceSpectrum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateXFEFluorescenceSpectrum")
    public JAXBElement<StoreOrUpdateXFEFluorescenceSpectrum> createStoreOrUpdateXFEFluorescenceSpectrum(StoreOrUpdateXFEFluorescenceSpectrum value) {
        return new JAXBElement<StoreOrUpdateXFEFluorescenceSpectrum>(_StoreOrUpdateXFEFluorescenceSpectrum_QNAME, StoreOrUpdateXFEFluorescenceSpectrum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrUpdateXFEFluorescenceSpectrumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeOrUpdateXFEFluorescenceSpectrumResponse")
    public JAXBElement<StoreOrUpdateXFEFluorescenceSpectrumResponse> createStoreOrUpdateXFEFluorescenceSpectrumResponse(StoreOrUpdateXFEFluorescenceSpectrumResponse value) {
        return new JAXBElement<StoreOrUpdateXFEFluorescenceSpectrumResponse>(_StoreOrUpdateXFEFluorescenceSpectrumResponse_QNAME, StoreOrUpdateXFEFluorescenceSpectrumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreRobotAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeRobotAction")
    public JAXBElement<StoreRobotAction> createStoreRobotAction(StoreRobotAction value) {
        return new JAXBElement<StoreRobotAction>(_StoreRobotAction_QNAME, StoreRobotAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreRobotActionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeRobotActionResponse")
    public JAXBElement<StoreRobotActionResponse> createStoreRobotActionResponse(StoreRobotActionResponse value) {
        return new JAXBElement<StoreRobotActionResponse>(_StoreRobotActionResponse_QNAME, StoreRobotActionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreWorkflowStep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeWorkflowStep")
    public JAXBElement<StoreWorkflowStep> createStoreWorkflowStep(StoreWorkflowStep value) {
        return new JAXBElement<StoreWorkflowStep>(_StoreWorkflowStep_QNAME, StoreWorkflowStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreWorkflowStepResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "storeWorkflowStepResponse")
    public JAXBElement<StoreWorkflowStepResponse> createStoreWorkflowStepResponse(StoreWorkflowStepResponse value) {
        return new JAXBElement<StoreWorkflowStepResponse>(_StoreWorkflowStepResponse_QNAME, StoreWorkflowStepResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDataCollectionGroupWorkflowId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "updateDataCollectionGroupWorkflowId")
    public JAXBElement<UpdateDataCollectionGroupWorkflowId> createUpdateDataCollectionGroupWorkflowId(UpdateDataCollectionGroupWorkflowId value) {
        return new JAXBElement<UpdateDataCollectionGroupWorkflowId>(_UpdateDataCollectionGroupWorkflowId_QNAME, UpdateDataCollectionGroupWorkflowId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDataCollectionGroupWorkflowIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "updateDataCollectionGroupWorkflowIdResponse")
    public JAXBElement<UpdateDataCollectionGroupWorkflowIdResponse> createUpdateDataCollectionGroupWorkflowIdResponse(UpdateDataCollectionGroupWorkflowIdResponse value) {
        return new JAXBElement<UpdateDataCollectionGroupWorkflowIdResponse>(_UpdateDataCollectionGroupWorkflowIdResponse_QNAME, UpdateDataCollectionGroupWorkflowIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDataCollectionStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "updateDataCollectionStatus")
    public JAXBElement<UpdateDataCollectionStatus> createUpdateDataCollectionStatus(UpdateDataCollectionStatus value) {
        return new JAXBElement<UpdateDataCollectionStatus>(_UpdateDataCollectionStatus_QNAME, UpdateDataCollectionStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDataCollectionStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "updateDataCollectionStatusResponse")
    public JAXBElement<UpdateDataCollectionStatusResponse> createUpdateDataCollectionStatusResponse(UpdateDataCollectionStatusResponse value) {
        return new JAXBElement<UpdateDataCollectionStatusResponse>(_UpdateDataCollectionStatusResponse_QNAME, UpdateDataCollectionStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWorkflowStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "updateWorkflowStatus")
    public JAXBElement<UpdateWorkflowStatus> createUpdateWorkflowStatus(UpdateWorkflowStatus value) {
        return new JAXBElement<UpdateWorkflowStatus>(_UpdateWorkflowStatus_QNAME, UpdateWorkflowStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWorkflowStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "updateWorkflowStatusResponse")
    public JAXBElement<UpdateWorkflowStatusResponse> createUpdateWorkflowStatusResponse(UpdateWorkflowStatusResponse value) {
        return new JAXBElement<UpdateWorkflowStatusResponse>(_UpdateWorkflowStatusResponse_QNAME, UpdateWorkflowStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ispyb.ejb3.webservices.collection", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
