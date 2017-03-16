
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
 * <p>Java class for session3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="session3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beamLineSetupVO" type="{http://ispyb.ejb3.webservices.collection}beamLineSetup3VO" minOccurs="0"/&gt;
 *         &lt;element name="beamlineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beamlineOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataCollectionGroupVOs" type="{http://ispyb.ejb3.webservices.collection}dataCollectionGroup3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="databackupEurope" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="databackupFrance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="dewarTransport" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="energyScanVOs" type="{http://ispyb.ejb3.webservices.collection}energyScan3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expSessionPk" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="nbShifts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="operatorSiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="projectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proposalVO" type="{http://ispyb.ejb3.webservices.collection}proposal3VO" minOccurs="0"/&gt;
 *         &lt;element name="protectedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scheduled" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="sessionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="structureDeterminations" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="usedFlag" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="visit_number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="xfeSpectrumVOs" type="{http://ispyb.ejb3.webservices.collection}xfeFluorescenceSpectrum3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "session3VO", propOrder = {
    "beamLineSetupVO",
    "beamlineName",
    "beamlineOperator",
    "comments",
    "dataCollectionGroupVOs",
    "databackupEurope",
    "databackupFrance",
    "dewarTransport",
    "endDate",
    "energyScanVOs",
    "expSessionPk",
    "externalId",
    "lastUpdate",
    "nbShifts",
    "operatorSiteNumber",
    "projectCode",
    "proposalVO",
    "protectedData",
    "scheduled",
    "sessionId",
    "sessionTitle",
    "startDate",
    "structureDeterminations",
    "timeStamp",
    "usedFlag",
    "visitNumber",
    "xfeSpectrumVOs"
})
@XmlSeeAlso({
    SessionWS3VO.class
})
public class Session3VO
    extends IsPyBValueObject
{

    protected BeamLineSetup3VO beamLineSetupVO;
    protected String beamlineName;
    protected String beamlineOperator;
    protected String comments;
    @XmlElement(nillable = true)
    protected List<DataCollectionGroup3VO> dataCollectionGroupVOs;
    protected Float databackupEurope;
    protected Float databackupFrance;
    protected Float dewarTransport;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(nillable = true)
    protected List<EnergyScan3VO> energyScanVOs;
    protected Long expSessionPk;
    protected Integer externalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;
    protected Integer nbShifts;
    protected String operatorSiteNumber;
    protected String projectCode;
    protected Proposal3VO proposalVO;
    protected String protectedData;
    protected Byte scheduled;
    protected Integer sessionId;
    protected String sessionTitle;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected Float structureDeterminations;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    protected Byte usedFlag;
    @XmlElement(name = "visit_number")
    protected Integer visitNumber;
    @XmlElement(nillable = true)
    protected List<XfeFluorescenceSpectrum3VO> xfeSpectrumVOs;

    /**
     * Gets the value of the beamLineSetupVO property.
     * 
     * @return
     *     possible object is
     *     {@link BeamLineSetup3VO }
     *     
     */
    public BeamLineSetup3VO getBeamLineSetupVO() {
        return beamLineSetupVO;
    }

    /**
     * Sets the value of the beamLineSetupVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeamLineSetup3VO }
     *     
     */
    public void setBeamLineSetupVO(BeamLineSetup3VO value) {
        this.beamLineSetupVO = value;
    }

    /**
     * Gets the value of the beamlineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeamlineName() {
        return beamlineName;
    }

    /**
     * Sets the value of the beamlineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeamlineName(String value) {
        this.beamlineName = value;
    }

    /**
     * Gets the value of the beamlineOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeamlineOperator() {
        return beamlineOperator;
    }

    /**
     * Sets the value of the beamlineOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeamlineOperator(String value) {
        this.beamlineOperator = value;
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
     * Gets the value of the dataCollectionGroupVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataCollectionGroupVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataCollectionGroupVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataCollectionGroup3VO }
     * 
     * 
     */
    public List<DataCollectionGroup3VO> getDataCollectionGroupVOs() {
        if (dataCollectionGroupVOs == null) {
            dataCollectionGroupVOs = new ArrayList<DataCollectionGroup3VO>();
        }
        return this.dataCollectionGroupVOs;
    }

    /**
     * Gets the value of the databackupEurope property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDatabackupEurope() {
        return databackupEurope;
    }

    /**
     * Sets the value of the databackupEurope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDatabackupEurope(Float value) {
        this.databackupEurope = value;
    }

    /**
     * Gets the value of the databackupFrance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDatabackupFrance() {
        return databackupFrance;
    }

    /**
     * Sets the value of the databackupFrance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDatabackupFrance(Float value) {
        this.databackupFrance = value;
    }

    /**
     * Gets the value of the dewarTransport property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDewarTransport() {
        return dewarTransport;
    }

    /**
     * Sets the value of the dewarTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDewarTransport(Float value) {
        this.dewarTransport = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the energyScanVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the energyScanVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnergyScanVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnergyScan3VO }
     * 
     * 
     */
    public List<EnergyScan3VO> getEnergyScanVOs() {
        if (energyScanVOs == null) {
            energyScanVOs = new ArrayList<EnergyScan3VO>();
        }
        return this.energyScanVOs;
    }

    /**
     * Gets the value of the expSessionPk property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpSessionPk() {
        return expSessionPk;
    }

    /**
     * Sets the value of the expSessionPk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpSessionPk(Long value) {
        this.expSessionPk = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExternalId(Integer value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the nbShifts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbShifts() {
        return nbShifts;
    }

    /**
     * Sets the value of the nbShifts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbShifts(Integer value) {
        this.nbShifts = value;
    }

    /**
     * Gets the value of the operatorSiteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorSiteNumber() {
        return operatorSiteNumber;
    }

    /**
     * Sets the value of the operatorSiteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorSiteNumber(String value) {
        this.operatorSiteNumber = value;
    }

    /**
     * Gets the value of the projectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * Sets the value of the projectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCode(String value) {
        this.projectCode = value;
    }

    /**
     * Gets the value of the proposalVO property.
     * 
     * @return
     *     possible object is
     *     {@link Proposal3VO }
     *     
     */
    public Proposal3VO getProposalVO() {
        return proposalVO;
    }

    /**
     * Sets the value of the proposalVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proposal3VO }
     *     
     */
    public void setProposalVO(Proposal3VO value) {
        this.proposalVO = value;
    }

    /**
     * Gets the value of the protectedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedData() {
        return protectedData;
    }

    /**
     * Sets the value of the protectedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedData(String value) {
        this.protectedData = value;
    }

    /**
     * Gets the value of the scheduled property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getScheduled() {
        return scheduled;
    }

    /**
     * Sets the value of the scheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setScheduled(Byte value) {
        this.scheduled = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSessionId(Integer value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the sessionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionTitle() {
        return sessionTitle;
    }

    /**
     * Sets the value of the sessionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionTitle(String value) {
        this.sessionTitle = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the structureDeterminations property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStructureDeterminations() {
        return structureDeterminations;
    }

    /**
     * Sets the value of the structureDeterminations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStructureDeterminations(Float value) {
        this.structureDeterminations = value;
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
     * Gets the value of the usedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getUsedFlag() {
        return usedFlag;
    }

    /**
     * Sets the value of the usedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setUsedFlag(Byte value) {
        this.usedFlag = value;
    }

    /**
     * Gets the value of the visitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVisitNumber() {
        return visitNumber;
    }

    /**
     * Sets the value of the visitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVisitNumber(Integer value) {
        this.visitNumber = value;
    }

    /**
     * Gets the value of the xfeSpectrumVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xfeSpectrumVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXfeSpectrumVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XfeFluorescenceSpectrum3VO }
     * 
     * 
     */
    public List<XfeFluorescenceSpectrum3VO> getXfeSpectrumVOs() {
        if (xfeSpectrumVOs == null) {
            xfeSpectrumVOs = new ArrayList<XfeFluorescenceSpectrum3VO>();
        }
        return this.xfeSpectrumVOs;
    }

}
