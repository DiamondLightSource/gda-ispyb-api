package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;

public class RobotAction {
    private Long id;
    private Long sessionId;
    private Long sessionNumber;
    private Long sampleId;
    private RobotActionType actionType = RobotActionType.NONE;
    private Timestamp startTimestamp;
    private Timestamp endTimestamp;
    private RobotActionStatus status = RobotActionStatus.NONE;
    private String message;
    private Integer containerLocation;
    private Integer dewarLocation;
    private String sampleBarcode;
    private String snapshotBefore;
    private String snapshotAfter;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public Long getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(Long sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public Long getSampleId() {
        return sampleId;
    }

    public void setSampleId(Long sampleId) {
        this.sampleId = sampleId;
    }

    public String getActionType() { return actionType.name(); }

    public void setActionType(String actionType) {
        this.actionType = RobotActionType.valueOf(actionType);
    }

    public Timestamp getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Timestamp startTime) {
        this.startTimestamp = startTime;
    }

    public Timestamp getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(Timestamp endTime) {
        this.endTimestamp = endTime;
    }

    public String getStatus() {
        return status.name();
    }

    public void setStatus(String status) {
        this.status = RobotActionStatus.valueOf(status);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getContainerLocation() {
        return containerLocation;
    }

    public void setContainerLocation(Integer containerLocation) {
        this.containerLocation = containerLocation;
    }

    public Integer getDewarLocation() {
        return dewarLocation;
    }

    public void setDewarLocation(Integer dewarLocation) {
        this.dewarLocation = dewarLocation;
    }

    public String getSampleBarcode() {
        return sampleBarcode;
    }

    public void setSampleBarcode(String sampleBarcode) {
        this.sampleBarcode = sampleBarcode;
    }

    public String getSnapshotBefore() {
        return snapshotBefore;
    }

    public void setSnapshotBefore(String xtalSnapshotBefore) {
        this.snapshotBefore = xtalSnapshotBefore;
    }

    public String getSnapshotAfter() {
        return snapshotAfter;
    }

    public void setsnapshotAfter(String xtalSnapshotAfter) {
        this.snapshotAfter = xtalSnapshotAfter;
    }

}