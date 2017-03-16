
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for blSubSample3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="blSubSample3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blSampleVO" type="{http://ispyb.ejb3.webservices.collection}blSample3VO" minOccurs="0"/&gt;
 *         &lt;element name="blSubSampleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="blSubSampleUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diffractionPlanVO" type="{http://ispyb.ejb3.webservices.collection}diffractionPlan3VO" minOccurs="0"/&gt;
 *         &lt;element name="imgFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imgFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="position2VO" type="{http://ispyb.ejb3.webservices.collection}position3VO" minOccurs="0"/&gt;
 *         &lt;element name="positionVO" type="{http://ispyb.ejb3.webservices.collection}position3VO" minOccurs="0"/&gt;
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
@XmlType(name = "blSubSample3VO", propOrder = {
    "blSampleVO",
    "blSubSampleId",
    "blSubSampleUUID",
    "comments",
    "diffractionPlanVO",
    "imgFileName",
    "imgFilePath",
    "position2VO",
    "positionVO",
    "recordTimeStamp"
})
public class BlSubSample3VO
    extends IsPyBValueObject
{

    protected BlSample3VO blSampleVO;
    protected Integer blSubSampleId;
    protected String blSubSampleUUID;
    protected String comments;
    protected DiffractionPlan3VO diffractionPlanVO;
    protected String imgFileName;
    protected String imgFilePath;
    protected Position3VO position2VO;
    protected Position3VO positionVO;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recordTimeStamp;

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
     * Gets the value of the blSubSampleId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlSubSampleId() {
        return blSubSampleId;
    }

    /**
     * Sets the value of the blSubSampleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlSubSampleId(Integer value) {
        this.blSubSampleId = value;
    }

    /**
     * Gets the value of the blSubSampleUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlSubSampleUUID() {
        return blSubSampleUUID;
    }

    /**
     * Sets the value of the blSubSampleUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlSubSampleUUID(String value) {
        this.blSubSampleUUID = value;
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
     * Gets the value of the diffractionPlanVO property.
     * 
     * @return
     *     possible object is
     *     {@link DiffractionPlan3VO }
     *     
     */
    public DiffractionPlan3VO getDiffractionPlanVO() {
        return diffractionPlanVO;
    }

    /**
     * Sets the value of the diffractionPlanVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiffractionPlan3VO }
     *     
     */
    public void setDiffractionPlanVO(DiffractionPlan3VO value) {
        this.diffractionPlanVO = value;
    }

    /**
     * Gets the value of the imgFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgFileName() {
        return imgFileName;
    }

    /**
     * Sets the value of the imgFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgFileName(String value) {
        this.imgFileName = value;
    }

    /**
     * Gets the value of the imgFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgFilePath() {
        return imgFilePath;
    }

    /**
     * Sets the value of the imgFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgFilePath(String value) {
        this.imgFilePath = value;
    }

    /**
     * Gets the value of the position2VO property.
     * 
     * @return
     *     possible object is
     *     {@link Position3VO }
     *     
     */
    public Position3VO getPosition2VO() {
        return position2VO;
    }

    /**
     * Sets the value of the position2VO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position3VO }
     *     
     */
    public void setPosition2VO(Position3VO value) {
        this.position2VO = value;
    }

    /**
     * Gets the value of the positionVO property.
     * 
     * @return
     *     possible object is
     *     {@link Position3VO }
     *     
     */
    public Position3VO getPositionVO() {
        return positionVO;
    }

    /**
     * Sets the value of the positionVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position3VO }
     *     
     */
    public void setPositionVO(Position3VO value) {
        this.positionVO = value;
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
