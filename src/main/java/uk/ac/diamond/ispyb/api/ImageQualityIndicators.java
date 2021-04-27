package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;

public class ImageQualityIndicators {
    private long dataCollectionId;
    private long imageNumber;
    private long imageId;
    private long autoProcProgramId;
    private long spotTotal;
    private long inResTotal;
    private long goodBraggCandidates;
    private long iceRings;
    private double method1Res;
    private double method2Res;
    private double maxUnitCell;
    private double pctSaturationTop50Peaks;
    private long inResolutionOvrlSpots;
    private long binPopCutOffMethod2Res;
    private Timestamp recordTimeStamp;
    private double totalIntegratedSignal;
    private double dozor_score;
    private double driftFactor;

    public long getDataCollectionId() {
        return dataCollectionId;
    }

    public void setDataCollectionId(long dataCollectionId) {
        this.dataCollectionId = dataCollectionId;
    }

    public long getImageNumber() {
        return imageNumber;
    }

    public void setImageNumber(long imageNumber) {
        this.imageNumber = imageNumber;
    }

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }

    public long getAutoProcProgramId() {
        return autoProcProgramId;
    }

    public void setAutoProcProgramId(long autoProcProgramId) {
        this.autoProcProgramId = autoProcProgramId;
    }

    public long getSpotTotal() {
        return spotTotal;
    }

    public void setSpotTotal(long spotTotal) {
        this.spotTotal = spotTotal;
    }

    public long getInResTotal() {
        return inResTotal;
    }

    public void setInResTotal(long inResTotal) {
        this.inResTotal = inResTotal;
    }

    public long getGoodBraggCandidates() {
        return goodBraggCandidates;
    }

    public void setGoodBraggCandidates(long goodBraggCandidates) {
        this.goodBraggCandidates = goodBraggCandidates;
    }

    public long getIceRings() {
        return iceRings;
    }

    public void setIceRings(long iceRings) {
        this.iceRings = iceRings;
    }

    public double getMethod1Res() {
        return method1Res;
    }

    public void setMethod1Res(double method1Res) {
        this.method1Res = method1Res;
    }

    public double getMethod2Res() {
        return method2Res;
    }

    public void setMethod2Res(double method2Res) {
        this.method2Res = method2Res;
    }

    public double getMaxUnitCell() {
        return maxUnitCell;
    }

    public void setMaxUnitCell(double maxUnitCell) {
        this.maxUnitCell = maxUnitCell;
    }

    public double getPctSaturationTop50Peaks() {
        return pctSaturationTop50Peaks;
    }

    public void setPctSaturationTop50Peaks(double pctSaturationTop50Peaks) {
        this.pctSaturationTop50Peaks = pctSaturationTop50Peaks;
    }

    public long getInResolutionOvrlSpots() {
        return inResolutionOvrlSpots;
    }

    public void setInResolutionOvrlSpots(long inResolutionOvrlSpots) {
        this.inResolutionOvrlSpots = inResolutionOvrlSpots;
    }

    public long getBinPopCutOffMethod2Res() {
        return binPopCutOffMethod2Res;
    }

    public void setBinPopCutOffMethod2Res(long binPopCutOffMethod2Res) {
        this.binPopCutOffMethod2Res = binPopCutOffMethod2Res;
    }

    public Timestamp getRecordTimeStamp() {
        return recordTimeStamp;
    }

    public void setRecordTimeStamp(Timestamp recordTimeStamp) {
        this.recordTimeStamp = recordTimeStamp;
    }

    public double getTotalIntegratedSignal() {
        return totalIntegratedSignal;
    }

    public void setTotalIntegratedSignal(double totalIntegratedSignal) {
        this.totalIntegratedSignal = totalIntegratedSignal;
    }

    public double getDozor_score() {
        return dozor_score;
    }

    public void setDozor_score(double dozor_score) {
        this.dozor_score = dozor_score;
    }

    public double getDriftFactor() {
        return driftFactor;
    }

    public void setDriftFactor(double driftFactor) {
        this.driftFactor = driftFactor;
    }
}
