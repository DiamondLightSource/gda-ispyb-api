
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for autoProcProgramAttachment3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="autoProcProgramAttachment3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autoProcProgramAttachmentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="autoProcProgramVO" type="{http://ispyb.ejb3.webservices.collection}autoProcProgram3VO" minOccurs="0"/&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "autoProcProgramAttachment3VO", propOrder = {
    "autoProcProgramAttachmentId",
    "autoProcProgramVO",
    "fileName",
    "filePath",
    "fileType",
    "recordTimeStamp"
})
public class AutoProcProgramAttachment3VO
    extends IsPyBValueObject
{

    protected Integer autoProcProgramAttachmentId;
    protected AutoProcProgram3VO autoProcProgramVO;
    protected String fileName;
    protected String filePath;
    protected String fileType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recordTimeStamp;

    /**
     * Gets the value of the autoProcProgramAttachmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoProcProgramAttachmentId() {
        return autoProcProgramAttachmentId;
    }

    /**
     * Sets the value of the autoProcProgramAttachmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoProcProgramAttachmentId(Integer value) {
        this.autoProcProgramAttachmentId = value;
    }

    /**
     * Gets the value of the autoProcProgramVO property.
     * 
     * @return
     *     possible object is
     *     {@link AutoProcProgram3VO }
     *     
     */
    public AutoProcProgram3VO getAutoProcProgramVO() {
        return autoProcProgramVO;
    }

    /**
     * Sets the value of the autoProcProgramVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoProcProgram3VO }
     *     
     */
    public void setAutoProcProgramVO(AutoProcProgram3VO value) {
        this.autoProcProgramVO = value;
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
     * Gets the value of the filePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the value of the filePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
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
