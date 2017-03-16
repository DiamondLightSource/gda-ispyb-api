
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findDataCollectionFromImageDirectoryAndImagePrefixAndNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findDataCollectionFromImageDirectoryAndImagePrefixAndNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imageDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imagePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataCollectionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findDataCollectionFromImageDirectoryAndImagePrefixAndNumber", propOrder = {
    "imageDirectory",
    "imagePrefix",
    "dataCollectionNumber"
})
public class FindDataCollectionFromImageDirectoryAndImagePrefixAndNumber {

    protected String imageDirectory;
    protected String imagePrefix;
    protected Integer dataCollectionNumber;

    /**
     * Gets the value of the imageDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageDirectory() {
        return imageDirectory;
    }

    /**
     * Sets the value of the imageDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageDirectory(String value) {
        this.imageDirectory = value;
    }

    /**
     * Gets the value of the imagePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePrefix() {
        return imagePrefix;
    }

    /**
     * Sets the value of the imagePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePrefix(String value) {
        this.imagePrefix = value;
    }

    /**
     * Gets the value of the dataCollectionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataCollectionNumber() {
        return dataCollectionNumber;
    }

    /**
     * Sets the value of the dataCollectionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataCollectionNumber(Integer value) {
        this.dataCollectionNumber = value;
    }

}
