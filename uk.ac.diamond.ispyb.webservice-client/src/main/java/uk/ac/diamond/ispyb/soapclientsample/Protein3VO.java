
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
 * <p>Java class for protein3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protein3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acronym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crystalVOs" type="{http://ispyb.ejb3.webservices.collection}crystal3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isCreatedBySampleSheet" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="molecularMass" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="proposalVO" type="{http://ispyb.ejb3.webservices.collection}proposal3VO" minOccurs="0"/&gt;
 *         &lt;element name="proteinId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="proteinType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="safetyLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "protein3VO", propOrder = {
    "acronym",
    "crystalVOs",
    "externalId",
    "isCreatedBySampleSheet",
    "molecularMass",
    "name",
    "personId",
    "proposalVO",
    "proteinId",
    "proteinType",
    "safetyLevel",
    "sequence",
    "timeStamp"
})
public class Protein3VO
    extends IsPyBValueObject
{

    protected String acronym;
    @XmlElement(nillable = true)
    protected List<Crystal3VO> crystalVOs;
    protected Integer externalId;
    protected Byte isCreatedBySampleSheet;
    protected Double molecularMass;
    protected String name;
    protected Integer personId;
    protected Proposal3VO proposalVO;
    protected Integer proteinId;
    protected String proteinType;
    protected String safetyLevel;
    protected String sequence;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the acronym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcronym() {
        return acronym;
    }

    /**
     * Sets the value of the acronym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcronym(String value) {
        this.acronym = value;
    }

    /**
     * Gets the value of the crystalVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crystalVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrystalVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Crystal3VO }
     * 
     * 
     */
    public List<Crystal3VO> getCrystalVOs() {
        if (crystalVOs == null) {
            crystalVOs = new ArrayList<Crystal3VO>();
        }
        return this.crystalVOs;
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
     * Gets the value of the isCreatedBySampleSheet property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getIsCreatedBySampleSheet() {
        return isCreatedBySampleSheet;
    }

    /**
     * Sets the value of the isCreatedBySampleSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setIsCreatedBySampleSheet(Byte value) {
        this.isCreatedBySampleSheet = value;
    }

    /**
     * Gets the value of the molecularMass property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMolecularMass() {
        return molecularMass;
    }

    /**
     * Sets the value of the molecularMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMolecularMass(Double value) {
        this.molecularMass = value;
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
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersonId(Integer value) {
        this.personId = value;
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
     * Gets the value of the proteinId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProteinId() {
        return proteinId;
    }

    /**
     * Sets the value of the proteinId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProteinId(Integer value) {
        this.proteinId = value;
    }

    /**
     * Gets the value of the proteinType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProteinType() {
        return proteinType;
    }

    /**
     * Sets the value of the proteinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProteinType(String value) {
        this.proteinType = value;
    }

    /**
     * Gets the value of the safetyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafetyLevel() {
        return safetyLevel;
    }

    /**
     * Sets the value of the safetyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafetyLevel(String value) {
        this.safetyLevel = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
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
