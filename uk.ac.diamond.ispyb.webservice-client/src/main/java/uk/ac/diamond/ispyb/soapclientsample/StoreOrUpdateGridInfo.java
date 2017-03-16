
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storeOrUpdateGridInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeOrUpdateGridInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gridInfo" type="{http://ispyb.ejb3.webservices.collection}gridInfoWS3VO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeOrUpdateGridInfo", propOrder = {
    "gridInfo"
})
public class StoreOrUpdateGridInfo {

    protected GridInfoWS3VO gridInfo;

    /**
     * Gets the value of the gridInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GridInfoWS3VO }
     *     
     */
    public GridInfoWS3VO getGridInfo() {
        return gridInfo;
    }

    /**
     * Sets the value of the gridInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GridInfoWS3VO }
     *     
     */
    public void setGridInfo(GridInfoWS3VO value) {
        this.gridInfo = value;
    }

}
