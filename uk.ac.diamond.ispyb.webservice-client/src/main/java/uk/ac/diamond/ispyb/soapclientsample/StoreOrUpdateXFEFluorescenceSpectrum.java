
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storeOrUpdateXFEFluorescenceSpectrum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeOrUpdateXFEFluorescenceSpectrum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="xfeFluorescenceSpectrum" type="{http://ispyb.ejb3.webservices.collection}xfeFluorescenceSpectrumWS3VO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeOrUpdateXFEFluorescenceSpectrum", propOrder = {
    "xfeFluorescenceSpectrum"
})
public class StoreOrUpdateXFEFluorescenceSpectrum {

    protected XfeFluorescenceSpectrumWS3VO xfeFluorescenceSpectrum;

    /**
     * Gets the value of the xfeFluorescenceSpectrum property.
     * 
     * @return
     *     possible object is
     *     {@link XfeFluorescenceSpectrumWS3VO }
     *     
     */
    public XfeFluorescenceSpectrumWS3VO getXfeFluorescenceSpectrum() {
        return xfeFluorescenceSpectrum;
    }

    /**
     * Sets the value of the xfeFluorescenceSpectrum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XfeFluorescenceSpectrumWS3VO }
     *     
     */
    public void setXfeFluorescenceSpectrum(XfeFluorescenceSpectrumWS3VO value) {
        this.xfeFluorescenceSpectrum = value;
    }

}
