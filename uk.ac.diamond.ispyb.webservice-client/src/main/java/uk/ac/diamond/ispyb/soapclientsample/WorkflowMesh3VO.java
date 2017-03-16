
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for workflowMesh3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workflowMesh3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bestImageVO" type="{http://ispyb.ejb3.webservices.collection}image3VO" minOccurs="0"/&gt;
 *         &lt;element name="cartographyPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="value1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="value2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="value3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="value4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="workflowMeshId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="workflowVO" type="{http://ispyb.ejb3.webservices.collection}workflow3VO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workflowMesh3VO", propOrder = {
    "bestImageVO",
    "cartographyPath",
    "recordTimeStamp",
    "value1",
    "value2",
    "value3",
    "value4",
    "workflowMeshId",
    "workflowVO"
})
@XmlSeeAlso({
    WorkflowMeshWS3VO.class
})
public class WorkflowMesh3VO
    extends IsPyBValueObject
{

    protected Image3VO bestImageVO;
    protected String cartographyPath;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recordTimeStamp;
    protected Double value1;
    protected Double value2;
    protected Double value3;
    protected Double value4;
    protected Integer workflowMeshId;
    protected Workflow3VO workflowVO;

    /**
     * Gets the value of the bestImageVO property.
     * 
     * @return
     *     possible object is
     *     {@link Image3VO }
     *     
     */
    public Image3VO getBestImageVO() {
        return bestImageVO;
    }

    /**
     * Sets the value of the bestImageVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image3VO }
     *     
     */
    public void setBestImageVO(Image3VO value) {
        this.bestImageVO = value;
    }

    /**
     * Gets the value of the cartographyPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartographyPath() {
        return cartographyPath;
    }

    /**
     * Sets the value of the cartographyPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartographyPath(String value) {
        this.cartographyPath = value;
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

    /**
     * Gets the value of the value1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue1() {
        return value1;
    }

    /**
     * Sets the value of the value1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue1(Double value) {
        this.value1 = value;
    }

    /**
     * Gets the value of the value2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue2() {
        return value2;
    }

    /**
     * Sets the value of the value2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue2(Double value) {
        this.value2 = value;
    }

    /**
     * Gets the value of the value3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue3() {
        return value3;
    }

    /**
     * Sets the value of the value3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue3(Double value) {
        this.value3 = value;
    }

    /**
     * Gets the value of the value4 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue4() {
        return value4;
    }

    /**
     * Sets the value of the value4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue4(Double value) {
        this.value4 = value;
    }

    /**
     * Gets the value of the workflowMeshId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkflowMeshId() {
        return workflowMeshId;
    }

    /**
     * Sets the value of the workflowMeshId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkflowMeshId(Integer value) {
        this.workflowMeshId = value;
    }

    /**
     * Gets the value of the workflowVO property.
     * 
     * @return
     *     possible object is
     *     {@link Workflow3VO }
     *     
     */
    public Workflow3VO getWorkflowVO() {
        return workflowVO;
    }

    /**
     * Sets the value of the workflowVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Workflow3VO }
     *     
     */
    public void setWorkflowVO(Workflow3VO value) {
        this.workflowVO = value;
    }

}
