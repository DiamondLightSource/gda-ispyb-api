
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for autoProcStatus3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="autoProcStatus3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autoProcIntegrationVO" type="{http://ispyb.ejb3.webservices.collection}autoProcIntegration3VO" minOccurs="0"/&gt;
 *         &lt;element name="autoProcStatusId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="blTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="step" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "autoProcStatus3VO", propOrder = {
    "autoProcIntegrationVO",
    "autoProcStatusId",
    "blTimeStamp",
    "comments",
    "status",
    "step"
})
public class AutoProcStatus3VO
    extends IsPyBValueObject
{

    protected AutoProcIntegration3VO autoProcIntegrationVO;
    protected Integer autoProcStatusId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar blTimeStamp;
    protected String comments;
    protected String status;
    protected String step;

    /**
     * Gets the value of the autoProcIntegrationVO property.
     * 
     * @return
     *     possible object is
     *     {@link AutoProcIntegration3VO }
     *     
     */
    public AutoProcIntegration3VO getAutoProcIntegrationVO() {
        return autoProcIntegrationVO;
    }

    /**
     * Sets the value of the autoProcIntegrationVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoProcIntegration3VO }
     *     
     */
    public void setAutoProcIntegrationVO(AutoProcIntegration3VO value) {
        this.autoProcIntegrationVO = value;
    }

    /**
     * Gets the value of the autoProcStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoProcStatusId() {
        return autoProcStatusId;
    }

    /**
     * Sets the value of the autoProcStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoProcStatusId(Integer value) {
        this.autoProcStatusId = value;
    }

    /**
     * Gets the value of the blTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBlTimeStamp() {
        return blTimeStamp;
    }

    /**
     * Sets the value of the blTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBlTimeStamp(XMLGregorianCalendar value) {
        this.blTimeStamp = value;
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
     * Gets the value of the step property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStep(String value) {
        this.step = value;
    }

}
