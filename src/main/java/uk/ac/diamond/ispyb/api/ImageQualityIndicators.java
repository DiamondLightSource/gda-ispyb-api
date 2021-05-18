package uk.ac.diamond.ispyb.api;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.sql.Timestamp;

public class ImageQualityIndicators {
    private Long dataCollectionId;
    private Long imageNumber;
    private Long imageId;
    private Long autoProcProgramId;
    private Long spotTotal;
    private Long inResTotal;
    private Long goodBraggCandidates;
    private Long iceRings;
    private Double method1Res;
    private Double method2Res;
    private Double maxUnitCell;
    private Double pctSaturationTop50Peaks;
    private Long inResolutionOvrlSpots;
    private Long binPopCutOffMethod2Res;
    private Timestamp recordTimeStamp;
    private Double totalIntegratedSignal;
    private Double dozor_score;
    private Double driftFactor;

    public Long getDataCollectionId() {
        return dataCollectionId;
    }

    public void setDataCollectionId(Long dataCollectionId) {
        this.dataCollectionId = dataCollectionId;
    }

    public Long getImageNumber() {
        return imageNumber;
    }

    public void setImageNumber(Long imageNumber) {
        this.imageNumber = imageNumber;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Long getAutoProcProgramId() {
        return autoProcProgramId;
    }

    public void setAutoProcProgramId(Long autoProcProgramId) {
        this.autoProcProgramId = autoProcProgramId;
    }

    public Long getSpotTotal() {
        return spotTotal;
    }

    public void setSpotTotal(Long spotTotal) {
        this.spotTotal = spotTotal;
    }

    public Long getInResTotal() {
        return inResTotal;
    }

    public void setInResTotal(Long inResTotal) {
        this.inResTotal = inResTotal;
    }

    public Long getGoodBraggCandidates() {
        return goodBraggCandidates;
    }

    public void setGoodBraggCandidates(Long goodBraggCandidates) {
        this.goodBraggCandidates = goodBraggCandidates;
    }

    public Long getIceRings() {
        return iceRings;
    }

    public void setIceRings(Long iceRings) {
        this.iceRings = iceRings;
    }

    public Double getMethod1Res() {
        return method1Res;
    }

    public void setMethod1Res(Double method1Res) {
        this.method1Res = method1Res;
    }

    public Double getMethod2Res() {
        return method2Res;
    }

    public void setMethod2Res(Double method2Res) {
        this.method2Res = method2Res;
    }

    public Double getMaxUnitCell() {
        return maxUnitCell;
    }

    public void setMaxUnitCell(Double maxUnitCell) {
        this.maxUnitCell = maxUnitCell;
    }

    public Double getPctSaturationTop50Peaks() {
        return pctSaturationTop50Peaks;
    }

    public void setPctSaturationTop50Peaks(Double pctSaturationTop50Peaks) {
        this.pctSaturationTop50Peaks = pctSaturationTop50Peaks;
    }

    public Long getInResolutionOvrlSpots() {
        return inResolutionOvrlSpots;
    }

    public void setInResolutionOvrlSpots(Long inResolutionOvrlSpots) {
        this.inResolutionOvrlSpots = inResolutionOvrlSpots;
    }

    public Long getBinPopCutOffMethod2Res() {
        return binPopCutOffMethod2Res;
    }

    public void setBinPopCutOffMethod2Res(Long binPopCutOffMethod2Res) {
        this.binPopCutOffMethod2Res = binPopCutOffMethod2Res;
    }

    public Timestamp getRecordTimeStamp() {
        return recordTimeStamp;
    }

    public void setRecordTimeStamp(Timestamp recordTimeStamp) {
        this.recordTimeStamp = recordTimeStamp;
    }

    public Double getTotalIntegratedSignal() {
        return totalIntegratedSignal;
    }

    public void setTotalIntegratedSignal(Double totalIntegratedSignal) {
        this.totalIntegratedSignal = totalIntegratedSignal;
    }

    public Double getDozor_score() {
        return dozor_score;
    }

    public void setDozor_score(Double dozor_score) {
        this.dozor_score = dozor_score;
    }

    public Double getDriftFactor() {
        return driftFactor;
    }

    public void setDriftFactor(Double driftFactor) {
        this.driftFactor = driftFactor;
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
