package uk.ac.diamond.ispyb.api;

public class DiffractionPlan {
    private long diffractionPlanId;
    private String name;
    private ExperimentKind experimentKind;
    private double observedResolution;
    private double minimalResolution;
    private double exposureTime;
    private double oscillationRange;
    private double maximalResolution;
    private double screeningResolution;
    private double radiationSensitivity;
    private String anomalousScatterer;
    private double preferredBeamSizeX;
    private double preferredBeamSizeY;
    private double preferredBeamSizeDiameter;
    private String comments;
    private String DIFFRACTIONPLANUUID;
    private double aimedCompleteness;
    private double aimedIOverSigmaAtHighestRes;
    private double aimedResolution;
    private int anomalousData;
    private String comlexity;
    private int estimateRadiationDamage;
    private String forcedSpaceGroup;
    private double requiredCompleteness;
    private double requiredMultiplicity;
    private double requiredResolution;
    private String strategyOption;
    private String kappaStrategyOption;
    private int numberOfPositions;
    private double minDimAccrossSpindleAxis;
    private double maxDimAccrossSpindleAxis;
    private double radiationSensitivityBeta;
    private double radiationSensitivityGamma;
    private double minOscWidth;
    private String monochromator;
    private double energy;
    private double transmission;
    private double boxSizeX;
    private double boxSizeY;
    private double kappaStart;
    private double axisStart;
    private double axisRange;
    private long numberOfImages;
    private long presetForProposalId;
    private String beamLineName;
    private long detectorId;
    private double distance;
    private double orientation;
    private double monoBandWidth;
    private CenteringMethod centeringMethod;
    private String userPath;
    private double robotPlateTemperature;
    private double exposureTemperature;
    private long experimentTypeId;
    private long purificationColumnId;
    private CollectionMode collectionMode;
    private long priority;

    public long getDiffractionPlanId() {
        return diffractionPlanId;
    }

    public void setDiffractionPlanId(long diffractionPlanId) {
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

    public double getObservedResolution() {
        return observedResolution;
    }

    public void setObservedResolution(double observedResolution) {
        this.observedResolution = observedResolution;
    }

    public double getMinimalResolution() {
        return minimalResolution;
    }

    public void setMinimalResolution(double minimalResolution) {
        this.minimalResolution = minimalResolution;
    }

    public double getExposureTime() {
        return exposureTime;
    }

    public void setExposureTime(double exposureTime) {
        this.exposureTime = exposureTime;
    }

    public double getOscillationRange() {
        return oscillationRange;
    }

    public void setOscillationRange(double oscillationRange) {
        this.oscillationRange = oscillationRange;
    }

    public double getMaximalResolution() {
        return maximalResolution;
    }

    public void setMaximalResolution(double maximalResolution) {
        this.maximalResolution = maximalResolution;
    }

    public double getScreeningResolution() {
        return screeningResolution;
    }

    public void setScreeningResolution(double screeningResolution) {
        this.screeningResolution = screeningResolution;
    }

    public double getRadiationSensitivity() {
        return radiationSensitivity;
    }

    public void setRadiationSensitivity(double radiationSensitivity) {
        this.radiationSensitivity = radiationSensitivity;
    }

    public String getAnomalousScatterer() {
        return anomalousScatterer;
    }

    public void setAnomalousScatterer(String anomalousScatterer) {
        this.anomalousScatterer = anomalousScatterer;
    }

    public double getPreferredBeamSizeX() {
        return preferredBeamSizeX;
    }

    public void setPreferredBeamSizeX(double preferredBeamSizeX) {
        this.preferredBeamSizeX = preferredBeamSizeX;
    }

    public double getPreferredBeamSizeY() {
        return preferredBeamSizeY;
    }

    public void setPreferredBeamSizeY(double preferredBeamSizeY) {
        this.preferredBeamSizeY = preferredBeamSizeY;
    }

    public double getPreferredBeamSizeDiameter() {
        return preferredBeamSizeDiameter;
    }

    public void setPreferredBeamSizeDiameter(double preferredBeamSizeDiameter) {
        this.preferredBeamSizeDiameter = preferredBeamSizeDiameter;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDIFFRACTIONPLANUUID() {
        return DIFFRACTIONPLANUUID;
    }

    public void setDIFFRACTIONPLANUUID(String DIFFRACTIONPLANUUID) {
        this.DIFFRACTIONPLANUUID = DIFFRACTIONPLANUUID;
    }

    public double getAimedCompleteness() {
        return aimedCompleteness;
    }

    public void setAimedCompleteness(double aimedCompleteness) {
        this.aimedCompleteness = aimedCompleteness;
    }

    public double getAimedIOverSigmaAtHighestRes() {
        return aimedIOverSigmaAtHighestRes;
    }

    public void setAimedIOverSigmaAtHighestRes(double aimedIOverSigmaAtHighestRes) {
        this.aimedIOverSigmaAtHighestRes = aimedIOverSigmaAtHighestRes;
    }

    public double getAimedResolution() {
        return aimedResolution;
    }

    public void setAimedResolution(double aimedResolution) {
        this.aimedResolution = aimedResolution;
    }

    public int getAnomalousData() {
        return anomalousData;
    }

    public void setAnomalousData(int anomalousData) {
        this.anomalousData = anomalousData;
    }

    public String getComlexity() {
        return comlexity;
    }

    public void setComlexity(String comlexity) {
        this.comlexity = comlexity;
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

    public double getRequiredCompleteness() {
        return requiredCompleteness;
    }

    public void setRequiredCompleteness(double requiredCompleteness) {
        this.requiredCompleteness = requiredCompleteness;
    }

    public double getRequiredMultiplicity() {
        return requiredMultiplicity;
    }

    public void setRequiredMultiplicity(double requiredMultiplicity) {
        this.requiredMultiplicity = requiredMultiplicity;
    }

    public double getRequiredResolution() {
        return requiredResolution;
    }

    public void setRequiredResolution(double requiredResolution) {
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

    public double getMinDimAccrossSpindleAxis() {
        return minDimAccrossSpindleAxis;
    }

    public void setMinDimAccrossSpindleAxis(double minDimAccrossSpindleAxis) {
        this.minDimAccrossSpindleAxis = minDimAccrossSpindleAxis;
    }

    public double getMaxDimAccrossSpindleAxis() {
        return maxDimAccrossSpindleAxis;
    }

    public void setMaxDimAccrossSpindleAxis(double maxDimAccrossSpindleAxis) {
        this.maxDimAccrossSpindleAxis = maxDimAccrossSpindleAxis;
    }

    public double getRadiationSensitivityBeta() {
        return radiationSensitivityBeta;
    }

    public void setRadiationSensitivityBeta(double radiationSensitivityBeta) {
        this.radiationSensitivityBeta = radiationSensitivityBeta;
    }

    public double getRadiationSensitivityGamma() {
        return radiationSensitivityGamma;
    }

    public void setRadiationSensitivityGamma(double radiationSensitivityGamma) {
        this.radiationSensitivityGamma = radiationSensitivityGamma;
    }

    public double getMinOscWidth() {
        return minOscWidth;
    }

    public void setMinOscWidth(double minOscWidth) {
        this.minOscWidth = minOscWidth;
    }

    public String getMonochromator() {
        return monochromator;
    }

    public void setMonochromator(String monochromator) {
        this.monochromator = monochromator;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getTransmission() {
        return transmission;
    }

    public void setTransmission(double transmission) {
        this.transmission = transmission;
    }

    public double getBoxSizeX() {
        return boxSizeX;
    }

    public void setBoxSizeX(double boxSizeX) {
        this.boxSizeX = boxSizeX;
    }

    public double getBoxSizeY() {
        return boxSizeY;
    }

    public void setBoxSizeY(double boxSizeY) {
        this.boxSizeY = boxSizeY;
    }

    public double getKappaStart() {
        return kappaStart;
    }

    public void setKappaStart(double kappaStart) {
        this.kappaStart = kappaStart;
    }

    public double getAxisStart() {
        return axisStart;
    }

    public void setAxisStart(double axisStart) {
        this.axisStart = axisStart;
    }

    public double getAxisRange() {
        return axisRange;
    }

    public void setAxisRange(double axisRange) {
        this.axisRange = axisRange;
    }

    public long getNumberOfImages() {
        return numberOfImages;
    }

    public void setNumberOfImages(long numberOfImages) {
        this.numberOfImages = numberOfImages;
    }

    public long getPresetForProposalId() {
        return presetForProposalId;
    }

    public void setPresetForProposalId(long presetForProposalId) {
        this.presetForProposalId = presetForProposalId;
    }

    public String getBeamLineName() {
        return beamLineName;
    }

    public void setBeamLineName(String beamLineName) {
        this.beamLineName = beamLineName;
    }

    public long getDetectorId() {
        return detectorId;
    }

    public void setDetectorId(long detectorId) {
        this.detectorId = detectorId;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getOrientation() {
        return orientation;
    }

    public void setOrientation(double orientation) {
        this.orientation = orientation;
    }

    public double getMonoBandWidth() {
        return monoBandWidth;
    }

    public void setMonoBandWidth(double monoBandWidth) {
        this.monoBandWidth = monoBandWidth;
    }

    public CenteringMethod getCenteringMethod() {
        return centeringMethod;
    }

    public void setCenteringMethod(CenteringMethod centeringMethod) {
        this.centeringMethod = centeringMethod;
    }

    public String getUserPath() {
        return userPath;
    }

    public void setUserPath(String userPath) {
        this.userPath = userPath;
    }

    public double getRobotPlateTemperature() {
        return robotPlateTemperature;
    }

    public void setRobotPlateTemperature(double robotPlateTemperature) {
        this.robotPlateTemperature = robotPlateTemperature;
    }

    public double getExposureTemperature() {
        return exposureTemperature;
    }

    public void setExposureTemperature(double exposureTemperature) {
        this.exposureTemperature = exposureTemperature;
    }

    public long getExperimentTypeId() {
        return experimentTypeId;
    }

    public void setExperimentTypeId(long experimentTypeId) {
        this.experimentTypeId = experimentTypeId;
    }

    public long getPurificationColumnId() {
        return purificationColumnId;
    }

    public void setPurificationColumnId(long purificationColumnId) {
        this.purificationColumnId = purificationColumnId;
    }

    public CollectionMode getCollectionMode() {
        return collectionMode;
    }

    public void setCollectionMode(CollectionMode collectionMode) {
        this.collectionMode = collectionMode;
    }

    public long getPriority() {
        return priority;
    }

    public void setPriority(long priority) {
        this.priority = priority;
    }
}
