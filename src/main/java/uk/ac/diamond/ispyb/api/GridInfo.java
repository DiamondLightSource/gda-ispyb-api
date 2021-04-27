package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;

public class GridInfo {
    private long gridInfoId;
    private double xOffset;
    private double yOffset;
    private double dx_mm;
    private double dy_mm;
    private double steps_x;
    private double steps_y;
    private double meshAngle;
    private Timestamp recordTimeStamp;
    private long workflowMeshId;
    private Orientation orientation;
    private long dataCollectionGroupId;
    private double pixelsPerMicronX;
    private double pixelsPerMicronY;
    private double snapshot_offsetXPixel;
    private double snapshot_offsetYPixel;
    private int snaked;
    private long dataCollectionId;

    public long getGridInfoId() {
        return gridInfoId;
    }

    public void setGridInfoId(long gridInfoId) {
        this.gridInfoId = gridInfoId;
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

    public double getDx_mm() {
        return dx_mm;
    }

    public void setDx_mm(double dx_mm) {
        this.dx_mm = dx_mm;
    }

    public double getDy_mm() {
        return dy_mm;
    }

    public void setDy_mm(double dy_mm) {
        this.dy_mm = dy_mm;
    }

    public double getSteps_x() {
        return steps_x;
    }

    public void setSteps_x(double steps_x) {
        this.steps_x = steps_x;
    }

    public double getSteps_y() {
        return steps_y;
    }

    public void setSteps_y(double steps_y) {
        this.steps_y = steps_y;
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

    public double getPixelsPerMicronX() {
        return pixelsPerMicronX;
    }

    public void setPixelsPerMicronX(double pixelsPerMicronX) {
        this.pixelsPerMicronX = pixelsPerMicronX;
    }

    public double getPixelsPerMicronY() {
        return pixelsPerMicronY;
    }

    public void setPixelsPerMicronY(double pixelsPerMicronY) {
        this.pixelsPerMicronY = pixelsPerMicronY;
    }

    public double getSnapshot_offsetXPixel() {
        return snapshot_offsetXPixel;
    }

    public void setSnapshot_offsetXPixel(double snapshot_offsetXPixel) {
        this.snapshot_offsetXPixel = snapshot_offsetXPixel;
    }

    public double getSnapshot_offsetYPixel() {
        return snapshot_offsetYPixel;
    }

    public void setSnapshot_offsetYPixel(double snapshot_offsetYPixel) {
        this.snapshot_offsetYPixel = snapshot_offsetYPixel;
    }

    public int getSnaked() {
        return snaked;
    }

    public void setSnaked(int snaked) {
        this.snaked = snaked;
    }

    public long getDataCollectionId() {
        return dataCollectionId;
    }

    public void setDataCollectionId(long dataCollectionId) {
        this.dataCollectionId = dataCollectionId;
    }
}
