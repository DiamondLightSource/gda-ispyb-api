package uk.ac.diamond.ispyb.api;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.sql.Timestamp;

public class DataCollection {
    private Long Id;
    private Long GroupId;
    private Long dcNumber;
    private Long apertureId;
    private Long blSubSample;
    private Long detectorId;
    private Long blSampleId;
    private Long positionId;
    private String actualCenteringPosition;
    private Double apertureSizeX;
    private Double averageTemperature;
    private Double axisEnd;
    private Double axisRange;
    private Double axisStart;
    private String beamShape;
    private Double beamSizeAtSampleX;
    private Double beamSizeAtSampleY;
    private String bestWilsonPlotPath;
    private Double chiStart;
    private String comments;
    private Double detector2Theta;
    private Double detectorDistance;
    private Timestamp endTime;
    private Double exposureTime;
    private String fileTemplate;
    private Double flux;
    private Double fluxEnd;
    private Double focalSpotSizeAtSampleX;
    private Double focalSpotSizeAtSampleY;
    private String imgContainerSubPath;
    private String imgDir;
    private String imgPrefix;
    private String imgSuffix;
    private Double kappaStart;
    private Long noImages;
    private Long noPasses;
    private Double omegaStart;
    private Double overlap;
    private Double phiStart;
    private Double polarisation;
    private Boolean printableForReport;
    private Double resolution;
    private Double resolutionAtCorner;
    private String rotationAxis;
    private String runStatus;
    private Long screeningOrigId;
    private Double slitGapHorizontal;
    private Double slitGapVertical;
    private String snapshot1;
    private String snapshot2;
    private String snapshot3;
    private String snapshot4;
    private Long startImgNumber;
    private Timestamp startTime;
    private String synchrotronMode;
    private Double transmission;
    private Double undulatorGap1;
    private Double undulatorGap2;
    private Double undulatorGap3;
    private Double wavelength;
    private Double xBeam;
    private Double yBeam;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public Long getGroupId() {
        return GroupId;
    }

    public void setGroupId(Long groupId) {
        this.GroupId = groupId;
    }

    public Long getDcNumber() {
        return dcNumber;
    }

    public void setDcNumber(Long dcNumber) {
        this.dcNumber = dcNumber;
    }

    public Long getApertureId() {
        return apertureId;
    }

    public void setApertureId(Long apertureId) {
        this.apertureId = apertureId;
    }

    public Long getBlSubSample() {
        return blSubSample;
    }

    public void setBlSubSample(Long blSubSample) {
        this.blSubSample = blSubSample;
    }

    public Long getDetectorId() {
        return detectorId;
    }

    public void setDetectorId(Long detectorId) {
        this.detectorId = detectorId;
    }

    public Long getBlSampleId() {
        return blSampleId;
    }

    public void setBlSampleId(Long blSampleId) {
        this.blSampleId = blSampleId;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public String getActualCenteringPosition() {
        return actualCenteringPosition;
    }

    public void setActualCenteringPosition(String actualCenteringPosition) {
        this.actualCenteringPosition = actualCenteringPosition;
    }

    public Double getApertureSizeX() {
        return apertureSizeX;
    }

    public void setApertureSizeX(Double apertureSizeX) {
        this.apertureSizeX = apertureSizeX;
    }

    public Double getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(Double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public Double getAxisEnd() {
        return axisEnd;
    }

    public void setAxisEnd(Double axisEnd) {
        this.axisEnd = axisEnd;
    }

    public Double getAxisRange() {
        return axisRange;
    }

    public void setAxisRange(Double axisRange) {
        this.axisRange = axisRange;
    }

    public Double getAxisStart() {
        return axisStart;
    }

    public void setAxisStart(Double axisStart) {
        this.axisStart = axisStart;
    }

    public String getBeamShape() {
        return beamShape;
    }

    public void setBeamShape(String beamShape) {
        this.beamShape = beamShape;
    }

    public Double getBeamSizeAtSampleX() {
        return beamSizeAtSampleX;
    }

    public void setBeamSizeAtSampleX(Double beamSizeAtSampleX) {
        this.beamSizeAtSampleX = beamSizeAtSampleX;
    }

    public Double getBeamSizeAtSampleY() {
        return beamSizeAtSampleY;
    }

    public void setBeamSizeAtSampleY(Double beamSizeAtSampleY) {
        this.beamSizeAtSampleY = beamSizeAtSampleY;
    }

    public String getBestWilsonPlotPath() {
        return bestWilsonPlotPath;
    }

    public void setBestWilsonPlotPath(String bestWilsonPlotPath) {
        this.bestWilsonPlotPath = bestWilsonPlotPath;
    }

    public Double getChiStart() {
        return chiStart;
    }

    public void setChiStart(Double chiStart) {
        this.chiStart = chiStart;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Double getDetector2Theta() {
        return detector2Theta;
    }

    public void setDetector2Theta(Double detector2Theta) {
        this.detector2Theta = detector2Theta;
    }

    public Double getDetectorDistance() {
        return detectorDistance;
    }

    public void setDetectorDistance(Double detectorDistance) {
        this.detectorDistance = detectorDistance;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Double getExposureTime() {
        return exposureTime;
    }

    public void setExposureTime(Double exposureTime) {
        this.exposureTime = exposureTime;
    }

    public String getFileTemplate() {
        return fileTemplate;
    }

    public void setFileTemplate(String fileTemplate) {
        this.fileTemplate = fileTemplate;
    }

    public Double getFlux() {
        return flux;
    }

    public void setFlux(Double flux) {
        this.flux = flux;
    }

    public Double getFluxEnd() {
        return fluxEnd;
    }

    public void setFluxEnd(Double fluxEnd) {
        this.fluxEnd = fluxEnd;
    }

    public Double getFocalSpotSizeAtSampleX() {
        return focalSpotSizeAtSampleX;
    }

    public void setFocalSpotSizeAtSampleX(Double focalSpotSizeAtSampleX) {
        this.focalSpotSizeAtSampleX = focalSpotSizeAtSampleX;
    }

    public Double getFocalSpotSizeAtSampleY() {
        return focalSpotSizeAtSampleY;
    }

    public void setFocalSpotSizeAtSampleY(Double focalSpotSizeAtSampleY) {
        this.focalSpotSizeAtSampleY = focalSpotSizeAtSampleY;
    }

    public String getImgContainerSubPath() {
        return imgContainerSubPath;
    }

    public void setImgContainerSubPath(String imgContainerSubPath) {
        this.imgContainerSubPath = imgContainerSubPath;
    }

    public String getImgDir() {
        return imgDir;
    }

    public void setImgDir(String imgDir) {
        this.imgDir = imgDir;
    }

    public String getImgPrefix() {
        return imgPrefix;
    }

    public void setImgPrefix(String imgPrefix) {
        this.imgPrefix = imgPrefix;
    }

    public String getImgSuffix() {
        return imgSuffix;
    }

    public void setImgSuffix(String imgSuffix) {
        this.imgSuffix = imgSuffix;
    }

    public Double getKappaStart() {
        return kappaStart;
    }

    public void setKappaStart(Double kappaStart) {
        this.kappaStart = kappaStart;
    }

    public Long getNoImages() {
        return noImages;
    }

    public void setNoImages(Long noImages) {
        this.noImages = noImages;
    }

    public Long getNoPasses() {
        return noPasses;
    }

    public void setNoPasses(Long noPasses) {
        this.noPasses = noPasses;
    }

    public Double getOmegaStart() {
        return omegaStart;
    }

    public void setOmegaStart(Double omegaStart) {
        this.omegaStart = omegaStart;
    }

    public Double getOverlap() {
        return overlap;
    }

    public void setOverlap(Double overlap) {
        this.overlap = overlap;
    }

    public Double getPhiStart() {
        return phiStart;
    }

    public void setPhiStart(Double phiStart) {
        this.phiStart = phiStart;
    }

    public Double getPolarisation() {
        return polarisation;
    }

    public void setPolarisation(Double polarisation) {
        this.polarisation = polarisation;
    }

    public Boolean getPrintableForReport() {
        return printableForReport;
    }

    public void setPrintableForReport(Boolean printableForReport) {
        this.printableForReport = printableForReport;
    }

    public Double getResolution() {
        return resolution;
    }

    public void setResolution(Double resolution) {
        this.resolution = resolution;
    }

    public Double getResolutionAtCorner() {
        return resolutionAtCorner;
    }

    public void setResolutionAtCorner(Double resolutionAtCorner) {
        this.resolutionAtCorner = resolutionAtCorner;
    }

    public String getRotationAxis() {
        return rotationAxis;
    }

    public void setRotationAxis(String rotationAxis) {
        this.rotationAxis = rotationAxis;
    }

    public String getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(String runStatus) {
        this.runStatus = runStatus;
    }

    public Long getScreeningOrigId() {
        return screeningOrigId;
    }

    public void setScreeningOrigId(Long screeningOrigId) {
        this.screeningOrigId = screeningOrigId;
    }

    public Double getSlitGapHorizontal() {
        return slitGapHorizontal;
    }

    public void setSlitGapHorizontal(Double slitGapHorizontal) {
        this.slitGapHorizontal = slitGapHorizontal;
    }

    public Double getSlitGapVertical() {
        return slitGapVertical;
    }

    public void setSlitGapVertical(Double slitGapVertical) {
        this.slitGapVertical = slitGapVertical;
    }

    public String getSnapshot1() {
        return snapshot1;
    }

    public void setSnapshot1(String snapshot1) {
        this.snapshot1 = snapshot1;
    }

    public String getSnapshot2() {
        return snapshot2;
    }

    public void setSnapshot2(String snapshot2) {
        this.snapshot2 = snapshot2;
    }

    public String getSnapshot3() {
        return snapshot3;
    }

    public void setSnapshot3(String snapshot3) {
        this.snapshot3 = snapshot3;
    }

    public String getSnapshot4() {
        return snapshot4;
    }

    public void setSnapshot4(String snapshot4) {
        this.snapshot4 = snapshot4;
    }

    public Long getStartImgNumber() {
        return startImgNumber;
    }

    public void setStartImgNumber(Long startImgNumber) {
        this.startImgNumber = startImgNumber;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public String getSynchrotronMode() {
        return synchrotronMode;
    }

    public void setSynchrotronMode(String synchrotronMode) {
        this.synchrotronMode = synchrotronMode;
    }

    public Double getTransmission() {
        return transmission;
    }

    public void setTransmission(Double transmission) {
        this.transmission = transmission;
    }

    public Double getUndulatorGap1() {
        return undulatorGap1;
    }

    public void setUndulatorGap1(Double undulatorGap1) {
        this.undulatorGap1 = undulatorGap1;
    }

    public Double getUndulatorGap2() {
        return undulatorGap2;
    }

    public void setUndulatorGap2(Double undulatorGap2) {
        this.undulatorGap2 = undulatorGap2;
    }

    public Double getUndulatorGap3() {
        return undulatorGap3;
    }

    public void setUndulatorGap3(Double undulatorGap3) {
        this.undulatorGap3 = undulatorGap3;
    }

    public Double getWavelength() {
        return wavelength;
    }

    public void setWavelength(Double wavelength) {
        this.wavelength = wavelength;
    }

    public Double getxBeam() {
        return xBeam;
    }

    public void setxBeam(Double xBeam) {
        this.xBeam = xBeam;
    }

    public Double getyBeam() {
        return yBeam;
    }

    public void setyBeam(Double yBeam) {
        this.yBeam = yBeam;
    }

    @Override
    public String toString(){
        return ReflectionToStringBuilder.toString(this);
    }

    @Override
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object that){
        return EqualsBuilder.reflectionEquals(this, that);
    }
}
