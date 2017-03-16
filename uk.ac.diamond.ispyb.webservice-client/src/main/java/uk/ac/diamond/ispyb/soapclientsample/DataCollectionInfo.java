
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataCollectionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataCollectionInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}dataCollection3VO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blSampleVO" type="{http://ispyb.ejb3.webservices.collection}blSampleWS3VO" minOccurs="0"/&gt;
 *         &lt;element name="cellA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cellAlpha" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cellB" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cellBeta" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cellC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cellGamma" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="localContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pdbFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="spaceGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataCollectionInfo", propOrder = {
    "blSampleVO",
    "cellA",
    "cellAlpha",
    "cellB",
    "cellBeta",
    "cellC",
    "cellGamma",
    "localContact",
    "localContactEmail",
    "pdbFilePath",
    "spaceGroup"
})
public class DataCollectionInfo
    extends DataCollection3VO
{

    protected BlSampleWS3VO blSampleVO;
    protected Double cellA;
    protected Double cellAlpha;
    protected Double cellB;
    protected Double cellBeta;
    protected Double cellC;
    protected Double cellGamma;
    protected String localContact;
    protected String localContactEmail;
    protected String pdbFilePath;
    protected String spaceGroup;

    /**
     * Gets the value of the blSampleVO property.
     * 
     * @return
     *     possible object is
     *     {@link BlSampleWS3VO }
     *     
     */
    public BlSampleWS3VO getBlSampleVO() {
        return blSampleVO;
    }

    /**
     * Sets the value of the blSampleVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlSampleWS3VO }
     *     
     */
    public void setBlSampleVO(BlSampleWS3VO value) {
        this.blSampleVO = value;
    }

    /**
     * Gets the value of the cellA property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCellA() {
        return cellA;
    }

    /**
     * Sets the value of the cellA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCellA(Double value) {
        this.cellA = value;
    }

    /**
     * Gets the value of the cellAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCellAlpha() {
        return cellAlpha;
    }

    /**
     * Sets the value of the cellAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCellAlpha(Double value) {
        this.cellAlpha = value;
    }

    /**
     * Gets the value of the cellB property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCellB() {
        return cellB;
    }

    /**
     * Sets the value of the cellB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCellB(Double value) {
        this.cellB = value;
    }

    /**
     * Gets the value of the cellBeta property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCellBeta() {
        return cellBeta;
    }

    /**
     * Sets the value of the cellBeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCellBeta(Double value) {
        this.cellBeta = value;
    }

    /**
     * Gets the value of the cellC property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCellC() {
        return cellC;
    }

    /**
     * Sets the value of the cellC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCellC(Double value) {
        this.cellC = value;
    }

    /**
     * Gets the value of the cellGamma property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCellGamma() {
        return cellGamma;
    }

    /**
     * Sets the value of the cellGamma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCellGamma(Double value) {
        this.cellGamma = value;
    }

    /**
     * Gets the value of the localContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalContact() {
        return localContact;
    }

    /**
     * Sets the value of the localContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalContact(String value) {
        this.localContact = value;
    }

    /**
     * Gets the value of the localContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalContactEmail() {
        return localContactEmail;
    }

    /**
     * Sets the value of the localContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalContactEmail(String value) {
        this.localContactEmail = value;
    }

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

    /**
     * Gets the value of the spaceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpaceGroup() {
        return spaceGroup;
    }

    /**
     * Sets the value of the spaceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpaceGroup(String value) {
        this.spaceGroup = value;
    }

}
