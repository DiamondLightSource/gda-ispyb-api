
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storeOrUpdateWorkflow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeOrUpdateWorkflow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="workflow" type="{http://ispyb.ejb3.webservices.collection}workflow3VO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeOrUpdateWorkflow", propOrder = {
    "workflow"
})
public class StoreOrUpdateWorkflow {

    protected Workflow3VO workflow;

    /**
     * Gets the value of the workflow property.
     * 
     * @return
     *     possible object is
     *     {@link Workflow3VO }
     *     
     */
    public Workflow3VO getWorkflow() {
        return workflow;
    }

    /**
     * Sets the value of the workflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Workflow3VO }
     *     
     */
    public void setWorkflow(Workflow3VO value) {
        this.workflow = value;
    }

}
