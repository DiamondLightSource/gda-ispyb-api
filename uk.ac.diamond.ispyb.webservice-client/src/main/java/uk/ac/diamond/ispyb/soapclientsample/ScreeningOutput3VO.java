
package uk.ac.diamond.ispyb.soapclientsample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for screeningOutput3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="screeningOutput3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beamShiftX" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="beamShiftY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="diffractionRings" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="doseTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="indexingSuccess" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="ioverSigma" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="mosaicity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="mosaicityEstimated" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="numSpotsFound" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numSpotsRejected" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numSpotsUsed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="program" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rankingResolution" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rejectedReflections" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="resolutionObtained" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="screeningOutputId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="screeningOutputLatticeVOs" type="{http://ispyb.ejb3.webservices.collection}screeningOutputLattice3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="screeningStrategyVOs" type="{http://ispyb.ejb3.webservices.collection}screeningStrategy3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="screeningVO" type="{http://ispyb.ejb3.webservices.collection}screening3VO" minOccurs="0"/&gt;
 *         &lt;element name="spotDeviationR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="spotDeviationTheta" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="statusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strategySuccess" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="totalExposureTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalNumberOfImages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="totalRotationRange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="rFriedel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screeningOutput3VO", propOrder = {
    "beamShiftX",
    "beamShiftY",
    "diffractionRings",
    "doseTotal",
    "indexingSuccess",
    "ioverSigma",
    "mosaicity",
    "mosaicityEstimated",
    "numSpotsFound",
    "numSpotsRejected",
    "numSpotsUsed",
    "program",
    "rankingResolution",
    "rejectedReflections",
    "resolutionObtained",
    "screeningOutputId",
    "screeningOutputLatticeVOs",
    "screeningStrategyVOs",
    "screeningVO",
    "spotDeviationR",
    "spotDeviationTheta",
    "statusDescription",
    "strategySuccess",
    "totalExposureTime",
    "totalNumberOfImages",
    "totalRotationRange",
    "rFriedel"
})
public class ScreeningOutput3VO
    extends IsPyBValueObject
{

    protected Double beamShiftX;
    protected Double beamShiftY;
    protected Byte diffractionRings;
    protected Double doseTotal;
    protected Byte indexingSuccess;
    protected Double ioverSigma;
    protected Double mosaicity;
    protected Byte mosaicityEstimated;
    protected Integer numSpotsFound;
    protected Integer numSpotsRejected;
    protected Integer numSpotsUsed;
    protected String program;
    protected Double rankingResolution;
    protected Integer rejectedReflections;
    protected Double resolutionObtained;
    protected Integer screeningOutputId;
    @XmlElement(nillable = true)
    protected List<ScreeningOutputLattice3VO> screeningOutputLatticeVOs;
    @XmlElement(nillable = true)
    protected List<ScreeningStrategy3VO> screeningStrategyVOs;
    protected Screening3VO screeningVO;
    protected Double spotDeviationR;
    protected Double spotDeviationTheta;
    protected String statusDescription;
    protected Byte strategySuccess;
    protected Double totalExposureTime;
    protected Integer totalNumberOfImages;
    protected Double totalRotationRange;
    protected Double rFriedel;

    /**
     * Gets the value of the beamShiftX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBeamShiftX() {
        return beamShiftX;
    }

    /**
     * Sets the value of the beamShiftX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBeamShiftX(Double value) {
        this.beamShiftX = value;
    }

    /**
     * Gets the value of the beamShiftY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBeamShiftY() {
        return beamShiftY;
    }

    /**
     * Sets the value of the beamShiftY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBeamShiftY(Double value) {
        this.beamShiftY = value;
    }

    /**
     * Gets the value of the diffractionRings property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getDiffractionRings() {
        return diffractionRings;
    }

    /**
     * Sets the value of the diffractionRings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setDiffractionRings(Byte value) {
        this.diffractionRings = value;
    }

    /**
     * Gets the value of the doseTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDoseTotal() {
        return doseTotal;
    }

    /**
     * Sets the value of the doseTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDoseTotal(Double value) {
        this.doseTotal = value;
    }

    /**
     * Gets the value of the indexingSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getIndexingSuccess() {
        return indexingSuccess;
    }

    /**
     * Sets the value of the indexingSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setIndexingSuccess(Byte value) {
        this.indexingSuccess = value;
    }

    /**
     * Gets the value of the ioverSigma property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIoverSigma() {
        return ioverSigma;
    }

    /**
     * Sets the value of the ioverSigma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIoverSigma(Double value) {
        this.ioverSigma = value;
    }

    /**
     * Gets the value of the mosaicity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMosaicity() {
        return mosaicity;
    }

    /**
     * Sets the value of the mosaicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMosaicity(Double value) {
        this.mosaicity = value;
    }

    /**
     * Gets the value of the mosaicityEstimated property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getMosaicityEstimated() {
        return mosaicityEstimated;
    }

    /**
     * Sets the value of the mosaicityEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setMosaicityEstimated(Byte value) {
        this.mosaicityEstimated = value;
    }

    /**
     * Gets the value of the numSpotsFound property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumSpotsFound() {
        return numSpotsFound;
    }

    /**
     * Sets the value of the numSpotsFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumSpotsFound(Integer value) {
        this.numSpotsFound = value;
    }

    /**
     * Gets the value of the numSpotsRejected property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumSpotsRejected() {
        return numSpotsRejected;
    }

    /**
     * Sets the value of the numSpotsRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumSpotsRejected(Integer value) {
        this.numSpotsRejected = value;
    }

    /**
     * Gets the value of the numSpotsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumSpotsUsed() {
        return numSpotsUsed;
    }

    /**
     * Sets the value of the numSpotsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumSpotsUsed(Integer value) {
        this.numSpotsUsed = value;
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
     * Gets the value of the rejectedReflections property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRejectedReflections() {
        return rejectedReflections;
    }

    /**
     * Sets the value of the rejectedReflections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRejectedReflections(Integer value) {
        this.rejectedReflections = value;
    }

    /**
     * Gets the value of the resolutionObtained property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getResolutionObtained() {
        return resolutionObtained;
    }

    /**
     * Sets the value of the resolutionObtained property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setResolutionObtained(Double value) {
        this.resolutionObtained = value;
    }

    /**
     * Gets the value of the screeningOutputId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScreeningOutputId() {
        return screeningOutputId;
    }

    /**
     * Sets the value of the screeningOutputId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScreeningOutputId(Integer value) {
        this.screeningOutputId = value;
    }

    /**
     * Gets the value of the screeningOutputLatticeVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screeningOutputLatticeVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreeningOutputLatticeVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningOutputLattice3VO }
     * 
     * 
     */
    public List<ScreeningOutputLattice3VO> getScreeningOutputLatticeVOs() {
        if (screeningOutputLatticeVOs == null) {
            screeningOutputLatticeVOs = new ArrayList<ScreeningOutputLattice3VO>();
        }
        return this.screeningOutputLatticeVOs;
    }

    /**
     * Gets the value of the screeningStrategyVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screeningStrategyVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreeningStrategyVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningStrategy3VO }
     * 
     * 
     */
    public List<ScreeningStrategy3VO> getScreeningStrategyVOs() {
        if (screeningStrategyVOs == null) {
            screeningStrategyVOs = new ArrayList<ScreeningStrategy3VO>();
        }
        return this.screeningStrategyVOs;
    }

    /**
     * Gets the value of the screeningVO property.
     * 
     * @return
     *     possible object is
     *     {@link Screening3VO }
     *     
     */
    public Screening3VO getScreeningVO() {
        return screeningVO;
    }

    /**
     * Sets the value of the screeningVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Screening3VO }
     *     
     */
    public void setScreeningVO(Screening3VO value) {
        this.screeningVO = value;
    }

    /**
     * Gets the value of the spotDeviationR property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpotDeviationR() {
        return spotDeviationR;
    }

    /**
     * Sets the value of the spotDeviationR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpotDeviationR(Double value) {
        this.spotDeviationR = value;
    }

    /**
     * Gets the value of the spotDeviationTheta property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpotDeviationTheta() {
        return spotDeviationTheta;
    }

    /**
     * Sets the value of the spotDeviationTheta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpotDeviationTheta(Double value) {
        this.spotDeviationTheta = value;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the strategySuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getStrategySuccess() {
        return strategySuccess;
    }

    /**
     * Sets the value of the strategySuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setStrategySuccess(Byte value) {
        this.strategySuccess = value;
    }

    /**
     * Gets the value of the totalExposureTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalExposureTime() {
        return totalExposureTime;
    }

    /**
     * Sets the value of the totalExposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalExposureTime(Double value) {
        this.totalExposureTime = value;
    }

    /**
     * Gets the value of the totalNumberOfImages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberOfImages() {
        return totalNumberOfImages;
    }

    /**
     * Sets the value of the totalNumberOfImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberOfImages(Integer value) {
        this.totalNumberOfImages = value;
    }

    /**
     * Gets the value of the totalRotationRange property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalRotationRange() {
        return totalRotationRange;
    }

    /**
     * Sets the value of the totalRotationRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalRotationRange(Double value) {
        this.totalRotationRange = value;
    }

    /**
     * Gets the value of the rFriedel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRFriedel() {
        return rFriedel;
    }

    /**
     * Sets the value of the rFriedel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRFriedel(Double value) {
        this.rFriedel = value;
    }

}
