
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
 * <p>Java class for container3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="container3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="barcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beamlineLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="containerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="containerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="containerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dewarVO" type="{http://ispyb.ejb3.webservices.collection}dewar3VO" minOccurs="0"/&gt;
 *         &lt;element name="personVO" type="{http://ispyb.ejb3.webservices.collection}person3VO" minOccurs="0"/&gt;
 *         &lt;element name="sampleChangerLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sampleVOs" type="{http://ispyb.ejb3.webservices.collection}blSample3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sessionVO" type="{http://ispyb.ejb3.webservices.collection}session3VO" minOccurs="0"/&gt;
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
@XmlType(name = "container3VO", propOrder = {
    "barcode",
    "beamlineLocation",
    "capacity",
    "code",
    "containerId",
    "containerStatus",
    "containerType",
    "dewarVO",
    "personVO",
    "sampleChangerLocation",
    "sampleVOs",
    "sessionVO",
    "timeStamp"
})
public class Container3VO
    extends IsPyBValueObject
{

    protected String barcode;
    protected String beamlineLocation;
    protected Integer capacity;
    protected String code;
    protected Integer containerId;
    protected String containerStatus;
    protected String containerType;
    protected Dewar3VO dewarVO;
    protected Person3VO personVO;
    protected String sampleChangerLocation;
    @XmlElement(nillable = true)
    protected List<BlSample3VO> sampleVOs;
    protected Session3VO sessionVO;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcode(String value) {
        this.barcode = value;
    }

    /**
     * Gets the value of the beamlineLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeamlineLocation() {
        return beamlineLocation;
    }

    /**
     * Sets the value of the beamlineLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeamlineLocation(String value) {
        this.beamlineLocation = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapacity(Integer value) {
        this.capacity = value;
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
     * Gets the value of the containerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContainerId() {
        return containerId;
    }

    /**
     * Sets the value of the containerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContainerId(Integer value) {
        this.containerId = value;
    }

    /**
     * Gets the value of the containerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerStatus() {
        return containerStatus;
    }

    /**
     * Sets the value of the containerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerStatus(String value) {
        this.containerStatus = value;
    }

    /**
     * Gets the value of the containerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerType() {
        return containerType;
    }

    /**
     * Sets the value of the containerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerType(String value) {
        this.containerType = value;
    }

    /**
     * Gets the value of the dewarVO property.
     * 
     * @return
     *     possible object is
     *     {@link Dewar3VO }
     *     
     */
    public Dewar3VO getDewarVO() {
        return dewarVO;
    }

    /**
     * Sets the value of the dewarVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dewar3VO }
     *     
     */
    public void setDewarVO(Dewar3VO value) {
        this.dewarVO = value;
    }

    /**
     * Gets the value of the personVO property.
     * 
     * @return
     *     possible object is
     *     {@link Person3VO }
     *     
     */
    public Person3VO getPersonVO() {
        return personVO;
    }

    /**
     * Sets the value of the personVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person3VO }
     *     
     */
    public void setPersonVO(Person3VO value) {
        this.personVO = value;
    }

    /**
     * Gets the value of the sampleChangerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleChangerLocation() {
        return sampleChangerLocation;
    }

    /**
     * Sets the value of the sampleChangerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleChangerLocation(String value) {
        this.sampleChangerLocation = value;
    }

    /**
     * Gets the value of the sampleVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sampleVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSampleVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlSample3VO }
     * 
     * 
     */
    public List<BlSample3VO> getSampleVOs() {
        if (sampleVOs == null) {
            sampleVOs = new ArrayList<BlSample3VO>();
        }
        return this.sampleVOs;
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
