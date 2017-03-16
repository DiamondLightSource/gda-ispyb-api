
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for imagePosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imagePosition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jpegFileFullPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jpegThumbnailFileFullPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imagePosition", propOrder = {
    "fileLocation",
    "fileName",
    "jpegFileFullPath",
    "jpegThumbnailFileFullPath"
})
public class ImagePosition {

    protected String fileLocation;
    protected String fileName;
    protected String jpegFileFullPath;
    protected String jpegThumbnailFileFullPath;

    /**
     * Gets the value of the fileLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileLocation() {
        return fileLocation;
    }

    /**
     * Sets the value of the fileLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileLocation(String value) {
        this.fileLocation = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the jpegFileFullPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJpegFileFullPath() {
        return jpegFileFullPath;
    }

    /**
     * Sets the value of the jpegFileFullPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJpegFileFullPath(String value) {
        this.jpegFileFullPath = value;
    }

    /**
     * Gets the value of the jpegThumbnailFileFullPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJpegThumbnailFileFullPath() {
        return jpegThumbnailFileFullPath;
    }

    /**
     * Sets the value of the jpegThumbnailFileFullPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJpegThumbnailFileFullPath(String value) {
        this.jpegThumbnailFileFullPath = value;
    }

}
