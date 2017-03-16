
package uk.ac.diamond.ispyb.soapclientsample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for blSample3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="blSample3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blSampleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="blSampleStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blSubSampleVOs" type="{http://ispyb.ejb3.webservices.collection}blSubSample3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="completionStage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="containerVO" type="{http://ispyb.ejb3.webservices.collection}container3VO" minOccurs="0"/&gt;
 *         &lt;element name="crystalVO" type="{http://ispyb.ejb3.webservices.collection}crystal3VO" minOccurs="0"/&gt;
 *         &lt;element name="diffractionPlanVO" type="{http://ispyb.ejb3.webservices.collection}diffractionPlan3VO" minOccurs="0"/&gt;
 *         &lt;element name="energyScanVOs" type="{http://ispyb.ejb3.webservices.collection}energyScan3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="holderLength" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="isInSampleChanger" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="lastImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastKnownCenteringPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loopLength" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="loopType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publicationComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publicationStage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="structureStage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wireWidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blSample3VO", propOrder = {
    "blSampleId",
    "blSampleStatus",
    "blSubSampleVOs",
    "code",
    "comments",
    "completionStage",
    "containerVO",
    "crystalVO",
    "diffractionPlanVO",
    "energyScanVOs",
    "holderLength",
    "isInSampleChanger",
    "lastImageURL",
    "lastKnownCenteringPosition",
    "location",
    "loopLength",
    "loopType",
    "name",
    "publicationComments",
    "publicationStage",
    "smiles",
    "structureStage",
    "wireWidth"
})
@XmlSeeAlso({
    BlSampleWS3VO.class
})
public class BlSample3VO
    extends IsPyBValueObject
{

    protected Integer blSampleId;
    protected String blSampleStatus;
    @XmlElement(nillable = true)
    protected List<BlSubSample3VO> blSubSampleVOs;
    protected String code;
    protected String comments;
    protected String completionStage;
    protected Container3VO containerVO;
    protected Crystal3VO crystalVO;
    protected DiffractionPlan3VO diffractionPlanVO;
    @XmlElement(nillable = true)
    protected List<EnergyScan3VO> energyScanVOs;
    protected Double holderLength;
    protected Byte isInSampleChanger;
    protected String lastImageURL;
    protected String lastKnownCenteringPosition;
    protected String location;
    protected Double loopLength;
    protected String loopType;
    protected String name;
    protected String publicationComments;
    protected String publicationStage;
    protected String smiles;
    protected String structureStage;
    protected Double wireWidth;

    /**
     * Gets the value of the blSampleId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlSampleId() {
        return blSampleId;
    }

    /**
     * Sets the value of the blSampleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlSampleId(Integer value) {
        this.blSampleId = value;
    }

    /**
     * Gets the value of the blSampleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlSampleStatus() {
        return blSampleStatus;
    }

    /**
     * Sets the value of the blSampleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlSampleStatus(String value) {
        this.blSampleStatus = value;
    }

    /**
     * Gets the value of the blSubSampleVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blSubSampleVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlSubSampleVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlSubSample3VO }
     * 
     * 
     */
    public List<BlSubSample3VO> getBlSubSampleVOs() {
        if (blSubSampleVOs == null) {
            blSubSampleVOs = new ArrayList<BlSubSample3VO>();
        }
        return this.blSubSampleVOs;
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
     * Gets the value of the completionStage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletionStage() {
        return completionStage;
    }

    /**
     * Sets the value of the completionStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletionStage(String value) {
        this.completionStage = value;
    }

    /**
     * Gets the value of the containerVO property.
     * 
     * @return
     *     possible object is
     *     {@link Container3VO }
     *     
     */
    public Container3VO getContainerVO() {
        return containerVO;
    }

    /**
     * Sets the value of the containerVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Container3VO }
     *     
     */
    public void setContainerVO(Container3VO value) {
        this.containerVO = value;
    }

    /**
     * Gets the value of the crystalVO property.
     * 
     * @return
     *     possible object is
     *     {@link Crystal3VO }
     *     
     */
    public Crystal3VO getCrystalVO() {
        return crystalVO;
    }

    /**
     * Sets the value of the crystalVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Crystal3VO }
     *     
     */
    public void setCrystalVO(Crystal3VO value) {
        this.crystalVO = value;
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
     * Gets the value of the holderLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHolderLength() {
        return holderLength;
    }

    /**
     * Sets the value of the holderLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHolderLength(Double value) {
        this.holderLength = value;
    }

    /**
     * Gets the value of the isInSampleChanger property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getIsInSampleChanger() {
        return isInSampleChanger;
    }

    /**
     * Sets the value of the isInSampleChanger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setIsInSampleChanger(Byte value) {
        this.isInSampleChanger = value;
    }

    /**
     * Gets the value of the lastImageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastImageURL() {
        return lastImageURL;
    }

    /**
     * Sets the value of the lastImageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastImageURL(String value) {
        this.lastImageURL = value;
    }

    /**
     * Gets the value of the lastKnownCenteringPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastKnownCenteringPosition() {
        return lastKnownCenteringPosition;
    }

    /**
     * Sets the value of the lastKnownCenteringPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastKnownCenteringPosition(String value) {
        this.lastKnownCenteringPosition = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the loopLength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLoopLength() {
        return loopLength;
    }

    /**
     * Sets the value of the loopLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLoopLength(Double value) {
        this.loopLength = value;
    }

    /**
     * Gets the value of the loopType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoopType() {
        return loopType;
    }

    /**
     * Sets the value of the loopType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoopType(String value) {
        this.loopType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the publicationComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationComments() {
        return publicationComments;
    }

    /**
     * Sets the value of the publicationComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationComments(String value) {
        this.publicationComments = value;
    }

    /**
     * Gets the value of the publicationStage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationStage() {
        return publicationStage;
    }

    /**
     * Sets the value of the publicationStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationStage(String value) {
        this.publicationStage = value;
    }

    /**
     * Gets the value of the smiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmiles() {
        return smiles;
    }

    /**
     * Sets the value of the smiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmiles(String value) {
        this.smiles = value;
    }

    /**
     * Gets the value of the structureStage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructureStage() {
        return structureStage;
    }

    /**
     * Sets the value of the structureStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructureStage(String value) {
        this.structureStage = value;
    }

    /**
     * Gets the value of the wireWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWireWidth() {
        return wireWidth;
    }

    /**
     * Sets the value of the wireWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWireWidth(Double value) {
        this.wireWidth = value;
    }

}
