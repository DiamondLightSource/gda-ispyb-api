
package uk.ac.diamond.ispyb.soapclientsample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for screeningStrategy3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="screeningStrategy3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anomalous" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="completeness" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="exposureTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="multiplicity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="phiEnd" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="phiStart" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="program" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rankingResolution" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="resolution" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rotation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="screeningOutputVO" type="{http://ispyb.ejb3.webservices.collection}screeningOutput3VO" minOccurs="0"/&gt;
 *         &lt;element name="screeningStrategyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="screeningStrategyWedgeVOs" type="{http://ispyb.ejb3.webservices.collection}screeningStrategyWedge3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transmission" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screeningStrategy3VO", propOrder = {
    "anomalous",
    "completeness",
    "exposureTime",
    "multiplicity",
    "phiEnd",
    "phiStart",
    "program",
    "rankingResolution",
    "resolution",
    "rotation",
    "screeningOutputVO",
    "screeningStrategyId",
    "screeningStrategyWedgeVOs",
    "transmission"
})
public class ScreeningStrategy3VO
    extends IsPyBValueObject
{

    protected Byte anomalous;
    protected Double completeness;
    protected Double exposureTime;
    protected Double multiplicity;
    protected Double phiEnd;
    protected Double phiStart;
    protected String program;
    protected Double rankingResolution;
    protected Double resolution;
    protected Double rotation;
    protected ScreeningOutput3VO screeningOutputVO;
    protected Integer screeningStrategyId;
    @XmlElement(nillable = true)
    protected List<ScreeningStrategyWedge3VO> screeningStrategyWedgeVOs;
    protected Double transmission;

    /**
     * Gets the value of the anomalous property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getAnomalous() {
        return anomalous;
    }

    /**
     * Sets the value of the anomalous property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setAnomalous(Byte value) {
        this.anomalous = value;
    }

    /**
     * Gets the value of the completeness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCompleteness() {
        return completeness;
    }

    /**
     * Sets the value of the completeness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCompleteness(Double value) {
        this.completeness = value;
    }

    /**
     * Gets the value of the exposureTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExposureTime() {
        return exposureTime;
    }

    /**
     * Sets the value of the exposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExposureTime(Double value) {
        this.exposureTime = value;
    }

    /**
     * Gets the value of the multiplicity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMultiplicity() {
        return multiplicity;
    }

    /**
     * Sets the value of the multiplicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMultiplicity(Double value) {
        this.multiplicity = value;
    }

    /**
     * Gets the value of the phiEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPhiEnd() {
        return phiEnd;
    }

    /**
     * Sets the value of the phiEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPhiEnd(Double value) {
        this.phiEnd = value;
    }

    /**
     * Gets the value of the phiStart property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPhiStart() {
        return phiStart;
    }

    /**
     * Sets the value of the phiStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPhiStart(Double value) {
        this.phiStart = value;
    }

    /**
     * Gets the value of the program property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgram() {
        return program;
    }

    /**
     * Sets the value of the program property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgram(String value) {
        this.program = value;
    }

    /**
     * Gets the value of the rankingResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRankingResolution() {
        return rankingResolution;
    }

    /**
     * Sets the value of the rankingResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRankingResolution(Double value) {
        this.rankingResolution = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setResolution(Double value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the rotation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRotation() {
        return rotation;
    }

    /**
     * Sets the value of the rotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRotation(Double value) {
        this.rotation = value;
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
     * Gets the value of the screeningStrategyId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScreeningStrategyId() {
        return screeningStrategyId;
    }

    /**
     * Sets the value of the screeningStrategyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScreeningStrategyId(Integer value) {
        this.screeningStrategyId = value;
    }

    /**
     * Gets the value of the screeningStrategyWedgeVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screeningStrategyWedgeVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreeningStrategyWedgeVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningStrategyWedge3VO }
     * 
     * 
     */
    public List<ScreeningStrategyWedge3VO> getScreeningStrategyWedgeVOs() {
        if (screeningStrategyWedgeVOs == null) {
            screeningStrategyWedgeVOs = new ArrayList<ScreeningStrategyWedge3VO>();
        }
        return this.screeningStrategyWedgeVOs;
    }

    /**
     * Gets the value of the transmission property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransmission() {
        return transmission;
    }

    /**
     * Sets the value of the transmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransmission(Double value) {
        this.transmission = value;
    }

}
