package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;

public class EnergyScan {
    private long id;
    private long sessionId;
    private long sampleId;
    private String fluorescenceDetector;
    private String scanFileFullPath;
    private String jpegChoochFileFullPath;
    private String element;
    private double startEnergy;
    private double endEnergy;
    private String detector;
    private double transmission;
    private double exposureTime;
    private double axisPosition;
    private double synchrotronCurrent;
    private double temperature;
    private double peakEnergy;
    private double peakFPrime;
    private double peakFDoublePrime;
    private double inflectionEnergy;
    private double inflectionFPrime;
    private double inflectionFDoublePrime;
    private double xrayDose;
    private Timestamp startTime;
    private Timestamp endTime;
    private String edgeEnergy;
    private String filename;
    private double beamSizeVertical;
    private double beamSizeHorizontal;
    private String choochFileFullPath;
    private String crystalClass;
    private double flux;
    private double fluxEnd;
    private String workingDirectory;
    private long subSampleId;
    private String comments;

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

    public String getFluorescenceDetector() {
        return fluorescenceDetector;
    }

    public void setFluorescenceDetector(String fluorescenceDetector) {
        this.fluorescenceDetector = fluorescenceDetector;
    }

    public String getScanFileFullPath() {
        return scanFileFullPath;
    }

    public void setScanFileFullPath(String scanFileFullPath) {
        this.scanFileFullPath = scanFileFullPath;
    }

    public String getJpegChoochFileFullPath() {
        return jpegChoochFileFullPath;
    }

    public void setJpegChoochFileFullPath(String jpegChoochFileFullPath) {
        this.jpegChoochFileFullPath = jpegChoochFileFullPath;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public double getStartEnergy() {
        return startEnergy;
    }

    public void setStartEnergy(double startEnergy) {
        this.startEnergy = startEnergy;
    }

    public double getEndEnergy() {
        return endEnergy;
    }

    public void setEndEnergy(double endEnergy) {
        this.endEnergy = endEnergy;
    }

    public String getDetector() {
        return detector;
    }

    public void setDetector(String detector) {
        this.detector = detector;
    }

    public double getTransmission() {
        return transmission;
    }

    public void setTransmission(double transmission) {
        this.transmission = transmission;
    }

    public double getExposureTime() {
        return exposureTime;
    }

    public void setExposureTime(double exposureTime) {
        this.exposureTime = exposureTime;
    }

    public double getAxisPosition() {
        return axisPosition;
    }

    public void setAxisPosition(double axisPosition) {
        this.axisPosition = axisPosition;
    }

    public double getSynchrotronCurrent() {
        return synchrotronCurrent;
    }

    public void setSynchrotronCurrent(double synchrotronCurrent) {
        this.synchrotronCurrent = synchrotronCurrent;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPeakEnergy() {
        return peakEnergy;
    }

    public void setPeakEnergy(double peakEnergy) {
        this.peakEnergy = peakEnergy;
    }

    public double getPeakFPrime() {
        return peakFPrime;
    }

    public void setPeakFPrime(double peakFPrime) {
        this.peakFPrime = peakFPrime;
    }

    public double getPeakFDoublePrime() {
        return peakFDoublePrime;
    }

    public void setPeakFDoublePrime(double peakFDoublePrime) {
        this.peakFDoublePrime = peakFDoublePrime;
    }

    public double getInflectionEnergy() {
        return inflectionEnergy;
    }

    public void setInflectionEnergy(double inflectionEnergy) {
        this.inflectionEnergy = inflectionEnergy;
    }

    public double getInflectionFPrime() {
        return inflectionFPrime;
    }

    public void setInflectionFPrime(double inflectionFPrime) {
        this.inflectionFPrime = inflectionFPrime;
    }

    public double getInflectionFDoublePrime() {
        return inflectionFDoublePrime;
    }

    public void setInflectionFDoublePrime(double inflectionFDoublePrime) {
        this.inflectionFDoublePrime = inflectionFDoublePrime;
    }

    public double getXrayDose() {
        return xrayDose;
    }

    public void setXrayDose(double xrayDose) {
        this.xrayDose = xrayDose;
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

    public String getEdgeEnergy() {
        return edgeEnergy;
    }

    public void setEdgeEnergy(String edgeEnergy) {
        this.edgeEnergy = edgeEnergy;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public double getBeamSizeVertical() {
        return beamSizeVertical;
    }

    public void setBeamSizeVertical(double beamSizeVertical) {
        this.beamSizeVertical = beamSizeVertical;
    }

    public double getBeamSizeHorizontal() {
        return beamSizeHorizontal;
    }

    public void setBeamSizeHorizontal(double beamSizeHorizontal) {
        this.beamSizeHorizontal = beamSizeHorizontal;
    }

    public String getChoochFileFullPath() {
        return choochFileFullPath;
    }

    public void setChoochFileFullPath(String choochFileFullPath) {
        this.choochFileFullPath = choochFileFullPath;
    }

    public String getCrystalClass() {
        return crystalClass;
    }

    public void setCrystalClass(String crystalClass) {
        this.crystalClass = crystalClass;
    }

    public double getFlux() {
        return flux;
    }

    public void setFlux(double flux) {
        this.flux = flux;
    }

    public double getFluxEnd() {
        return fluxEnd;
    }

    public void setFluxEnd(double fluxEnd) {
        this.fluxEnd = fluxEnd;
    }

    public String getWorkingDirectory() {
        return workingDirectory;
    }

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    public long getSubSampleId() {
        return subSampleId;
    }

    public void setSubSampleId(long subSampleId) {
        this.subSampleId = subSampleId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
