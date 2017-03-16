
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
 * <p>Java class for shipping3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shipping3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateOfShippingToUser" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deliveryAgentAgentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deliveryAgentAgentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deliveryAgentDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deliveryAgentFlightCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deliveryAgentShippingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dewarVOs" type="{http://ispyb.ejb3.webservices.collection}dewar3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isStorageShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="laboratoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="proposalVO" type="{http://ispyb.ejb3.webservices.collection}proposal3VO" minOccurs="0"/&gt;
 *         &lt;element name="returnCourier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnLabContactVO" type="{http://ispyb.ejb3.webservices.collection}labContact3VO" minOccurs="0"/&gt;
 *         &lt;element name="sendingLabContactVO" type="{http://ispyb.ejb3.webservices.collection}labContact3VO" minOccurs="0"/&gt;
 *         &lt;element name="sessions" type="{http://ispyb.ejb3.webservices.collection}session3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shippingId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="shippingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shipping3VO", propOrder = {
    "comments",
    "creationDate",
    "dateOfShippingToUser",
    "deliveryAgentAgentCode",
    "deliveryAgentAgentName",
    "deliveryAgentDeliveryDate",
    "deliveryAgentFlightCode",
    "deliveryAgentShippingDate",
    "dewarVOs",
    "isStorageShipping",
    "laboratoryId",
    "proposalVO",
    "returnCourier",
    "returnLabContactVO",
    "sendingLabContactVO",
    "sessions",
    "shippingId",
    "shippingName",
    "shippingStatus",
    "shippingType",
    "timeStamp"
})
public class Shipping3VO
    extends IsPyBValueObject
{

    protected String comments;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfShippingToUser;
    protected String deliveryAgentAgentCode;
    protected String deliveryAgentAgentName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryAgentDeliveryDate;
    protected String deliveryAgentFlightCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryAgentShippingDate;
    @XmlElement(nillable = true)
    protected List<Dewar3VO> dewarVOs;
    protected Boolean isStorageShipping;
    protected Integer laboratoryId;
    protected Proposal3VO proposalVO;
    protected String returnCourier;
    protected LabContact3VO returnLabContactVO;
    protected LabContact3VO sendingLabContactVO;
    @XmlElement(nillable = true)
    protected List<Session3VO> sessions;
    protected Integer shippingId;
    protected String shippingName;
    protected String shippingStatus;
    protected String shippingType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

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
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the dateOfShippingToUser property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfShippingToUser() {
        return dateOfShippingToUser;
    }

    /**
     * Sets the value of the dateOfShippingToUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfShippingToUser(XMLGregorianCalendar value) {
        this.dateOfShippingToUser = value;
    }

    /**
     * Gets the value of the deliveryAgentAgentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryAgentAgentCode() {
        return deliveryAgentAgentCode;
    }

    /**
     * Sets the value of the deliveryAgentAgentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryAgentAgentCode(String value) {
        this.deliveryAgentAgentCode = value;
    }

    /**
     * Gets the value of the deliveryAgentAgentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryAgentAgentName() {
        return deliveryAgentAgentName;
    }

    /**
     * Sets the value of the deliveryAgentAgentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryAgentAgentName(String value) {
        this.deliveryAgentAgentName = value;
    }

    /**
     * Gets the value of the deliveryAgentDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryAgentDeliveryDate() {
        return deliveryAgentDeliveryDate;
    }

    /**
     * Sets the value of the deliveryAgentDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryAgentDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryAgentDeliveryDate = value;
    }

    /**
     * Gets the value of the deliveryAgentFlightCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryAgentFlightCode() {
        return deliveryAgentFlightCode;
    }

    /**
     * Sets the value of the deliveryAgentFlightCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryAgentFlightCode(String value) {
        this.deliveryAgentFlightCode = value;
    }

    /**
     * Gets the value of the deliveryAgentShippingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryAgentShippingDate() {
        return deliveryAgentShippingDate;
    }

    /**
     * Sets the value of the deliveryAgentShippingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryAgentShippingDate(XMLGregorianCalendar value) {
        this.deliveryAgentShippingDate = value;
    }

    /**
     * Gets the value of the dewarVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dewarVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDewarVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dewar3VO }
     * 
     * 
     */
    public List<Dewar3VO> getDewarVOs() {
        if (dewarVOs == null) {
            dewarVOs = new ArrayList<Dewar3VO>();
        }
        return this.dewarVOs;
    }

    /**
     * Gets the value of the isStorageShipping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStorageShipping() {
        return isStorageShipping;
    }

    /**
     * Sets the value of the isStorageShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStorageShipping(Boolean value) {
        this.isStorageShipping = value;
    }

    /**
     * Gets the value of the laboratoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLaboratoryId() {
        return laboratoryId;
    }

    /**
     * Sets the value of the laboratoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLaboratoryId(Integer value) {
        this.laboratoryId = value;
    }

    /**
     * Gets the value of the proposalVO property.
     * 
     * @return
     *     possible object is
     *     {@link Proposal3VO }
     *     
     */
    public Proposal3VO getProposalVO() {
        return proposalVO;
    }

    /**
     * Sets the value of the proposalVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proposal3VO }
     *     
     */
    public void setProposalVO(Proposal3VO value) {
        this.proposalVO = value;
    }

    /**
     * Gets the value of the returnCourier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCourier() {
        return returnCourier;
    }

    /**
     * Sets the value of the returnCourier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCourier(String value) {
        this.returnCourier = value;
    }

    /**
     * Gets the value of the returnLabContactVO property.
     * 
     * @return
     *     possible object is
     *     {@link LabContact3VO }
     *     
     */
    public LabContact3VO getReturnLabContactVO() {
        return returnLabContactVO;
    }

    /**
     * Sets the value of the returnLabContactVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabContact3VO }
     *     
     */
    public void setReturnLabContactVO(LabContact3VO value) {
        this.returnLabContactVO = value;
    }

    /**
     * Gets the value of the sendingLabContactVO property.
     * 
     * @return
     *     possible object is
     *     {@link LabContact3VO }
     *     
     */
    public LabContact3VO getSendingLabContactVO() {
        return sendingLabContactVO;
    }

    /**
     * Sets the value of the sendingLabContactVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabContact3VO }
     *     
     */
    public void setSendingLabContactVO(LabContact3VO value) {
        this.sendingLabContactVO = value;
    }

    /**
     * Gets the value of the sessions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Session3VO }
     * 
     * 
     */
    public List<Session3VO> getSessions() {
        if (sessions == null) {
            sessions = new ArrayList<Session3VO>();
        }
        return this.sessions;
    }

    /**
     * Gets the value of the shippingId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingId() {
        return shippingId;
    }

    /**
     * Sets the value of the shippingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingId(Integer value) {
        this.shippingId = value;
    }

    /**
     * Gets the value of the shippingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * Sets the value of the shippingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingName(String value) {
        this.shippingName = value;
    }

    /**
     * Gets the value of the shippingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingStatus() {
        return shippingStatus;
    }

    /**
     * Sets the value of the shippingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingStatus(String value) {
        this.shippingStatus = value;
    }

    /**
     * Gets the value of the shippingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingType() {
        return shippingType;
    }

    /**
     * Sets the value of the shippingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingType(String value) {
        this.shippingType = value;
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

}
