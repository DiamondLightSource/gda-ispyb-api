
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
 * <p>Java class for screening3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="screening3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataCollectionGroupVO" type="{http://ispyb.ejb3.webservices.collection}dataCollectionGroup3VO" minOccurs="0"/&gt;
 *         &lt;element name="diffractionPlanVO" type="{http://ispyb.ejb3.webservices.collection}diffractionPlan3VO" minOccurs="0"/&gt;
 *         &lt;element name="programVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screeningId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="screeningOutputVOs" type="{http://ispyb.ejb3.webservices.collection}screeningOutput3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="screeningRankVOs" type="{http://ispyb.ejb3.webservices.collection}screeningRank3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shortComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="xmlSampleInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screening3VO", propOrder = {
    "comments",
    "dataCollectionGroupVO",
    "diffractionPlanVO",
    "programVersion",
    "screeningId",
    "screeningOutputVOs",
    "screeningRankVOs",
    "shortComments",
    "timeStamp",
    "xmlSampleInformation"
})
public class Screening3VO
    extends IsPyBValueObject
{

    protected String comments;
    protected DataCollectionGroup3VO dataCollectionGroupVO;
    protected DiffractionPlan3VO diffractionPlanVO;
    protected String programVersion;
    protected Integer screeningId;
    @XmlElement(nillable = true)
    protected List<ScreeningOutput3VO> screeningOutputVOs;
    @XmlElement(nillable = true)
    protected List<ScreeningRank3VO> screeningRankVOs;
    protected String shortComments;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    protected String xmlSampleInformation;

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
     * Gets the value of the dataCollectionGroupVO property.
     * 
     * @return
     *     possible object is
     *     {@link DataCollectionGroup3VO }
     *     
     */
    public DataCollectionGroup3VO getDataCollectionGroupVO() {
        return dataCollectionGroupVO;
    }

    /**
     * Sets the value of the dataCollectionGroupVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataCollectionGroup3VO }
     *     
     */
    public void setDataCollectionGroupVO(DataCollectionGroup3VO value) {
        this.dataCollectionGroupVO = value;
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
     * Gets the value of the programVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramVersion() {
        return programVersion;
    }

    /**
     * Sets the value of the programVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramVersion(String value) {
        this.programVersion = value;
    }

    /**
     * Gets the value of the screeningId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScreeningId() {
        return screeningId;
    }

    /**
     * Sets the value of the screeningId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScreeningId(Integer value) {
        this.screeningId = value;
    }

    /**
     * Gets the value of the screeningOutputVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screeningOutputVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreeningOutputVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningOutput3VO }
     * 
     * 
     */
    public List<ScreeningOutput3VO> getScreeningOutputVOs() {
        if (screeningOutputVOs == null) {
            screeningOutputVOs = new ArrayList<ScreeningOutput3VO>();
        }
        return this.screeningOutputVOs;
    }

    /**
     * Gets the value of the screeningRankVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screeningRankVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreeningRankVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningRank3VO }
     * 
     * 
     */
    public List<ScreeningRank3VO> getScreeningRankVOs() {
        if (screeningRankVOs == null) {
            screeningRankVOs = new ArrayList<ScreeningRank3VO>();
        }
        return this.screeningRankVOs;
    }

    /**
     * Gets the value of the shortComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortComments() {
        return shortComments;
    }

    /**
     * Sets the value of the shortComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortComments(String value) {
        this.shortComments = value;
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

    /**
     * Gets the value of the xmlSampleInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlSampleInformation() {
        return xmlSampleInformation;
    }

    /**
     * Sets the value of the xmlSampleInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlSampleInformation(String value) {
        this.xmlSampleInformation = value;
    }

}
