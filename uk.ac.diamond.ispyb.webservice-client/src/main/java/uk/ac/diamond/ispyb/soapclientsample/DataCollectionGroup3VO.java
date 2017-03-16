
package uk.ac.diamond.ispyb.soapclientsample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dataCollectionGroup3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataCollectionGroup3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actualContainerBarcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actualContainerSlotInSC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="actualSampleBarcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actualSampleSlotInContainer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="blSampleVO" type="{http://ispyb.ejb3.webservices.collection}blSample3VO" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crystalClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataCollectionGroupId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dataCollectionVOs" type="{http://ispyb.ejb3.webservices.collection}dataCollection3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="detectorMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="experimentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screeningVOs" type="{http://ispyb.ejb3.webservices.collection}screening3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sessionVO" type="{http://ispyb.ejb3.webservices.collection}session3VO" minOccurs="0"/&gt;
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="workflowVO" type="{http://ispyb.ejb3.webservices.collection}workflow3VO" minOccurs="0"/&gt;
 *         &lt;element name="xtalSnapshotFullPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataCollectionGroup3VO", propOrder = {
    "actualContainerBarcode",
    "actualContainerSlotInSC",
    "actualSampleBarcode",
    "actualSampleSlotInContainer",
    "blSampleVO",
    "comments",
    "crystalClass",
    "dataCollectionGroupId",
    "dataCollectionVOs",
    "detectorMode",
    "endTime",
    "experimentType",
    "screeningVOs",
    "sessionVO",
    "startTime",
    "workflowVO",
    "xtalSnapshotFullPath"
})
@XmlSeeAlso({
    DataCollectionGroupWS3VO.class
})
public class DataCollectionGroup3VO
    extends IsPyBValueObject
{

    protected String actualContainerBarcode;
    protected Integer actualContainerSlotInSC;
    protected String actualSampleBarcode;
    protected Integer actualSampleSlotInContainer;
    protected BlSample3VO blSampleVO;
    protected String comments;
    protected String crystalClass;
    protected Integer dataCollectionGroupId;
    @XmlElement(nillable = true)
    protected List<DataCollection3VO> dataCollectionVOs;
    protected String detectorMode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    protected String experimentType;
    @XmlElement(nillable = true)
    protected List<Screening3VO> screeningVOs;
    protected Session3VO sessionVO;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    protected Workflow3VO workflowVO;
    protected String xtalSnapshotFullPath;

    /**
     * Gets the value of the actualContainerBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualContainerBarcode() {
        return actualContainerBarcode;
    }

    /**
     * Sets the value of the actualContainerBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualContainerBarcode(String value) {
        this.actualContainerBarcode = value;
    }

    /**
     * Gets the value of the actualContainerSlotInSC property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActualContainerSlotInSC() {
        return actualContainerSlotInSC;
    }

    /**
     * Sets the value of the actualContainerSlotInSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActualContainerSlotInSC(Integer value) {
        this.actualContainerSlotInSC = value;
    }

    /**
     * Gets the value of the actualSampleBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualSampleBarcode() {
        return actualSampleBarcode;
    }

    /**
     * Sets the value of the actualSampleBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualSampleBarcode(String value) {
        this.actualSampleBarcode = value;
    }

    /**
     * Gets the value of the actualSampleSlotInContainer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActualSampleSlotInContainer() {
        return actualSampleSlotInContainer;
    }

    /**
     * Sets the value of the actualSampleSlotInContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActualSampleSlotInContainer(Integer value) {
        this.actualSampleSlotInContainer = value;
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
     * Gets the value of the crystalClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrystalClass() {
        return crystalClass;
    }

    /**
     * Sets the value of the crystalClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrystalClass(String value) {
        this.crystalClass = value;
    }

    /**
     * Gets the value of the dataCollectionGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataCollectionGroupId() {
        return dataCollectionGroupId;
    }

    /**
     * Sets the value of the dataCollectionGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataCollectionGroupId(Integer value) {
        this.dataCollectionGroupId = value;
    }

    /**
     * Gets the value of the dataCollectionVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataCollectionVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataCollectionVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataCollection3VO }
     * 
     * 
     */
    public List<DataCollection3VO> getDataCollectionVOs() {
        if (dataCollectionVOs == null) {
            dataCollectionVOs = new ArrayList<DataCollection3VO>();
        }
        return this.dataCollectionVOs;
    }

    /**
     * Gets the value of the detectorMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectorMode() {
        return detectorMode;
    }

    /**
     * Sets the value of the detectorMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectorMode(String value) {
        this.detectorMode = value;
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
     * Gets the value of the experimentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperimentType() {
        return experimentType;
    }

    /**
     * Sets the value of the experimentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperimentType(String value) {
        this.experimentType = value;
    }

    /**
     * Gets the value of the screeningVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screeningVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreeningVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Screening3VO }
     * 
     * 
     */
    public List<Screening3VO> getScreeningVOs() {
        if (screeningVOs == null) {
            screeningVOs = new ArrayList<Screening3VO>();
        }
        return this.screeningVOs;
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

    /**
     * Gets the value of the xtalSnapshotFullPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtalSnapshotFullPath() {
        return xtalSnapshotFullPath;
    }

    /**
     * Sets the value of the xtalSnapshotFullPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtalSnapshotFullPath(String value) {
        this.xtalSnapshotFullPath = value;
    }

}
