
package uk.ac.diamond.ispyb.api;

import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@Generated("uk.ac.diamond.ispyb.generator.BeanGenerator")
public class ContainerSubsample {

    private String barcode;
    private int id;
    private String sampleLocation;
    private double ROIPos1x;
    private double ROIPos1y;
    private double ROIPos1z;
    private double ROIPos2x;
    private double ROIPos2y;
    private double ROIPos2z;
    private String lastImgFullPath;
    private String uploadedImgFilePath;
    private String uploadedImgFileName;
    private char experimentKind;
    private float exposureTime;
    private float preferredBeamSizeX;
    private float preferredBeamSizeY;
    private double requiredResolution;
    private String monochromator;
    private double wavelength;
    private float transmission;
    private float boxSizeX;
    private float boxSizeY;
    private float kappaStart;
    private float axisStart;
    private float axisRange;
    private int numberOfImages;

    public String getBarcode() {
        return this.barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSampleLocation() {
        return this.sampleLocation;
    }

    public void setSampleLocation(String sampleLocation) {
        this.sampleLocation = sampleLocation;
    }

    public double getROIPos1x() {
        return this.ROIPos1x;
    }

    public void setROIPos1x(double ROIPos1x) {
        this.ROIPos1x = ROIPos1x;
    }

    public double getROIPos1y() {
        return this.ROIPos1y;
    }

    public void setROIPos1y(double ROIPos1y) {
        this.ROIPos1y = ROIPos1y;
    }

    public double getROIPos1z() {
        return this.ROIPos1z;
    }

    public void setROIPos1z(double ROIPos1z) {
        this.ROIPos1z = ROIPos1z;
    }

    public double getROIPos2x() {
        return this.ROIPos2x;
    }

    public void setROIPos2x(double ROIPos2x) {
        this.ROIPos2x = ROIPos2x;
    }

    public double getROIPos2y() {
        return this.ROIPos2y;
    }

    public void setROIPos2y(double ROIPos2y) {
        this.ROIPos2y = ROIPos2y;
    }

    public double getROIPos2z() {
        return this.ROIPos2z;
    }

    public void setROIPos2z(double ROIPos2z) {
        this.ROIPos2z = ROIPos2z;
    }

    public String getLastImgFullPath() {
        return this.lastImgFullPath;
    }

    public void setLastImgFullPath(String lastImgFullPath) {
        this.lastImgFullPath = lastImgFullPath;
    }

    public String getUploadedImgFilePath() {
        return this.uploadedImgFilePath;
    }

    public void setUploadedImgFilePath(String uploadedImgFilePath) {
        this.uploadedImgFilePath = uploadedImgFilePath;
    }

    public String getUploadedImgFileName() {
        return this.uploadedImgFileName;
    }

    public void setUploadedImgFileName(String uploadedImgFileName) {
        this.uploadedImgFileName = uploadedImgFileName;
    }

    public char getExperimentKind() {
        return this.experimentKind;
    }

    public void setExperimentKind(char experimentKind) {
        this.experimentKind = experimentKind;
    }

    public float getExposureTime() {
        return this.exposureTime;
    }

    public void setExposureTime(float exposureTime) {
        this.exposureTime = exposureTime;
    }

    public float getPreferredBeamSizeX() {
        return this.preferredBeamSizeX;
    }

    public void setPreferredBeamSizeX(float preferredBeamSizeX) {
        this.preferredBeamSizeX = preferredBeamSizeX;
    }

    public float getPreferredBeamSizeY() {
        return this.preferredBeamSizeY;
    }

    public void setPreferredBeamSizeY(float preferredBeamSizeY) {
        this.preferredBeamSizeY = preferredBeamSizeY;
    }

    public double getRequiredResolution() {
        return this.requiredResolution;
    }

    public void setRequiredResolution(double requiredResolution) {
        this.requiredResolution = requiredResolution;
    }

    public String getMonochromator() {
        return this.monochromator;
    }

    public void setMonochromator(String monochromator) {
        this.monochromator = monochromator;
    }

    public double getWavelength() {
        return this.wavelength;
    }

    public void setWavelength(double wavelength) {
        this.wavelength = wavelength;
    }

    public float getTransmission() {
        return this.transmission;
    }

    public void setTransmission(float transmission) {
        this.transmission = transmission;
    }

    public float getBoxSizeX() {
        return this.boxSizeX;
    }

    public void setBoxSizeX(float boxSizeX) {
        this.boxSizeX = boxSizeX;
    }

    public float getBoxSizeY() {
        return this.boxSizeY;
    }

    public void setBoxSizeY(float boxSizeY) {
        this.boxSizeY = boxSizeY;
    }

    public float getKappaStart() {
        return this.kappaStart;
    }

    public void setKappaStart(float kappaStart) {
        this.kappaStart = kappaStart;
    }

    public float getAxisStart() {
        return this.axisStart;
    }

    public void setAxisStart(float axisStart) {
        this.axisStart = axisStart;
    }

    public float getAxisRange() {
        return this.axisRange;
    }

    public void setAxisRange(float axisRange) {
        this.axisRange = axisRange;
    }

    public int getNumberOfImages() {
        return this.numberOfImages;
    }

    public void setNumberOfImages(int numberOfImages) {
        this.numberOfImages = numberOfImages;
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
