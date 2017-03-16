
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sessionWS3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sessionWS3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}session3VO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beamLineSetupId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="proposalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sessionWS3VO", propOrder = {
    "beamLineSetupId",
    "proposalId"
})
public class SessionWS3VO
    extends Session3VO
{

    protected Integer beamLineSetupId;
    protected Integer proposalId;

    /**
     * Gets the value of the beamLineSetupId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBeamLineSetupId() {
        return beamLineSetupId;
    }

    /**
     * Sets the value of the beamLineSetupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBeamLineSetupId(Integer value) {
        this.beamLineSetupId = value;
    }

    /**
     * Gets the value of the proposalId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProposalId() {
        return proposalId;
    }

    /**
     * Sets the value of the proposalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProposalId(Integer value) {
        this.proposalId = value;
    }

}
