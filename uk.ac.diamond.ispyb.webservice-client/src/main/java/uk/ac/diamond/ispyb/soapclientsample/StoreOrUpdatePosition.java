
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storeOrUpdatePosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeOrUpdatePosition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="position" type="{http://ispyb.ejb3.webservices.collection}positionWS3VO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeOrUpdatePosition", propOrder = {
    "position"
})
public class StoreOrUpdatePosition {

    protected PositionWS3VO position;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link PositionWS3VO }
     *     
     */
    public PositionWS3VO getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionWS3VO }
     *     
     */
    public void setPosition(PositionWS3VO value) {
        this.position = value;
    }

}
