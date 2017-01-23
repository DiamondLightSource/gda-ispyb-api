
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

    private int id;
    private float slitGapVertical;
    private float slitGapHorizontal;
    private float transmission;
    private float exposureTime;
    private float xBeam;
    private float yBeam;
    private float axisStart;
    private float axisEnd;
    private float axisRange;
    private float overlap;
    private double flux;
    private double fluxEnd;
    private String rotationAxis;
    private float phiStart;
    private float kappaStart;
    private float omegaStart;
    private float wavelength;
    private float resolution;
    private float detectorDistance;
    private String bestWilsonPlotPath;
    private float beamSizeAtSampleX;
    private float beamSizeAtSampleY;
    private float focalSpotSizeAtSampleX;
    private float focalSpotSizeAtSampleY;
    private float apertureSizeX;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getExposureTime() {
        return this.exposureTime;
    }

    public void setExposureTime(float exposureTime) {
        this.exposureTime = exposureTime;
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

    public String getBestWilsonPlotPath() {
        return this.bestWilsonPlotPath;
    }

    public void setBestWilsonPlotPath(String bestWilsonPlotPath) {
        this.bestWilsonPlotPath = bestWilsonPlotPath;
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

    public float getApertureSizeX() {
        return this.apertureSizeX;
    }

    public void setApertureSizeX(float apertureSizeX) {
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
