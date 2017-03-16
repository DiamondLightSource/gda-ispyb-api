
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataCollection" type="{http://ispyb.ejb3.webservices.collection}dataCollectionWS3VO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse", propOrder = {
    "dataCollection"
})
public class FindDataCollectionFromImageDirectoryAndImagePrefixAndNumberResponse {

    protected DataCollectionWS3VO dataCollection;

    /**
     * Gets the value of the dataCollection property.
     * 
     * @return
     *     possible object is
     *     {@link DataCollectionWS3VO }
     *     
     */
    public DataCollectionWS3VO getDataCollection() {
        return dataCollection;
    }

    /**
     * Sets the value of the dataCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataCollectionWS3VO }
     *     
     */
    public void setDataCollection(DataCollectionWS3VO value) {
        this.dataCollection = value;
    }

}
