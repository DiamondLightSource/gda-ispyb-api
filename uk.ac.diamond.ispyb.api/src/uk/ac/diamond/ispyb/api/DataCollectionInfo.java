
package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Extended information about a data collection. Extends from data collected in {@link DataCollectionMain}
 */
@Generated("uk.ac.diamond.ispyb.generator.BeanGenerator")
public class DataCollectionInfo {

    private Long id;
    private Integer dcNumber;
    private Timestamp startTime;
    private Timestamp endTime;
    private String status;
    private Float axisStart;
    private Float axisEnd;
    private Float axisRange;
    private Float overlap;
    private Integer numberOfImages;
    private Integer startImageNumber;
    private Integer numberOfPasses;
    private Float exposureTime;
    private String imageDirectory;
    private String imagePrefix;
    private String imageSuffix;
    private String fileTemplate;
    private Float wavelength;
    private Float resolution;
    private Float detectorDistance;
    private Float xBeam;
    private Float yBeam;
    private String comments;
    private Float slitgapVertical;
    private Float slitgapHorizontal;
    private Float transmission;
    private String synchrotronMode;
    private String snapshot1;
    private String snapshot2;
    private String snapshot3;
    private String snapshot4;
    private String rotationAxis;
    private Float phiStart;
    private Float kappaStart;
    private Float omegaStart;
    private Float undulatorGap1;
    private Float undulatorGap2;
    private Float undulatorGap3;
    private Float beamSizeAtSampleX;
    private Float beamSizeAtSampleY;
    private Float focalSpotSizeAtSampleX;
    private Float focalSpotSizeAtSampleY;
    private Float polarisation;
    private Double flux;
    private Double fluxEnd;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDcNumber() {
        return this.dcNumber;
    }

    public void setDcNumber(Integer dcNumber) {
        this.dcNumber = dcNumber;
    }

    public Timestamp getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getAxisStart() {
        return this.axisStart;
    }

    public void setAxisStart(Float axisStart) {
        this.axisStart = axisStart;
    }

    public Float getAxisEnd() {
        return this.axisEnd;
    }

    public void setAxisEnd(Float axisEnd) {
        this.axisEnd = axisEnd;
    }

    public Float getAxisRange() {
        return this.axisRange;
    }

    public void setAxisRange(Float axisRange) {
        this.axisRange = axisRange;
    }

    public Float getOverlap() {
        return this.overlap;
    }

    public void setOverlap(Float overlap) {
        this.overlap = overlap;
    }

    public Integer getNumberOfImages() {
        return this.numberOfImages;
    }

    public void setNumberOfImages(Integer numberOfImages) {
        this.numberOfImages = numberOfImages;
    }

    public Integer getStartImageNumber() {
        return this.startImageNumber;
    }

    public void setStartImageNumber(Integer startImageNumber) {
        this.startImageNumber = startImageNumber;
    }

    public Integer getNumberOfPasses() {
        return this.numberOfPasses;
    }

    public void setNumberOfPasses(Integer numberOfPasses) {
        this.numberOfPasses = numberOfPasses;
    }

    public Float getExposureTime() {
        return this.exposureTime;
    }

    public void setExposureTime(Float exposureTime) {
        this.exposureTime = exposureTime;
    }

    public String getImageDirectory() {
        return this.imageDirectory;
    }

    public void setImageDirectory(String imageDirectory) {
        this.imageDirectory = imageDirectory;
    }

    public String getImagePrefix() {
        return this.imagePrefix;
    }

    public void setImagePrefix(String imagePrefix) {
        this.imagePrefix = imagePrefix;
    }

    public String getImageSuffix() {
        return this.imageSuffix;
    }

    public void setImageSuffix(String imageSuffix) {
        this.imageSuffix = imageSuffix;
    }

    public String getFileTemplate() {
        return this.fileTemplate;
    }

    public void setFileTemplate(String fileTemplate) {
        this.fileTemplate = fileTemplate;
    }

    public Float getWavelength() {
        return this.wavelength;
    }

    public void setWavelength(Float wavelength) {
        this.wavelength = wavelength;
    }

    public Float getResolution() {
        return this.resolution;
    }

    public void setResolution(Float resolution) {
        this.resolution = resolution;
    }

    public Float getDetectorDistance() {
        return this.detectorDistance;
    }

    public void setDetectorDistance(Float detectorDistance) {
        this.detectorDistance = detectorDistance;
    }

    public Float getXBeam() {
        return this.xBeam;
    }

    public void setXBeam(Float xBeam) {
        this.xBeam = xBeam;
    }

    public Float getYBeam() {
        return this.yBeam;
    }

    public void setYBeam(Float yBeam) {
        this.yBeam = yBeam;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Float getSlitgapVertical() {
        return this.slitgapVertical;
    }

    public void setSlitgapVertical(Float slitgapVertical) {
        this.slitgapVertical = slitgapVertical;
    }

    public Float getSlitgapHorizontal() {
        return this.slitgapHorizontal;
    }

    public void setSlitgapHorizontal(Float slitgapHorizontal) {
        this.slitgapHorizontal = slitgapHorizontal;
    }

    public Float getTransmission() {
        return this.transmission;
    }

    public void setTransmission(Float transmission) {
        this.transmission = transmission;
    }

    public String getSynchrotronMode() {
        return this.synchrotronMode;
    }

    public void setSynchrotronMode(String synchrotronMode) {
        this.synchrotronMode = synchrotronMode;
    }

    public String getSnapshot1() {
        return this.snapshot1;
    }

    public void setSnapshot1(String snapshot1) {
        this.snapshot1 = snapshot1;
    }

    public String getSnapshot2() {
        return this.snapshot2;
    }

    public void setSnapshot2(String snapshot2) {
        this.snapshot2 = snapshot2;
    }

    public String getSnapshot3() {
        return this.snapshot3;
    }

    public void setSnapshot3(String snapshot3) {
        this.snapshot3 = snapshot3;
    }

    public String getSnapshot4() {
        return this.snapshot4;
    }

    public void setSnapshot4(String snapshot4) {
        this.snapshot4 = snapshot4;
    }

    public String getRotationAxis() {
        return this.rotationAxis;
    }

    public void setRotationAxis(String rotationAxis) {
        this.rotationAxis = rotationAxis;
    }

    public Float getPhiStart() {
        return this.phiStart;
    }

    public void setPhiStart(Float phiStart) {
        this.phiStart = phiStart;
    }

    public Float getKappaStart() {
        return this.kappaStart;
    }

    public void setKappaStart(Float kappaStart) {
        this.kappaStart = kappaStart;
    }

    public Float getOmegaStart() {
        return this.omegaStart;
    }

    public void setOmegaStart(Float omegaStart) {
        this.omegaStart = omegaStart;
    }

    public Float getUndulatorGap1() {
        return this.undulatorGap1;
    }

    public void setUndulatorGap1(Float undulatorGap1) {
        this.undulatorGap1 = undulatorGap1;
    }

    public Float getUndulatorGap2() {
        return this.undulatorGap2;
    }

    public void setUndulatorGap2(Float undulatorGap2) {
        this.undulatorGap2 = undulatorGap2;
    }

    public Float getUndulatorGap3() {
        return this.undulatorGap3;
    }

    public void setUndulatorGap3(Float undulatorGap3) {
        this.undulatorGap3 = undulatorGap3;
    }

    public Float getBeamSizeAtSampleX() {
        return this.beamSizeAtSampleX;
    }

    public void setBeamSizeAtSampleX(Float beamSizeAtSampleX) {
        this.beamSizeAtSampleX = beamSizeAtSampleX;
    }

    public Float getBeamSizeAtSampleY() {
        return this.beamSizeAtSampleY;
    }

    public void setBeamSizeAtSampleY(Float beamSizeAtSampleY) {
        this.beamSizeAtSampleY = beamSizeAtSampleY;
    }

    public Float getFocalSpotSizeAtSampleX() {
        return this.focalSpotSizeAtSampleX;
    }

    public void setFocalSpotSizeAtSampleX(Float focalSpotSizeAtSampleX) {
        this.focalSpotSizeAtSampleX = focalSpotSizeAtSampleX;
    }

    public Float getFocalSpotSizeAtSampleY() {
        return this.focalSpotSizeAtSampleY;
    }

    public void setFocalSpotSizeAtSampleY(Float focalSpotSizeAtSampleY) {
        this.focalSpotSizeAtSampleY = focalSpotSizeAtSampleY;
    }

    public Float getPolarisation() {
        return this.polarisation;
    }

    public void setPolarisation(Float polarisation) {
        this.polarisation = polarisation;
    }

    public Double getFlux() {
        return this.flux;
    }

    public void setFlux(Double flux) {
        this.flux = flux;
    }

    public Double getFluxEnd() {
        return this.fluxEnd;
    }

    public void setFluxEnd(Double fluxEnd) {
        this.fluxEnd = fluxEnd;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

}
