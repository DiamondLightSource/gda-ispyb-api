
package uk.ac.diamond.ispyb.soapclientsample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gridInfo3VO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gridInfo3VO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ispyb.ejb3.webservices.collection}isPyBValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dx_mm" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dy_mm" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="gridInfoId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="meshAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="steps_x" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="steps_y" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="workflowMeshVO" type="{http://ispyb.ejb3.webservices.collection}workflowMesh3VO" minOccurs="0"/&gt;
 *         &lt;element name="xOffset" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="yOffset" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gridInfo3VO", propOrder = {
    "dxMm",
    "dyMm",
    "gridInfoId",
    "meshAngle",
    "stepsX",
    "stepsY",
    "workflowMeshVO",
    "xOffset",
    "yOffset"
})
@XmlSeeAlso({
    GridInfoWS3VO.class
})
public class GridInfo3VO
    extends IsPyBValueObject
{

    @XmlElement(name = "dx_mm")
    protected Double dxMm;
    @XmlElement(name = "dy_mm")
    protected Double dyMm;
    protected Integer gridInfoId;
    protected Double meshAngle;
    @XmlElement(name = "steps_x")
    protected Double stepsX;
    @XmlElement(name = "steps_y")
    protected Double stepsY;
    protected WorkflowMesh3VO workflowMeshVO;
    protected Double xOffset;
    protected Double yOffset;

    /**
     * Gets the value of the dxMm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDxMm() {
        return dxMm;
    }

    /**
     * Sets the value of the dxMm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDxMm(Double value) {
        this.dxMm = value;
    }

    /**
     * Gets the value of the dyMm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDyMm() {
        return dyMm;
    }

    /**
     * Sets the value of the dyMm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDyMm(Double value) {
        this.dyMm = value;
    }

    /**
     * Gets the value of the gridInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGridInfoId() {
        return gridInfoId;
    }

    /**
     * Sets the value of the gridInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGridInfoId(Integer value) {
        this.gridInfoId = value;
    }

    /**
     * Gets the value of the meshAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMeshAngle() {
        return meshAngle;
    }

    /**
     * Sets the value of the meshAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMeshAngle(Double value) {
        this.meshAngle = value;
    }

    /**
     * Gets the value of the stepsX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStepsX() {
        return stepsX;
    }

    /**
     * Sets the value of the stepsX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStepsX(Double value) {
        this.stepsX = value;
    }

    /**
     * Gets the value of the stepsY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStepsY() {
        return stepsY;
    }

    /**
     * Sets the value of the stepsY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStepsY(Double value) {
        this.stepsY = value;
    }

    /**
     * Gets the value of the workflowMeshVO property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowMesh3VO }
     *     
     */
    public WorkflowMesh3VO getWorkflowMeshVO() {
        return workflowMeshVO;
    }

    /**
     * Sets the value of the workflowMeshVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowMesh3VO }
     *     
     */
    public void setWorkflowMeshVO(WorkflowMesh3VO value) {
        this.workflowMeshVO = value;
    }

    /**
     * Gets the value of the xOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXOffset() {
        return xOffset;
    }

    /**
     * Sets the value of the xOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXOffset(Double value) {
        this.xOffset = value;
    }

    /**
     * Gets the value of the yOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getYOffset() {
        return yOffset;
    }

    /**
     * Sets the value of the yOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setYOffset(Double value) {
        this.yOffset = value;
    }

}
