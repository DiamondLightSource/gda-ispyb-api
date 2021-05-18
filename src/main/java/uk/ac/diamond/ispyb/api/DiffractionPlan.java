package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;

public class DiffractionPlan {
    private Long diffractionPlanId;
    private String name;
    private ExperimentKind experimentKind;
    private Double observedResolution;
    private Double minimalResolution;
    private Double exposureTime;
    private Double oscillationRange;
    private Double maximalResolution;
    private Double screeningResolution;
    private Double radiationSensitivity;
    private String anomalousScatterer;
    private Double preferredBeamSizeX;
    private Double preferredBeamSizeY;
    private Double preferredBeamDiameter;
    private String comments;
    private String DiffractionPlanUUID;
    private Double aimedCompleteness;
    private Double aimedIOverSigmaAtHighestRes;
    private Double aimedMultiplicity;
    private Double aimedResolution;
    private int anomalousData;
    private String complexity;
    private int estimateRadiationDamage;
    private String forcedSpaceGroup;
    private Double requiredCompleteness;
    private Double requiredMultiplicity;
    private Double requiredResolution;
    private String strategyOption;
    private String kappaStrategyOption;
    private int numberOfPositions;
    private Double minDimAccrossSpindleAxis;
    private Double maxDimAccrossSpindleAxis;
    private Double radiationSensitivityBeta;
    private Double radiationSensitivityGamma;
    private Double minOscWidth;
    private Timestamp recordTimeStamp;
    private String monochromator;
    private Double energy;
    private Double transmission;
    private Double boxSizeX;
    private Double boxSizeY;
    private Double kappaStart;
    private Double axisStart;
    private Double axisRange;
    private Long numberOfImages;
    private Long presetForProposalId;
    private String beamLineName;
    private Long detectorId;
    private Double distance;
    private Double orientation;
    private Double monoBandWidth;
    private CentringMethod centringMethod;
    private String userPath;
    private Double robotPlateTemperature;
    private Double exposureTemperature;
    private CollectionMode collectionMode;
    private Long priority;

    public Long getDiffractionPlanId() {
        return diffractionPlanId;
    }

    public void setDiffractionPlanId(Long diffractionPlanId) {
        this.diffractionPlanId = diffractionPlanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExperimentKind getExperimentKind() {
        return experimentKind;
    }

    public void setExperimentKind(ExperimentKind experimentKind) {
        this.experimentKind = experimentKind;
    }

    public Double getObservedResolution() {
        return observedResolution;
    }

    public void setObservedResolution(Double observedResolution) {
        this.observedResolution = observedResolution;
    }

    public Double getMinimalResolution() {
        return minimalResolution;
    }

    public void setMinimalResolution(Double minimalResolution) {
        this.minimalResolution = minimalResolution;
    }

    public Double getExposureTime() {
        return exposureTime;
    }

    public void setExposureTime(Double exposureTime) {
        this.exposureTime = exposureTime;
    }

    public Double getOscillationRange() {
        return oscillationRange;
    }

    public void setOscillationRange(Double oscillationRange) {
        this.oscillationRange = oscillationRange;
    }

    public Double getMaximalResolution() {
        return maximalResolution;
    }

    public void setMaximalResolution(Double maximalResolution) {
        this.maximalResolution = maximalResolution;
    }

    public Double getScreeningResolution() {
        return screeningResolution;
    }

    public void setScreeningResolution(Double screeningResolution) {
        this.screeningResolution = screeningResolution;
    }

    public Double getRadiationSensitivity() {
        return radiationSensitivity;
    }

    public void setRadiationSensitivity(Double radiationSensitivity) {
        this.radiationSensitivity = radiationSensitivity;
    }

    public String getAnomalousScatterer() {
        return anomalousScatterer;
    }

    public void setAnomalousScatterer(String anomalousScatterer) {
        this.anomalousScatterer = anomalousScatterer;
    }

    public Double getPreferredBeamSizeX() {
        return preferredBeamSizeX;
    }

    public void setPreferredBeamSizeX(Double preferredBeamSizeX) {
        this.preferredBeamSizeX = preferredBeamSizeX;
    }

    public Double getPreferredBeamSizeY() {
        return preferredBeamSizeY;
    }

    public void setPreferredBeamSizeY(Double preferredBeamSizeY) {
        this.preferredBeamSizeY = preferredBeamSizeY;
    }

    public Double getPreferredBeamDiameter() {
        return preferredBeamDiameter;
    }

    public void setPreferredBeamDiameter(Double preferredBeamDiameter) {
        this.preferredBeamDiameter = preferredBeamDiameter;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDiffractionPlanUUID() {
        return DiffractionPlanUUID;
    }

    public void setDiffractionPlanUUID(String diffractionPlanUUID) {
        this.DiffractionPlanUUID = diffractionPlanUUID;
    }

    public Double getAimedCompleteness() {
        return aimedCompleteness;
    }

    public void setAimedCompleteness(Double aimedCompleteness) {
        this.aimedCompleteness = aimedCompleteness;
    }

    public Double getAimedIOverSigmaAtHighestRes() {
        return aimedIOverSigmaAtHighestRes;
    }

    public void setAimedIOverSigmaAtHighestRes(Double aimedIOverSigmaAtHighestRes) {
        this.aimedIOverSigmaAtHighestRes = aimedIOverSigmaAtHighestRes;
    }

    public Double getAimedMultiplicity() {
        return aimedMultiplicity;
    }

    public void setAimedMultiplicity(Double aimedMultiplicity) {
        this.aimedMultiplicity = aimedMultiplicity;
    }

    public Double getAimedResolution() {
        return aimedResolution;
    }

    public void setAimedResolution(Double aimedResolution) {
        this.aimedResolution = aimedResolution;
    }

    public int getAnomalousData() {
        return anomalousData;
    }

    public void setAnomalousData(int anomalousData) {
        this.anomalousData = anomalousData;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public int getEstimateRadiationDamage() {
        return estimateRadiationDamage;
    }

    public void setEstimateRadiationDamage(int estimateRadiationDamage) {
        this.estimateRadiationDamage = estimateRadiationDamage;
    }

    public String getForcedSpaceGroup() {
        return forcedSpaceGroup;
    }

    public void setForcedSpaceGroup(String forcedSpaceGroup) {
        this.forcedSpaceGroup = forcedSpaceGroup;
    }

    public Double getRequiredCompleteness() {
        return requiredCompleteness;
    }

    public void setRequiredCompleteness(Double requiredCompleteness) {
        this.requiredCompleteness = requiredCompleteness;
    }

    public Double getRequiredMultiplicity() {
        return requiredMultiplicity;
    }

    public void setRequiredMultiplicity(Double requiredMultiplicity) {
        this.requiredMultiplicity = requiredMultiplicity;
    }

    public Double getRequiredResolution() {
        return requiredResolution;
    }

    public void setRequiredResolution(Double requiredResolution) {
        this.requiredResolution = requiredResolution;
    }

    public String getStrategyOption() {
        return strategyOption;
    }

    public void setStrategyOption(String strategyOption) {
        this.strategyOption = strategyOption;
    }

    public String getKappaStrategyOption() {
        return kappaStrategyOption;
    }

    public void setKappaStrategyOption(String kappaStrategyOption) {
        this.kappaStrategyOption = kappaStrategyOption;
    }

    public int getNumberOfPositions() {
        return numberOfPositions;
    }

    public void setNumberOfPositions(int numberOfPositions) {
        this.numberOfPositions = numberOfPositions;
    }

    public Double getMinDimAccrossSpindleAxis() {
        return minDimAccrossSpindleAxis;
    }

    public void setMinDimAccrossSpindleAxis(Double minDimAccrossSpindleAxis) {
        this.minDimAccrossSpindleAxis = minDimAccrossSpindleAxis;
    }

    public Double getMaxDimAccrossSpindleAxis() {
        return maxDimAccrossSpindleAxis;
    }

    public void setMaxDimAccrossSpindleAxis(Double maxDimAccrossSpindleAxis) {
        this.maxDimAccrossSpindleAxis = maxDimAccrossSpindleAxis;
    }

    public Double getRadiationSensitivityBeta() {
        return radiationSensitivityBeta;
    }

    public void setRadiationSensitivityBeta(Double radiationSensitivityBeta) {
        this.radiationSensitivityBeta = radiationSensitivityBeta;
    }

    public Double getRadiationSensitivityGamma() {
        return radiationSensitivityGamma;
    }

    public void setRadiationSensitivityGamma(Double radiationSensitivityGamma) {
        this.radiationSensitivityGamma = radiationSensitivityGamma;
    }

    public Double getMinOscWidth() {
        return minOscWidth;
    }

    public void setMinOscWidth(Double minOscWidth) {
        this.minOscWidth = minOscWidth;
    }

    public Timestamp getRecordTimeStamp() {
        return recordTimeStamp;
    }

    public void setRecordTimeStamp(Timestamp recordTimeStamp) {
        this.recordTimeStamp = recordTimeStamp;
    }

    public String getMonochromator() {
        return monochromator;
    }

    public void setMonochromator(String monochromator) {
        this.monochromator = monochromator;
    }

    public Double getEnergy() {
        return energy;
    }

    public void setEnergy(Double energy) {
        this.energy = energy;
    }

    public Double getTransmission() {
        return transmission;
    }

    public void setTransmission(Double transmission) {
        this.transmission = transmission;
    }

    public Double getBoxSizeX() {
        return boxSizeX;
    }

    public void setBoxSizeX(Double boxSizeX) {
        this.boxSizeX = boxSizeX;
    }

    public Double getBoxSizeY() {
        return boxSizeY;
    }

    public void setBoxSizeY(Double boxSizeY) {
        this.boxSizeY = boxSizeY;
    }

    public Double getKappaStart() {
        return kappaStart;
    }

    public void setKappaStart(Double kappaStart) {
        this.kappaStart = kappaStart;
    }

    public Double getAxisStart() {
        return axisStart;
    }

    public void setAxisStart(Double axisStart) {
        this.axisStart = axisStart;
    }

    public Double getAxisRange() {
        return axisRange;
    }

    public void setAxisRange(Double axisRange) {
        this.axisRange = axisRange;
    }

    public Long getNumberOfImages() {
        return numberOfImages;
    }

    public void setNumberOfImages(Long numberOfImages) {
        this.numberOfImages = numberOfImages;
    }

    public Long getPresetForProposalId() {
        return presetForProposalId;
    }

    public void setPresetForProposalId(Long presetForProposalId) {
        this.presetForProposalId = presetForProposalId;
    }

    public String getBeamLineName() {
        return beamLineName;
    }

    public void setBeamLineName(String beamLineName) {
        this.beamLineName = beamLineName;
    }

    public Long getDetectorId() {
        return detectorId;
    }

    public void setDetectorId(Long detectorId) {
        this.detectorId = detectorId;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getOrientation() {
        return orientation;
    }

    public void setOrientation(Double orientation) {
        this.orientation = orientation;
    }

    public Double getMonoBandWidth() {
        return monoBandWidth;
    }

    public void setMonoBandWidth(Double monoBandWidth) {
        this.monoBandWidth = monoBandWidth;
    }

    public CentringMethod getCentringMethod() {
        return centringMethod;
    }

    public void setCentringMethod(CentringMethod centringMethod) {
        this.centringMethod = centringMethod;
    }

    public String getUserPath() {
        return userPath;
    }

    public void setUserPath(String userPath) {
        this.userPath = userPath;
    }

    public Double getRobotPlateTemperature() {
        return robotPlateTemperature;
    }

    public void setRobotPlateTemperature(Double robotPlateTemperature) {
        this.robotPlateTemperature = robotPlateTemperature;
    }

    public Double getExposureTemperature() {
        return exposureTemperature;
    }

    public void setExposureTemperature(Double exposureTemperature) {
        this.exposureTemperature = exposureTemperature;
    }

    public CollectionMode getCollectionMode() {
        return collectionMode;
    }

    public void setCollectionMode(CollectionMode collectionMode) {
        this.collectionMode = collectionMode;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }
}
