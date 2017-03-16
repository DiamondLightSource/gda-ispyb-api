
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for image3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="image3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cumulativeIntensity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="dataCollectionVO" type="{http://ispyb.ejb3.webservices.collection}dataCollection3VO" minOccurs="0"/&gt;
 *         &lt;element name="fileLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="imageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="jpegFileFullPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jpegThumbnailFileFullPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="machineMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="measuredIntensity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="synchrotronCurrent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "image3VO", propOrder = {
    "comments",
    "cumulativeIntensity",
    "dataCollectionVO",
    "fileLocation",
    "fileName",
    "imageId",
    "imageNumber",
    "jpegFileFullPath",
    "jpegThumbnailFileFullPath",
    "machineMessage",
    "measuredIntensity",
    "synchrotronCurrent",
    "temperature"
})
@XmlSeeAlso({
    ImageWS3VO.class
})
public class Image3VO
    extends IsPyBValueObject
{

    protected String comments;
    protected Float cumulativeIntensity;
    protected DataCollection3VO dataCollectionVO;
    protected String fileLocation;
    protected String fileName;
    protected Integer imageId;
    protected Integer imageNumber;
    protected String jpegFileFullPath;
    protected String jpegThumbnailFileFullPath;
    protected String machineMessage;
    protected Float measuredIntensity;
    protected Float synchrotronCurrent;
    protected Float temperature;

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the cumulativeIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCumulativeIntensity() {
        return cumulativeIntensity;
    }

    /**
     * Sets the value of the cumulativeIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCumulativeIntensity(Float value) {
        this.cumulativeIntensity = value;
    }

    /**
     * Gets the value of the dataCollectionVO property.
     * 
     * @return
     *     possible object is
     *     {@link DataCollection3VO }
     *     
     */
    public DataCollection3VO getDataCollectionVO() {
        return dataCollectionVO;
    }

    /**
     * Sets the value of the dataCollectionVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataCollection3VO }
     *     
     */
    public void setDataCollectionVO(DataCollection3VO value) {
        this.dataCollectionVO = value;
    }

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
     * Gets the value of the imageId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageId() {
        return imageId;
    }

    /**
     * Sets the value of the imageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageId(Integer value) {
        this.imageId = value;
    }

    /**
     * Gets the value of the imageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageNumber() {
        return imageNumber;
    }

    /**
     * Sets the value of the imageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageNumber(Integer value) {
        this.imageNumber = value;
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

    /**
     * Gets the value of the machineMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineMessage() {
        return machineMessage;
    }

    /**
     * Sets the value of the machineMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineMessage(String value) {
        this.machineMessage = value;
    }

    /**
     * Gets the value of the measuredIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMeasuredIntensity() {
        return measuredIntensity;
    }

    /**
     * Sets the value of the measuredIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMeasuredIntensity(Float value) {
        this.measuredIntensity = value;
    }

    /**
     * Gets the value of the synchrotronCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSynchrotronCurrent() {
        return synchrotronCurrent;
    }

    /**
     * Sets the value of the synchrotronCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSynchrotronCurrent(Float value) {
        this.synchrotronCurrent = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTemperature(Float value) {
        this.temperature = value;
    }

}
