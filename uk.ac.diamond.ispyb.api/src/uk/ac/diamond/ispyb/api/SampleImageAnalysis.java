
package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@Generated("uk.ac.diamond.ispyb.generator.BeanGenerator")
public class SampleImageAnalysis {

    private long id;
    private String containerBarcode;
    private String sampleLocation;
    private String oavSnapshotBefore;
    private String oavSnapshotAfter;
    private long deltaX;
    private long deltaY;
    private float goodnessOfFit;
    private float scaleFactor;
    private String resultCode;
    private Timestamp matchStartTS;
    private Timestamp matchEndTS;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContainerBarcode() {
        return this.containerBarcode;
    }

    public void setContainerBarcode(String containerBarcode) {
        this.containerBarcode = containerBarcode;
    }

    public String getSampleLocation() {
        return this.sampleLocation;
    }

    public void setSampleLocation(String sampleLocation) {
        this.sampleLocation = sampleLocation;
    }

    public String getOavSnapshotBefore() {
        return this.oavSnapshotBefore;
    }

    public void setOavSnapshotBefore(String oavSnapshotBefore) {
        this.oavSnapshotBefore = oavSnapshotBefore;
    }

    public String getOavSnapshotAfter() {
        return this.oavSnapshotAfter;
    }

    public void setOavSnapshotAfter(String oavSnapshotAfter) {
        this.oavSnapshotAfter = oavSnapshotAfter;
    }

    public long getDeltaX() {
        return this.deltaX;
    }

    public void setDeltaX(long deltaX) {
        this.deltaX = deltaX;
    }

    public long getDeltaY() {
        return this.deltaY;
    }

    public void setDeltaY(long deltaY) {
        this.deltaY = deltaY;
    }

    public float getGoodnessOfFit() {
        return this.goodnessOfFit;
    }

    public void setGoodnessOfFit(float goodnessOfFit) {
        this.goodnessOfFit = goodnessOfFit;
    }

    public float getScaleFactor() {
        return this.scaleFactor;
    }

    public void setScaleFactor(float scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public Timestamp getMatchStartTS() {
        return this.matchStartTS;
    }

    public void setMatchStartTS(Timestamp matchStartTS) {
        this.matchStartTS = matchStartTS;
    }

    public Timestamp getMatchEndTS() {
        return this.matchEndTS;
    }

    public void setMatchEndTS(Timestamp matchEndTS) {
        this.matchEndTS = matchEndTS;
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
