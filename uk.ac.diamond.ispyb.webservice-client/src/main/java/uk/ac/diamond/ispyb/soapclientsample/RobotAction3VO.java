
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for robotAction3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="robotAction3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blSampleVO" type="{http://ispyb.ejb3.webservices.collection}blSample3VO" minOccurs="0"/&gt;
 *         &lt;element name="containerLocation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dewarLocation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="robotActionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="sampleBarcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sessionVO" type="{http://ispyb.ejb3.webservices.collection}session3VO" minOccurs="0"/&gt;
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xtalSnapshotAfter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xtalSnapshotBefore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "robotAction3VO", propOrder = {
    "actionType",
    "blSampleVO",
    "containerLocation",
    "dewarLocation",
    "endTime",
    "message",
    "robotActionId",
    "sampleBarcode",
    "sessionVO",
    "startTime",
    "status",
    "xtalSnapshotAfter",
    "xtalSnapshotBefore"
})
@XmlSeeAlso({
    RobotActionWS3VO.class
})
public class RobotAction3VO
    extends IsPyBValueObject
{

    protected String actionType;
    protected BlSample3VO blSampleVO;
    protected Integer containerLocation;
    protected Integer dewarLocation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    protected String message;
    protected Integer robotActionId;
    protected String sampleBarcode;
    protected Session3VO sessionVO;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    protected String status;
    protected String xtalSnapshotAfter;
    protected String xtalSnapshotBefore;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the blSampleVO property.
     * 
     * @return
     *     possible object is
     *     {@link BlSample3VO }
     *     
     */
    public BlSample3VO getBlSampleVO() {
        return blSampleVO;
    }

    /**
     * Sets the value of the blSampleVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlSample3VO }
     *     
     */
    public void setBlSampleVO(BlSample3VO value) {
        this.blSampleVO = value;
    }

    /**
     * Gets the value of the containerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContainerLocation() {
        return containerLocation;
    }

    /**
     * Sets the value of the containerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContainerLocation(Integer value) {
        this.containerLocation = value;
    }

    /**
     * Gets the value of the dewarLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDewarLocation() {
        return dewarLocation;
    }

    /**
     * Sets the value of the dewarLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDewarLocation(Integer value) {
        this.dewarLocation = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the robotActionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRobotActionId() {
        return robotActionId;
    }

    /**
     * Sets the value of the robotActionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRobotActionId(Integer value) {
        this.robotActionId = value;
    }

    /**
     * Gets the value of the sampleBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleBarcode() {
        return sampleBarcode;
    }

    /**
     * Sets the value of the sampleBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleBarcode(String value) {
        this.sampleBarcode = value;
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
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the xtalSnapshotAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtalSnapshotAfter() {
        return xtalSnapshotAfter;
    }

    /**
     * Sets the value of the xtalSnapshotAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtalSnapshotAfter(String value) {
        this.xtalSnapshotAfter = value;
    }

    /**
     * Gets the value of the xtalSnapshotBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtalSnapshotBefore() {
        return xtalSnapshotBefore;
    }

    /**
     * Sets the value of the xtalSnapshotBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtalSnapshotBefore(String value) {
        this.xtalSnapshotBefore = value;
    }

}
