
package uk.ac.diamond.ispyb.soapclientsample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dewar3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dewar3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="barCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="containerVOs" type="{http://ispyb.ejb3.webservices.collection}container3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="customsValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dewarId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dewarStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dewarTransportHistoryVOs" type="{http://ispyb.ejb3.webservices.collection}dewarTransportHistory3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="facilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isStorageDewar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sessionVO" type="{http://ispyb.ejb3.webservices.collection}session3VO" minOccurs="0"/&gt;
 *         &lt;element name="shippingVO" type="{http://ispyb.ejb3.webservices.collection}shipping3VO" minOccurs="0"/&gt;
 *         &lt;element name="storageLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="trackingNumberFromSynchrotron" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trackingNumberToSynchrotron" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dewar3VO", propOrder = {
    "barCode",
    "code",
    "comments",
    "containerVOs",
    "customsValue",
    "dewarId",
    "dewarStatus",
    "dewarTransportHistoryVOs",
    "facilityCode",
    "isStorageDewar",
    "sessionVO",
    "shippingVO",
    "storageLocation",
    "timeStamp",
    "trackingNumberFromSynchrotron",
    "trackingNumberToSynchrotron",
    "transportValue",
    "type"
})
public class Dewar3VO
    extends IsPyBValueObject
{

    protected String barCode;
    protected String code;
    protected String comments;
    @XmlElement(nillable = true)
    protected List<Container3VO> containerVOs;
    protected Integer customsValue;
    protected Integer dewarId;
    protected String dewarStatus;
    @XmlElement(nillable = true)
    protected List<DewarTransportHistory3VO> dewarTransportHistoryVOs;
    protected String facilityCode;
    protected Boolean isStorageDewar;
    protected Session3VO sessionVO;
    protected Shipping3VO shippingVO;
    protected String storageLocation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    protected String trackingNumberFromSynchrotron;
    protected String trackingNumberToSynchrotron;
    protected Integer transportValue;
    protected String type;

    /**
     * Gets the value of the barCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * Sets the value of the barCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCode(String value) {
        this.barCode = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

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
     * Gets the value of the containerVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Container3VO }
     * 
     * 
     */
    public List<Container3VO> getContainerVOs() {
        if (containerVOs == null) {
            containerVOs = new ArrayList<Container3VO>();
        }
        return this.containerVOs;
    }

    /**
     * Gets the value of the customsValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomsValue() {
        return customsValue;
    }

    /**
     * Sets the value of the customsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomsValue(Integer value) {
        this.customsValue = value;
    }

    /**
     * Gets the value of the dewarId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDewarId() {
        return dewarId;
    }

    /**
     * Sets the value of the dewarId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDewarId(Integer value) {
        this.dewarId = value;
    }

    /**
     * Gets the value of the dewarStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDewarStatus() {
        return dewarStatus;
    }

    /**
     * Sets the value of the dewarStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDewarStatus(String value) {
        this.dewarStatus = value;
    }

    /**
     * Gets the value of the dewarTransportHistoryVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dewarTransportHistoryVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDewarTransportHistoryVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DewarTransportHistory3VO }
     * 
     * 
     */
    public List<DewarTransportHistory3VO> getDewarTransportHistoryVOs() {
        if (dewarTransportHistoryVOs == null) {
            dewarTransportHistoryVOs = new ArrayList<DewarTransportHistory3VO>();
        }
        return this.dewarTransportHistoryVOs;
    }

    /**
     * Gets the value of the facilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityCode() {
        return facilityCode;
    }

    /**
     * Sets the value of the facilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityCode(String value) {
        this.facilityCode = value;
    }

    /**
     * Gets the value of the isStorageDewar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStorageDewar() {
        return isStorageDewar;
    }

    /**
     * Sets the value of the isStorageDewar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStorageDewar(Boolean value) {
        this.isStorageDewar = value;
    }

    /**
     * Gets the value of the sessionVO property.
     * 
     * @return
     *     possible object is
     *     {@link Session3VO }
     *     
     */
    public Session3VO getSessionVO() {
        return sessionVO;
    }

    /**
     * Sets the value of the sessionVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Session3VO }
     *     
     */
    public void setSessionVO(Session3VO value) {
        this.sessionVO = value;
    }

    /**
     * Gets the value of the shippingVO property.
     * 
     * @return
     *     possible object is
     *     {@link Shipping3VO }
     *     
     */
    public Shipping3VO getShippingVO() {
        return shippingVO;
    }

    /**
     * Sets the value of the shippingVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shipping3VO }
     *     
     */
    public void setShippingVO(Shipping3VO value) {
        this.shippingVO = value;
    }

    /**
     * Gets the value of the storageLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageLocation() {
        return storageLocation;
    }

    /**
     * Sets the value of the storageLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageLocation(String value) {
        this.storageLocation = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the trackingNumberFromSynchrotron property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumberFromSynchrotron() {
        return trackingNumberFromSynchrotron;
    }

    /**
     * Sets the value of the trackingNumberFromSynchrotron property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumberFromSynchrotron(String value) {
        this.trackingNumberFromSynchrotron = value;
    }

    /**
     * Gets the value of the trackingNumberToSynchrotron property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumberToSynchrotron() {
        return trackingNumberToSynchrotron;
    }

    /**
     * Sets the value of the trackingNumberToSynchrotron property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumberToSynchrotron(String value) {
        this.trackingNumberToSynchrotron = value;
    }

    /**
     * Gets the value of the transportValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransportValue() {
        return transportValue;
    }

    /**
     * Sets the value of the transportValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransportValue(Integer value) {
        this.transportValue = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
