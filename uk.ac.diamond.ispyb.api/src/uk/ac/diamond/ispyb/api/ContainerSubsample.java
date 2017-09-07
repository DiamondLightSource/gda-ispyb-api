/*-
 *******************************************************************************
 * Copyright (c) 2011, 2016 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    See git history
 *******************************************************************************/

package uk.ac.diamond.ispyb.api;

import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * details about a subsample within a container
 */
@Generated("uk.ac.diamond.ispyb.generator.BeanGenerator")
public class ContainerSubsample {

    private String barcode;
    private Long id;
    private String sampleLocation;
    private Double ROIPos1x;
    private Double ROIPos1y;
    private Double ROIPos1z;
    private Double ROIPos2x;
    private Double ROIPos2y;
    private Double ROIPos2z;
    private String lastImgFullPath;
    private String uploadedImgFilePath;
    private String uploadedImgFileName;
    private String experimentKind;
    private Float exposureTime;
    private Float preferredBeamSizeX;
    private Float preferredBeamSizeY;
    private Double requiredResolution;
    private String monochromator;
    private Double wavelength;
    private Float transmission;
    private Float boxSizeX;
    private Float boxSizeY;
    private Float kappaStart;
    private Float axisStart;
    private Float axisRange;
    private Integer numberOfImages;
    private Integer numDCs;

    public String getBarcode() {
        return this.barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSampleLocation() {
        return this.sampleLocation;
    }

    public void setSampleLocation(String sampleLocation) {
        this.sampleLocation = sampleLocation;
    }

    public Double getROIPos1x() {
        return this.ROIPos1x;
    }

    public void setROIPos1x(Double ROIPos1x) {
        this.ROIPos1x = ROIPos1x;
    }

    public Double getROIPos1y() {
        return this.ROIPos1y;
    }

    public void setROIPos1y(Double ROIPos1y) {
        this.ROIPos1y = ROIPos1y;
    }

    public Double getROIPos1z() {
        return this.ROIPos1z;
    }

    public void setROIPos1z(Double ROIPos1z) {
        this.ROIPos1z = ROIPos1z;
    }

    public Double getROIPos2x() {
        return this.ROIPos2x;
    }

    public void setROIPos2x(Double ROIPos2x) {
        this.ROIPos2x = ROIPos2x;
    }

    public Double getROIPos2y() {
        return this.ROIPos2y;
    }

    public void setROIPos2y(Double ROIPos2y) {
        this.ROIPos2y = ROIPos2y;
    }

    public Double getROIPos2z() {
        return this.ROIPos2z;
    }

    public void setROIPos2z(Double ROIPos2z) {
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

    public String getExperimentKind() {
        return this.experimentKind;
    }

    public void setExperimentKind(String experimentKind) {
        this.experimentKind = experimentKind;
    }

    public Float getExposureTime() {
        return this.exposureTime;
    }

    public void setExposureTime(Float exposureTime) {
        this.exposureTime = exposureTime;
    }

    public Float getPreferredBeamSizeX() {
        return this.preferredBeamSizeX;
    }

    public void setPreferredBeamSizeX(Float preferredBeamSizeX) {
        this.preferredBeamSizeX = preferredBeamSizeX;
    }

    public Float getPreferredBeamSizeY() {
        return this.preferredBeamSizeY;
    }

    public void setPreferredBeamSizeY(Float preferredBeamSizeY) {
        this.preferredBeamSizeY = preferredBeamSizeY;
    }

    public Double getRequiredResolution() {
        return this.requiredResolution;
    }

    public void setRequiredResolution(Double requiredResolution) {
        this.requiredResolution = requiredResolution;
    }

    public String getMonochromator() {
        return this.monochromator;
    }

    public void setMonochromator(String monochromator) {
        this.monochromator = monochromator;
    }

    public Double getWavelength() {
        return this.wavelength;
    }

    public void setWavelength(Double wavelength) {
        this.wavelength = wavelength;
    }

    public Float getTransmission() {
        return this.transmission;
    }

    public void setTransmission(Float transmission) {
        this.transmission = transmission;
    }

    public Float getBoxSizeX() {
        return this.boxSizeX;
    }

    public void setBoxSizeX(Float boxSizeX) {
        this.boxSizeX = boxSizeX;
    }

    public Float getBoxSizeY() {
        return this.boxSizeY;
    }

    public void setBoxSizeY(Float boxSizeY) {
        this.boxSizeY = boxSizeY;
    }

    public Float getKappaStart() {
        return this.kappaStart;
    }

    public void setKappaStart(Float kappaStart) {
        this.kappaStart = kappaStart;
    }

    public Float getAxisStart() {
        return this.axisStart;
    }

    public void setAxisStart(Float axisStart) {
        this.axisStart = axisStart;
    }

    public Float getAxisRange() {
        return this.axisRange;
    }

    public void setAxisRange(Float axisRange) {
        this.axisRange = axisRange;
    }

    public Integer getNumberOfImages() {
        return this.numberOfImages;
    }

    public void setNumberOfImages(Integer numberOfImages) {
        this.numberOfImages = numberOfImages;
    }

    public Integer getNumDCs() {
        return numDCs;
    }

    public void setNumDCs(Integer numDCs) {
        this.numDCs = numDCs;
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
