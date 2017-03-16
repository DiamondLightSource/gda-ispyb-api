
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getXDSInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getXDSInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XDSInfo" type="{http://ispyb.ejb3.webservices.collection}xdsInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getXDSInfoResponse", propOrder = {
    "xdsInfo"
})
public class GetXDSInfoResponse {

    @XmlElement(name = "XDSInfo")
    protected XdsInfo xdsInfo;

    /**
     * Gets the value of the xdsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XdsInfo }
     *     
     */
    public XdsInfo getXDSInfo() {
        return xdsInfo;
    }

    /**
     * Sets the value of the xdsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XdsInfo }
     *     
     */
    public void setXDSInfo(XdsInfo value) {
        this.xdsInfo = value;
    }

}
