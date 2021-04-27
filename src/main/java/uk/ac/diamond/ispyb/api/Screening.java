package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;

public class Screening {
    private long screeningId;
    private long dataCollectionId;
    private Timestamp bltimeStamp;
    private String programVersion;
    private String comments;
    private String shortComments;
    private long diffractionPlanId;
    private long dataCollectionGroupId;
    private String xmlSampleInformation;

    public long getScreeningId() {
        return screeningId;
    }

    public void setScreeningId(long screeningId) {
        this.screeningId = screeningId;
    }

    public long getDataCollectionId() {
        return dataCollectionId;
    }

    public void setDataCollectionId(long dataCollectionId) {
        this.dataCollectionId = dataCollectionId;
    }

    public Timestamp getBltimeStamp() {
        return bltimeStamp;
    }

    public void setBltimeStamp(Timestamp bltimeStamp) {
        this.bltimeStamp = bltimeStamp;
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

    public long getDiffractionPlanId() {
        return diffractionPlanId;
    }

    public void setDiffractionPlanId(long diffractionPlanId) {
        this.diffractionPlanId = diffractionPlanId;
    }

    public long getDataCollectionGroupId() {
        return dataCollectionGroupId;
    }

    public void setDataCollectionGroupId(long dataCollectionGroupId) {
        this.dataCollectionGroupId = dataCollectionGroupId;
    }

    public String getXmlSampleInformation() {
        return xmlSampleInformation;
    }

    public void setXmlSampleInformation(String xmlSampleInformation) {
        this.xmlSampleInformation = xmlSampleInformation;
    }
}
