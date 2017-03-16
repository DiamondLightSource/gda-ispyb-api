
package uk.ac.diamond.ispyb.soapclientsample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for screeningRankSet3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="screeningRankSet3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rankEngine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rankingProjectFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rankingSummaryFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screeningRankSetId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="screeningRankVOs" type="{http://ispyb.ejb3.webservices.collection}screeningRank3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screeningRankSet3VO", propOrder = {
    "rankEngine",
    "rankingProjectFileName",
    "rankingSummaryFileName",
    "screeningRankSetId",
    "screeningRankVOs"
})
public class ScreeningRankSet3VO
    extends IsPyBValueObject
{

    protected String rankEngine;
    protected String rankingProjectFileName;
    protected String rankingSummaryFileName;
    protected Integer screeningRankSetId;
    @XmlElement(nillable = true)
    protected List<ScreeningRank3VO> screeningRankVOs;

    /**
     * Gets the value of the rankEngine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankEngine() {
        return rankEngine;
    }

    /**
     * Sets the value of the rankEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankEngine(String value) {
        this.rankEngine = value;
    }

    /**
     * Gets the value of the rankingProjectFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankingProjectFileName() {
        return rankingProjectFileName;
    }

    /**
     * Sets the value of the rankingProjectFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankingProjectFileName(String value) {
        this.rankingProjectFileName = value;
    }

    /**
     * Gets the value of the rankingSummaryFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankingSummaryFileName() {
        return rankingSummaryFileName;
    }

    /**
     * Sets the value of the rankingSummaryFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankingSummaryFileName(String value) {
        this.rankingSummaryFileName = value;
    }

    /**
     * Gets the value of the screeningRankSetId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScreeningRankSetId() {
        return screeningRankSetId;
    }

    /**
     * Sets the value of the screeningRankSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScreeningRankSetId(Integer value) {
        this.screeningRankSetId = value;
    }

    /**
     * Gets the value of the screeningRankVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screeningRankVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreeningRankVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningRank3VO }
     * 
     * 
     */
    public List<ScreeningRank3VO> getScreeningRankVOs() {
        if (screeningRankVOs == null) {
            screeningRankVOs = new ArrayList<ScreeningRank3VO>();
        }
        return this.screeningRankVOs;
    }

}
