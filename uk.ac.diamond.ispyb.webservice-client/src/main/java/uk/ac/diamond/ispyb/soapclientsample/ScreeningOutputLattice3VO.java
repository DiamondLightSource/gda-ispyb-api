
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for screeningOutputLattice3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="screeningOutputLattice3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bravaisLattice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="labelitIndexing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="pointGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rawOrientationMatrix_a_x" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rawOrientationMatrix_a_y" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rawOrientationMatrix_a_z" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rawOrientationMatrix_b_x" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rawOrientationMatrix_b_y" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rawOrientationMatrix_b_z" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rawOrientationMatrix_c_x" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rawOrientationMatrix_c_y" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rawOrientationMatrix_c_z" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="screeningOutputLatticeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="screeningOutputVO" type="{http://ispyb.ejb3.webservices.collection}screeningOutput3VO" minOccurs="0"/&gt;
 *         &lt;element name="spaceGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="unitCell_a" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="unitCell_alpha" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="unitCell_b" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="unitCell_beta" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="unitCell_c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="unitCell_gamma" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screeningOutputLattice3VO", propOrder = {
    "bravaisLattice",
    "labelitIndexing",
    "pointGroup",
    "rawOrientationMatrixAX",
    "rawOrientationMatrixAY",
    "rawOrientationMatrixAZ",
    "rawOrientationMatrixBX",
    "rawOrientationMatrixBY",
    "rawOrientationMatrixBZ",
    "rawOrientationMatrixCX",
    "rawOrientationMatrixCY",
    "rawOrientationMatrixCZ",
    "screeningOutputLatticeId",
    "screeningOutputVO",
    "spaceGroup",
    "timeStamp",
    "unitCellA",
    "unitCellAlpha",
    "unitCellB",
    "unitCellBeta",
    "unitCellC",
    "unitCellGamma"
})
public class ScreeningOutputLattice3VO
    extends IsPyBValueObject
{

    protected String bravaisLattice;
    protected Boolean labelitIndexing;
    protected String pointGroup;
    @XmlElement(name = "rawOrientationMatrix_a_x")
    protected Double rawOrientationMatrixAX;
    @XmlElement(name = "rawOrientationMatrix_a_y")
    protected Double rawOrientationMatrixAY;
    @XmlElement(name = "rawOrientationMatrix_a_z")
    protected Double rawOrientationMatrixAZ;
    @XmlElement(name = "rawOrientationMatrix_b_x")
    protected Double rawOrientationMatrixBX;
    @XmlElement(name = "rawOrientationMatrix_b_y")
    protected Double rawOrientationMatrixBY;
    @XmlElement(name = "rawOrientationMatrix_b_z")
    protected Double rawOrientationMatrixBZ;
    @XmlElement(name = "rawOrientationMatrix_c_x")
    protected Double rawOrientationMatrixCX;
    @XmlElement(name = "rawOrientationMatrix_c_y")
    protected Double rawOrientationMatrixCY;
    @XmlElement(name = "rawOrientationMatrix_c_z")
    protected Double rawOrientationMatrixCZ;
    protected Integer screeningOutputLatticeId;
    protected ScreeningOutput3VO screeningOutputVO;
    protected String spaceGroup;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlElement(name = "unitCell_a")
    protected Double unitCellA;
    @XmlElement(name = "unitCell_alpha")
    protected Double unitCellAlpha;
    @XmlElement(name = "unitCell_b")
    protected Double unitCellB;
    @XmlElement(name = "unitCell_beta")
    protected Double unitCellBeta;
    @XmlElement(name = "unitCell_c")
    protected Double unitCellC;
    @XmlElement(name = "unitCell_gamma")
    protected Double unitCellGamma;

    /**
     * Gets the value of the bravaisLattice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBravaisLattice() {
        return bravaisLattice;
    }

    /**
     * Sets the value of the bravaisLattice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBravaisLattice(String value) {
        this.bravaisLattice = value;
    }

    /**
     * Gets the value of the labelitIndexing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLabelitIndexing() {
        return labelitIndexing;
    }

    /**
     * Sets the value of the labelitIndexing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLabelitIndexing(Boolean value) {
        this.labelitIndexing = value;
    }

    /**
     * Gets the value of the pointGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointGroup() {
        return pointGroup;
    }

    /**
     * Sets the value of the pointGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointGroup(String value) {
        this.pointGroup = value;
    }

    /**
     * Gets the value of the rawOrientationMatrixAX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRawOrientationMatrixAX() {
        return rawOrientationMatrixAX;
    }

    /**
     * Sets the value of the rawOrientationMatrixAX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRawOrientationMatrixAX(Double value) {
        this.rawOrientationMatrixAX = value;
    }

    /**
     * Gets the value of the rawOrientationMatrixAY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRawOrientationMatrixAY() {
        return rawOrientationMatrixAY;
    }

    /**
     * Sets the value of the rawOrientationMatrixAY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRawOrientationMatrixAY(Double value) {
        this.rawOrientationMatrixAY = value;
    }

    /**
     * Gets the value of the rawOrientationMatrixAZ property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRawOrientationMatrixAZ() {
        return rawOrientationMatrixAZ;
    }

    /**
     * Sets the value of the rawOrientationMatrixAZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRawOrientationMatrixAZ(Double value) {
        this.rawOrientationMatrixAZ = value;
    }

    /**
     * Gets the value of the rawOrientationMatrixBX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRawOrientationMatrixBX() {
        return rawOrientationMatrixBX;
    }

    /**
     * Sets the value of the rawOrientationMatrixBX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRawOrientationMatrixBX(Double value) {
        this.rawOrientationMatrixBX = value;
    }

    /**
     * Gets the value of the rawOrientationMatrixBY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRawOrientationMatrixBY() {
        return rawOrientationMatrixBY;
    }

    /**
     * Sets the value of the rawOrientationMatrixBY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRawOrientationMatrixBY(Double value) {
        this.rawOrientationMatrixBY = value;
    }

    /**
     * Gets the value of the rawOrientationMatrixBZ property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRawOrientationMatrixBZ() {
        return rawOrientationMatrixBZ;
    }

    /**
     * Sets the value of the rawOrientationMatrixBZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRawOrientationMatrixBZ(Double value) {
        this.rawOrientationMatrixBZ = value;
    }

    /**
     * Gets the value of the rawOrientationMatrixCX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRawOrientationMatrixCX() {
        return rawOrientationMatrixCX;
    }

    /**
     * Sets the value of the rawOrientationMatrixCX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRawOrientationMatrixCX(Double value) {
        this.rawOrientationMatrixCX = value;
    }

    /**
     * Gets the value of the rawOrientationMatrixCY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRawOrientationMatrixCY() {
        return rawOrientationMatrixCY;
    }

    /**
     * Sets the value of the rawOrientationMatrixCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRawOrientationMatrixCY(Double value) {
        this.rawOrientationMatrixCY = value;
    }

    /**
     * Gets the value of the rawOrientationMatrixCZ property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRawOrientationMatrixCZ() {
        return rawOrientationMatrixCZ;
    }

    /**
     * Sets the value of the rawOrientationMatrixCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRawOrientationMatrixCZ(Double value) {
        this.rawOrientationMatrixCZ = value;
    }

    /**
     * Gets the value of the screeningOutputLatticeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScreeningOutputLatticeId() {
        return screeningOutputLatticeId;
    }

    /**
     * Sets the value of the screeningOutputLatticeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScreeningOutputLatticeId(Integer value) {
        this.screeningOutputLatticeId = value;
    }

    /**
     * Gets the value of the screeningOutputVO property.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningOutput3VO }
     *     
     */
    public ScreeningOutput3VO getScreeningOutputVO() {
        return screeningOutputVO;
    }

    /**
     * Sets the value of the screeningOutputVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningOutput3VO }
     *     
     */
    public void setScreeningOutputVO(ScreeningOutput3VO value) {
        this.screeningOutputVO = value;
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
     * Gets the value of the unitCellA property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitCellA() {
        return unitCellA;
    }

    /**
     * Sets the value of the unitCellA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitCellA(Double value) {
        this.unitCellA = value;
    }

    /**
     * Gets the value of the unitCellAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitCellAlpha() {
        return unitCellAlpha;
    }

    /**
     * Sets the value of the unitCellAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitCellAlpha(Double value) {
        this.unitCellAlpha = value;
    }

    /**
     * Gets the value of the unitCellB property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitCellB() {
        return unitCellB;
    }

    /**
     * Sets the value of the unitCellB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitCellB(Double value) {
        this.unitCellB = value;
    }

    /**
     * Gets the value of the unitCellBeta property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitCellBeta() {
        return unitCellBeta;
    }

    /**
     * Sets the value of the unitCellBeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitCellBeta(Double value) {
        this.unitCellBeta = value;
    }

    /**
     * Gets the value of the unitCellC property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitCellC() {
        return unitCellC;
    }

    /**
     * Sets the value of the unitCellC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitCellC(Double value) {
        this.unitCellC = value;
    }

    /**
     * Gets the value of the unitCellGamma property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitCellGamma() {
        return unitCellGamma;
    }

    /**
     * Sets the value of the unitCellGamma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitCellGamma(Double value) {
        this.unitCellGamma = value;
    }

}
