
package uk.ac.diamond.ispyb.soapclientsample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for crystal3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="crystal3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cellA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cellAlpha" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cellB" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cellBeta" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cellC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cellGamma" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crystalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="crystalUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diffractionPlanVO" type="{http://ispyb.ejb3.webservices.collection}diffractionPlan3VO" minOccurs="0"/&gt;
 *         &lt;element name="morphology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pdbFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pdbFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proteinVO" type="{http://ispyb.ejb3.webservices.collection}protein3VO" minOccurs="0"/&gt;
 *         &lt;element name="sampleVOs" type="{http://ispyb.ejb3.webservices.collection}blSample3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sizeX" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="sizeY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="sizeZ" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="spaceGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crystal3VO", propOrder = {
    "cellA",
    "cellAlpha",
    "cellB",
    "cellBeta",
    "cellC",
    "cellGamma",
    "color",
    "comments",
    "crystalId",
    "crystalUUID",
    "diffractionPlanVO",
    "morphology",
    "name",
    "pdbFileName",
    "pdbFilePath",
    "proteinVO",
    "sampleVOs",
    "sizeX",
    "sizeY",
    "sizeZ",
    "spaceGroup"
})
public class Crystal3VO
    extends IsPyBValueObject
{

    protected Double cellA;
    protected Double cellAlpha;
    protected Double cellB;
    protected Double cellBeta;
    protected Double cellC;
    protected Double cellGamma;
    protected String color;
    protected String comments;
    protected Integer crystalId;
    protected String crystalUUID;
    protected DiffractionPlan3VO diffractionPlanVO;
    protected String morphology;
    protected String name;
    protected String pdbFileName;
    protected String pdbFilePath;
    protected Protein3VO proteinVO;
    @XmlElement(nillable = true)
    protected List<BlSample3VO> sampleVOs;
    protected Double sizeX;
    protected Double sizeY;
    protected Double sizeZ;
    protected String spaceGroup;

    /**
     * Gets the value of the cellA property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCellA() {
        return cellA;
    }

    /**
     * Sets the value of the cellA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCellA(Double value) {
        this.cellA = value;
    }

    /**
     * Gets the value of the cellAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCellAlpha() {
        return cellAlpha;
    }

    /**
     * Sets the value of the cellAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCellAlpha(Double value) {
        this.cellAlpha = value;
    }

    /**
     * Gets the value of the cellB property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCellB() {
        return cellB;
    }

    /**
     * Sets the value of the cellB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCellB(Double value) {
        this.cellB = value;
    }

    /**
     * Gets the value of the cellBeta property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCellBeta() {
        return cellBeta;
    }

    /**
     * Sets the value of the cellBeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCellBeta(Double value) {
        this.cellBeta = value;
    }

    /**
     * Gets the value of the cellC property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCellC() {
        return cellC;
    }

    /**
     * Sets the value of the cellC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCellC(Double value) {
        this.cellC = value;
    }

    /**
     * Gets the value of the cellGamma property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCellGamma() {
        return cellGamma;
    }

    /**
     * Sets the value of the cellGamma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCellGamma(Double value) {
        this.cellGamma = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
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
     * Gets the value of the crystalId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCrystalId() {
        return crystalId;
    }

    /**
     * Sets the value of the crystalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCrystalId(Integer value) {
        this.crystalId = value;
    }

    /**
     * Gets the value of the crystalUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrystalUUID() {
        return crystalUUID;
    }

    /**
     * Sets the value of the crystalUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrystalUUID(String value) {
        this.crystalUUID = value;
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
     * Gets the value of the morphology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMorphology() {
        return morphology;
    }

    /**
     * Sets the value of the morphology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMorphology(String value) {
        this.morphology = value;
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
     * Gets the value of the pdbFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdbFileName() {
        return pdbFileName;
    }

    /**
     * Sets the value of the pdbFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdbFileName(String value) {
        this.pdbFileName = value;
    }

    /**
     * Gets the value of the pdbFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdbFilePath() {
        return pdbFilePath;
    }

    /**
     * Sets the value of the pdbFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdbFilePath(String value) {
        this.pdbFilePath = value;
    }

    /**
     * Gets the value of the proteinVO property.
     * 
     * @return
     *     possible object is
     *     {@link Protein3VO }
     *     
     */
    public Protein3VO getProteinVO() {
        return proteinVO;
    }

    /**
     * Sets the value of the proteinVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protein3VO }
     *     
     */
    public void setProteinVO(Protein3VO value) {
        this.proteinVO = value;
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
     * Gets the value of the sizeX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSizeX() {
        return sizeX;
    }

    /**
     * Sets the value of the sizeX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSizeX(Double value) {
        this.sizeX = value;
    }

    /**
     * Gets the value of the sizeY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSizeY() {
        return sizeY;
    }

    /**
     * Sets the value of the sizeY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSizeY(Double value) {
        this.sizeY = value;
    }

    /**
     * Gets the value of the sizeZ property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSizeZ() {
        return sizeZ;
    }

    /**
     * Sets the value of the sizeZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSizeZ(Double value) {
        this.sizeZ = value;
    }

    /**
     * Gets the value of the spaceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpaceGroup() {
        return spaceGroup;
    }

    /**
     * Sets the value of the spaceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpaceGroup(String value) {
        this.spaceGroup = value;
    }

}
