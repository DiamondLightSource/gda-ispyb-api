
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPdbFilePathResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPdbFilePathResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PdbFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPdbFilePathResponse", propOrder = {
    "pdbFilePath"
})
public class GetPdbFilePathResponse {

    @XmlElement(name = "PdbFilePath")
    protected String pdbFilePath;

    /**
     * Gets the value of the pdbFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdbFilePath() {
        return pdbFilePath;
    }

    /**
     * Sets the value of the pdbFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdbFilePath(String value) {
        this.pdbFilePath = value;
    }

}
