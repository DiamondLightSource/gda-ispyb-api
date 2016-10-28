package uk.ac.diamond.ispyb.api;

import java.time.LocalDateTime;

public class DataCollectionGroup {
	int id;
	String session;
	int sampleId;
	String experimentType;
	LocalDateTime starttime;
	LocalDateTime endtime;
	String crystalClass;
	String detectorMode;
	String actualSampleBarcode;
	int actualSampleSlotInContainer;
	String actualContainerBarcode;
	int actualContainerSlotInSC;
	String comments;
	
	public DataCollectionGroup(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public int getSampleId() {
		return sampleId;
	}

	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}

	public String getExperimentType() {
		return experimentType;
	}

	public void setExperimentType(String experimentType) {
		this.experimentType = experimentType;
	}

	public LocalDateTime getStarttime() {
		return starttime;
	}

	public void setStarttime(LocalDateTime starttime) {
		this.starttime = starttime;
	}

	public LocalDateTime getEndtime() {
		return endtime;
	}

	public void setEndtime(LocalDateTime endtime) {
		this.endtime = endtime;
	}

	public String getCrystalClass() {
		return crystalClass;
	}

	public void setCrystalClass(String crystalClass) {
		this.crystalClass = crystalClass;
	}

	public String getDetectorMode() {
		return detectorMode;
	}

	public void setDetectorMode(String detectorMode) {
		this.detectorMode = detectorMode;
	}

	public String getActualSampleBarcode() {
		return actualSampleBarcode;
	}

	public void setActualSampleBarcode(String actualSampleBarcode) {
		this.actualSampleBarcode = actualSampleBarcode;
	}

	public int getActualSampleSlotInContainer() {
		return actualSampleSlotInContainer;
	}

	public void setActualSampleSlotInContainer(int actualSampleSlotInContainer) {
		this.actualSampleSlotInContainer = actualSampleSlotInContainer;
	}

	public String getActualContainerBarcode() {
		return actualContainerBarcode;
	}

	public void setActualContainerBarcode(String actualContainerBarcode) {
		this.actualContainerBarcode = actualContainerBarcode;
	}

	public int getActualContainerSlotInSC() {
		return actualContainerSlotInSC;
	}

	public void setActualContainerSlotInSC(int actualContainerSlotInSC) {
		this.actualContainerSlotInSC = actualContainerSlotInSC;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}
