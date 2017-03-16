
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findDetectorByParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findDetectorByParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detectorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detectorManufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detectorModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detectorMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findDetectorByParam", propOrder = {
    "detectorType",
    "detectorManufacturer",
    "detectorModel",
    "detectorMode"
})
public class FindDetectorByParam {

    protected String detectorType;
    protected String detectorManufacturer;
    protected String detectorModel;
    protected String detectorMode;

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

}
