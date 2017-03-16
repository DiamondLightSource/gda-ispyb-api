
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for beamLineSetup3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="beamLineSetup3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beamDivergenceHorizontal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="beamDivergenceVertical" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="beamLineSetupId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="focalSpotSizeAtSample" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="focusingOptic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="goniostatMaxOscillationSpeed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="goniostatMinOscillationWidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="maxExpTimePerDataCollection" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minExposureTimePerImage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minTransmission" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="monochromatorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="polarisation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="setupDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="synchrotronMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="synchrotronName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="undulatorType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="undulatorType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="undulatorType3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beamLineSetup3VO", propOrder = {
    "beamDivergenceHorizontal",
    "beamDivergenceVertical",
    "beamLineSetupId",
    "focalSpotSizeAtSample",
    "focusingOptic",
    "goniostatMaxOscillationSpeed",
    "goniostatMinOscillationWidth",
    "maxExpTimePerDataCollection",
    "minExposureTimePerImage",
    "minTransmission",
    "monochromatorType",
    "polarisation",
    "setupDate",
    "synchrotronMode",
    "synchrotronName",
    "undulatorType1",
    "undulatorType2",
    "undulatorType3"
})
public class BeamLineSetup3VO
    extends IsPyBValueObject
{

    protected Double beamDivergenceHorizontal;
    protected Double beamDivergenceVertical;
    protected Integer beamLineSetupId;
    protected Double focalSpotSizeAtSample;
    protected String focusingOptic;
    protected Double goniostatMaxOscillationSpeed;
    protected Double goniostatMinOscillationWidth;
    protected Double maxExpTimePerDataCollection;
    protected Double minExposureTimePerImage;
    protected Double minTransmission;
    protected String monochromatorType;
    protected Double polarisation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar setupDate;
    protected String synchrotronMode;
    protected String synchrotronName;
    protected String undulatorType1;
    protected String undulatorType2;
    protected String undulatorType3;

    /**
     * Gets the value of the beamDivergenceHorizontal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBeamDivergenceHorizontal() {
        return beamDivergenceHorizontal;
    }

    /**
     * Sets the value of the beamDivergenceHorizontal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBeamDivergenceHorizontal(Double value) {
        this.beamDivergenceHorizontal = value;
    }

    /**
     * Gets the value of the beamDivergenceVertical property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBeamDivergenceVertical() {
        return beamDivergenceVertical;
    }

    /**
     * Sets the value of the beamDivergenceVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBeamDivergenceVertical(Double value) {
        this.beamDivergenceVertical = value;
    }

    /**
     * Gets the value of the beamLineSetupId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBeamLineSetupId() {
        return beamLineSetupId;
    }

    /**
     * Sets the value of the beamLineSetupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBeamLineSetupId(Integer value) {
        this.beamLineSetupId = value;
    }

    /**
     * Gets the value of the focalSpotSizeAtSample property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFocalSpotSizeAtSample() {
        return focalSpotSizeAtSample;
    }

    /**
     * Sets the value of the focalSpotSizeAtSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFocalSpotSizeAtSample(Double value) {
        this.focalSpotSizeAtSample = value;
    }

    /**
     * Gets the value of the focusingOptic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFocusingOptic() {
        return focusingOptic;
    }

    /**
     * Sets the value of the focusingOptic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFocusingOptic(String value) {
        this.focusingOptic = value;
    }

    /**
     * Gets the value of the goniostatMaxOscillationSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGoniostatMaxOscillationSpeed() {
        return goniostatMaxOscillationSpeed;
    }

    /**
     * Sets the value of the goniostatMaxOscillationSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGoniostatMaxOscillationSpeed(Double value) {
        this.goniostatMaxOscillationSpeed = value;
    }

    /**
     * Gets the value of the goniostatMinOscillationWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGoniostatMinOscillationWidth() {
        return goniostatMinOscillationWidth;
    }

    /**
     * Sets the value of the goniostatMinOscillationWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGoniostatMinOscillationWidth(Double value) {
        this.goniostatMinOscillationWidth = value;
    }

    /**
     * Gets the value of the maxExpTimePerDataCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxExpTimePerDataCollection() {
        return maxExpTimePerDataCollection;
    }

    /**
     * Sets the value of the maxExpTimePerDataCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxExpTimePerDataCollection(Double value) {
        this.maxExpTimePerDataCollection = value;
    }

    /**
     * Gets the value of the minExposureTimePerImage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinExposureTimePerImage() {
        return minExposureTimePerImage;
    }

    /**
     * Sets the value of the minExposureTimePerImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinExposureTimePerImage(Double value) {
        this.minExposureTimePerImage = value;
    }

    /**
     * Gets the value of the minTransmission property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinTransmission() {
        return minTransmission;
    }

    /**
     * Sets the value of the minTransmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinTransmission(Double value) {
        this.minTransmission = value;
    }

    /**
     * Gets the value of the monochromatorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonochromatorType() {
        return monochromatorType;
    }

    /**
     * Sets the value of the monochromatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonochromatorType(String value) {
        this.monochromatorType = value;
    }

    /**
     * Gets the value of the polarisation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPolarisation() {
        return polarisation;
    }

    /**
     * Sets the value of the polarisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPolarisation(Double value) {
        this.polarisation = value;
    }

    /**
     * Gets the value of the setupDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSetupDate() {
        return setupDate;
    }

    /**
     * Sets the value of the setupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSetupDate(XMLGregorianCalendar value) {
        this.setupDate = value;
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
     * Gets the value of the synchrotronName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynchrotronName() {
        return synchrotronName;
    }

    /**
     * Sets the value of the synchrotronName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynchrotronName(String value) {
        this.synchrotronName = value;
    }

    /**
     * Gets the value of the undulatorType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndulatorType1() {
        return undulatorType1;
    }

    /**
     * Sets the value of the undulatorType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndulatorType1(String value) {
        this.undulatorType1 = value;
    }

    /**
     * Gets the value of the undulatorType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndulatorType2() {
        return undulatorType2;
    }

    /**
     * Sets the value of the undulatorType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndulatorType2(String value) {
        this.undulatorType2 = value;
    }

    /**
     * Gets the value of the undulatorType3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndulatorType3() {
        return undulatorType3;
    }

    /**
     * Sets the value of the undulatorType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndulatorType3(String value) {
        this.undulatorType3 = value;
    }

}
