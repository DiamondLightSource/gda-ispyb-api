
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xdsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xdsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="axisEnd" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="axisRange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="axisStart" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="detectorDistance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="detectorManufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detectorModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detectorPixelSizeHorizontal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="detectorPixelSizeVertical" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="fileTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kappaStart" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="numberOfImages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="phiStart" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="polarisation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="startImageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="wavelength" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="xbeam" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ybeam" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xdsInfo", propOrder = {
    "axisEnd",
    "axisRange",
    "axisStart",
    "detectorDistance",
    "detectorManufacturer",
    "detectorModel",
    "detectorPixelSizeHorizontal",
    "detectorPixelSizeVertical",
    "fileTemplate",
    "imageDirectory",
    "imageSuffix",
    "kappaStart",
    "numberOfImages",
    "phiStart",
    "polarisation",
    "startImageNumber",
    "wavelength",
    "xbeam",
    "ybeam"
})
public class XdsInfo {

    protected Double axisEnd;
    protected Double axisRange;
    protected Double axisStart;
    protected Double detectorDistance;
    protected String detectorManufacturer;
    protected String detectorModel;
    protected Double detectorPixelSizeHorizontal;
    protected Double detectorPixelSizeVertical;
    protected String fileTemplate;
    protected String imageDirectory;
    protected String imageSuffix;
    protected Double kappaStart;
    protected Integer numberOfImages;
    protected Double phiStart;
    protected Double polarisation;
    protected Integer startImageNumber;
    protected Double wavelength;
    protected Double xbeam;
    protected Double ybeam;

    /**
     * Gets the value of the axisEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAxisEnd() {
        return axisEnd;
    }

    /**
     * Sets the value of the axisEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAxisEnd(Double value) {
        this.axisEnd = value;
    }

    /**
     * Gets the value of the axisRange property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAxisRange() {
        return axisRange;
    }

    /**
     * Sets the value of the axisRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAxisRange(Double value) {
        this.axisRange = value;
    }

    /**
     * Gets the value of the axisStart property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAxisStart() {
        return axisStart;
    }

    /**
     * Sets the value of the axisStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAxisStart(Double value) {
        this.axisStart = value;
    }

    /**
     * Gets the value of the detectorDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDetectorDistance() {
        return detectorDistance;
    }

    /**
     * Sets the value of the detectorDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDetectorDistance(Double value) {
        this.detectorDistance = value;
    }

    /**
     * Gets the value of the detectorManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectorManufacturer() {
        return detectorManufacturer;
    }

    /**
     * Sets the value of the detectorManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectorManufacturer(String value) {
        this.detectorManufacturer = value;
    }

    /**
     * Gets the value of the detectorModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectorModel() {
        return detectorModel;
    }

    /**
     * Sets the value of the detectorModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectorModel(String value) {
        this.detectorModel = value;
    }

    /**
     * Gets the value of the detectorPixelSizeHorizontal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDetectorPixelSizeHorizontal() {
        return detectorPixelSizeHorizontal;
    }

    /**
     * Sets the value of the detectorPixelSizeHorizontal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDetectorPixelSizeHorizontal(Double value) {
        this.detectorPixelSizeHorizontal = value;
    }

    /**
     * Gets the value of the detectorPixelSizeVertical property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDetectorPixelSizeVertical() {
        return detectorPixelSizeVertical;
    }

    /**
     * Sets the value of the detectorPixelSizeVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDetectorPixelSizeVertical(Double value) {
        this.detectorPixelSizeVertical = value;
    }

    /**
     * Gets the value of the fileTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileTemplate() {
        return fileTemplate;
    }

    /**
     * Sets the value of the fileTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileTemplate(String value) {
        this.fileTemplate = value;
    }

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
     * Gets the value of the imageSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageSuffix() {
        return imageSuffix;
    }

    /**
     * Sets the value of the imageSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageSuffix(String value) {
        this.imageSuffix = value;
    }

    /**
     * Gets the value of the kappaStart property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKappaStart() {
        return kappaStart;
    }

    /**
     * Sets the value of the kappaStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKappaStart(Double value) {
        this.kappaStart = value;
    }

    /**
     * Gets the value of the numberOfImages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfImages() {
        return numberOfImages;
    }

    /**
     * Sets the value of the numberOfImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfImages(Integer value) {
        this.numberOfImages = value;
    }

    /**
     * Gets the value of the phiStart property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPhiStart() {
        return phiStart;
    }

    /**
     * Sets the value of the phiStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPhiStart(Double value) {
        this.phiStart = value;
    }

    /**
     * Gets the value of the polarisation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPolarisation() {
        return polarisation;
    }

    /**
     * Sets the value of the polarisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPolarisation(Double value) {
        this.polarisation = value;
    }

    /**
     * Gets the value of the startImageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartImageNumber() {
        return startImageNumber;
    }

    /**
     * Sets the value of the startImageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartImageNumber(Integer value) {
        this.startImageNumber = value;
    }

    /**
     * Gets the value of the wavelength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWavelength() {
        return wavelength;
    }

    /**
     * Sets the value of the wavelength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWavelength(Double value) {
        this.wavelength = value;
    }

    /**
     * Gets the value of the xbeam property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXbeam() {
        return xbeam;
    }

    /**
     * Sets the value of the xbeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXbeam(Double value) {
        this.xbeam = value;
    }

    /**
     * Gets the value of the ybeam property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getYbeam() {
        return ybeam;
    }

    /**
     * Sets the value of the ybeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setYbeam(Double value) {
        this.ybeam = value;
    }

}
