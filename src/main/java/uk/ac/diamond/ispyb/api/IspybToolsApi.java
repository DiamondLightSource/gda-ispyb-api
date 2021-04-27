package uk.ac.diamond.ispyb.api;

public interface IspybToolsApi {

    long[] retrieveFluorescenceSpectrumIdsForSample(long sampleId);
    ImageQualityIndicators retrieveImageQualityIndicators(long dataCollectionId, long imageNumber);
    Screening[] retrieveScreeningsForSample(long sampleId);
    DataCollectionMain[] retrieveDataCollectionsForSample(long sampleId);
    DataCollectionMain retrieveDataCollection(long dataCollectionId);
    Sample retrieveSample(long sampleId);
    Container retrieveContainer(long containerId);
    long insertAperture(Aperture aperture);
    long insertDataCollectionGroup(DataCollectionGroup dataCollectionGroup);
    long insertDataCollection(DataCollectionMain dataCollectionMain);
    long updateSample(Sample sample);
    long insertVFEFluorescenceSpectrum(XFEFlourecenceSpectrum xfeFlourecenceSpectrum);
    long insertEnergyScan(EnergyScan energyScan);
    long insertPosition(Position position);
    long insertCrystal(Crystal crystal);
    long insertProtein(Protein protein);
    long insertDiffractionPlan(DiffractionPlan diffractionPlan);
    long insertGridInfo(GridInfo gridInfo);

}
