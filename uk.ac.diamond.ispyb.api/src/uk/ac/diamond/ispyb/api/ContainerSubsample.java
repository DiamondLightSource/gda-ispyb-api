package uk.ac.diamond.ispyb.api;

/**
 * All details related to a subsample in a container
 */
public class ContainerSubsample {

	private String sampleLocation;
	private double ROIPos1x;
	private double ROIPos1y;
	private double ROIPos1z;
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
		return "ContainerSubsample [sampleLocation=" + sampleLocation + ", ROIPos1x=" + ROIPos1x + ", ROIPos1y="
				+ ROIPos1y + ", ROIPos1z=" + ROIPos1z + ", lastImgFullPath=" + lastImgFullPath
				+ ", uploadedImgFilePath=" + uploadedImgFilePath + ", uploadedImgFileName=" + uploadedImgFileName
				+ ", experimentKind=" + experimentKind + ", exposureTime=" + exposureTime + ", preferredBeamSizeX="
				+ preferredBeamSizeX + ", preferredBeamSizeY=" + preferredBeamSizeY + ", requiredResolution="
				+ requiredResolution + ", monochromator=" + monochromator + ", wavelength=" + wavelength + ", boxSizeX="
				+ boxSizeX + ", boxSizeY=" + boxSizeY + ", kappaStart=" + kappaStart + ", axisStart=" + axisStart
				+ ", axisRange=" + axisRange + ", numberOfImages=" + numberOfImages + "]";
	}
}
