package uk.ac.diamond.ispyb.api;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.sql.Timestamp;

public class Screening {
    private Long screeningId;
    private Long dataCollectionId;
    private _Timestamp bltimeStamp;
    private String programVersion;
    private String comments;
    private String shortComments;
    private Long diffractionPlanId;
    private Long dataCollectionGroupId;
    private String xmlSampleInformation;

    public Long getScreeningId() {
        return screeningId;
    }

    public void setScreeningId(Long screeningId) {
        this.screeningId = screeningId;
    }

    public Long getDataCollectionId() {
        return dataCollectionId;
    }

    public void setDataCollectionId(Long dataCollectionId) {
        this.dataCollectionId = dataCollectionId;
    }

    public _Timestamp getBltimeStamp() {
        return bltimeStamp;
    }

    public void setBltimeStamp(Timestamp bltimeStamp) {
        this.bltimeStamp = (_Timestamp) bltimeStamp;
    }

    public void setBltimeStamp(_Timestamp blTimeStamp) {
        this.bltimeStamp = blTimeStamp;
    }

    public String getProgramVersion() {
        return programVersion;
    }

    public void setProgramVersion(String programVersion) {
        this.programVersion = programVersion;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getShortComments() {
        return shortComments;
    }

    public void setShortComments(String shortComments) {
        this.shortComments = shortComments;
    }

    public Long getDiffractionPlanId() {
        return diffractionPlanId;
    }

    public void setDiffractionPlanId(Long diffractionPlanId) {
        this.diffractionPlanId = diffractionPlanId;
    }

    public Long getDataCollectionGroupId() {
        return dataCollectionGroupId;
    }

    public void setDataCollectionGroupId(Long dataCollectionGroupId) {
        this.dataCollectionGroupId = dataCollectionGroupId;
    }

    public String getXmlSampleInformation() {
        return xmlSampleInformation;
    }

    public void setXmlSampleInformation(String xmlSampleInformation) {
        this.xmlSampleInformation = xmlSampleInformation;
    }

    @Override
    public String toString(){
        return ReflectionToStringBuilder.toString(this);
    }

    @Override
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object that){
        return EqualsBuilder.reflectionEquals(this, that);
    }
}
