
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storeOrUpdateBeamLineSetup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeOrUpdateBeamLineSetup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beamLineSetup" type="{http://ispyb.ejb3.webservices.collection}beamLineSetup3VO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeOrUpdateBeamLineSetup", propOrder = {
    "beamLineSetup"
})
public class StoreOrUpdateBeamLineSetup {

    protected BeamLineSetup3VO beamLineSetup;

    /**
     * Gets the value of the beamLineSetup property.
     * 
     * @return
     *     possible object is
     *     {@link BeamLineSetup3VO }
     *     
     */
    public BeamLineSetup3VO getBeamLineSetup() {
        return beamLineSetup;
    }

    /**
     * Sets the value of the beamLineSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeamLineSetup3VO }
     *     
     */
    public void setBeamLineSetup(BeamLineSetup3VO value) {
        this.beamLineSetup = value;
    }

}
