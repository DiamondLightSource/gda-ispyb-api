
package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@Generated("uk.ac.diamond.ispyb.generator.BeanGenerator")
public class DataCollectionInfo {

    private long id;
    private int dcNumber;
    private Timestamp startTime;
    private Timestamp endTime;
    private String status;
    private float axisStart;
    private float axisEnd;
    private float axisRange;
    private float overlap;
    private int numberOfImages;
    private int startImageNumber;
    private int numberOfPasses;
    private float exposureTime;
    private String imageDirectory;
    private String imagePrefix;
    private String imageSuffix;
    private String fileTemplate;
    private float wavelength;
    private float resolution;
    private float detectorDistance;
    private float xBeam;
    private float yBeam;
    private String comments;
    private float slitgapVertical;
    private float slitgapHorizontal;
    private float transmission;
    private String synchrotronMode;
    private String snapshot1;
    private String snapshot2;
    private String snapshot3;
    private String snapshot4;
    private String rotationAxis;
    private float phiStart;
    private float kappaStart;
    private float omegaStart;
    private float undulatorGap1;
    private float undulatorGap2;
    private float undulatorGap3;
    private float beamSizeAtSampleX;
    private float beamSizeAtSampleY;
    private float focalSpotSizeAtSampleX;
    private float focalSpotSizeAtSampleY;
    private float polarisation;
    private double flux;
    private double fluxEnd;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDcNumber() {
        return this.dcNumber;
    }

    public void setDcNumber(int dcNumber) {
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

    public float getAxisStart() {
        return this.axisStart;
    }

    public void setAxisStart(float axisStart) {
        this.axisStart = axisStart;
    }

    public float getAxisEnd() {
        return this.axisEnd;
    }

    public void setAxisEnd(float axisEnd) {
        this.axisEnd = axisEnd;
    }

    public float getAxisRange() {
        return this.axisRange;
    }

    public void setAxisRange(float axisRange) {
        this.axisRange = axisRange;
    }

    public float getOverlap() {
        return this.overlap;
    }

    public void setOverlap(float overlap) {
        this.overlap = overlap;
    }

    public int getNumberOfImages() {
        return this.numberOfImages;
    }

    public void setNumberOfImages(int numberOfImages) {
        this.numberOfImages = numberOfImages;
    }

    public int getStartImageNumber() {
        return this.startImageNumber;
    }

    public void setStartImageNumber(int startImageNumber) {
        this.startImageNumber = startImageNumber;
    }

    public int getNumberOfPasses() {
        return this.numberOfPasses;
    }

    public void setNumberOfPasses(int numberOfPasses) {
        this.numberOfPasses = numberOfPasses;
    }

    public float getExposureTime() {
        return this.exposureTime;
    }

    public void setExposureTime(float exposureTime) {
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

    public float getWavelength() {
        return this.wavelength;
    }

    public void setWavelength(float wavelength) {
        this.wavelength = wavelength;
    }

    public float getResolution() {
        return this.resolution;
    }

    public void setResolution(float resolution) {
        this.resolution = resolution;
    }

    public float getDetectorDistance() {
        return this.detectorDistance;
    }

    public void setDetectorDistance(float detectorDistance) {
        this.detectorDistance = detectorDistance;
    }

    public float getXBeam() {
        return this.xBeam;
    }

    public void setXBeam(float xBeam) {
        this.xBeam = xBeam;
    }

    public float getYBeam() {
        return this.yBeam;
    }

    public void setYBeam(float yBeam) {
        this.yBeam = yBeam;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public float getSlitgapVertical() {
        return this.slitgapVertical;
    }

    public void setSlitgapVertical(float slitgapVertical) {
        this.slitgapVertical = slitgapVertical;
    }

    public float getSlitgapHorizontal() {
        return this.slitgapHorizontal;
    }

    public void setSlitgapHorizontal(float slitgapHorizontal) {
        this.slitgapHorizontal = slitgapHorizontal;
    }

    public float getTransmission() {
        return this.transmission;
    }

    public void setTransmission(float transmission) {
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

    public float getPhiStart() {
        return this.phiStart;
    }

    public void setPhiStart(float phiStart) {
        this.phiStart = phiStart;
    }

    public float getKappaStart() {
        return this.kappaStart;
    }

    public void setKappaStart(float kappaStart) {
        this.kappaStart = kappaStart;
    }

    public float getOmegaStart() {
        return this.omegaStart;
    }

    public void setOmegaStart(float omegaStart) {
        this.omegaStart = omegaStart;
    }

    public float getUndulatorGap1() {
        return this.undulatorGap1;
    }

    public void setUndulatorGap1(float undulatorGap1) {
        this.undulatorGap1 = undulatorGap1;
    }

    public float getUndulatorGap2() {
        return this.undulatorGap2;
    }

    public void setUndulatorGap2(float undulatorGap2) {
        this.undulatorGap2 = undulatorGap2;
    }

    public float getUndulatorGap3() {
        return this.undulatorGap3;
    }

    public void setUndulatorGap3(float undulatorGap3) {
        this.undulatorGap3 = undulatorGap3;
    }

    public float getBeamSizeAtSampleX() {
        return this.beamSizeAtSampleX;
    }

    public void setBeamSizeAtSampleX(float beamSizeAtSampleX) {
        this.beamSizeAtSampleX = beamSizeAtSampleX;
    }

    public float getBeamSizeAtSampleY() {
        return this.beamSizeAtSampleY;
    }

    public void setBeamSizeAtSampleY(float beamSizeAtSampleY) {
        this.beamSizeAtSampleY = beamSizeAtSampleY;
    }

    public float getFocalSpotSizeAtSampleX() {
        return this.focalSpotSizeAtSampleX;
    }

    public void setFocalSpotSizeAtSampleX(float focalSpotSizeAtSampleX) {
        this.focalSpotSizeAtSampleX = focalSpotSizeAtSampleX;
    }

    public float getFocalSpotSizeAtSampleY() {
        return this.focalSpotSizeAtSampleY;
    }

    public void setFocalSpotSizeAtSampleY(float focalSpotSizeAtSampleY) {
        this.focalSpotSizeAtSampleY = focalSpotSizeAtSampleY;
    }

    public float getPolarisation() {
        return this.polarisation;
    }

    public void setPolarisation(float polarisation) {
        this.polarisation = polarisation;
    }

    public double getFlux() {
        return this.flux;
    }

    public void setFlux(double flux) {
        this.flux = flux;
    }

    public double getFluxEnd() {
        return this.fluxEnd;
    }

    public void setFluxEnd(double fluxEnd) {
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
