package uk.ac.diamond.ispyb.api;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DataCollectionPlanInfo {
	private Double wavelength;
	private Double preferredBeamSizeX;
	private Double preferredBeamSizeY;
	private Double exposureTime;
	private Double distance;
	private String orientation;
	private Double monoBandwidth;
	private String detectorType;
	private String detectorManufacturer;
	private String detectorModel;
	private Double detectorDistanceMin;
	private Double detectorDistanceMax;
	private Double density;
	private String composition; 
	private String scanParamServiceName;
	private String scanParamServiceDesc;
	private Integer scanParamModelNumber;
	private Double scanParamModelStart;
	private Double scanParamModelStop;
	private Double scanParamModelStep;
	private String scanParamModelArray;
	
	public DataCollectionPlanInfo() {}

	public Double getWavelength() {
		return wavelength;
	}

	public void setWavelength(Double wavelength) {
		this.wavelength = wavelength;
	}

	public Double getPreferredBeamSizeX() {
		return preferredBeamSizeX;
	}

	public void setPreferredBeamSizeX(Double preferredBeamSizeX) {
		this.preferredBeamSizeX = preferredBeamSizeX;
	}

	public Double getPreferredBeamSizeY() {
		return preferredBeamSizeY;
	}

	public void setPreferredBeamSizeY(Double preferredBeamSizeY) {
		this.preferredBeamSizeY = preferredBeamSizeY;
	}

	public Double getExposureTime() {
		return exposureTime;
	}

	public void setExposureTime(Double exposureTime) {
		this.exposureTime = exposureTime;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public Double getMonoBandwidth() {
		return monoBandwidth;
	}

	public void setMonoBandwidth(Double monoBandwidth) {
		this.monoBandwidth = monoBandwidth;
	}

	public String getDetectorType() {
		return detectorType;
	}

	public void setDetectorType(String detectorType) {
		this.detectorType = detectorType;
	}

	public String getDetectorManufacturer() {
		return detectorManufacturer;
	}

	public void setDetectorManufacturer(String detectorManufacturer) {
		this.detectorManufacturer = detectorManufacturer;
	}

	public String getDetectorModel() {
		return detectorModel;
	}

	public void setDetectorModel(String detectorModel) {
		this.detectorModel = detectorModel;
	}

	public Double getDetectorDistanceMin() {
		return detectorDistanceMin;
	}

	public void setDetectorDistanceMin(Double detectorDistanceMin) {
		this.detectorDistanceMin = detectorDistanceMin;
	}

	public Double getDetectorDistanceMax() {
		return detectorDistanceMax;
	}

	public void setDetectorDistanceMax(Double detectorDistanceMax) {
		this.detectorDistanceMax = detectorDistanceMax;
	}

	public Double getDensity() {
		return density;
	}

	public void setDensity(Double density) {
		this.density = density;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getScanParamServiceName() {
		return scanParamServiceName;
	}

	public void setScanParamServiceName(String scanParamServiceName) {
		this.scanParamServiceName = scanParamServiceName;
	}

	public String getScanParamServiceDesc() {
		return scanParamServiceDesc;
	}

	public void setScanParamServiceDesc(String scanParamServiceDesc) {
		this.scanParamServiceDesc = scanParamServiceDesc;
	}

	public Integer getScanParamModelNumber() {
		return scanParamModelNumber;
	}

	public void setScanParamModelNumber(Integer scanParamModelNumber) {
		this.scanParamModelNumber = scanParamModelNumber;
	}

	public Double getScanParamModelStart() {
		return scanParamModelStart;
	}

	public void setScanParamModelStart(Double scanParamModelStart) {
		this.scanParamModelStart = scanParamModelStart;
	}

	public Double getScanParamModelStop() {
		return scanParamModelStop;
	}

	public void setScanParamModelStop(Double scanParamModelStop) {
		this.scanParamModelStop = scanParamModelStop;
	}

	public Double getScanParamModelStep() {
		return scanParamModelStep;
	}

	public void setScanParamModelStep(Double scanParamModelStep) {
		this.scanParamModelStep = scanParamModelStep;
	}

	public String getScanParamModelArray() {
		return scanParamModelArray;
	}

	public void setScanParamModelArray(String scanParamModelArray) {
		this.scanParamModelArray = scanParamModelArray;
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
	};
}
