package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;

public class XFEFlourecenceSpectrum {
    private long xfeFluorescenceSpectrumId;
    private long sessionId;
    private long blSampleId;
    private String jpegScanFileFullPath;
    private Timestamp startTime;
    private Timestamp endTime;
    private String filename;
    private Double exposureTime;
    private Double axisPosition;
    private  Double beamTransmission;
    private String annotatedPymcaXfeSpectrum;
    private String fittedDataFileFullPath;
    private String scanFileFullPath;
    private Double energy;
    private Double beamSizeVertical;
    private Double beamSizeHorizontal;
    private String crystalClass;
    private String comments;
    private long blSumSampleId;
    private Double flux;
    private Double flux_end;
    private String workingDirectory;

    public long getXfeFluorescenceSpectrumId() {
        return xfeFluorescenceSpectrumId;
    }

    public void setXfeFluorescenceSpectrumId(long xfeFluorescenceSpectrumId) {
        this.xfeFluorescenceSpectrumId = xfeFluorescenceSpectrumId;
    }

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

    public long getBlSampleId() {
        return blSampleId;
    }

    public void setBlSampleId(long blSampleId) {
        this.blSampleId = blSampleId;
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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
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

    public Double getBeamTransmission() {
        return beamTransmission;
    }

    public void setBeamTransmission(Double beamTransmission) {
        this.beamTransmission = beamTransmission;
    }

    public String getAnnotatedPymcaXfeSpectrum() {
        return annotatedPymcaXfeSpectrum;
    }

    public void setAnnotatedPymcaXfeSpectrum(String annotatedPymcaXfeSpectrum) {
        this.annotatedPymcaXfeSpectrum = annotatedPymcaXfeSpectrum;
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

    public long getBlSumSampleId() {
        return blSumSampleId;
    }

    public void setBlSumSampleId(long blSumSampleId) {
        this.blSumSampleId = blSumSampleId;
    }

    public Double getFlux() {
        return flux;
    }

    public void setFlux(Double flux) {
        this.flux = flux;
    }

    public Double getFlux_end() {
        return flux_end;
    }

    public void setFlux_end(Double flux_end) {
        this.flux_end = flux_end;
    }

    public String getWorkingDirectory() {
        return workingDirectory;
    }

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }
}
