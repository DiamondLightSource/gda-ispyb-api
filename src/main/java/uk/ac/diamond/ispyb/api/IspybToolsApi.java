package uk.ac.diamond.ispyb.api;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface IspybToolsApi {

    List<Long> retrieveFluorescenceSpectrumIdsForSample(long sampleId) throws SQLException;
    Optional<ImageQualityIndicators> retrieveImageQualityIndicators(long dataCollectionId, long imageNumber) throws SQLException;
    List<Screening> retrieveScreeningsForSample(long sampleId) throws SQLException;
    List<DataCollectionMain> retrieveDataCollectionsForSample(long sampleId) throws SQLException;
    Optional<DataCollectionMain> retrieveDataCollection(long dataCollectionId) throws SQLException;
    Optional<Sample> retrieveSample(long sampleId) throws SQLException;
    Optional<Container> retrieveContainer(long containerId) throws SQLException;
    long insertAperture(Aperture aperture) throws SQLException;
    long insertDataCollectionGroup(DataCollectionGroup dataCollectionGroup) throws SQLException;
    long insertDataCollection(DataCollectionMain dataCollectionMain) throws SQLException;
    long updateSample(Sample sample) throws SQLException;
    long insertXFEFluorescenceSpectrum(XFEFlourecenceSpectrum xfeFlourecenceSpectrum) throws SQLException;
    long insertEnergyScan(EnergyScan energyScan) throws SQLException;
    long insertPosition(Position position) throws SQLException;
    long insertCrystal(Crystal crystal) throws SQLException;
    long insertProtein(Protein protein) throws SQLException;
    long insertDiffractionPlan(DiffractionPlan diffractionPlan) throws SQLException;
    long insertGridInfo(GridInfo gridInfo) throws SQLException;

}
