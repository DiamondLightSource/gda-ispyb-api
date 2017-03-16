
package uk.ac.diamond.ispyb.soapclientsample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for autoProcIntegration3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="autoProcIntegration3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anomalous" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="autoProcIntegrationId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="autoProcProgramVO" type="{http://ispyb.ejb3.webservices.collection}autoProcProgram3VO" minOccurs="0"/&gt;
 *         &lt;element name="autoProcStatusVOs" type="{http://ispyb.ejb3.webservices.collection}autoProcStatus3VO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="beamVectorX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="beamVectorY" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="beamVectorZ" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="cellA" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="cellAlpha" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="cellB" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="cellBeta" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="cellC" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="cellGamma" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="dataCollectionVO" type="{http://ispyb.ejb3.webservices.collection}dataCollection3VO" minOccurs="0"/&gt;
 *         &lt;element name="endImageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="recordTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="refinedDetectorDistance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="refinedXbeam" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="refinedYbeam" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="rotationAxisX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="rotationAxisY" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="rotationAxisZ" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="startImageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "autoProcIntegration3VO", propOrder = {
    "anomalous",
    "autoProcIntegrationId",
    "autoProcProgramVO",
    "autoProcStatusVOs",
    "beamVectorX",
    "beamVectorY",
    "beamVectorZ",
    "cellA",
    "cellAlpha",
    "cellB",
    "cellBeta",
    "cellC",
    "cellGamma",
    "dataCollectionVO",
    "endImageNumber",
    "recordTimeStamp",
    "refinedDetectorDistance",
    "refinedXbeam",
    "refinedYbeam",
    "rotationAxisX",
    "rotationAxisY",
    "rotationAxisZ",
    "startImageNumber"
})
public class AutoProcIntegration3VO
    extends IsPyBValueObject
{

    protected Boolean anomalous;
    protected Integer autoProcIntegrationId;
    protected AutoProcProgram3VO autoProcProgramVO;
    @XmlElement(nillable = true)
    protected List<AutoProcStatus3VO> autoProcStatusVOs;
    protected Float beamVectorX;
    protected Float beamVectorY;
    protected Float beamVectorZ;
    protected Float cellA;
    protected Float cellAlpha;
    protected Float cellB;
    protected Float cellBeta;
    protected Float cellC;
    protected Float cellGamma;
    protected DataCollection3VO dataCollectionVO;
    protected Integer endImageNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recordTimeStamp;
    protected Float refinedDetectorDistance;
    protected Float refinedXbeam;
    protected Float refinedYbeam;
    protected Float rotationAxisX;
    protected Float rotationAxisY;
    protected Float rotationAxisZ;
    protected Integer startImageNumber;

    /**
     * Gets the value of the anomalous property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnomalous() {
        return anomalous;
    }

    /**
     * Sets the value of the anomalous property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnomalous(Boolean value) {
        this.anomalous = value;
    }

    /**
     * Gets the value of the autoProcIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoProcIntegrationId() {
        return autoProcIntegrationId;
    }

    /**
     * Sets the value of the autoProcIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoProcIntegrationId(Integer value) {
        this.autoProcIntegrationId = value;
    }

    /**
     * Gets the value of the autoProcProgramVO property.
     * 
     * @return
     *     possible object is
     *     {@link AutoProcProgram3VO }
     *     
     */
    public AutoProcProgram3VO getAutoProcProgramVO() {
        return autoProcProgramVO;
    }

    /**
     * Sets the value of the autoProcProgramVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoProcProgram3VO }
     *     
     */
    public void setAutoProcProgramVO(AutoProcProgram3VO value) {
        this.autoProcProgramVO = value;
    }

    /**
     * Gets the value of the autoProcStatusVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoProcStatusVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoProcStatusVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoProcStatus3VO }
     * 
     * 
     */
    public List<AutoProcStatus3VO> getAutoProcStatusVOs() {
        if (autoProcStatusVOs == null) {
            autoProcStatusVOs = new ArrayList<AutoProcStatus3VO>();
        }
        return this.autoProcStatusVOs;
    }

    /**
     * Gets the value of the beamVectorX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBeamVectorX() {
        return beamVectorX;
    }

    /**
     * Sets the value of the beamVectorX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBeamVectorX(Float value) {
        this.beamVectorX = value;
    }

    /**
     * Gets the value of the beamVectorY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBeamVectorY() {
        return beamVectorY;
    }

    /**
     * Sets the value of the beamVectorY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBeamVectorY(Float value) {
        this.beamVectorY = value;
    }

    /**
     * Gets the value of the beamVectorZ property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBeamVectorZ() {
        return beamVectorZ;
    }

    /**
     * Sets the value of the beamVectorZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBeamVectorZ(Float value) {
        this.beamVectorZ = value;
    }

    /**
     * Gets the value of the cellA property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCellA() {
        return cellA;
    }

    /**
     * Sets the value of the cellA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCellA(Float value) {
        this.cellA = value;
    }

    /**
     * Gets the value of the cellAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCellAlpha() {
        return cellAlpha;
    }

    /**
     * Sets the value of the cellAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCellAlpha(Float value) {
        this.cellAlpha = value;
    }

    /**
     * Gets the value of the cellB property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCellB() {
        return cellB;
    }

    /**
     * Sets the value of the cellB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCellB(Float value) {
        this.cellB = value;
    }

    /**
     * Gets the value of the cellBeta property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCellBeta() {
        return cellBeta;
    }

    /**
     * Sets the value of the cellBeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCellBeta(Float value) {
        this.cellBeta = value;
    }

    /**
     * Gets the value of the cellC property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCellC() {
        return cellC;
    }

    /**
     * Sets the value of the cellC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCellC(Float value) {
        this.cellC = value;
    }

    /**
     * Gets the value of the cellGamma property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCellGamma() {
        return cellGamma;
    }

    /**
     * Sets the value of the cellGamma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCellGamma(Float value) {
        this.cellGamma = value;
    }

    /**
     * Gets the value of the dataCollectionVO property.
     * 
     * @return
     *     possible object is
     *     {@link DataCollection3VO }
     *     
     */
    public DataCollection3VO getDataCollectionVO() {
        return dataCollectionVO;
    }

    /**
     * Sets the value of the dataCollectionVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataCollection3VO }
     *     
     */
    public void setDataCollectionVO(DataCollection3VO value) {
        this.dataCollectionVO = value;
    }

    /**
     * Gets the value of the endImageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndImageNumber() {
        return endImageNumber;
    }

    /**
     * Sets the value of the endImageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndImageNumber(Integer value) {
        this.endImageNumber = value;
    }

    /**
     * Gets the value of the recordTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecordTimeStamp() {
        return recordTimeStamp;
    }

    /**
     * Sets the value of the recordTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecordTimeStamp(XMLGregorianCalendar value) {
        this.recordTimeStamp = value;
    }

    /**
     * Gets the value of the refinedDetectorDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRefinedDetectorDistance() {
        return refinedDetectorDistance;
    }

    /**
     * Sets the value of the refinedDetectorDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRefinedDetectorDistance(Float value) {
        this.refinedDetectorDistance = value;
    }

    /**
     * Gets the value of the refinedXbeam property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRefinedXbeam() {
        return refinedXbeam;
    }

    /**
     * Sets the value of the refinedXbeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRefinedXbeam(Float value) {
        this.refinedXbeam = value;
    }

    /**
     * Gets the value of the refinedYbeam property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRefinedYbeam() {
        return refinedYbeam;
    }

    /**
     * Sets the value of the refinedYbeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRefinedYbeam(Float value) {
        this.refinedYbeam = value;
    }

    /**
     * Gets the value of the rotationAxisX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRotationAxisX() {
        return rotationAxisX;
    }

    /**
     * Sets the value of the rotationAxisX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRotationAxisX(Float value) {
        this.rotationAxisX = value;
    }

    /**
     * Gets the value of the rotationAxisY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRotationAxisY() {
        return rotationAxisY;
    }

    /**
     * Sets the value of the rotationAxisY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRotationAxisY(Float value) {
        this.rotationAxisY = value;
    }

    /**
     * Gets the value of the rotationAxisZ property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRotationAxisZ() {
        return rotationAxisZ;
    }

    /**
     * Sets the value of the rotationAxisZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRotationAxisZ(Float value) {
        this.rotationAxisZ = value;
    }

    /**
     * Gets the value of the startImageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartImageNumber() {
        return startImageNumber;
    }

    /**
     * Sets the value of the startImageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartImageNumber(Integer value) {
        this.startImageNumber = value;
    }

}
