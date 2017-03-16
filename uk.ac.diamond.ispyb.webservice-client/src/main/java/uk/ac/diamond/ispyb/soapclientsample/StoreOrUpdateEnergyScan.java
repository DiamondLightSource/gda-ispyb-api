
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storeOrUpdateEnergyScan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeOrUpdateEnergyScan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="energyScan" type="{http://ispyb.ejb3.webservices.collection}energyScanWS3VO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeOrUpdateEnergyScan", propOrder = {
    "energyScan"
})
public class StoreOrUpdateEnergyScan {

    protected EnergyScanWS3VO energyScan;

    /**
     * Gets the value of the energyScan property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyScanWS3VO }
     *     
     */
    public EnergyScanWS3VO getEnergyScan() {
        return energyScan;
    }

    /**
     * Sets the value of the energyScan property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyScanWS3VO }
     *     
     */
    public void setEnergyScan(EnergyScanWS3VO value) {
        this.energyScan = value;
    }

}
