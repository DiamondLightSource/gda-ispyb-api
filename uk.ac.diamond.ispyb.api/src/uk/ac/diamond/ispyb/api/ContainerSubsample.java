package uk.ac.diamond.ispyb.api;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * All details related to a subsample in a container
 */
public class ContainerSubsample {

	private String sampleLocation;
	private double ROIPos1x;
	private double ROIPos1y;
	private double ROIPos1z;
	private double ROIPos2x;
	private double ROIPos2y;
	private double ROIPos2z;
	private String lastImgFullPath;
	private String uploadedImgFilePath;
	private String uploadedImgFileName;
	private String experimentKind;
	private float exposureTime;
	private float preferredBeamSizeX;
	private float preferredBeamSizeY;
	private double requiredResolution;
	private String monochromator;
	private float wavelength;
	private float boxSizeX;
	private float boxSizeY;
	private float kappaStart;
	private float axisStart;
	private float axisRange;
	private int numberOfImages;

	public ContainerSubsample() {
		System.err.println("help");
	}

	public String getSampleLocation() {
		return sampleLocation;
	}

	public void setSampleLocation(String sampleLocation) {
		this.sampleLocation = sampleLocation;
	}

	public double getROIPos1x() {
		return ROIPos1x;
	}

	public void setROIPos1x(double rOIPos1x) {
		ROIPos1x = rOIPos1x;
	}

	public double getROIPos1y() {
		return ROIPos1y;
	}

	public void setROIPos1y(double rOIPos1y) {
		ROIPos1y = rOIPos1y;
	}

	public double getROIPos1z() {
		return ROIPos1z;
	}

	public void setROIPos1z(double rOIPos1z) {
		ROIPos1z = rOIPos1z;
	}

	public double getROIPos2x() {
		return ROIPos2x;
	}
	
	public void setROIPos2x(double rOIPos2x) {
		ROIPos2x = rOIPos2x;
	}
	
	public double getROIPos2y() {
		return ROIPos2y;
	}
	
	public void setROIPos2y(double rOIPos2y) {
		ROIPos2y = rOIPos2y;
	}
	
	public double getROIPos2z() {
		return ROIPos2z;
	}
	
	public void setROIPos2z(double rOIPos2z) {
		ROIPos2z = rOIPos2z;
	}
	
	public String getLastImgFullPath() {
		return lastImgFullPath;
	}

	public void setLastImgFullPath(String lastImgFullPath) {
		this.lastImgFullPath = lastImgFullPath;
	}

	public String getUploadedImgFilePath() {
		return uploadedImgFilePath;
	}

	public void setUploadedImgFilePath(String uploadedImgFilePath) {
		this.uploadedImgFilePath = uploadedImgFilePath;
	}

	public String getUploadedImgFileName() {
		return uploadedImgFileName;
	}

	public void setUploadedImgFileName(String uploadedImgFileName) {
		this.uploadedImgFileName = uploadedImgFileName;
	}

	public String getExperimentKind() {
		return experimentKind;
	}

	public void setExperimentKind(String experimentKind) {
		this.experimentKind = experimentKind;
	}

	public float getExposureTime() {
		return exposureTime;
	}

	public void setExposureTime(float exposureTime) {
		this.exposureTime = exposureTime;
	}

	public float getPreferredBeamSizeX() {
		return preferredBeamSizeX;
	}

	public void setPreferredBeamSizeX(float preferredBeamSizeX) {
		this.preferredBeamSizeX = preferredBeamSizeX;
	}

	public float getPreferredBeamSizeY() {
		return preferredBeamSizeY;
	}

	public void setPreferredBeamSizeY(float preferredBeamSizeY) {
		this.preferredBeamSizeY = preferredBeamSizeY;
	}

	public double getRequiredResolution() {
		return requiredResolution;
	}

	public void setRequiredResolution(double requiredResolution) {
		this.requiredResolution = requiredResolution;
	}

	public String getMonochromator() {
		return monochromator;
	}

	public void setMonochromator(String monochromator) {
		this.monochromator = monochromator;
	}

	public float getWavelength() {
		return wavelength;
	}

	public void setWavelength(float wavelength) {
		this.wavelength = wavelength;
	}

	public float getBoxSizeX() {
		return boxSizeX;
	}

	public void setBoxSizeX(float boxSizeX) {
		this.boxSizeX = boxSizeX;
	}

	public float getBoxSizeY() {
		return boxSizeY;
	}

	public void setBoxSizeY(float boxSizeY) {
		this.boxSizeY = boxSizeY;
	}

	public float getKappaStart() {
		return kappaStart;
	}

	public void setKappaStart(float kappaStart) {
		this.kappaStart = kappaStart;
	}

	public float getAxisStart() {
		return axisStart;
	}

	public void setAxisStart(float axisStart) {
		this.axisStart = axisStart;
	}

	public float getAxisRange() {
		return axisRange;
	}

	public void setAxisRange(float axisRange) {
		this.axisRange = axisRange;
	}

	public int getNumberOfImages() {
		return numberOfImages;
	}

	public void setNumberOfImages(int numberOfImages) {
		this.numberOfImages = numberOfImages;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
	public boolean equals(Object that) {
		return EqualsBuilder.reflectionEquals(this, that);
	};
}
