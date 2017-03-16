
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for screeningRank3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="screeningRank3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rankInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rankValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="screeningRankId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="screeningRankSetVO" type="{http://ispyb.ejb3.webservices.collection}screeningRankSet3VO" minOccurs="0"/&gt;
 *         &lt;element name="screeningVO" type="{http://ispyb.ejb3.webservices.collection}screening3VO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screeningRank3VO", propOrder = {
    "rankInformation",
    "rankValue",
    "screeningRankId",
    "screeningRankSetVO",
    "screeningVO"
})
public class ScreeningRank3VO
    extends IsPyBValueObject
{

    protected String rankInformation;
    protected Double rankValue;
    protected Integer screeningRankId;
    protected ScreeningRankSet3VO screeningRankSetVO;
    protected Screening3VO screeningVO;

    /**
     * Gets the value of the rankInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankInformation() {
        return rankInformation;
    }

    /**
     * Sets the value of the rankInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankInformation(String value) {
        this.rankInformation = value;
    }

    /**
     * Gets the value of the rankValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRankValue() {
        return rankValue;
    }

    /**
     * Sets the value of the rankValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRankValue(Double value) {
        this.rankValue = value;
    }

    /**
     * Gets the value of the screeningRankId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScreeningRankId() {
        return screeningRankId;
    }

    /**
     * Sets the value of the screeningRankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScreeningRankId(Integer value) {
        this.screeningRankId = value;
    }

    /**
     * Gets the value of the screeningRankSetVO property.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningRankSet3VO }
     *     
     */
    public ScreeningRankSet3VO getScreeningRankSetVO() {
        return screeningRankSetVO;
    }

    /**
     * Sets the value of the screeningRankSetVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningRankSet3VO }
     *     
     */
    public void setScreeningRankSetVO(ScreeningRankSet3VO value) {
        this.screeningRankSetVO = value;
    }

    /**
     * Gets the value of the screeningVO property.
     * 
     * @return
     *     possible object is
     *     {@link Screening3VO }
     *     
     */
    public Screening3VO getScreeningVO() {
        return screeningVO;
    }

    /**
     * Sets the value of the screeningVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Screening3VO }
     *     
     */
    public void setScreeningVO(Screening3VO value) {
        this.screeningVO = value;
    }

}
