
package uk.ac.diamond.ispyb.soapclientsample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setImagesPositionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setImagesPositionsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrayImageIdsAndIsCreated" type="{http://ispyb.ejb3.webservices.collection}imageCreation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setImagesPositionsResponse", propOrder = {
    "arrayImageIdsAndIsCreated"
})
public class SetImagesPositionsResponse {

    protected List<ImageCreation> arrayImageIdsAndIsCreated;

    /**
     * Gets the value of the arrayImageIdsAndIsCreated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayImageIdsAndIsCreated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayImageIdsAndIsCreated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageCreation }
     * 
     * 
     */
    public List<ImageCreation> getArrayImageIdsAndIsCreated() {
        if (arrayImageIdsAndIsCreated == null) {
            arrayImageIdsAndIsCreated = new ArrayList<ImageCreation>();
        }
        return this.arrayImageIdsAndIsCreated;
    }

}
