package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;

public class XFEFlourecenceSpectrum {
    private long id;
    private long sessionId;
    private long sampleId;
    private String jpegScanFileFullPath;
    private Timestamp startTime;
    private Timestamp endTime;
    private String fileName;
    private Double exposureTime;
    private Double axisPosition;
    private  Double transmission;
    private String annotatedPymcaSpectrum;
    private String fittedDataFileFullPath;
    private String scanFileFullPath;
    private Double energy;
    private Double beamSizeVertical;
    private Double beamSizeHorizontal;
    private String crystalClass;
    private String comments;
    private long subSampleId;
    private Double flux;
    private Double fluxEnd;
    private String workingDirectory;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

    public long getSampleId() {
        return sampleId;
    }

    public void setSampleId(long sampleId) {
        this.sampleId = sampleId;
    }

    public String getJpegScanFileFullPath() {
        return jpegScanFileFullPath;
    }

    public void setJpegScanFileFullPath(String jpegScanFileFullPath) {
        this.jpegScanFileFullPath = jpegScanFileFullPath;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Double getExposureTime() {
        return exposureTime;
    }

    public void setExposureTime(Double exposureTime) {
        this.exposureTime = exposureTime;
    }

    public Double getAxisPosition() {
        return axisPosition;
    }

    public void setAxisPosition(Double axisPosition) {
        this.axisPosition = axisPosition;
    }

    public Double getTransmission() {
        return transmission;
    }

    public void setTransmission(Double transmission) {
        this.transmission = transmission;
    }

    public String getAnnotatedPymcaSpectrum() {
        return annotatedPymcaSpectrum;
    }

    public void setAnnotatedPymcaSpectrum(String annotatedPymcaSpectrum) {
        this.annotatedPymcaSpectrum = annotatedPymcaSpectrum;
    }

    public String getFittedDataFileFullPath() {
        return fittedDataFileFullPath;
    }

    public void setFittedDataFileFullPath(String fittedDataFileFullPath) {
        this.fittedDataFileFullPath = fittedDataFileFullPath;
    }

    public String getScanFileFullPath() {
        return scanFileFullPath;
    }

    public void setScanFileFullPath(String scanFileFullPath) {
        this.scanFileFullPath = scanFileFullPath;
    }

    public Double getEnergy() {
        return energy;
    }

    public void setEnergy(Double energy) {
        this.energy = energy;
    }

    public Double getBeamSizeVertical() {
        return beamSizeVertical;
    }

    public void setBeamSizeVertical(Double beamSizeVertical) {
        this.beamSizeVertical = beamSizeVertical;
    }

    public Double getBeamSizeHorizontal() {
        return beamSizeHorizontal;
    }

    public void setBeamSizeHorizontal(Double beamSizeHorizontal) {
        this.beamSizeHorizontal = beamSizeHorizontal;
    }

    public String getCrystalClass() {
        return crystalClass;
    }

    public void setCrystalClass(String crystalClass) {
        this.crystalClass = crystalClass;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public long getSubSampleId() {
        return subSampleId;
    }

    public void setSubSampleId(long subSampleId) {
        this.subSampleId = subSampleId;
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

    public String getWorkingDirectory() {
        return workingDirectory;
    }

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }
}
