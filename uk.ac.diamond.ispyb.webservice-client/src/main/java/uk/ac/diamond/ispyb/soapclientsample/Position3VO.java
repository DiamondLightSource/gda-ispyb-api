
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for position3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="position3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="posX" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="posY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="posZ" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="positionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="recordTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="relativePositionVO" type="{http://ispyb.ejb3.webservices.collection}position3VO" minOccurs="0"/&gt;
 *         &lt;element name="scale" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "position3VO", propOrder = {
    "posX",
    "posY",
    "posZ",
    "positionId",
    "recordTimeStamp",
    "relativePositionVO",
    "scale"
})
@XmlSeeAlso({
    PositionWS3VO.class
})
public class Position3VO
    extends IsPyBValueObject
{

    protected Double posX;
    protected Double posY;
    protected Double posZ;
    protected Integer positionId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recordTimeStamp;
    protected Position3VO relativePositionVO;
    protected Double scale;

    /**
     * Gets the value of the posX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPosX() {
        return posX;
    }

    /**
     * Sets the value of the posX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPosX(Double value) {
        this.posX = value;
    }

    /**
     * Gets the value of the posY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPosY() {
        return posY;
    }

    /**
     * Sets the value of the posY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPosY(Double value) {
        this.posY = value;
    }

    /**
     * Gets the value of the posZ property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPosZ() {
        return posZ;
    }

    /**
     * Sets the value of the posZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPosZ(Double value) {
        this.posZ = value;
    }

    /**
     * Gets the value of the positionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPositionId() {
        return positionId;
    }

    /**
     * Sets the value of the positionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPositionId(Integer value) {
        this.positionId = value;
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
     * Gets the value of the relativePositionVO property.
     * 
     * @return
     *     possible object is
     *     {@link Position3VO }
     *     
     */
    public Position3VO getRelativePositionVO() {
        return relativePositionVO;
    }

    /**
     * Sets the value of the relativePositionVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position3VO }
     *     
     */
    public void setRelativePositionVO(Position3VO value) {
        this.relativePositionVO = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScale(Double value) {
        this.scale = value;
    }

}
