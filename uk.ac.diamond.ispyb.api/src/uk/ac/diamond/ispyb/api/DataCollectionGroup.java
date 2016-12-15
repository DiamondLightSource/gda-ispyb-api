
package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@Generated("uk.ac.diamond.ispyb.generator.BeanGenerator")
public class DataCollectionGroup {
    private int id;
    private String proposalCode;
    private int proposalNumber;
    private int sessionNumber;
    private int sampleId;
    private String sampleBarcode;
    private String experimenttype;
    private Timestamp starttime;
    private Timestamp endtime;
    private String crystalClass;
    private String detectorMode;
    private String actualSampleBarcode;
    private int actualSampleSlotInContainer;
    private String actualContainerBarcode;
    private int actualContainerSlotInSC;
    private String comments;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProposalCode() {
        return this.proposalCode;
    }

    public void setProposalCode(String proposalCode) {
        this.proposalCode = proposalCode;
    }

    public int getProposalNumber() {
        return this.proposalNumber;
    }

    public void setProposalNumber(int proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public int getSessionNumber() {
        return this.sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public int getSampleId() {
        return this.sampleId;
    }

    public void setSampleId(int sampleId) {
        this.sampleId = sampleId;
    }

    public String getSampleBarcode() {
        return this.sampleBarcode;
    }

    public void setSampleBarcode(String sampleBarcode) {
        this.sampleBarcode = sampleBarcode;
    }

    public String getExperimenttype() {
        return this.experimenttype;
    }

    public void setExperimenttype(String experimenttype) {
        this.experimenttype = experimenttype;
    }

    public Timestamp getStarttime() {
        return this.starttime;
    }

    public void setStarttime(Timestamp starttime) {
        this.starttime = starttime;
    }

    public Timestamp getEndtime() {
        return this.endtime;
    }

    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }

    public String getCrystalClass() {
        return this.crystalClass;
    }

    public void setCrystalClass(String crystalClass) {
        this.crystalClass = crystalClass;
    }

    public String getDetectorMode() {
        return this.detectorMode;
    }

    public void setDetectorMode(String detectorMode) {
        this.detectorMode = detectorMode;
    }

    public String getActualSampleBarcode() {
        return this.actualSampleBarcode;
    }

    public void setActualSampleBarcode(String actualSampleBarcode) {
        this.actualSampleBarcode = actualSampleBarcode;
    }

    public int getActualSampleSlotInContainer() {
        return this.actualSampleSlotInContainer;
    }

    public void setActualSampleSlotInContainer(int actualSampleSlotInContainer) {
        this.actualSampleSlotInContainer = actualSampleSlotInContainer;
    }

    public String getActualContainerBarcode() {
        return this.actualContainerBarcode;
    }

    public void setActualContainerBarcode(String actualContainerBarcode) {
        this.actualContainerBarcode = actualContainerBarcode;
    }

    public int getActualContainerSlotInSC() {
        return this.actualContainerSlotInSC;
    }

    public void setActualContainerSlotInSC(int actualContainerSlotInSC) {
        this.actualContainerSlotInSC = actualContainerSlotInSC;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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
