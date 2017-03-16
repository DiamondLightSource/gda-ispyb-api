
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for xfeFluorescenceSpectrum3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xfeFluorescenceSpectrum3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="annotatedPymcaXfeSpectrum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beamSizeHorizontal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="beamSizeVertical" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="beamTransmission" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="blSampleVO" type="{http://ispyb.ejb3.webservices.collection}blSample3VO" minOccurs="0"/&gt;
 *         &lt;element name="blSubSampleVO" type="{http://ispyb.ejb3.webservices.collection}blSubSample3VO" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crystalClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="energy" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="exposureTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fittedDataFileFullPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flux" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="flux_end" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="jpegScanFileFullPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scanFileFullPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sessionVO" type="{http://ispyb.ejb3.webservices.collection}session3VO" minOccurs="0"/&gt;
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="workingDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xfeFluorescenceSpectrumId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xfeFluorescenceSpectrum3VO", propOrder = {
    "annotatedPymcaXfeSpectrum",
    "beamSizeHorizontal",
    "beamSizeVertical",
    "beamTransmission",
    "blSampleVO",
    "blSubSampleVO",
    "comments",
    "crystalClass",
    "endTime",
    "energy",
    "exposureTime",
    "filename",
    "fittedDataFileFullPath",
    "flux",
    "fluxEnd",
    "jpegScanFileFullPath",
    "scanFileFullPath",
    "sessionVO",
    "startTime",
    "workingDirectory",
    "xfeFluorescenceSpectrumId"
})
@XmlSeeAlso({
    XfeFluorescenceSpectrumWS3VO.class
})
public class XfeFluorescenceSpectrum3VO
    extends IsPyBValueObject
{

    protected String annotatedPymcaXfeSpectrum;
    protected Float beamSizeHorizontal;
    protected Float beamSizeVertical;
    protected Float beamTransmission;
    protected BlSample3VO blSampleVO;
    protected BlSubSample3VO blSubSampleVO;
    protected String comments;
    protected String crystalClass;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    protected Float energy;
    protected Float exposureTime;
    protected String filename;
    protected String fittedDataFileFullPath;
    protected Double flux;
    @XmlElement(name = "flux_end")
    protected Double fluxEnd;
    protected String jpegScanFileFullPath;
    protected String scanFileFullPath;
    protected Session3VO sessionVO;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    protected String workingDirectory;
    protected Integer xfeFluorescenceSpectrumId;

    /**
     * Gets the value of the annotatedPymcaXfeSpectrum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotatedPymcaXfeSpectrum() {
        return annotatedPymcaXfeSpectrum;
    }

    /**
     * Sets the value of the annotatedPymcaXfeSpectrum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotatedPymcaXfeSpectrum(String value) {
        this.annotatedPymcaXfeSpectrum = value;
    }

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
     * Gets the value of the beamTransmission property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBeamTransmission() {
        return beamTransmission;
    }

    /**
     * Sets the value of the beamTransmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBeamTransmission(Float value) {
        this.beamTransmission = value;
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
     * Gets the value of the energy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEnergy() {
        return energy;
    }

    /**
     * Sets the value of the energy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEnergy(Float value) {
        this.energy = value;
    }

    /**
     * Gets the value of the exposureTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getExposureTime() {
        return exposureTime;
    }

    /**
     * Sets the value of the exposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setExposureTime(Float value) {
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
     * Gets the value of the fittedDataFileFullPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFittedDataFileFullPath() {
        return fittedDataFileFullPath;
    }

    /**
     * Sets the value of the fittedDataFileFullPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFittedDataFileFullPath(String value) {
        this.fittedDataFileFullPath = value;
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
     * Gets the value of the jpegScanFileFullPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJpegScanFileFullPath() {
        return jpegScanFileFullPath;
    }

    /**
     * Sets the value of the jpegScanFileFullPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJpegScanFileFullPath(String value) {
        this.jpegScanFileFullPath = value;
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
     * Gets the value of the xfeFluorescenceSpectrumId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getXfeFluorescenceSpectrumId() {
        return xfeFluorescenceSpectrumId;
    }

    /**
     * Sets the value of the xfeFluorescenceSpectrumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setXfeFluorescenceSpectrumId(Integer value) {
        this.xfeFluorescenceSpectrumId = value;
    }

}
