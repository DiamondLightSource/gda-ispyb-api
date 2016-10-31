package uk.ac.diamond.ispyb.api;

import java.time.LocalDateTime;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DataCollection {
	private int id;
	private int groupId;
	private int subSampleId;
	private int detectorId;
	private int positionId;
	private int apertureId;
	private int dcNumber; 
	private LocalDateTime startTime;
	private LocalDateTime endTime; 
	private String runStatus;
	private double axisStart;
	private double axisEnd;
	private double axisRange;
	private double overlap;
	private int numberOfImages;
	private int startImageNumber;
	private int numberOfPasses;
	private double exposureTime; String imageDirectory;
	private String imagePrefix; String imageSuffix;
	private String fileTemplate;
	private double wavelength;
	private double resolution;
	private double detectorDistance;
	private double xBeam;
	private double yBeam; String comments;
	private double slitgapVertical;
	private double slitgapHorizontal;
	private double transmission; String synchrotronMode;
	private String xtalSnapshotFullPath1; String xtalSnapshotFullPath2;
	private String xtalSnapshotFullPath3; String xtalSnapshotFullPath4;
	private RotationAxis rotationAxis;
	private double phistart;
	private double kappastart;
	private double omegastart;
	private double resolutionAtCorner;
	private double detector2theta;
	private double undulatorGap1;
	private double undulatorGap2;
	private double undulatorGap3;
	private double beamSizeAtSampleX;
	private double beamSizeAtSampleY;
	private double averageTemperature;
	private double actualCenteringPosition; String beamShape;
	private double focalSpotSizeAtSampleX;
	private double focalSpotSizeAtSampleY;
	private double polarisation;
	private double flux;
	private double fluxEnd; String processedDataFile;
	private String datFullPath;
	private int magnification;
	private double totalAbsorbedDose;
	private int binning;
	private double particleDiameter;
	private double boxSize_CTF;
	private double minResolution;
	private double minDefocus;
	private double maxDefocus;
	private double defocusStepSize;
	private double amountAstigmatism;
	private double extractSize;
	private double bgRadius;
	private double voltage;
	private double objAperture;
	private double c1aperture;
	private double c2aperture;
	private double c3aperture;
	private double c1lens;
	private double c2lens;
	private double c3lens;
	
	public DataCollection(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getSubSampleId() {
		return subSampleId;
	}

	public void setSubSampleId(int subSampleId) {
		this.subSampleId = subSampleId;
	}

	public int getDetectorId() {
		return detectorId;
	}

	public void setDetectorId(int detectorId) {
		this.detectorId = detectorId;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public int getApertureId() {
		return apertureId;
	}

	public void setApertureId(int apertureId) {
		this.apertureId = apertureId;
	}

	public int getDcNumber() {
		return dcNumber;
	}

	public void setDcNumber(int dcNumber) {
		this.dcNumber = dcNumber;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public String getRunStatus() {
		return runStatus;
	}

	public void setRunStatus(String runStatus) {
		this.runStatus = runStatus;
	}

	public double getAxisStart() {
		return axisStart;
	}

	public void setAxisStart(double axisStart) {
		this.axisStart = axisStart;
	}

	public double getAxisEnd() {
		return axisEnd;
	}

	public void setAxisEnd(double axisEnd) {
		this.axisEnd = axisEnd;
	}

	public double getAxisRange() {
		return axisRange;
	}

	public void setAxisRange(double axisRange) {
		this.axisRange = axisRange;
	}

	public double getOverlap() {
		return overlap;
	}

	public void setOverlap(double overlap) {
		this.overlap = overlap;
	}

	public int getNumberOfImages() {
		return numberOfImages;
	}

	public void setNumberOfImages(int numberOfImages) {
		this.numberOfImages = numberOfImages;
	}

	public int getStartImageNumber() {
		return startImageNumber;
	}

	public void setStartImageNumber(int startImageNumber) {
		this.startImageNumber = startImageNumber;
	}

	public int getNumberOfPasses() {
		return numberOfPasses;
	}

	public void setNumberOfPasses(int numberOfPasses) {
		this.numberOfPasses = numberOfPasses;
	}

	public double getExposureTime() {
		return exposureTime;
	}

	public void setExposureTime(double exposureTime) {
		this.exposureTime = exposureTime;
	}

	public String getImageDirectory() {
		return imageDirectory;
	}

	public void setImageDirectory(String imageDirectory) {
		this.imageDirectory = imageDirectory;
	}

	public String getImagePrefix() {
		return imagePrefix;
	}

	public void setImagePrefix(String imagePrefix) {
		this.imagePrefix = imagePrefix;
	}

	public String getImageSuffix() {
		return imageSuffix;
	}

	public void setImageSuffix(String imageSuffix) {
		this.imageSuffix = imageSuffix;
	}

	public String getFileTemplate() {
		return fileTemplate;
	}

	public void setFileTemplate(String fileTemplate) {
		this.fileTemplate = fileTemplate;
	}

	public double getWavelength() {
		return wavelength;
	}

	public void setWavelength(double wavelength) {
		this.wavelength = wavelength;
	}

	public double getResolution() {
		return resolution;
	}

	public void setResolution(double resolution) {
		this.resolution = resolution;
	}

	public double getDetectorDistance() {
		return detectorDistance;
	}

	public void setDetectorDistance(double detectorDistance) {
		this.detectorDistance = detectorDistance;
	}

	public double getxBeam() {
		return xBeam;
	}

	public void setxBeam(double xBeam) {
		this.xBeam = xBeam;
	}

	public double getyBeam() {
		return yBeam;
	}

	public void setyBeam(double yBeam) {
		this.yBeam = yBeam;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public double getSlitgapVertical() {
		return slitgapVertical;
	}

	public void setSlitgapVertical(double slitgapVertical) {
		this.slitgapVertical = slitgapVertical;
	}

	public double getSlitgapHorizontal() {
		return slitgapHorizontal;
	}

	public void setSlitgapHorizontal(double slitgapHorizontal) {
		this.slitgapHorizontal = slitgapHorizontal;
	}

	public double getTransmission() {
		return transmission;
	}

	public void setTransmission(double transmission) {
		this.transmission = transmission;
	}

	public String getSynchrotronMode() {
		return synchrotronMode;
	}

	public void setSynchrotronMode(String synchrotronMode) {
		this.synchrotronMode = synchrotronMode;
	}

	public String getXtalSnapshotFullPath1() {
		return xtalSnapshotFullPath1;
	}

	public void setXtalSnapshotFullPath1(String xtalSnapshotFullPath1) {
		this.xtalSnapshotFullPath1 = xtalSnapshotFullPath1;
	}

	public String getXtalSnapshotFullPath2() {
		return xtalSnapshotFullPath2;
	}

	public void setXtalSnapshotFullPath2(String xtalSnapshotFullPath2) {
		this.xtalSnapshotFullPath2 = xtalSnapshotFullPath2;
	}

	public String getXtalSnapshotFullPath3() {
		return xtalSnapshotFullPath3;
	}

	public void setXtalSnapshotFullPath3(String xtalSnapshotFullPath3) {
		this.xtalSnapshotFullPath3 = xtalSnapshotFullPath3;
	}

	public String getXtalSnapshotFullPath4() {
		return xtalSnapshotFullPath4;
	}

	public void setXtalSnapshotFullPath4(String xtalSnapshotFullPath4) {
		this.xtalSnapshotFullPath4 = xtalSnapshotFullPath4;
	}

	public RotationAxis getRotationAxis() {
		return rotationAxis;
	}

	public void setRotationAxis(RotationAxis rotationAxis) {
		this.rotationAxis = rotationAxis;
	}

	public double getPhistart() {
		return phistart;
	}

	public void setPhistart(double phistart) {
		this.phistart = phistart;
	}

	public double getKappastart() {
		return kappastart;
	}

	public void setKappastart(double kappastart) {
		this.kappastart = kappastart;
	}

	public double getOmegastart() {
		return omegastart;
	}

	public void setOmegastart(double omegastart) {
		this.omegastart = omegastart;
	}

	public double getResolutionAtCorner() {
		return resolutionAtCorner;
	}

	public void setResolutionAtCorner(double resolutionAtCorner) {
		this.resolutionAtCorner = resolutionAtCorner;
	}

	public double getDetector2theta() {
		return detector2theta;
	}

	public void setDetector2theta(double detector2theta) {
		this.detector2theta = detector2theta;
	}

	public double getUndulatorGap1() {
		return undulatorGap1;
	}

	public void setUndulatorGap1(double undulatorGap1) {
		this.undulatorGap1 = undulatorGap1;
	}

	public double getUndulatorGap2() {
		return undulatorGap2;
	}

	public void setUndulatorGap2(double undulatorGap2) {
		this.undulatorGap2 = undulatorGap2;
	}

	public double getUndulatorGap3() {
		return undulatorGap3;
	}

	public void setUndulatorGap3(double undulatorGap3) {
		this.undulatorGap3 = undulatorGap3;
	}

	public double getBeamSizeAtSampleX() {
		return beamSizeAtSampleX;
	}

	public void setBeamSizeAtSampleX(double beamSizeAtSampleX) {
		this.beamSizeAtSampleX = beamSizeAtSampleX;
	}

	public double getBeamSizeAtSampleY() {
		return beamSizeAtSampleY;
	}

	public void setBeamSizeAtSampleY(double beamSizeAtSampleY) {
		this.beamSizeAtSampleY = beamSizeAtSampleY;
	}

	public double getAverageTemperature() {
		return averageTemperature;
	}

	public void setAverageTemperature(double averageTemperature) {
		this.averageTemperature = averageTemperature;
	}

	public double getActualCenteringPosition() {
		return actualCenteringPosition;
	}

	public void setActualCenteringPosition(double actualCenteringPosition) {
		this.actualCenteringPosition = actualCenteringPosition;
	}

	public String getBeamShape() {
		return beamShape;
	}

	public void setBeamShape(String beamShape) {
		this.beamShape = beamShape;
	}

	public double getFocalSpotSizeAtSampleX() {
		return focalSpotSizeAtSampleX;
	}

	public void setFocalSpotSizeAtSampleX(double focalSpotSizeAtSampleX) {
		this.focalSpotSizeAtSampleX = focalSpotSizeAtSampleX;
	}

	public double getFocalSpotSizeAtSampleY() {
		return focalSpotSizeAtSampleY;
	}

	public void setFocalSpotSizeAtSampleY(double focalSpotSizeAtSampleY) {
		this.focalSpotSizeAtSampleY = focalSpotSizeAtSampleY;
	}

	public double getPolarisation() {
		return polarisation;
	}

	public void setPolarisation(double polarisation) {
		this.polarisation = polarisation;
	}

	public double getFlux() {
		return flux;
	}

	public void setFlux(double flux) {
		this.flux = flux;
	}

	public double getFluxEnd() {
		return fluxEnd;
	}

	public void setFluxEnd(double fluxEnd) {
		this.fluxEnd = fluxEnd;
	}

	public String getProcessedDataFile() {
		return processedDataFile;
	}

	public void setProcessedDataFile(String processedDataFile) {
		this.processedDataFile = processedDataFile;
	}

	public String getDatFullPath() {
		return datFullPath;
	}

	public void setDatFullPath(String datFullPath) {
		this.datFullPath = datFullPath;
	}

	public int getMagnification() {
		return magnification;
	}

	public void setMagnification(int magnification) {
		this.magnification = magnification;
	}

	public double getTotalAbsorbedDose() {
		return totalAbsorbedDose;
	}

	public void setTotalAbsorbedDose(double totalAbsorbedDose) {
		this.totalAbsorbedDose = totalAbsorbedDose;
	}

	public int getBinning() {
		return binning;
	}

	public void setBinning(int binning) {
		this.binning = binning;
	}

	public double getParticleDiameter() {
		return particleDiameter;
	}

	public void setParticleDiameter(double particleDiameter) {
		this.particleDiameter = particleDiameter;
	}

	public double getBoxSize_CTF() {
		return boxSize_CTF;
	}

	public void setBoxSize_CTF(double boxSize_CTF) {
		this.boxSize_CTF = boxSize_CTF;
	}

	public double getMinResolution() {
		return minResolution;
	}

	public void setMinResolution(double minResolution) {
		this.minResolution = minResolution;
	}

	public double getMinDefocus() {
		return minDefocus;
	}

	public void setMinDefocus(double minDefocus) {
		this.minDefocus = minDefocus;
	}

	public double getMaxDefocus() {
		return maxDefocus;
	}

	public void setMaxDefocus(double maxDefocus) {
		this.maxDefocus = maxDefocus;
	}

	public double getDefocusStepSize() {
		return defocusStepSize;
	}

	public void setDefocusStepSize(double defocusStepSize) {
		this.defocusStepSize = defocusStepSize;
	}

	public double getAmountAstigmatism() {
		return amountAstigmatism;
	}

	public void setAmountAstigmatism(double amountAstigmatism) {
		this.amountAstigmatism = amountAstigmatism;
	}

	public double getExtractSize() {
		return extractSize;
	}

	public void setExtractSize(double extractSize) {
		this.extractSize = extractSize;
	}

	public double getBgRadius() {
		return bgRadius;
	}

	public void setBgRadius(double bgRadius) {
		this.bgRadius = bgRadius;
	}

	public double getVoltage() {
		return voltage;
	}

	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}

	public double getObjAperture() {
		return objAperture;
	}

	public void setObjAperture(double objAperture) {
		this.objAperture = objAperture;
	}

	public double getC1aperture() {
		return c1aperture;
	}

	public void setC1aperture(double c1aperture) {
		this.c1aperture = c1aperture;
	}

	public double getC2aperture() {
		return c2aperture;
	}

	public void setC2aperture(double c2aperture) {
		this.c2aperture = c2aperture;
	}

	public double getC3aperture() {
		return c3aperture;
	}

	public void setC3aperture(double c3aperture) {
		this.c3aperture = c3aperture;
	}

	public double getC1lens() {
		return c1lens;
	}

	public void setC1lens(double c1lens) {
		this.c1lens = c1lens;
	}

	public double getC2lens() {
		return c2lens;
	}

	public void setC2lens(double c2lens) {
		this.c2lens = c2lens;
	}

	public double getC3lens() {
		return c3lens;
	}

	public void setC3lens(double c3lens) {
		this.c3lens = c3lens;
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
