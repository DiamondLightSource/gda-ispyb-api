
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dewarTransportHistory3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dewarTransportHistory3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dewarStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dewarTransportHistoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dewarVO" type="{http://ispyb.ejb3.webservices.collection}dewar3VO" minOccurs="0"/&gt;
 *         &lt;element name="storageLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dewarTransportHistory3VO", propOrder = {
    "arrivalDate",
    "dewarStatus",
    "dewarTransportHistoryId",
    "dewarVO",
    "storageLocation"
})
public class DewarTransportHistory3VO
    extends IsPyBValueObject
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDate;
    protected String dewarStatus;
    protected Integer dewarTransportHistoryId;
    protected Dewar3VO dewarVO;
    protected String storageLocation;

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDate(XMLGregorianCalendar value) {
        this.arrivalDate = value;
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
     * Gets the value of the dewarTransportHistoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDewarTransportHistoryId() {
        return dewarTransportHistoryId;
    }

    /**
     * Sets the value of the dewarTransportHistoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDewarTransportHistoryId(Integer value) {
        this.dewarTransportHistoryId = value;
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

}
