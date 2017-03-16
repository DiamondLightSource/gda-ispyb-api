
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for labContact3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="labContact3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billingReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="courierAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defaultCourrierCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dewarAvgCustomsValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dewarAvgTransportValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="labContactId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="personVO" type="{http://ispyb.ejb3.webservices.collection}person3VO" minOccurs="0"/&gt;
 *         &lt;element name="proposalVO" type="{http://ispyb.ejb3.webservices.collection}proposal3VO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "labContact3VO", propOrder = {
    "billingReference",
    "cardName",
    "courierAccount",
    "defaultCourrierCompany",
    "dewarAvgCustomsValue",
    "dewarAvgTransportValue",
    "labContactId",
    "personVO",
    "proposalVO"
})
public class LabContact3VO
    extends IsPyBValueObject
{

    protected String billingReference;
    protected String cardName;
    protected String courierAccount;
    protected String defaultCourrierCompany;
    protected Integer dewarAvgCustomsValue;
    protected Integer dewarAvgTransportValue;
    protected Integer labContactId;
    protected Person3VO personVO;
    protected Proposal3VO proposalVO;

    /**
     * Gets the value of the billingReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingReference() {
        return billingReference;
    }

    /**
     * Sets the value of the billingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingReference(String value) {
        this.billingReference = value;
    }

    /**
     * Gets the value of the cardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * Sets the value of the cardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardName(String value) {
        this.cardName = value;
    }

    /**
     * Gets the value of the courierAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourierAccount() {
        return courierAccount;
    }

    /**
     * Sets the value of the courierAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourierAccount(String value) {
        this.courierAccount = value;
    }

    /**
     * Gets the value of the defaultCourrierCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCourrierCompany() {
        return defaultCourrierCompany;
    }

    /**
     * Sets the value of the defaultCourrierCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCourrierCompany(String value) {
        this.defaultCourrierCompany = value;
    }

    /**
     * Gets the value of the dewarAvgCustomsValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDewarAvgCustomsValue() {
        return dewarAvgCustomsValue;
    }

    /**
     * Sets the value of the dewarAvgCustomsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDewarAvgCustomsValue(Integer value) {
        this.dewarAvgCustomsValue = value;
    }

    /**
     * Gets the value of the dewarAvgTransportValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDewarAvgTransportValue() {
        return dewarAvgTransportValue;
    }

    /**
     * Sets the value of the dewarAvgTransportValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDewarAvgTransportValue(Integer value) {
        this.dewarAvgTransportValue = value;
    }

    /**
     * Gets the value of the labContactId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLabContactId() {
        return labContactId;
    }

    /**
     * Sets the value of the labContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLabContactId(Integer value) {
        this.labContactId = value;
    }

    /**
     * Gets the value of the personVO property.
     * 
     * @return
     *     possible object is
     *     {@link Person3VO }
     *     
     */
    public Person3VO getPersonVO() {
        return personVO;
    }

    /**
     * Sets the value of the personVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person3VO }
     *     
     */
    public void setPersonVO(Person3VO value) {
        this.personVO = value;
    }

    /**
     * Gets the value of the proposalVO property.
     * 
     * @return
     *     possible object is
     *     {@link Proposal3VO }
     *     
     */
    public Proposal3VO getProposalVO() {
        return proposalVO;
    }

    /**
     * Sets the value of the proposalVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proposal3VO }
     *     
     */
    public void setProposalVO(Proposal3VO value) {
        this.proposalVO = value;
    }

}
