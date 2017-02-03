
package uk.ac.diamond.ispyb.api;

import java.util.Optional;

import javax.annotation.Generated;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@Generated("uk.ac.diamond.ispyb.generator.BeanGenerator")
public class DataCollectionGroupGrid {

    private Long id;
    private Long dcgId;
    private Double dxInMm;
    private Double dyInMm;
    private Double stepsX;
    private Double stepsY;
    private Double meshAngle;
    private Float pixelsPerMicronX;
    private Float pixelsPerMicronY;
    private Float snapshotOffsetXPixel;
    private Float snapshotOffsetYPixel;
    private Orientation orientation;
    private Integer snaked;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDcgId() {
        return this.dcgId;
    }

    public void setDcgId(Long dcgId) {
        this.dcgId = dcgId;
    }

    public Double getDxInMm() {
        return this.dxInMm;
    }

    public void setDxInMm(Double dxInMm) {
        this.dxInMm = dxInMm;
    }

    public Double getDyInMm() {
        return this.dyInMm;
    }

    public void setDyInMm(Double dyInMm) {
        this.dyInMm = dyInMm;
    }

    public Double getStepsX() {
        return this.stepsX;
    }

    public void setStepsX(Double stepsX) {
        this.stepsX = stepsX;
    }

    public Double getStepsY() {
        return this.stepsY;
    }

    public void setStepsY(Double stepsY) {
        this.stepsY = stepsY;
    }

    public Double getMeshAngle() {
        return this.meshAngle;
    }

    public void setMeshAngle(Double meshAngle) {
        this.meshAngle = meshAngle;
    }

    public Float getPixelsPerMicronX() {
        return this.pixelsPerMicronX;
    }

    public void setPixelsPerMicronX(Float pixelsPerMicronX) {
        this.pixelsPerMicronX = pixelsPerMicronX;
    }

    public Float getPixelsPerMicronY() {
        return this.pixelsPerMicronY;
    }

    public void setPixelsPerMicronY(Float pixelsPerMicronY) {
        this.pixelsPerMicronY = pixelsPerMicronY;
    }

    public Float getSnapshotOffsetXPixel() {
        return this.snapshotOffsetXPixel;
    }

    public void setSnapshotOffsetXPixel(Float snapshotOffsetXPixel) {
        this.snapshotOffsetXPixel = snapshotOffsetXPixel;
    }

    public Float getSnapshotOffsetYPixel() {
        return this.snapshotOffsetYPixel;
    }

    public void setSnapshotOffsetYPixel(Float snapshotOffsetYPixel) {
        this.snapshotOffsetYPixel = snapshotOffsetYPixel;
    }

    public String getOrientation() {
        return Optional
        		.ofNullable(orientation)
        		.map(Orientation::name)
        		.map(StringUtils::lowerCase)
        		.orElse(null);
    }

    public void setOrientation(String orientation) {
        this.orientation = Orientation.valueOf(StringUtils.upperCase(orientation));
    }

    public Integer getSnaked() {
        return this.snaked;
    }

    public void setSnaked(Integer snaked) {
        this.snaked = snaked;
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
