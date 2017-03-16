
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for experimentKindDetails3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="experimentKindDetails3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataCollectionKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataCollectionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diffractionPlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="experimentKindId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="exposureIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="wedgeValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "experimentKindDetails3VO", propOrder = {
    "dataCollectionKind",
    "dataCollectionType",
    "diffractionPlanId",
    "experimentKindId",
    "exposureIndex",
    "wedgeValue"
})
public class ExperimentKindDetails3VO
    extends IsPyBValueObject
{

    protected String dataCollectionKind;
    protected String dataCollectionType;
    protected Integer diffractionPlanId;
    protected Integer experimentKindId;
    protected Integer exposureIndex;
    protected Float wedgeValue;

    /**
     * Gets the value of the dataCollectionKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCollectionKind() {
        return dataCollectionKind;
    }

    /**
     * Sets the value of the dataCollectionKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCollectionKind(String value) {
        this.dataCollectionKind = value;
    }

    /**
     * Gets the value of the dataCollectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCollectionType() {
        return dataCollectionType;
    }

    /**
     * Sets the value of the dataCollectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCollectionType(String value) {
        this.dataCollectionType = value;
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
     * Gets the value of the experimentKindId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExperimentKindId() {
        return experimentKindId;
    }

    /**
     * Sets the value of the experimentKindId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExperimentKindId(Integer value) {
        this.experimentKindId = value;
    }

    /**
     * Gets the value of the exposureIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExposureIndex() {
        return exposureIndex;
    }

    /**
     * Sets the value of the exposureIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExposureIndex(Integer value) {
        this.exposureIndex = value;
    }

    /**
     * Gets the value of the wedgeValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWedgeValue() {
        return wedgeValue;
    }

    /**
     * Sets the value of the wedgeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWedgeValue(Float value) {
        this.wedgeValue = value;
    }

}
