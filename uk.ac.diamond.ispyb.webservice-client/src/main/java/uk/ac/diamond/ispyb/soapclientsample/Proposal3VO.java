
package uk.ac.diamond.ispyb.soapclientsample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for proposal3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="proposal3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personVO" type="{http://ispyb.ejb3.webservices.collection}person3VO" minOccurs="0"/&gt;
 *         &lt;element name="proposalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="proteinVOs" type="{http://ispyb.ejb3.webservices.collection}protein3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sessionVOs" type="{http://ispyb.ejb3.webservices.collection}session3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shippingVOs" type="{http://ispyb.ejb3.webservices.collection}shipping3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proposal3VO", propOrder = {
    "code",
    "externalId",
    "number",
    "personVO",
    "proposalId",
    "proteinVOs",
    "sessionVOs",
    "shippingVOs",
    "title",
    "type"
})
public class Proposal3VO
    extends IsPyBValueObject
{

    protected String code;
    protected Integer externalId;
    protected String number;
    protected Person3VO personVO;
    protected Integer proposalId;
    @XmlElement(nillable = true)
    protected List<Protein3VO> proteinVOs;
    @XmlElement(nillable = true)
    protected List<Session3VO> sessionVOs;
    @XmlElement(nillable = true)
    protected List<Shipping3VO> shippingVOs;
    protected String title;
    protected String type;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExternalId(Integer value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
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

    /**
     * Gets the value of the proteinVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proteinVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProteinVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Protein3VO }
     * 
     * 
     */
    public List<Protein3VO> getProteinVOs() {
        if (proteinVOs == null) {
            proteinVOs = new ArrayList<Protein3VO>();
        }
        return this.proteinVOs;
    }

    /**
     * Gets the value of the sessionVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessionVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessionVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Session3VO }
     * 
     * 
     */
    public List<Session3VO> getSessionVOs() {
        if (sessionVOs == null) {
            sessionVOs = new ArrayList<Session3VO>();
        }
        return this.sessionVOs;
    }

    /**
     * Gets the value of the shippingVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Shipping3VO }
     * 
     * 
     */
    public List<Shipping3VO> getShippingVOs() {
        if (shippingVOs == null) {
            shippingVOs = new ArrayList<Shipping3VO>();
        }
        return this.shippingVOs;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
