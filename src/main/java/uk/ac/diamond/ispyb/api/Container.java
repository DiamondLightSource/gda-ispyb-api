package uk.ac.diamond.ispyb.api;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.sql.Timestamp;

/**
 * Class containing fields from the Container table in ISpyB.
 */
public class Container {
    private Long containerId;
    private Long dewarId;
    private String code;
    private String containerType;
    private Long capacity;
    private String sampleChangerLocation;
    private String containerStatus;
    private Timestamp blTimeStamp;
    private String beamlineLocation;
    private Long screenId;
    private Long scheduleId;
    private String barcode;
    private Long imagerId;
    private Long sessionId;
    private Long ownerId;
    private Long requestedImagerId;
    private int requestedReturn;
    private String comments;
    private String experimentType;
    private Double storageTemperature;
    private Long containerRegistry;
    private Timestamp scLocationUpdated;
    private Long priorityPipelineId;
    private Long experimentTypeId;
    private Long containerTypeId;
    private String proposalCode;
    private String proposalNumber;
    private String visitNumber;

    public Long getContainerId() {
        return containerId;
    }

    public void setContainerId(Long containerId) {
        this.containerId = containerId;
    }

    public Long getDewarId() {
        return dewarId;
    }

    public void setDewarId(Long dewarId) {
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

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
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

    public Long getScreenId() {
        return screenId;
    }

    public void setScreenId(Long screenId) {
        this.screenId = screenId;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Long getImagerId() {
        return imagerId;
    }

    public void setImagerId(Long imagerId) {
        this.imagerId = imagerId;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getRequestedImagerId() {
        return requestedImagerId;
    }

    public void setRequestedImagerId(Long requestedImagerId) {
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

    public Double getStorageTemperature() {
        return storageTemperature;
    }

    public void setStorageTemperature(Double storageTemperature) {
        this.storageTemperature = storageTemperature;
    }

    public Long getContainerRegistry() {
        return containerRegistry;
    }

    public void setContainerRegistry(Long containerRegistry) {
        this.containerRegistry = containerRegistry;
    }

    public Timestamp getScLocationUpdated() {
        return scLocationUpdated;
    }

    public void setScLocationUpdated(Timestamp scLocationUpdated) {
        this.scLocationUpdated = scLocationUpdated;
    }

    public Long getPriorityPipelineId() {
        return priorityPipelineId;
    }

    public void setPriorityPipelineId(Long priorityPipelineId) {
        this.priorityPipelineId = priorityPipelineId;
    }

    public Long getExperimentTypeId() {
        return experimentTypeId;
    }

    public void setExperimentTypeId(Long experimentTypeId) {
        this.experimentTypeId = experimentTypeId;
    }

    public Long getContainerTypeId() {
        return containerTypeId;
    }

    public void setContainerTypeId(Long containerTypeId) {
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
