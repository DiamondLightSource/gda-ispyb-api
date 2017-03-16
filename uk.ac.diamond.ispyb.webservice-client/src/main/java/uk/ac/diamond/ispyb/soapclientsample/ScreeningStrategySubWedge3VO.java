
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for screeningStrategySubWedge3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="screeningStrategySubWedge3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="axisEnd" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="axisStart" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="completeness" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="doseTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="exposureTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="multiplicity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="numberOfImages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="oscillationRange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rotationAxis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screeningStrategySubWedgeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="screeningStrategyWedgeVO" type="{http://ispyb.ejb3.webservices.collection}screeningStrategyWedge3VO" minOccurs="0"/&gt;
 *         &lt;element name="subWedgeNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="transmission" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screeningStrategySubWedge3VO", propOrder = {
    "axisEnd",
    "axisStart",
    "comments",
    "completeness",
    "doseTotal",
    "exposureTime",
    "multiplicity",
    "numberOfImages",
    "oscillationRange",
    "rotationAxis",
    "screeningStrategySubWedgeId",
    "screeningStrategyWedgeVO",
    "subWedgeNumber",
    "transmission"
})
public class ScreeningStrategySubWedge3VO
    extends IsPyBValueObject
{

    protected Double axisEnd;
    protected Double axisStart;
    protected String comments;
    protected Double completeness;
    protected Double doseTotal;
    protected Double exposureTime;
    protected Double multiplicity;
    protected Integer numberOfImages;
    protected Double oscillationRange;
    protected String rotationAxis;
    protected Integer screeningStrategySubWedgeId;
    protected ScreeningStrategyWedge3VO screeningStrategyWedgeVO;
    protected Integer subWedgeNumber;
    protected Double transmission;

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
     * Gets the value of the completeness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCompleteness() {
        return completeness;
    }

    /**
     * Sets the value of the completeness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCompleteness(Double value) {
        this.completeness = value;
    }

    /**
     * Gets the value of the doseTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDoseTotal() {
        return doseTotal;
    }

    /**
     * Sets the value of the doseTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDoseTotal(Double value) {
        this.doseTotal = value;
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
     * Gets the value of the multiplicity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMultiplicity() {
        return multiplicity;
    }

    /**
     * Sets the value of the multiplicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMultiplicity(Double value) {
        this.multiplicity = value;
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
     * Gets the value of the oscillationRange property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOscillationRange() {
        return oscillationRange;
    }

    /**
     * Sets the value of the oscillationRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOscillationRange(Double value) {
        this.oscillationRange = value;
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
     * Gets the value of the screeningStrategySubWedgeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScreeningStrategySubWedgeId() {
        return screeningStrategySubWedgeId;
    }

    /**
     * Sets the value of the screeningStrategySubWedgeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScreeningStrategySubWedgeId(Integer value) {
        this.screeningStrategySubWedgeId = value;
    }

    /**
     * Gets the value of the screeningStrategyWedgeVO property.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningStrategyWedge3VO }
     *     
     */
    public ScreeningStrategyWedge3VO getScreeningStrategyWedgeVO() {
        return screeningStrategyWedgeVO;
    }

    /**
     * Sets the value of the screeningStrategyWedgeVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningStrategyWedge3VO }
     *     
     */
    public void setScreeningStrategyWedgeVO(ScreeningStrategyWedge3VO value) {
        this.screeningStrategyWedgeVO = value;
    }

    /**
     * Gets the value of the subWedgeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubWedgeNumber() {
        return subWedgeNumber;
    }

    /**
     * Sets the value of the subWedgeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubWedgeNumber(Integer value) {
        this.subWedgeNumber = value;
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

}
