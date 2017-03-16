
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storeRobotAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeRobotAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="robotAction" type="{http://ispyb.ejb3.webservices.collection}robotActionWS3VO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeRobotAction", propOrder = {
    "robotAction"
})
public class StoreRobotAction {

    protected RobotActionWS3VO robotAction;

    /**
     * Gets the value of the robotAction property.
     * 
     * @return
     *     possible object is
     *     {@link RobotActionWS3VO }
     *     
     */
    public RobotActionWS3VO getRobotAction() {
        return robotAction;
    }

    /**
     * Sets the value of the robotAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RobotActionWS3VO }
     *     
     */
    public void setRobotAction(RobotActionWS3VO value) {
        this.robotAction = value;
    }

}
