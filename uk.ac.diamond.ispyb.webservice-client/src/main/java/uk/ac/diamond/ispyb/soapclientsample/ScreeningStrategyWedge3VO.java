
package uk.ac.diamond.ispyb.soapclientsample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for screeningStrategyWedge3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="screeningStrategyWedge3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="completeness" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="doseTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="kappa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="multiplicity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="numberOfImages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="phi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="resolution" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="screeningStrategySubWedgeVOs" type="{http://ispyb.ejb3.webservices.collection}screeningStrategySubWedge3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="screeningStrategyVO" type="{http://ispyb.ejb3.webservices.collection}screeningStrategy3VO" minOccurs="0"/&gt;
 *         &lt;element name="screeningStrategyWedgeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="wavelength" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="wedgeNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screeningStrategyWedge3VO", propOrder = {
    "chi",
    "comments",
    "completeness",
    "doseTotal",
    "kappa",
    "multiplicity",
    "numberOfImages",
    "phi",
    "resolution",
    "screeningStrategySubWedgeVOs",
    "screeningStrategyVO",
    "screeningStrategyWedgeId",
    "wavelength",
    "wedgeNumber"
})
public class ScreeningStrategyWedge3VO
    extends IsPyBValueObject
{

    protected Double chi;
    protected String comments;
    protected Double completeness;
    protected Double doseTotal;
    protected Double kappa;
    protected Double multiplicity;
    protected Integer numberOfImages;
    protected Double phi;
    protected Double resolution;
    @XmlElement(nillable = true)
    protected List<ScreeningStrategySubWedge3VO> screeningStrategySubWedgeVOs;
    protected ScreeningStrategy3VO screeningStrategyVO;
    protected Integer screeningStrategyWedgeId;
    protected Double wavelength;
    protected Integer wedgeNumber;

    /**
     * Gets the value of the chi property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getChi() {
        return chi;
    }

    /**
     * Sets the value of the chi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setChi(Double value) {
        this.chi = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the completeness property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCompleteness() {
        return completeness;
    }

    /**
     * Sets the value of the completeness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCompleteness(Double value) {
        this.completeness = value;
    }

    /**
     * Gets the value of the doseTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDoseTotal() {
        return doseTotal;
    }

    /**
     * Sets the value of the doseTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDoseTotal(Double value) {
        this.doseTotal = value;
    }

    /**
     * Gets the value of the kappa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKappa() {
        return kappa;
    }

    /**
     * Sets the value of the kappa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKappa(Double value) {
        this.kappa = value;
    }

    /**
     * Gets the value of the multiplicity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMultiplicity() {
        return multiplicity;
    }

    /**
     * Sets the value of the multiplicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMultiplicity(Double value) {
        this.multiplicity = value;
    }

    /**
     * Gets the value of the numberOfImages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfImages() {
        return numberOfImages;
    }

    /**
     * Sets the value of the numberOfImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfImages(Integer value) {
        this.numberOfImages = value;
    }

    /**
     * Gets the value of the phi property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPhi() {
        return phi;
    }

    /**
     * Sets the value of the phi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPhi(Double value) {
        this.phi = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setResolution(Double value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the screeningStrategySubWedgeVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screeningStrategySubWedgeVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreeningStrategySubWedgeVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningStrategySubWedge3VO }
     * 
     * 
     */
    public List<ScreeningStrategySubWedge3VO> getScreeningStrategySubWedgeVOs() {
        if (screeningStrategySubWedgeVOs == null) {
            screeningStrategySubWedgeVOs = new ArrayList<ScreeningStrategySubWedge3VO>();
        }
        return this.screeningStrategySubWedgeVOs;
    }

    /**
     * Gets the value of the screeningStrategyVO property.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningStrategy3VO }
     *     
     */
    public ScreeningStrategy3VO getScreeningStrategyVO() {
        return screeningStrategyVO;
    }

    /**
     * Sets the value of the screeningStrategyVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningStrategy3VO }
     *     
     */
    public void setScreeningStrategyVO(ScreeningStrategy3VO value) {
        this.screeningStrategyVO = value;
    }

    /**
     * Gets the value of the screeningStrategyWedgeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScreeningStrategyWedgeId() {
        return screeningStrategyWedgeId;
    }

    /**
     * Sets the value of the screeningStrategyWedgeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScreeningStrategyWedgeId(Integer value) {
        this.screeningStrategyWedgeId = value;
    }

    /**
     * Gets the value of the wavelength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWavelength() {
        return wavelength;
    }

    /**
     * Sets the value of the wavelength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWavelength(Double value) {
        this.wavelength = value;
    }

    /**
     * Gets the value of the wedgeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWedgeNumber() {
        return wedgeNumber;
    }

    /**
     * Sets the value of the wedgeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWedgeNumber(Integer value) {
        this.wedgeNumber = value;
    }

}
