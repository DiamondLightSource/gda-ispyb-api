
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataCollectionWS3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataCollectionWS3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}dataCollection3VO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blSubSampleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dataCollectionGroupId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="detectorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="strategySubWedgeOrigId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataCollectionWS3VO", propOrder = {
    "blSubSampleId",
    "dataCollectionGroupId",
    "detectorId",
    "strategySubWedgeOrigId"
})
public class DataCollectionWS3VO
    extends DataCollection3VO
{

    protected Integer blSubSampleId;
    protected Integer dataCollectionGroupId;
    protected Integer detectorId;
    protected Integer strategySubWedgeOrigId;

    /**
     * Gets the value of the blSubSampleId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlSubSampleId() {
        return blSubSampleId;
    }

    /**
     * Sets the value of the blSubSampleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlSubSampleId(Integer value) {
        this.blSubSampleId = value;
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
     * Gets the value of the detectorId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDetectorId() {
        return detectorId;
    }

    /**
     * Sets the value of the detectorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDetectorId(Integer value) {
        this.detectorId = value;
    }

    /**
     * Gets the value of the strategySubWedgeOrigId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStrategySubWedgeOrigId() {
        return strategySubWedgeOrigId;
    }

    /**
     * Sets the value of the strategySubWedgeOrigId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStrategySubWedgeOrigId(Integer value) {
        this.strategySubWedgeOrigId = value;
    }

}
