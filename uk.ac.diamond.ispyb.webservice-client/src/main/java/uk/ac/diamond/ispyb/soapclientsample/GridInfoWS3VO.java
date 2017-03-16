
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gridInfoWS3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gridInfoWS3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}gridInfo3VO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="workflowMeshId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gridInfoWS3VO", propOrder = {
    "workflowMeshId"
})
public class GridInfoWS3VO
    extends GridInfo3VO
{

    protected Integer workflowMeshId;

    /**
     * Gets the value of the workflowMeshId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkflowMeshId() {
        return workflowMeshId;
    }

    /**
     * Sets the value of the workflowMeshId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkflowMeshId(Integer value) {
        this.workflowMeshId = value;
    }

}
