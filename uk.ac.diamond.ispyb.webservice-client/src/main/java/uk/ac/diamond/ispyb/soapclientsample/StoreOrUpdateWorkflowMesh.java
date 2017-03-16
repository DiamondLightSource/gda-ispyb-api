
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storeOrUpdateWorkflowMesh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeOrUpdateWorkflowMesh"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="workflowMesh" type="{http://ispyb.ejb3.webservices.collection}workflowMeshWS3VO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeOrUpdateWorkflowMesh", propOrder = {
    "workflowMesh"
})
public class StoreOrUpdateWorkflowMesh {

    protected WorkflowMeshWS3VO workflowMesh;

    /**
     * Gets the value of the workflowMesh property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowMeshWS3VO }
     *     
     */
    public WorkflowMeshWS3VO getWorkflowMesh() {
        return workflowMesh;
    }

    /**
     * Sets the value of the workflowMesh property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowMeshWS3VO }
     *     
     */
    public void setWorkflowMesh(WorkflowMeshWS3VO value) {
        this.workflowMesh = value;
    }

}
