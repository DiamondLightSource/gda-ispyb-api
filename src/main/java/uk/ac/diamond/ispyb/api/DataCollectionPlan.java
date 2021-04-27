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

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DataCollectionPlan {
    private Long dcPlanId;
    private String name;
    private Short sampleOrderInPlan;
    private String experimentKind;
    private Double preferredBeamSizeX;
    private Double preferredBeamSizeY;
    private Double requiredResolution;
    private Double monoBandwidth;
    private Double energy;
    private Long detectorId;
    private Double exposureTime;
    private Double distance;
    private Double roll;
    private Long scanParamModelId;
    private String scanParamServiceName;
    private String scanParamSequenceNumber;
    private Double scanParamModelStart;
    private Double scanParamModelStop;
    private Double scanParamModelStep;
    private String scanParamModelArray;

    public Long getDcPlanId() {
        return dcPlanId;
    }

    public void setDcPlanId(Long dcPlanId) {
        this.dcPlanId = dcPlanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getSampleOrderInPlan() {
        return sampleOrderInPlan;
    }

    public void setSampleOrderInPlan(Short sampleOrderInPlan) {
        this.sampleOrderInPlan = sampleOrderInPlan;
    }

    public String getExperimentKind() {
        return experimentKind;
    }

    public void setExperimentKind(String experimentKind) {
        this.experimentKind = experimentKind;
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

    public Double getRequiredResolution() {
        return requiredResolution;
    }

    public void setRequiredResolution(Double requiredResolution) {
        this.requiredResolution = requiredResolution;
    }

    public Double getMonoBandwidth() {
        return monoBandwidth;
    }

    public void setMonoBandwidth(Double monoBandwidth) {
        this.monoBandwidth = monoBandwidth;
    }

    public Double getEnergy() {
        return energy;
    }

    public void setEnergy(Double energy) {
        this.energy = energy;
    }

    public Long getDetectorId() {
        return detectorId;
    }

    public void setDetectorId(Long detectorId) {
        this.detectorId = detectorId;
    }

    public Double getExposureTime() {
        return exposureTime;
    }

    public void setExposureTime(Double exposureTime) {
        this.exposureTime = exposureTime;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getRoll() {
        return roll;
    }

    public void setRoll(Double roll) {
        this.roll = roll;
    }

    public Long getScanParamModelId() {
        return scanParamModelId;
    }

    public void setScanParamModelId(Long scanParamModelId) {
        this.scanParamModelId = scanParamModelId;
    }

    public String getScanParamServiceName() {
        return scanParamServiceName;
    }

    public void setScanParamServiceName(String scanParamServiceName) {
        this.scanParamServiceName = scanParamServiceName;
    }

    public String getScanParamSequenceNumber() {
        return scanParamSequenceNumber;
    }

    public void setScanParamSequenceNumber(String scanParamSequenceNumber) {
        this.scanParamSequenceNumber = scanParamSequenceNumber;
    }

    public Double getScanParamModelStart() {
        return scanParamModelStart;
    }

    public void setScanParamModelStart(Double scanParamModelStart) {
        this.scanParamModelStart = scanParamModelStart;
    }

    public Double getScanParamModelStop() {
        return scanParamModelStop;
    }

    public void setScanParamModelStop(Double scanParamModelStop) {
        this.scanParamModelStop = scanParamModelStop;
    }

    public Double getScanParamModelStep() {
        return scanParamModelStep;
    }

    public void setScanParamModelStep(Double scanParamModelStep) {
        this.scanParamModelStep = scanParamModelStep;
    }

    public String getScanParamModelArray() {
        return scanParamModelArray;
    }

    public void setScanParamModelArray(String scanParamModelArray) {
        this.scanParamModelArray = scanParamModelArray;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

}
