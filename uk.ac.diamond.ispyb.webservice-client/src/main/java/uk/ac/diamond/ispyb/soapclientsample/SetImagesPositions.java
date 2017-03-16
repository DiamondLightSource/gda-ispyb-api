
package uk.ac.diamond.ispyb.soapclientsample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setImagesPositions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setImagesPositions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listImagePosition" type="{http://ispyb.ejb3.webservices.collection}imagePosition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setImagesPositions", propOrder = {
    "listImagePosition"
})
public class SetImagesPositions {

    protected List<ImagePosition> listImagePosition;

    /**
     * Gets the value of the listImagePosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listImagePosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListImagePosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImagePosition }
     * 
     * 
     */
    public List<ImagePosition> getListImagePosition() {
        if (listImagePosition == null) {
            listImagePosition = new ArrayList<ImagePosition>();
        }
        return this.listImagePosition;
    }

}
