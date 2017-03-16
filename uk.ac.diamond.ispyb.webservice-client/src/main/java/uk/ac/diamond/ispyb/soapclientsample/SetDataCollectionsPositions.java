
package uk.ac.diamond.ispyb.soapclientsample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setDataCollectionsPositions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setDataCollectionsPositions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listDataCollectionPosition" type="{http://ispyb.ejb3.webservices.collection}dataCollectionPosition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setDataCollectionsPositions", propOrder = {
    "listDataCollectionPosition"
})
public class SetDataCollectionsPositions {

    protected List<DataCollectionPosition> listDataCollectionPosition;

    /**
     * Gets the value of the listDataCollectionPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listDataCollectionPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListDataCollectionPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataCollectionPosition }
     * 
     * 
     */
    public List<DataCollectionPosition> getListDataCollectionPosition() {
        if (listDataCollectionPosition == null) {
            listDataCollectionPosition = new ArrayList<DataCollectionPosition>();
        }
        return this.listDataCollectionPosition;
    }

}
