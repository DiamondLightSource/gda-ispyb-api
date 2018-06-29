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

/*
 * Details of an experiment related to a data collection.
 */
@Generated("uk.ac.diamond.ispyb.generator.BeanGenerator")
public class DataCollectionExperiment {

    private Long id;
    private Float slitGapVertical;
    private Float slitGapHorizontal;
    private Float transmission;
    private Float exposureTime;
    private Float xBeam;
    private Float yBeam;
    private Float axisStart;
    private Float axisEnd;
    private Float axisRange;
    private Float overlap;
    private Double flux;
    private Double fluxEnd;
    private String rotationAxis;
    private Float phiStart;
    private Float kappaStart;
    private Float omegaStart;
    private Float wavelength;
    private Float resolution;
    private Float detectorDistance;
    private Float detector2Theta;
    private String bestWilsonPlotPath;
    private Float beamSizeAtSampleX;
    private Float beamSizeAtSampleY;
    private Float focalSpotSizeAtSampleX;
    private Float focalSpotSizeAtSampleY;
    private Float apertureSizeX;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getSlitGapVertical() {
        return this.slitGapVertical;
    }

    public void setSlitGapVertical(Float slitGapVertical) {
        this.slitGapVertical = slitGapVertical;
    }

    public Float getSlitGapHorizontal() {
        return this.slitGapHorizontal;
    }

    public void setSlitGapHorizontal(Float slitGapHorizontal) {
        this.slitGapHorizontal = slitGapHorizontal;
    }

    public Float getTransmission() {
        return this.transmission;
    }

    public void setTransmission(Float transmission) {
        this.transmission = transmission;
    }

    public Float getExposureTime() {
        return this.exposureTime;
    }

    public void setExposureTime(Float exposureTime) {
        this.exposureTime = exposureTime;
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

    public Float getDetector2Theta() {
        return this.detector2Theta;
    }

    public void setDetector2Theta(Float detector2Theta) {
        this.detector2Theta = detector2Theta;
    }

    public String getBestWilsonPlotPath() {
        return this.bestWilsonPlotPath;
    }

    public void setBestWilsonPlotPath(String bestWilsonPlotPath) {
        this.bestWilsonPlotPath = bestWilsonPlotPath;
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

    public Float getApertureSizeX() {
        return this.apertureSizeX;
    }

    public void setApertureSizeX(Float apertureSizeX) {
        this.apertureSizeX = apertureSizeX;
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
