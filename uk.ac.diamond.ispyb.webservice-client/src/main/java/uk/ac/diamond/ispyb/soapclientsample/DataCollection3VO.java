
package uk.ac.diamond.ispyb.soapclientsample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dataCollection3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataCollection3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actualCenteringPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="autoProcIntegrationVOs" type="{http://ispyb.ejb3.webservices.collection}autoProcIntegration3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="averageTemperature" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="axisEnd" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="axisRange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="axisStart" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="beamShape" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beamSizeAtSampleX" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="beamSizeAtSampleY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="bestWilsonPlotPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blSubSampleVO" type="{http://ispyb.ejb3.webservices.collection}blSubSample3VO" minOccurs="0"/&gt;
 *         &lt;element name="centeringMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataCollectionGroupVO" type="{http://ispyb.ejb3.webservices.collection}dataCollectionGroup3VO" minOccurs="0"/&gt;
 *         &lt;element name="dataCollectionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dataCollectionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="detector2theta" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="detectorDistance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="detectorVO" type="{http://ispyb.ejb3.webservices.collection}detector3VO" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="exposureTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="fileTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flux" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="flux_end" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="imageDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imagePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageQualityIndicatorsCSVPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageQualityIndicatorsPlotPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageVOs" type="{http://ispyb.ejb3.webservices.collection}image3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="kappaStart" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="numberOfImages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numberOfPasses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="omegaStart" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="overlap" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="phiStart" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="printableForReport" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="resolution" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="resolutionAtCorner" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rotationAxis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="runStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="slitGapHorizontal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="slitGapVertical" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="startImageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="strategySubWedgeOrigVO" type="{http://ispyb.ejb3.webservices.collection}screeningStrategySubWedge3VO" minOccurs="0"/&gt;
 *         &lt;element name="synchrotronMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalAbsorbedDose" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="transmission" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="undulatorGap1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="undulatorGap2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="undulatorGap3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="wavelength" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="xbeam" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="xbeamPix" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="xtalSnapshotFullPath1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xtalSnapshotFullPath2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xtalSnapshotFullPath3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xtalSnapshotFullPath4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ybeam" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ybeamPix" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataCollection3VO", propOrder = {
    "actualCenteringPosition",
    "autoProcIntegrationVOs",
    "averageTemperature",
    "axisEnd",
    "axisRange",
    "axisStart",
    "beamShape",
    "beamSizeAtSampleX",
    "beamSizeAtSampleY",
    "bestWilsonPlotPath",
    "blSubSampleVO",
    "centeringMethod",
    "comments",
    "dataCollectionGroupVO",
    "dataCollectionId",
    "dataCollectionNumber",
    "detector2Theta",
    "detectorDistance",
    "detectorVO",
    "endTime",
    "exposureTime",
    "fileTemplate",
    "flux",
    "fluxEnd",
    "imageDirectory",
    "imagePrefix",
    "imageQualityIndicatorsCSVPath",
    "imageQualityIndicatorsPlotPath",
    "imageSuffix",
    "imageVOs",
    "kappaStart",
    "numberOfImages",
    "numberOfPasses",
    "omegaStart",
    "overlap",
    "phiStart",
    "printableForReport",
    "resolution",
    "resolutionAtCorner",
    "rotationAxis",
    "runStatus",
    "slitGapHorizontal",
    "slitGapVertical",
    "startImageNumber",
    "startTime",
    "strategySubWedgeOrigVO",
    "synchrotronMode",
    "totalAbsorbedDose",
    "transmission",
    "undulatorGap1",
    "undulatorGap2",
    "undulatorGap3",
    "wavelength",
    "xbeam",
    "xbeamPix",
    "xtalSnapshotFullPath1",
    "xtalSnapshotFullPath2",
    "xtalSnapshotFullPath3",
    "xtalSnapshotFullPath4",
    "ybeam",
    "ybeamPix"
})
@XmlSeeAlso({
    DataCollectionWS3VO.class,
    DataCollectionInfo.class
})
public class DataCollection3VO
    extends IsPyBValueObject
{

    protected String actualCenteringPosition;
    @XmlElement(nillable = true)
    protected List<AutoProcIntegration3VO> autoProcIntegrationVOs;
    protected Double averageTemperature;
    protected Double axisEnd;
    protected Double axisRange;
    protected Double axisStart;
    protected String beamShape;
    protected Double beamSizeAtSampleX;
    protected Double beamSizeAtSampleY;
    protected String bestWilsonPlotPath;
    protected BlSubSample3VO blSubSampleVO;
    protected String centeringMethod;
    protected String comments;
    protected DataCollectionGroup3VO dataCollectionGroupVO;
    protected Integer dataCollectionId;
    protected Integer dataCollectionNumber;
    @XmlElement(name = "detector2theta")
    protected Double detector2Theta;
    protected Double detectorDistance;
    protected Detector3VO detectorVO;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    protected Double exposureTime;
    protected String fileTemplate;
    protected Double flux;
    @XmlElement(name = "flux_end")
    protected Double fluxEnd;
    protected String imageDirectory;
    protected String imagePrefix;
    protected String imageQualityIndicatorsCSVPath;
    protected String imageQualityIndicatorsPlotPath;
    protected String imageSuffix;
    @XmlElement(nillable = true)
    protected List<Image3VO> imageVOs;
    protected Double kappaStart;
    protected Integer numberOfImages;
    protected Integer numberOfPasses;
    protected Double omegaStart;
    protected Double overlap;
    protected Double phiStart;
    protected Byte printableForReport;
    protected Double resolution;
    protected Double resolutionAtCorner;
    protected String rotationAxis;
    protected String runStatus;
    protected Double slitGapHorizontal;
    protected Double slitGapVertical;
    protected Integer startImageNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    protected ScreeningStrategySubWedge3VO strategySubWedgeOrigVO;
    protected String synchrotronMode;
    protected Double totalAbsorbedDose;
    protected Double transmission;
    protected Double undulatorGap1;
    protected Double undulatorGap2;
    protected Double undulatorGap3;
    protected Double wavelength;
    protected Double xbeam;
    protected Double xbeamPix;
    protected String xtalSnapshotFullPath1;
    protected String xtalSnapshotFullPath2;
    protected String xtalSnapshotFullPath3;
    protected String xtalSnapshotFullPath4;
    protected Double ybeam;
    protected Double ybeamPix;

    /**
     * Gets the value of the actualCenteringPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualCenteringPosition() {
        return actualCenteringPosition;
    }

    /**
     * Sets the value of the actualCenteringPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualCenteringPosition(String value) {
        this.actualCenteringPosition = value;
    }

    /**
     * Gets the value of the autoProcIntegrationVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoProcIntegrationVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoProcIntegrationVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoProcIntegration3VO }
     * 
     * 
     */
    public List<AutoProcIntegration3VO> getAutoProcIntegrationVOs() {
        if (autoProcIntegrationVOs == null) {
            autoProcIntegrationVOs = new ArrayList<AutoProcIntegration3VO>();
        }
        return this.autoProcIntegrationVOs;
    }

    /**
     * Gets the value of the averageTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageTemperature() {
        return averageTemperature;
    }

    /**
     * Sets the value of the averageTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageTemperature(Double value) {
        this.averageTemperature = value;
    }

    /**
     * Gets the value of the axisEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAxisEnd() {
        return axisEnd;
    }

    /**
     * Sets the value of the axisEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAxisEnd(Double value) {
        this.axisEnd = value;
    }

    /**
     * Gets the value of the axisRange property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAxisRange() {
        return axisRange;
    }

    /**
     * Sets the value of the axisRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAxisRange(Double value) {
        this.axisRange = value;
    }

    /**
     * Gets the value of the axisStart property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAxisStart() {
        return axisStart;
    }

    /**
     * Sets the value of the axisStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAxisStart(Double value) {
        this.axisStart = value;
    }

    /**
     * Gets the value of the beamShape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeamShape() {
        return beamShape;
    }

    /**
     * Sets the value of the beamShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeamShape(String value) {
        this.beamShape = value;
    }

    /**
     * Gets the value of the beamSizeAtSampleX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBeamSizeAtSampleX() {
        return beamSizeAtSampleX;
    }

    /**
     * Sets the value of the beamSizeAtSampleX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBeamSizeAtSampleX(Double value) {
        this.beamSizeAtSampleX = value;
    }

    /**
     * Gets the value of the beamSizeAtSampleY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBeamSizeAtSampleY() {
        return beamSizeAtSampleY;
    }

    /**
     * Sets the value of the beamSizeAtSampleY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBeamSizeAtSampleY(Double value) {
        this.beamSizeAtSampleY = value;
    }

    /**
     * Gets the value of the bestWilsonPlotPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestWilsonPlotPath() {
        return bestWilsonPlotPath;
    }

    /**
     * Sets the value of the bestWilsonPlotPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestWilsonPlotPath(String value) {
        this.bestWilsonPlotPath = value;
    }

    /**
     * Gets the value of the blSubSampleVO property.
     * 
     * @return
     *     possible object is
     *     {@link BlSubSample3VO }
     *     
     */
    public BlSubSample3VO getBlSubSampleVO() {
        return blSubSampleVO;
    }

    /**
     * Sets the value of the blSubSampleVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlSubSample3VO }
     *     
     */
    public void setBlSubSampleVO(BlSubSample3VO value) {
        this.blSubSampleVO = value;
    }

    /**
     * Gets the value of the centeringMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenteringMethod() {
        return centeringMethod;
    }

    /**
     * Sets the value of the centeringMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenteringMethod(String value) {
        this.centeringMethod = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the dataCollectionGroupVO property.
     * 
     * @return
     *     possible object is
     *     {@link DataCollectionGroup3VO }
     *     
     */
    public DataCollectionGroup3VO getDataCollectionGroupVO() {
        return dataCollectionGroupVO;
    }

    /**
     * Sets the value of the dataCollectionGroupVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataCollectionGroup3VO }
     *     
     */
    public void setDataCollectionGroupVO(DataCollectionGroup3VO value) {
        this.dataCollectionGroupVO = value;
    }

    /**
     * Gets the value of the dataCollectionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataCollectionId() {
        return dataCollectionId;
    }

    /**
     * Sets the value of the dataCollectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataCollectionId(Integer value) {
        this.dataCollectionId = value;
    }

    /**
     * Gets the value of the dataCollectionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataCollectionNumber() {
        return dataCollectionNumber;
    }

    /**
     * Sets the value of the dataCollectionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataCollectionNumber(Integer value) {
        this.dataCollectionNumber = value;
    }

    /**
     * Gets the value of the detector2Theta property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDetector2Theta() {
        return detector2Theta;
    }

    /**
     * Sets the value of the detector2Theta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDetector2Theta(Double value) {
        this.detector2Theta = value;
    }

    /**
     * Gets the value of the detectorDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDetectorDistance() {
        return detectorDistance;
    }

    /**
     * Sets the value of the detectorDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDetectorDistance(Double value) {
        this.detectorDistance = value;
    }

    /**
     * Gets the value of the detectorVO property.
     * 
     * @return
     *     possible object is
     *     {@link Detector3VO }
     *     
     */
    public Detector3VO getDetectorVO() {
        return detectorVO;
    }

    /**
     * Sets the value of the detectorVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Detector3VO }
     *     
     */
    public void setDetectorVO(Detector3VO value) {
        this.detectorVO = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the exposureTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExposureTime() {
        return exposureTime;
    }

    /**
     * Sets the value of the exposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExposureTime(Double value) {
        this.exposureTime = value;
    }

    /**
     * Gets the value of the fileTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileTemplate() {
        return fileTemplate;
    }

    /**
     * Sets the value of the fileTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileTemplate(String value) {
        this.fileTemplate = value;
    }

    /**
     * Gets the value of the flux property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFlux() {
        return flux;
    }

    /**
     * Sets the value of the flux property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFlux(Double value) {
        this.flux = value;
    }

    /**
     * Gets the value of the fluxEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFluxEnd() {
        return fluxEnd;
    }

    /**
     * Sets the value of the fluxEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFluxEnd(Double value) {
        this.fluxEnd = value;
    }

    /**
     * Gets the value of the imageDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageDirectory() {
        return imageDirectory;
    }

    /**
     * Sets the value of the imageDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageDirectory(String value) {
        this.imageDirectory = value;
    }

    /**
     * Gets the value of the imagePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePrefix() {
        return imagePrefix;
    }

    /**
     * Sets the value of the imagePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePrefix(String value) {
        this.imagePrefix = value;
    }

    /**
     * Gets the value of the imageQualityIndicatorsCSVPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageQualityIndicatorsCSVPath() {
        return imageQualityIndicatorsCSVPath;
    }

    /**
     * Sets the value of the imageQualityIndicatorsCSVPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageQualityIndicatorsCSVPath(String value) {
        this.imageQualityIndicatorsCSVPath = value;
    }

    /**
     * Gets the value of the imageQualityIndicatorsPlotPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageQualityIndicatorsPlotPath() {
        return imageQualityIndicatorsPlotPath;
    }

    /**
     * Sets the value of the imageQualityIndicatorsPlotPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageQualityIndicatorsPlotPath(String value) {
        this.imageQualityIndicatorsPlotPath = value;
    }

    /**
     * Gets the value of the imageSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageSuffix() {
        return imageSuffix;
    }

    /**
     * Sets the value of the imageSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageSuffix(String value) {
        this.imageSuffix = value;
    }

    /**
     * Gets the value of the imageVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Image3VO }
     * 
     * 
     */
    public List<Image3VO> getImageVOs() {
        if (imageVOs == null) {
            imageVOs = new ArrayList<Image3VO>();
        }
        return this.imageVOs;
    }

    /**
     * Gets the value of the kappaStart property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKappaStart() {
        return kappaStart;
    }

    /**
     * Sets the value of the kappaStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKappaStart(Double value) {
        this.kappaStart = value;
    }

    /**
     * Gets the value of the numberOfImages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfImages() {
        return numberOfImages;
    }

    /**
     * Sets the value of the numberOfImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfImages(Integer value) {
        this.numberOfImages = value;
    }

    /**
     * Gets the value of the numberOfPasses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfPasses() {
        return numberOfPasses;
    }

    /**
     * Sets the value of the numberOfPasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfPasses(Integer value) {
        this.numberOfPasses = value;
    }

    /**
     * Gets the value of the omegaStart property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOmegaStart() {
        return omegaStart;
    }

    /**
     * Sets the value of the omegaStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOmegaStart(Double value) {
        this.omegaStart = value;
    }

    /**
     * Gets the value of the overlap property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverlap() {
        return overlap;
    }

    /**
     * Sets the value of the overlap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverlap(Double value) {
        this.overlap = value;
    }

    /**
     * Gets the value of the phiStart property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPhiStart() {
        return phiStart;
    }

    /**
     * Sets the value of the phiStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPhiStart(Double value) {
        this.phiStart = value;
    }

    /**
     * Gets the value of the printableForReport property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPrintableForReport() {
        return printableForReport;
    }

    /**
     * Sets the value of the printableForReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPrintableForReport(Byte value) {
        this.printableForReport = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setResolution(Double value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the resolutionAtCorner property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getResolutionAtCorner() {
        return resolutionAtCorner;
    }

    /**
     * Sets the value of the resolutionAtCorner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setResolutionAtCorner(Double value) {
        this.resolutionAtCorner = value;
    }

    /**
     * Gets the value of the rotationAxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotationAxis() {
        return rotationAxis;
    }

    /**
     * Sets the value of the rotationAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotationAxis(String value) {
        this.rotationAxis = value;
    }

    /**
     * Gets the value of the runStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunStatus() {
        return runStatus;
    }

    /**
     * Sets the value of the runStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunStatus(String value) {
        this.runStatus = value;
    }

    /**
     * Gets the value of the slitGapHorizontal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSlitGapHorizontal() {
        return slitGapHorizontal;
    }

    /**
     * Sets the value of the slitGapHorizontal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSlitGapHorizontal(Double value) {
        this.slitGapHorizontal = value;
    }

    /**
     * Gets the value of the slitGapVertical property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSlitGapVertical() {
        return slitGapVertical;
    }

    /**
     * Sets the value of the slitGapVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSlitGapVertical(Double value) {
        this.slitGapVertical = value;
    }

    /**
     * Gets the value of the startImageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartImageNumber() {
        return startImageNumber;
    }

    /**
     * Sets the value of the startImageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartImageNumber(Integer value) {
        this.startImageNumber = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the strategySubWedgeOrigVO property.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningStrategySubWedge3VO }
     *     
     */
    public ScreeningStrategySubWedge3VO getStrategySubWedgeOrigVO() {
        return strategySubWedgeOrigVO;
    }

    /**
     * Sets the value of the strategySubWedgeOrigVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningStrategySubWedge3VO }
     *     
     */
    public void setStrategySubWedgeOrigVO(ScreeningStrategySubWedge3VO value) {
        this.strategySubWedgeOrigVO = value;
    }

    /**
     * Gets the value of the synchrotronMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynchrotronMode() {
        return synchrotronMode;
    }

    /**
     * Sets the value of the synchrotronMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynchrotronMode(String value) {
        this.synchrotronMode = value;
    }

    /**
     * Gets the value of the totalAbsorbedDose property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAbsorbedDose() {
        return totalAbsorbedDose;
    }

    /**
     * Sets the value of the totalAbsorbedDose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAbsorbedDose(Double value) {
        this.totalAbsorbedDose = value;
    }

    /**
     * Gets the value of the transmission property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransmission() {
        return transmission;
    }

    /**
     * Sets the value of the transmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransmission(Double value) {
        this.transmission = value;
    }

    /**
     * Gets the value of the undulatorGap1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUndulatorGap1() {
        return undulatorGap1;
    }

    /**
     * Sets the value of the undulatorGap1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUndulatorGap1(Double value) {
        this.undulatorGap1 = value;
    }

    /**
     * Gets the value of the undulatorGap2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUndulatorGap2() {
        return undulatorGap2;
    }

    /**
     * Sets the value of the undulatorGap2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUndulatorGap2(Double value) {
        this.undulatorGap2 = value;
    }

    /**
     * Gets the value of the undulatorGap3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUndulatorGap3() {
        return undulatorGap3;
    }

    /**
     * Sets the value of the undulatorGap3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUndulatorGap3(Double value) {
        this.undulatorGap3 = value;
    }

    /**
     * Gets the value of the wavelength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWavelength() {
        return wavelength;
    }

    /**
     * Sets the value of the wavelength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWavelength(Double value) {
        this.wavelength = value;
    }

    /**
     * Gets the value of the xbeam property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXbeam() {
        return xbeam;
    }

    /**
     * Sets the value of the xbeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXbeam(Double value) {
        this.xbeam = value;
    }

    /**
     * Gets the value of the xbeamPix property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXbeamPix() {
        return xbeamPix;
    }

    /**
     * Sets the value of the xbeamPix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXbeamPix(Double value) {
        this.xbeamPix = value;
    }

    /**
     * Gets the value of the xtalSnapshotFullPath1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtalSnapshotFullPath1() {
        return xtalSnapshotFullPath1;
    }

    /**
     * Sets the value of the xtalSnapshotFullPath1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtalSnapshotFullPath1(String value) {
        this.xtalSnapshotFullPath1 = value;
    }

    /**
     * Gets the value of the xtalSnapshotFullPath2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtalSnapshotFullPath2() {
        return xtalSnapshotFullPath2;
    }

    /**
     * Sets the value of the xtalSnapshotFullPath2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtalSnapshotFullPath2(String value) {
        this.xtalSnapshotFullPath2 = value;
    }

    /**
     * Gets the value of the xtalSnapshotFullPath3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtalSnapshotFullPath3() {
        return xtalSnapshotFullPath3;
    }

    /**
     * Sets the value of the xtalSnapshotFullPath3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtalSnapshotFullPath3(String value) {
        this.xtalSnapshotFullPath3 = value;
    }

    /**
     * Gets the value of the xtalSnapshotFullPath4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtalSnapshotFullPath4() {
        return xtalSnapshotFullPath4;
    }

    /**
     * Sets the value of the xtalSnapshotFullPath4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtalSnapshotFullPath4(String value) {
        this.xtalSnapshotFullPath4 = value;
    }

    /**
     * Gets the value of the ybeam property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getYbeam() {
        return ybeam;
    }

    /**
     * Sets the value of the ybeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setYbeam(Double value) {
        this.ybeam = value;
    }

    /**
     * Gets the value of the ybeamPix property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getYbeamPix() {
        return ybeamPix;
    }

    /**
     * Sets the value of the ybeamPix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setYbeamPix(Double value) {
        this.ybeamPix = value;
    }

}
