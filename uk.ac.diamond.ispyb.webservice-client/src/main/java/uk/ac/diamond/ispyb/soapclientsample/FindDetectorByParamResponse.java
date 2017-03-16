
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findDetectorByParamResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findDetectorByParamResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Detector" type="{http://ispyb.ejb3.webservices.collection}detector3VO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findDetectorByParamResponse", propOrder = {
    "detector"
})
public class FindDetectorByParamResponse {

    @XmlElement(name = "Detector")
    protected Detector3VO detector;

    /**
     * Gets the value of the detector property.
     * 
     * @return
     *     possible object is
     *     {@link Detector3VO }
     *     
     */
    public Detector3VO getDetector() {
        return detector;
    }

    /**
     * Sets the value of the detector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Detector3VO }
     *     
     */
    public void setDetector(Detector3VO value) {
        this.detector = value;
    }

}
