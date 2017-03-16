
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDataCollectionInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDataCollectionInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataCollectionInfo" type="{http://ispyb.ejb3.webservices.collection}dataCollectionInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDataCollectionInfoResponse", propOrder = {
    "dataCollectionInfo"
})
public class GetDataCollectionInfoResponse {

    protected DataCollectionInfo dataCollectionInfo;

    /**
     * Gets the value of the dataCollectionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DataCollectionInfo }
     *     
     */
    public DataCollectionInfo getDataCollectionInfo() {
        return dataCollectionInfo;
    }

    /**
     * Sets the value of the dataCollectionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataCollectionInfo }
     *     
     */
    public void setDataCollectionInfo(DataCollectionInfo value) {
        this.dataCollectionInfo = value;
    }

}
