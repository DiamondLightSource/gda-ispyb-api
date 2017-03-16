
package uk.ac.diamond.ispyb.soapclientsample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diffractionPlan3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diffractionPlan3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aimedCompleteness" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="aimedIOverSigmaAtHighestRes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="aimedMultiplicity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="aimedResolution" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="anomalousData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="anomalousScatterer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="complexity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diffractionPlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="estimateRadiationDamage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="experimentKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="experimentKindVOs" type="{http://ispyb.ejb3.webservices.collection}experimentKindDetails3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="exposureTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="forcedSpaceGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kappaStrategyOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxDimAccrossSpindleAxis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="maximalResolution" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minDimAccrossSpindleAxis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minOscWidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minimalResolution" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="numberOfPositions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="observedResolution" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="oscillationRange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="preferredBeamDiameter" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="preferredBeamSizeX" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="preferredBeamSizeY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="radiationSensitivity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="radiationSensitivityBeta" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="radiationSensitivityGamma" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="requiredCompleteness" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="requiredMultiplicity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="requiredResolution" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="screeningResolution" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="strategyOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diffractionPlan3VO", propOrder = {
    "aimedCompleteness",
    "aimedIOverSigmaAtHighestRes",
    "aimedMultiplicity",
    "aimedResolution",
    "anomalousData",
    "anomalousScatterer",
    "comments",
    "complexity",
    "diffractionPlanId",
    "estimateRadiationDamage",
    "experimentKind",
    "experimentKindVOs",
    "exposureTime",
    "forcedSpaceGroup",
    "kappaStrategyOption",
    "maxDimAccrossSpindleAxis",
    "maximalResolution",
    "minDimAccrossSpindleAxis",
    "minOscWidth",
    "minimalResolution",
    "numberOfPositions",
    "observedResolution",
    "oscillationRange",
    "preferredBeamDiameter",
    "preferredBeamSizeX",
    "preferredBeamSizeY",
    "radiationSensitivity",
    "radiationSensitivityBeta",
    "radiationSensitivityGamma",
    "requiredCompleteness",
    "requiredMultiplicity",
    "requiredResolution",
    "screeningResolution",
    "strategyOption"
})
public class DiffractionPlan3VO
    extends IsPyBValueObject
{

    protected Double aimedCompleteness;
    protected Double aimedIOverSigmaAtHighestRes;
    protected Double aimedMultiplicity;
    protected Double aimedResolution;
    protected Boolean anomalousData;
    protected String anomalousScatterer;
    protected String comments;
    protected String complexity;
    protected Integer diffractionPlanId;
    protected Boolean estimateRadiationDamage;
    protected String experimentKind;
    @XmlElement(nillable = true)
    protected List<ExperimentKindDetails3VO> experimentKindVOs;
    protected Double exposureTime;
    protected String forcedSpaceGroup;
    protected String kappaStrategyOption;
    protected Double maxDimAccrossSpindleAxis;
    protected Double maximalResolution;
    protected Double minDimAccrossSpindleAxis;
    protected Double minOscWidth;
    protected Double minimalResolution;
    protected Integer numberOfPositions;
    protected Double observedResolution;
    protected Double oscillationRange;
    protected Double preferredBeamDiameter;
    protected Double preferredBeamSizeX;
    protected Double preferredBeamSizeY;
    protected Double radiationSensitivity;
    protected Double radiationSensitivityBeta;
    protected Double radiationSensitivityGamma;
    protected Double requiredCompleteness;
    protected Double requiredMultiplicity;
    protected Double requiredResolution;
    protected Double screeningResolution;
    protected String strategyOption;

    /**
     * Gets the value of the aimedCompleteness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAimedCompleteness() {
        return aimedCompleteness;
    }

    /**
     * Sets the value of the aimedCompleteness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAimedCompleteness(Double value) {
        this.aimedCompleteness = value;
    }

    /**
     * Gets the value of the aimedIOverSigmaAtHighestRes property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAimedIOverSigmaAtHighestRes() {
        return aimedIOverSigmaAtHighestRes;
    }

    /**
     * Sets the value of the aimedIOverSigmaAtHighestRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAimedIOverSigmaAtHighestRes(Double value) {
        this.aimedIOverSigmaAtHighestRes = value;
    }

    /**
     * Gets the value of the aimedMultiplicity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAimedMultiplicity() {
        return aimedMultiplicity;
    }

    /**
     * Sets the value of the aimedMultiplicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAimedMultiplicity(Double value) {
        this.aimedMultiplicity = value;
    }

    /**
     * Gets the value of the aimedResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAimedResolution() {
        return aimedResolution;
    }

    /**
     * Sets the value of the aimedResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAimedResolution(Double value) {
        this.aimedResolution = value;
    }

    /**
     * Gets the value of the anomalousData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnomalousData() {
        return anomalousData;
    }

    /**
     * Sets the value of the anomalousData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnomalousData(Boolean value) {
        this.anomalousData = value;
    }

    /**
     * Gets the value of the anomalousScatterer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnomalousScatterer() {
        return anomalousScatterer;
    }

    /**
     * Sets the value of the anomalousScatterer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnomalousScatterer(String value) {
        this.anomalousScatterer = value;
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
     * Gets the value of the complexity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexity() {
        return complexity;
    }

    /**
     * Sets the value of the complexity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexity(String value) {
        this.complexity = value;
    }

    /**
     * Gets the value of the diffractionPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiffractionPlanId() {
        return diffractionPlanId;
    }

    /**
     * Sets the value of the diffractionPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiffractionPlanId(Integer value) {
        this.diffractionPlanId = value;
    }

    /**
     * Gets the value of the estimateRadiationDamage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstimateRadiationDamage() {
        return estimateRadiationDamage;
    }

    /**
     * Sets the value of the estimateRadiationDamage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstimateRadiationDamage(Boolean value) {
        this.estimateRadiationDamage = value;
    }

    /**
     * Gets the value of the experimentKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperimentKind() {
        return experimentKind;
    }

    /**
     * Sets the value of the experimentKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperimentKind(String value) {
        this.experimentKind = value;
    }

    /**
     * Gets the value of the experimentKindVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experimentKindVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperimentKindVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExperimentKindDetails3VO }
     * 
     * 
     */
    public List<ExperimentKindDetails3VO> getExperimentKindVOs() {
        if (experimentKindVOs == null) {
            experimentKindVOs = new ArrayList<ExperimentKindDetails3VO>();
        }
        return this.experimentKindVOs;
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
     * Gets the value of the forcedSpaceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForcedSpaceGroup() {
        return forcedSpaceGroup;
    }

    /**
     * Sets the value of the forcedSpaceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForcedSpaceGroup(String value) {
        this.forcedSpaceGroup = value;
    }

    /**
     * Gets the value of the kappaStrategyOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKappaStrategyOption() {
        return kappaStrategyOption;
    }

    /**
     * Sets the value of the kappaStrategyOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKappaStrategyOption(String value) {
        this.kappaStrategyOption = value;
    }

    /**
     * Gets the value of the maxDimAccrossSpindleAxis property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxDimAccrossSpindleAxis() {
        return maxDimAccrossSpindleAxis;
    }

    /**
     * Sets the value of the maxDimAccrossSpindleAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxDimAccrossSpindleAxis(Double value) {
        this.maxDimAccrossSpindleAxis = value;
    }

    /**
     * Gets the value of the maximalResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximalResolution() {
        return maximalResolution;
    }

    /**
     * Sets the value of the maximalResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximalResolution(Double value) {
        this.maximalResolution = value;
    }

    /**
     * Gets the value of the minDimAccrossSpindleAxis property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinDimAccrossSpindleAxis() {
        return minDimAccrossSpindleAxis;
    }

    /**
     * Sets the value of the minDimAccrossSpindleAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinDimAccrossSpindleAxis(Double value) {
        this.minDimAccrossSpindleAxis = value;
    }

    /**
     * Gets the value of the minOscWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinOscWidth() {
        return minOscWidth;
    }

    /**
     * Sets the value of the minOscWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinOscWidth(Double value) {
        this.minOscWidth = value;
    }

    /**
     * Gets the value of the minimalResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimalResolution() {
        return minimalResolution;
    }

    /**
     * Sets the value of the minimalResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimalResolution(Double value) {
        this.minimalResolution = value;
    }

    /**
     * Gets the value of the numberOfPositions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfPositions() {
        return numberOfPositions;
    }

    /**
     * Sets the value of the numberOfPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfPositions(Integer value) {
        this.numberOfPositions = value;
    }

    /**
     * Gets the value of the observedResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getObservedResolution() {
        return observedResolution;
    }

    /**
     * Sets the value of the observedResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setObservedResolution(Double value) {
        this.observedResolution = value;
    }

    /**
     * Gets the value of the oscillationRange property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOscillationRange() {
        return oscillationRange;
    }

    /**
     * Sets the value of the oscillationRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOscillationRange(Double value) {
        this.oscillationRange = value;
    }

    /**
     * Gets the value of the preferredBeamDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreferredBeamDiameter() {
        return preferredBeamDiameter;
    }

    /**
     * Sets the value of the preferredBeamDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreferredBeamDiameter(Double value) {
        this.preferredBeamDiameter = value;
    }

    /**
     * Gets the value of the preferredBeamSizeX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreferredBeamSizeX() {
        return preferredBeamSizeX;
    }

    /**
     * Sets the value of the preferredBeamSizeX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreferredBeamSizeX(Double value) {
        this.preferredBeamSizeX = value;
    }

    /**
     * Gets the value of the preferredBeamSizeY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreferredBeamSizeY() {
        return preferredBeamSizeY;
    }

    /**
     * Sets the value of the preferredBeamSizeY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreferredBeamSizeY(Double value) {
        this.preferredBeamSizeY = value;
    }

    /**
     * Gets the value of the radiationSensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRadiationSensitivity() {
        return radiationSensitivity;
    }

    /**
     * Sets the value of the radiationSensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRadiationSensitivity(Double value) {
        this.radiationSensitivity = value;
    }

    /**
     * Gets the value of the radiationSensitivityBeta property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRadiationSensitivityBeta() {
        return radiationSensitivityBeta;
    }

    /**
     * Sets the value of the radiationSensitivityBeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRadiationSensitivityBeta(Double value) {
        this.radiationSensitivityBeta = value;
    }

    /**
     * Gets the value of the radiationSensitivityGamma property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRadiationSensitivityGamma() {
        return radiationSensitivityGamma;
    }

    /**
     * Sets the value of the radiationSensitivityGamma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRadiationSensitivityGamma(Double value) {
        this.radiationSensitivityGamma = value;
    }

    /**
     * Gets the value of the requiredCompleteness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRequiredCompleteness() {
        return requiredCompleteness;
    }

    /**
     * Sets the value of the requiredCompleteness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRequiredCompleteness(Double value) {
        this.requiredCompleteness = value;
    }

    /**
     * Gets the value of the requiredMultiplicity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRequiredMultiplicity() {
        return requiredMultiplicity;
    }

    /**
     * Sets the value of the requiredMultiplicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRequiredMultiplicity(Double value) {
        this.requiredMultiplicity = value;
    }

    /**
     * Gets the value of the requiredResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRequiredResolution() {
        return requiredResolution;
    }

    /**
     * Sets the value of the requiredResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRequiredResolution(Double value) {
        this.requiredResolution = value;
    }

    /**
     * Gets the value of the screeningResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScreeningResolution() {
        return screeningResolution;
    }

    /**
     * Sets the value of the screeningResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScreeningResolution(Double value) {
        this.screeningResolution = value;
    }

    /**
     * Gets the value of the strategyOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategyOption() {
        return strategyOption;
    }

    /**
     * Sets the value of the strategyOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategyOption(String value) {
        this.strategyOption = value;
    }

}
