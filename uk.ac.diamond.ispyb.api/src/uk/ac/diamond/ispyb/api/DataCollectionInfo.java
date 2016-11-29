
package uk.ac.diamond.ispyb.api;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@Generated("uk.ac.diamond.ispyb.generator.BeanGenerator")
public class DataCollectionInfo {
    private int dataCollectionId;
    private int dataCollectionNumber;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String runStatus;
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
    private float slitGapVertical;
    private float slitGapHorizontal;
    private float transmission;
    private String synchrotronMode;
    private String xtalSnapshotFullPath1;
    private String xtalSnapshotFullPath2;
    private String xtalSnapshotFullPath3;
    private String xtalSnapshotFullPath4;
    private char rotationAxis;
    private float phiStart;
    private float kappaStart;
    private float omegaStart;
    private float undulatorGap1;
    private float undulatorGap2;
    private float undulatorGap3;
    private float beamSizeAtSampleX;
    private float beamSizeAtSampleY;
    private float FOCALSPOTSIZEATSAMPLEX;
    private float FOCALSPOTSIZEATSAMPLEY;
    private float POLARISATION;
    private double flux;
    private double flux_end;

    public int getDataCollectionId() {
        return this.dataCollectionId;
    }

    public void setDataCollectionId(int dataCollectionId) {
        this.dataCollectionId = dataCollectionId;
    }

    public int getDataCollectionNumber() {
        return this.dataCollectionNumber;
    }

    public void setDataCollectionNumber(int dataCollectionNumber) {
        this.dataCollectionNumber = dataCollectionNumber;
    }

    public LocalDateTime getStartTime() {
        return this.startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return this.endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getRunStatus() {
        return this.runStatus;
    }

    public void setRunStatus(String runStatus) {
        this.runStatus = runStatus;
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

    public float getSlitGapVertical() {
        return this.slitGapVertical;
    }

    public void setSlitGapVertical(float slitGapVertical) {
        this.slitGapVertical = slitGapVertical;
    }

    public float getSlitGapHorizontal() {
        return this.slitGapHorizontal;
    }

    public void setSlitGapHorizontal(float slitGapHorizontal) {
        this.slitGapHorizontal = slitGapHorizontal;
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

    public String getXtalSnapshotFullPath1() {
        return this.xtalSnapshotFullPath1;
    }

    public void setXtalSnapshotFullPath1(String xtalSnapshotFullPath1) {
        this.xtalSnapshotFullPath1 = xtalSnapshotFullPath1;
    }

    public String getXtalSnapshotFullPath2() {
        return this.xtalSnapshotFullPath2;
    }

    public void setXtalSnapshotFullPath2(String xtalSnapshotFullPath2) {
        this.xtalSnapshotFullPath2 = xtalSnapshotFullPath2;
    }

    public String getXtalSnapshotFullPath3() {
        return this.xtalSnapshotFullPath3;
    }

    public void setXtalSnapshotFullPath3(String xtalSnapshotFullPath3) {
        this.xtalSnapshotFullPath3 = xtalSnapshotFullPath3;
    }

    public String getXtalSnapshotFullPath4() {
        return this.xtalSnapshotFullPath4;
    }

    public void setXtalSnapshotFullPath4(String xtalSnapshotFullPath4) {
        this.xtalSnapshotFullPath4 = xtalSnapshotFullPath4;
    }

    public char getRotationAxis() {
        return this.rotationAxis;
    }

    public void setRotationAxis(char rotationAxis) {
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

    public float getFOCALSPOTSIZEATSAMPLEX() {
        return this.FOCALSPOTSIZEATSAMPLEX;
    }

    public void setFOCALSPOTSIZEATSAMPLEX(float FOCALSPOTSIZEATSAMPLEX) {
        this.FOCALSPOTSIZEATSAMPLEX = FOCALSPOTSIZEATSAMPLEX;
    }

    public float getFOCALSPOTSIZEATSAMPLEY() {
        return this.FOCALSPOTSIZEATSAMPLEY;
    }

    public void setFOCALSPOTSIZEATSAMPLEY(float FOCALSPOTSIZEATSAMPLEY) {
        this.FOCALSPOTSIZEATSAMPLEY = FOCALSPOTSIZEATSAMPLEY;
    }

    public float getPOLARISATION() {
        return this.POLARISATION;
    }

    public void setPOLARISATION(float POLARISATION) {
        this.POLARISATION = POLARISATION;
    }

    public double getFlux() {
        return this.flux;
    }

    public void setFlux(double flux) {
        this.flux = flux;
    }

    public double getFlux_end() {
        return this.flux_end;
    }

    public void setFlux_end(double flux_end) {
        this.flux_end = flux_end;
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
