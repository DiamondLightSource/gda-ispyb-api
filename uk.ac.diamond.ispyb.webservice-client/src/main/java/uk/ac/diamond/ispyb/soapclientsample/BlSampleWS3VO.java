
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for blSampleWS3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="blSampleWS3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}blSample3VO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="containerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="crystalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="diffractionPlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blSampleWS3VO", propOrder = {
    "containerId",
    "crystalId",
    "diffractionPlanId"
})
public class BlSampleWS3VO
    extends BlSample3VO
{

    protected Integer containerId;
    protected Integer crystalId;
    protected Integer diffractionPlanId;

    /**
     * Gets the value of the containerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContainerId() {
        return containerId;
    }

    /**
     * Sets the value of the containerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContainerId(Integer value) {
        this.containerId = value;
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

}
