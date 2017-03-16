
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for energyScan3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="energyScan3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beamSizeHorizontal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="beamSizeVertical" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="blSampleVO" type="{http://ispyb.ejb3.webservices.collection}blSample3VO" minOccurs="0"/&gt;
 *         &lt;element name="blSubSampleVO" type="{http://ispyb.ejb3.webservices.collection}blSubSample3VO" minOccurs="0"/&gt;
 *         &lt;element name="choochFileFullPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crystalClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="edgeEnergy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="element" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endEnergy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="energyScanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="exposureTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fluorescenceDetector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flux" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="flux_end" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="inflectionEnergy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="inflectionFDoublePrime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="inflectionFPrime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="jpegChoochFileFullPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="peakEnergy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="peakFDoublePrime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="peakFPrime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="scanFileFullPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sessionVO" type="{http://ispyb.ejb3.webservices.collection}session3VO" minOccurs="0"/&gt;
 *         &lt;element name="startEnergy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="synchrotronCurrent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="transmissionFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="workingDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xrayDose" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "energyScan3VO", propOrder = {
    "beamSizeHorizontal",
    "beamSizeVertical",
    "blSampleVO",
    "blSubSampleVO",
    "choochFileFullPath",
    "comments",
    "crystalClass",
    "edgeEnergy",
    "element",
    "endEnergy",
    "endTime",
    "energyScanId",
    "exposureTime",
    "filename",
    "fluorescenceDetector",
    "flux",
    "fluxEnd",
    "inflectionEnergy",
    "inflectionFDoublePrime",
    "inflectionFPrime",
    "jpegChoochFileFullPath",
    "peakEnergy",
    "peakFDoublePrime",
    "peakFPrime",
    "scanFileFullPath",
    "sessionVO",
    "startEnergy",
    "startTime",
    "synchrotronCurrent",
    "temperature",
    "transmissionFactor",
    "workingDirectory",
    "xrayDose"
})
@XmlSeeAlso({
    EnergyScanWS3VO.class
})
public class EnergyScan3VO
    extends IsPyBValueObject
{

    protected Float beamSizeHorizontal;
    protected Float beamSizeVertical;
    protected BlSample3VO blSampleVO;
    protected BlSubSample3VO blSubSampleVO;
    protected String choochFileFullPath;
    protected String comments;
    protected String crystalClass;
    protected String edgeEnergy;
    protected String element;
    protected Double endEnergy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    protected Integer energyScanId;
    protected Double exposureTime;
    protected String filename;
    protected String fluorescenceDetector;
    protected Double flux;
    @XmlElement(name = "flux_end")
    protected Double fluxEnd;
    protected Double inflectionEnergy;
    protected Double inflectionFDoublePrime;
    protected Double inflectionFPrime;
    protected String jpegChoochFileFullPath;
    protected Double peakEnergy;
    protected Double peakFDoublePrime;
    protected Double peakFPrime;
    protected String scanFileFullPath;
    protected Session3VO sessionVO;
    protected Double startEnergy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    protected Double synchrotronCurrent;
    protected Double temperature;
    protected Double transmissionFactor;
    protected String workingDirectory;
    protected Double xrayDose;

    /**
     * Gets the value of the beamSizeHorizontal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBeamSizeHorizontal() {
        return beamSizeHorizontal;
    }

    /**
     * Sets the value of the beamSizeHorizontal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBeamSizeHorizontal(Float value) {
        this.beamSizeHorizontal = value;
    }

    /**
     * Gets the value of the beamSizeVertical property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBeamSizeVertical() {
        return beamSizeVertical;
    }

    /**
     * Sets the value of the beamSizeVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBeamSizeVertical(Float value) {
        this.beamSizeVertical = value;
    }

    /**
     * Gets the value of the blSampleVO property.
     * 
     * @return
     *     possible object is
     *     {@link BlSample3VO }
     *     
     */
    public BlSample3VO getBlSampleVO() {
        return blSampleVO;
    }

    /**
     * Sets the value of the blSampleVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlSample3VO }
     *     
     */
    public void setBlSampleVO(BlSample3VO value) {
        this.blSampleVO = value;
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
     * Gets the value of the choochFileFullPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoochFileFullPath() {
        return choochFileFullPath;
    }

    /**
     * Sets the value of the choochFileFullPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoochFileFullPath(String value) {
        this.choochFileFullPath = value;
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
     * Gets the value of the crystalClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrystalClass() {
        return crystalClass;
    }

    /**
     * Sets the value of the crystalClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrystalClass(String value) {
        this.crystalClass = value;
    }

    /**
     * Gets the value of the edgeEnergy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeEnergy() {
        return edgeEnergy;
    }

    /**
     * Sets the value of the edgeEnergy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeEnergy(String value) {
        this.edgeEnergy = value;
    }

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElement(String value) {
        this.element = value;
    }

    /**
     * Gets the value of the endEnergy property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEndEnergy() {
        return endEnergy;
    }

    /**
     * Sets the value of the endEnergy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEndEnergy(Double value) {
        this.endEnergy = value;
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
     * Gets the value of the energyScanId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnergyScanId() {
        return energyScanId;
    }

    /**
     * Sets the value of the energyScanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnergyScanId(Integer value) {
        this.energyScanId = value;
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
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the fluorescenceDetector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFluorescenceDetector() {
        return fluorescenceDetector;
    }

    /**
     * Sets the value of the fluorescenceDetector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFluorescenceDetector(String value) {
        this.fluorescenceDetector = value;
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
     * Gets the value of the inflectionEnergy property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInflectionEnergy() {
        return inflectionEnergy;
    }

    /**
     * Sets the value of the inflectionEnergy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInflectionEnergy(Double value) {
        this.inflectionEnergy = value;
    }

    /**
     * Gets the value of the inflectionFDoublePrime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInflectionFDoublePrime() {
        return inflectionFDoublePrime;
    }

    /**
     * Sets the value of the inflectionFDoublePrime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInflectionFDoublePrime(Double value) {
        this.inflectionFDoublePrime = value;
    }

    /**
     * Gets the value of the inflectionFPrime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInflectionFPrime() {
        return inflectionFPrime;
    }

    /**
     * Sets the value of the inflectionFPrime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInflectionFPrime(Double value) {
        this.inflectionFPrime = value;
    }

    /**
     * Gets the value of the jpegChoochFileFullPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJpegChoochFileFullPath() {
        return jpegChoochFileFullPath;
    }

    /**
     * Sets the value of the jpegChoochFileFullPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJpegChoochFileFullPath(String value) {
        this.jpegChoochFileFullPath = value;
    }

    /**
     * Gets the value of the peakEnergy property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeakEnergy() {
        return peakEnergy;
    }

    /**
     * Sets the value of the peakEnergy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeakEnergy(Double value) {
        this.peakEnergy = value;
    }

    /**
     * Gets the value of the peakFDoublePrime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeakFDoublePrime() {
        return peakFDoublePrime;
    }

    /**
     * Sets the value of the peakFDoublePrime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeakFDoublePrime(Double value) {
        this.peakFDoublePrime = value;
    }

    /**
     * Gets the value of the peakFPrime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeakFPrime() {
        return peakFPrime;
    }

    /**
     * Sets the value of the peakFPrime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeakFPrime(Double value) {
        this.peakFPrime = value;
    }

    /**
     * Gets the value of the scanFileFullPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanFileFullPath() {
        return scanFileFullPath;
    }

    /**
     * Sets the value of the scanFileFullPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanFileFullPath(String value) {
        this.scanFileFullPath = value;
    }

    /**
     * Gets the value of the sessionVO property.
     * 
     * @return
     *     possible object is
     *     {@link Session3VO }
     *     
     */
    public Session3VO getSessionVO() {
        return sessionVO;
    }

    /**
     * Sets the value of the sessionVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Session3VO }
     *     
     */
    public void setSessionVO(Session3VO value) {
        this.sessionVO = value;
    }

    /**
     * Gets the value of the startEnergy property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStartEnergy() {
        return startEnergy;
    }

    /**
     * Sets the value of the startEnergy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStartEnergy(Double value) {
        this.startEnergy = value;
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
     * Gets the value of the synchrotronCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSynchrotronCurrent() {
        return synchrotronCurrent;
    }

    /**
     * Sets the value of the synchrotronCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSynchrotronCurrent(Double value) {
        this.synchrotronCurrent = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTemperature(Double value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the transmissionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransmissionFactor() {
        return transmissionFactor;
    }

    /**
     * Sets the value of the transmissionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransmissionFactor(Double value) {
        this.transmissionFactor = value;
    }

    /**
     * Gets the value of the workingDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingDirectory() {
        return workingDirectory;
    }

    /**
     * Sets the value of the workingDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingDirectory(String value) {
        this.workingDirectory = value;
    }

    /**
     * Gets the value of the xrayDose property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXrayDose() {
        return xrayDose;
    }

    /**
     * Sets the value of the xrayDose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXrayDose(Double value) {
        this.xrayDose = value;
    }

}
