package uk.ac.diamond.ispyb.api;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.sql.Timestamp;

public class BeamlineAction {
    private String proposalCode;
    private Long proposalNumber;
    private Long sessionNumber;
    private Timestamp startTime;
    private Timestamp endTime;
    private String message;
    private String parameter;
    private String value;
    private BeamlineLogLevel logLevel;
    private BeamlineActionStatus status;


    public String getProposalCode() {
        return proposalCode;
    }

    public void setProposalCode(String proposalCode) {
        this.proposalCode = proposalCode;
    }

    public Long getProposalNumber() {
        return proposalNumber;
    }

    public void setProposalNumber(Long proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public Long getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(Long sessionNumber) {
        this.sessionNumber = sessionNumber;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLogLevel() {
        return logLevel.name();
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = BeamlineLogLevel.valueOf(logLevel);
    }

    public String getStatus() {
        return status.name();
    }

    public void setStatus(String status) {
        this.status = BeamlineActionStatus.valueOf(status);
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
    };
}
