package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;

/**
 * Class containing fields from the Container table in ISpyB.
 */
public class Container {
    private long containerId;
    private long dewarId;
    private String code;
    private String containerType;
    private long capacity;
    private String sampleChangerLocation;
    private String containerStatus;
    private Timestamp blTimeStamp;
    private String beamlineLocation;
    private long screenId;
    private long scheduleId;
    private String barcode;
    private long imagerId;
    private long sessionId;
    private long ownerId;
    private long requestedImagerId;
    private int requestedReturn;
    private String comments;
    private String experimentType;
    private double storageTemperature;
    private long containerRegistry;
    private Timestamp scLocationUpdated;
    private long priorityPipelineId;
    private long experimentTypeId;
    private long containerTypeId;
    private String proposalCode;
    private String proposalNumber;
    private String visitNumber;

    public long getContainerId() {
        return containerId;
    }

    public void setContainerId(long containerId) {
        this.containerId = containerId;
    }

    public long getDewarId() {
        return dewarId;
    }

    public void setDewarId(long dewarId) {
        this.dewarId = dewarId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public String getSampleChangerLocation() {
        return sampleChangerLocation;
    }

    public void setSampleChangerLocation(String sampleChangerLocation) {
        this.sampleChangerLocation = sampleChangerLocation;
    }

    public String getContainerStatus() {
        return containerStatus;
    }

    public void setContainerStatus(String containerStatus) {
        this.containerStatus = containerStatus;
    }

    public Timestamp getBlTimeStamp() {
        return blTimeStamp;
    }

    public void setBlTimeStamp(Timestamp blTimeStamp) {
        this.blTimeStamp = blTimeStamp;
    }

    public String getBeamlineLocation() {
        return beamlineLocation;
    }

    public void setBeamlineLocation(String beamlineLocation) {
        this.beamlineLocation = beamlineLocation;
    }

    public long getScreenId() {
        return screenId;
    }

    public void setScreenId(long screenId) {
        this.screenId = screenId;
    }

    public long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public long getImagerId() {
        return imagerId;
    }

    public void setImagerId(long imagerId) {
        this.imagerId = imagerId;
    }

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public long getRequestedImagerId() {
        return requestedImagerId;
    }

    public void setRequestedImagerId(long requestedImagerId) {
        this.requestedImagerId = requestedImagerId;
    }

    public int getRequestedReturn() {
        return requestedReturn;
    }

    public void setRequestedReturn(int requestedReturn) {
        this.requestedReturn = requestedReturn;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getExperimentType() {
        return experimentType;
    }

    public void setExperimentType(String experimentType) {
        this.experimentType = experimentType;
    }

    public double getStorageTemperature() {
        return storageTemperature;
    }

    public void setStorageTemperature(double storageTemperature) {
        this.storageTemperature = storageTemperature;
    }

    public long getContainerRegistry() {
        return containerRegistry;
    }

    public void setContainerRegistry(long containerRegistry) {
        this.containerRegistry = containerRegistry;
    }

    public Timestamp getScLocationUpdated() {
        return scLocationUpdated;
    }

    public void setScLocationUpdated(Timestamp scLocationUpdated) {
        this.scLocationUpdated = scLocationUpdated;
    }

    public long getPriorityPipelineId() {
        return priorityPipelineId;
    }

    public void setPriorityPipelineId(long priorityPipelineId) {
        this.priorityPipelineId = priorityPipelineId;
    }

    public long getExperimentTypeId() {
        return experimentTypeId;
    }

    public void setExperimentTypeId(long experimentTypeId) {
        this.experimentTypeId = experimentTypeId;
    }

    public long getContainerTypeId() {
        return containerTypeId;
    }

    public void setContainerTypeId(long containerTypeId) {
        this.containerTypeId = containerTypeId;
    }

    public String getProposalCode() {
        return proposalCode;
    }

    public void setProposalCode(String proposalCode) {
        this.proposalCode = proposalCode;
    }

    public String getProposalNumber() {
        return proposalNumber;
    }

    public void setProposalNumber(String proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public String getVisitNumber() {
        return visitNumber;
    }

    public void setVisitNumber(String visitNumber) {
        this.visitNumber = visitNumber;
    }
}
