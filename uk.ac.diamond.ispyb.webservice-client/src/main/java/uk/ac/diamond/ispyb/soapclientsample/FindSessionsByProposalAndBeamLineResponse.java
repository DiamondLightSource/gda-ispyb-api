
package uk.ac.diamond.ispyb.soapclientsample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findSessionsByProposalAndBeamLineResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findSessionsByProposalAndBeamLineResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sessions" type="{http://ispyb.ejb3.webservices.collection}sessionWS3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findSessionsByProposalAndBeamLineResponse", propOrder = {
    "sessions"
})
public class FindSessionsByProposalAndBeamLineResponse {

    @XmlElement(name = "Sessions")
    protected List<SessionWS3VO> sessions;

    /**
     * Gets the value of the sessions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SessionWS3VO }
     * 
     * 
     */
    public List<SessionWS3VO> getSessions() {
        if (sessions == null) {
            sessions = new ArrayList<SessionWS3VO>();
        }
        return this.sessions;
    }

}
