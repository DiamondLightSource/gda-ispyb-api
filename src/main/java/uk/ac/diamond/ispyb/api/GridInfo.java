package uk.ac.diamond.ispyb.api;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.sql.Timestamp;

public class GridInfo {
    private long id;
    private double xOffset;
    private double yOffset;
    private double dxInMm;
    private double dyInMm;
    private double stepsX;
    private double stepsY;
    private double meshAngle;
    private Timestamp recordTimeStamp;
    private long workflowMeshId;
    private Orientation orientation;
    private long dataCollectionGroupId;
    private double micronsPerPixelX;
    private double micronsPerPixelY;
    private double snapshotOffsetXPixel;
    private double snapshotOffsetYPixel;
    private int snaked;
    private long dcId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getxOffset() {
        return xOffset;
    }

    public void setxOffset(double xOffset) {
        this.xOffset = xOffset;
    }

    public double getyOffset() {
        return yOffset;
    }

    public void setyOffset(double yOffset) {
        this.yOffset = yOffset;
    }

    public double getDxInMm() {
        return dxInMm;
    }

    public void setDxInMm(double dxInMm) {
        this.dxInMm = dxInMm;
    }

    public double getDyInMm() {
        return dyInMm;
    }

    public void setDyInMm(double dyInMm) {
        this.dyInMm = dyInMm;
    }

    public double getStepsX() {
        return stepsX;
    }

    public void setStepsX(double stepsX) {
        this.stepsX = stepsX;
    }

    public double getStepsY() {
        return stepsY;
    }

    public void setStepsY(double stepsY) {
        this.stepsY = stepsY;
    }

    public double getMeshAngle() {
        return meshAngle;
    }

    public void setMeshAngle(double meshAngle) {
        this.meshAngle = meshAngle;
    }

    public Timestamp getRecordTimeStamp() {
        return recordTimeStamp;
    }

    public void setRecordTimeStamp(Timestamp recordTimeStamp) {
        this.recordTimeStamp = recordTimeStamp;
    }

    public long getWorkflowMeshId() {
        return workflowMeshId;
    }

    public void setWorkflowMeshId(long workflowMeshId) {
        this.workflowMeshId = workflowMeshId;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public long getDataCollectionGroupId() {
        return dataCollectionGroupId;
    }

    public void setDataCollectionGroupId(long dataCollectionGroupId) {
        this.dataCollectionGroupId = dataCollectionGroupId;
    }

    public double getMicronsPerPixelX() {
        return this.micronsPerPixelX;
    }

    public void setMicronsPerPixelX(double micronsPerPixelX) {
        this.micronsPerPixelX = micronsPerPixelX;
    }

    public double getMicronsPerPixelY() {
        return this.micronsPerPixelY;
    }

    public void setMicronsPerPixelY(double micronsPerPixelY) {
        this.micronsPerPixelY = micronsPerPixelY;
    }

    public double getSnapshotOffsetXPixel() {
        return snapshotOffsetXPixel;
    }

    public void setSnapshotOffsetXPixel(double snapshotOffsetXPixel) {
        this.snapshotOffsetXPixel = snapshotOffsetXPixel;
    }

    public double getSnapshotOffsetYPixel() {
        return snapshotOffsetYPixel;
    }

    public void setSnapshotOffsetYPixel(double snapshotOffsetYPixel) {
        this.snapshotOffsetYPixel = snapshotOffsetYPixel;
    }

    public int getSnaked() {
        return snaked;
    }

    public void setSnaked(int snaked) {
        this.snaked = snaked;
    }

    public long getDcId() {
        return dcId;
    }

    public void setDcId(long dcId) {
        this.dcId = dcId;
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
