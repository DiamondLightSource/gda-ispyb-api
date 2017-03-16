
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
 * <p>Java class for autoProcProgram3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="autoProcProgram3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachmentVOs" type="{http://ispyb.ejb3.webservices.collection}autoProcProgramAttachment3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="autoProcProgramId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="processingCommandLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processingEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="processingEnvironment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processingMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processingPrograms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processingStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="processingStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="recordTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "autoProcProgram3VO", propOrder = {
    "attachmentVOs",
    "autoProcProgramId",
    "processingCommandLine",
    "processingEndTime",
    "processingEnvironment",
    "processingMessage",
    "processingPrograms",
    "processingStartTime",
    "processingStatus",
    "recordTimeStamp"
})
public class AutoProcProgram3VO
    extends IsPyBValueObject
{

    @XmlElement(nillable = true)
    protected List<AutoProcProgramAttachment3VO> attachmentVOs;
    protected Integer autoProcProgramId;
    protected String processingCommandLine;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processingEndTime;
    protected String processingEnvironment;
    protected String processingMessage;
    protected String processingPrograms;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processingStartTime;
    protected Boolean processingStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recordTimeStamp;

    /**
     * Gets the value of the attachmentVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoProcProgramAttachment3VO }
     * 
     * 
     */
    public List<AutoProcProgramAttachment3VO> getAttachmentVOs() {
        if (attachmentVOs == null) {
            attachmentVOs = new ArrayList<AutoProcProgramAttachment3VO>();
        }
        return this.attachmentVOs;
    }

    /**
     * Gets the value of the autoProcProgramId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoProcProgramId() {
        return autoProcProgramId;
    }

    /**
     * Sets the value of the autoProcProgramId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoProcProgramId(Integer value) {
        this.autoProcProgramId = value;
    }

    /**
     * Gets the value of the processingCommandLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingCommandLine() {
        return processingCommandLine;
    }

    /**
     * Sets the value of the processingCommandLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingCommandLine(String value) {
        this.processingCommandLine = value;
    }

    /**
     * Gets the value of the processingEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessingEndTime() {
        return processingEndTime;
    }

    /**
     * Sets the value of the processingEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessingEndTime(XMLGregorianCalendar value) {
        this.processingEndTime = value;
    }

    /**
     * Gets the value of the processingEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingEnvironment() {
        return processingEnvironment;
    }

    /**
     * Sets the value of the processingEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingEnvironment(String value) {
        this.processingEnvironment = value;
    }

    /**
     * Gets the value of the processingMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingMessage() {
        return processingMessage;
    }

    /**
     * Sets the value of the processingMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingMessage(String value) {
        this.processingMessage = value;
    }

    /**
     * Gets the value of the processingPrograms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingPrograms() {
        return processingPrograms;
    }

    /**
     * Sets the value of the processingPrograms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingPrograms(String value) {
        this.processingPrograms = value;
    }

    /**
     * Gets the value of the processingStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessingStartTime() {
        return processingStartTime;
    }

    /**
     * Sets the value of the processingStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessingStartTime(XMLGregorianCalendar value) {
        this.processingStartTime = value;
    }

    /**
     * Gets the value of the processingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessingStatus() {
        return processingStatus;
    }

    /**
     * Sets the value of the processingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessingStatus(Boolean value) {
        this.processingStatus = value;
    }

    /**
     * Gets the value of the recordTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecordTimeStamp() {
        return recordTimeStamp;
    }

    /**
     * Sets the value of the recordTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecordTimeStamp(XMLGregorianCalendar value) {
        this.recordTimeStamp = value;
    }

}
