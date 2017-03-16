
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detector3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detector3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detectorDistanceMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="detectorDistanceMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="detectorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="detectorManufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detectorMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detectorModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detectorPixelSizeHorizontal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="detectorPixelSizeVertical" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="detectorSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="detectorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overload" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="sensorThickness" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="trustedPixelValueRangeLower" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="trustedPixelValueRangeUpper" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="xGeoCorr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yGeoCorr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detector3VO", propOrder = {
    "detectorDistanceMax",
    "detectorDistanceMin",
    "detectorId",
    "detectorManufacturer",
    "detectorMode",
    "detectorModel",
    "detectorPixelSizeHorizontal",
    "detectorPixelSizeVertical",
    "detectorSerialNumber",
    "detectorType",
    "overload",
    "sensorThickness",
    "trustedPixelValueRangeLower",
    "trustedPixelValueRangeUpper",
    "xGeoCorr",
    "yGeoCorr"
})
public class Detector3VO
    extends IsPyBValueObject
{

    protected Double detectorDistanceMax;
    protected Double detectorDistanceMin;
    protected Integer detectorId;
    protected String detectorManufacturer;
    protected String detectorMode;
    protected String detectorModel;
    protected Double detectorPixelSizeHorizontal;
    protected Double detectorPixelSizeVertical;
    protected Double detectorSerialNumber;
    protected String detectorType;
    protected Double overload;
    protected Double sensorThickness;
    protected Double trustedPixelValueRangeLower;
    protected Double trustedPixelValueRangeUpper;
    protected String xGeoCorr;
    protected String yGeoCorr;

    /**
     * Gets the value of the detectorDistanceMax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDetectorDistanceMax() {
        return detectorDistanceMax;
    }

    /**
     * Sets the value of the detectorDistanceMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDetectorDistanceMax(Double value) {
        this.detectorDistanceMax = value;
    }

    /**
     * Gets the value of the detectorDistanceMin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDetectorDistanceMin() {
        return detectorDistanceMin;
    }

    /**
     * Sets the value of the detectorDistanceMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDetectorDistanceMin(Double value) {
        this.detectorDistanceMin = value;
    }

    /**
     * Gets the value of the detectorId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDetectorId() {
        return detectorId;
    }

    /**
     * Sets the value of the detectorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDetectorId(Integer value) {
        this.detectorId = value;
    }

    /**
     * Gets the value of the detectorManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectorManufacturer() {
        return detectorManufacturer;
    }

    /**
     * Sets the value of the detectorManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectorManufacturer(String value) {
        this.detectorManufacturer = value;
    }

    /**
     * Gets the value of the detectorMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectorMode() {
        return detectorMode;
    }

    /**
     * Sets the value of the detectorMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectorMode(String value) {
        this.detectorMode = value;
    }

    /**
     * Gets the value of the detectorModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectorModel() {
        return detectorModel;
    }

    /**
     * Sets the value of the detectorModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectorModel(String value) {
        this.detectorModel = value;
    }

    /**
     * Gets the value of the detectorPixelSizeHorizontal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDetectorPixelSizeHorizontal() {
        return detectorPixelSizeHorizontal;
    }

    /**
     * Sets the value of the detectorPixelSizeHorizontal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDetectorPixelSizeHorizontal(Double value) {
        this.detectorPixelSizeHorizontal = value;
    }

    /**
     * Gets the value of the detectorPixelSizeVertical property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDetectorPixelSizeVertical() {
        return detectorPixelSizeVertical;
    }

    /**
     * Sets the value of the detectorPixelSizeVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDetectorPixelSizeVertical(Double value) {
        this.detectorPixelSizeVertical = value;
    }

    /**
     * Gets the value of the detectorSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDetectorSerialNumber() {
        return detectorSerialNumber;
    }

    /**
     * Sets the value of the detectorSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDetectorSerialNumber(Double value) {
        this.detectorSerialNumber = value;
    }

    /**
     * Gets the value of the detectorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectorType() {
        return detectorType;
    }

    /**
     * Sets the value of the detectorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectorType(String value) {
        this.detectorType = value;
    }

    /**
     * Gets the value of the overload property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverload() {
        return overload;
    }

    /**
     * Sets the value of the overload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverload(Double value) {
        this.overload = value;
    }

    /**
     * Gets the value of the sensorThickness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSensorThickness() {
        return sensorThickness;
    }

    /**
     * Sets the value of the sensorThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSensorThickness(Double value) {
        this.sensorThickness = value;
    }

    /**
     * Gets the value of the trustedPixelValueRangeLower property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTrustedPixelValueRangeLower() {
        return trustedPixelValueRangeLower;
    }

    /**
     * Sets the value of the trustedPixelValueRangeLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTrustedPixelValueRangeLower(Double value) {
        this.trustedPixelValueRangeLower = value;
    }

    /**
     * Gets the value of the trustedPixelValueRangeUpper property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTrustedPixelValueRangeUpper() {
        return trustedPixelValueRangeUpper;
    }

    /**
     * Sets the value of the trustedPixelValueRangeUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTrustedPixelValueRangeUpper(Double value) {
        this.trustedPixelValueRangeUpper = value;
    }

    /**
     * Gets the value of the xGeoCorr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXGeoCorr() {
        return xGeoCorr;
    }

    /**
     * Sets the value of the xGeoCorr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXGeoCorr(String value) {
        this.xGeoCorr = value;
    }

    /**
     * Gets the value of the yGeoCorr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYGeoCorr() {
        return yGeoCorr;
    }

    /**
     * Sets the value of the yGeoCorr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYGeoCorr(String value) {
        this.yGeoCorr = value;
    }

}
