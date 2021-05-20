package uk.ac.diamond.ispyb.api;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface IspybToolsApi extends Closeable {

    List<Long> retrieveFluorescenceSpectrumIdsForSample(Long sampleId) throws SQLException;
    Optional<ImageQualityIndicators> retrieveImageQualityIndicators(Long dataCollectionId, Long imageNumber) throws SQLException;
    List<Screening> retrieveScreeningsForSample(Long sampleId) throws SQLException;
    List<DataCollectionMain> retrieveDataCollectionsForSample(Long sampleId) throws SQLException;
    Optional<DataCollection> retrieveDataCollection(Long dataCollectionId, String authLogin) throws SQLException;
    Optional<MxSample> retrieveSample(Long sampleId, boolean useConatinerSession, String authLogin) throws SQLException;
    Optional<Container> retrieveContainer(Long containerId, boolean useContainerSession, String authLogin) throws SQLException;
    Long insertAperture(Aperture aperture) throws SQLException;
    Long insertDataCollectionGroup(DataCollectionGroup dataCollectionGroup) throws SQLException;
    Long insertDataCollection(DataCollectionMain dataCollectionMain) throws SQLException;
    Long updateSample(MxSample mxSample) throws SQLException;
    Long insertXFEFluorescenceSpectrum(XFEFluorescenceSpectrum xfeFlourecenceSpectrum) throws SQLException;
    Long insertEnergyScan(EnergyScan energyScan) throws SQLException;
    void insertPosition(Position position) throws SQLException;
    Long insertCrystal(Crystal crystal) throws SQLException;
    Long insertDiffractionPlan(DiffractionPlan diffractionPlan) throws SQLException;
    Long insertGridInfo(GridInfo gridInfo) throws SQLException;

}
