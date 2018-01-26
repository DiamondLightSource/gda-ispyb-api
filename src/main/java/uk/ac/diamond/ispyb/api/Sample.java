/*-
 *******************************************************************************
 * Copyright (c) 2011, 2016 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    See git history
 *******************************************************************************/
package uk.ac.diamond.ispyb.api;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Sample {
    private Long sampleId;
    private Long containerId;
    private Long sampleTypeId;
    private String sampleName;
    private String sampleCode;
    private String sampleComments;
    private String sampleLocation;
    private String samplePackingFraction;
    private Double dimension1;
    private Double dimension2;
    private Double dimension3;
    private String shape;
    private String sampleTypeName;
    private String sampleTypeComments;
    private String sampleTypeSpaceGroup;
    private Long orderInGroup;
    private String typeInGroup;

    public Long getSampleId() {
        return sampleId;
    }

    public void setSampleId(Long sampleId) {
        this.sampleId = sampleId;
    }

    public Long getContainerId() {
        return containerId;
    }

    public void setContainerId(Long containerId) {
        this.containerId = containerId;
    }

    public Long getSampleTypeId() {
        return sampleTypeId;
    }

    public void setSampleTypeId(Long sampleTypeId) {
        this.sampleTypeId = sampleTypeId;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public String getSampleCode() {
        return sampleCode;
    }

    public void setSampleCode(String sampleCode) {
        this.sampleCode = sampleCode;
    }

    public String getSampleComments() {
        return sampleComments;
    }

    public void setSampleComments(String sampleComments) {
        this.sampleComments = sampleComments;
    }

    public String getSampleLocation() {
        return sampleLocation;
    }

    public void setSampleLocation(String sampleLocation) {
        this.sampleLocation = sampleLocation;
    }

    public String getSamplePackingFraction() {
        return samplePackingFraction;
    }

    public void setSamplePackingFraction(String samplePackingFraction) {
        this.samplePackingFraction = samplePackingFraction;
    }

    public Double getDimension1() {
        return dimension1;
    }

    public void setDimension1(Double dimension1) {
        this.dimension1 = dimension1;
    }

    public Double getDimension2() {
        return dimension2;
    }

    public void setDimension2(Double dimension2) {
        this.dimension2 = dimension2;
    }

    public Double getDimension3() {
        return dimension3;
    }

    public void setDimension3(Double dimension3) {
        this.dimension3 = dimension3;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getSampleTypeName() {
        return sampleTypeName;
    }

    public void setSampleTypeName(String sampleTypeName) {
        this.sampleTypeName = sampleTypeName;
    }

    public String getSampleTypeComments() {
        return sampleTypeComments;
    }

    public void setSampleTypeComments(String sampleTypeComments) {
        this.sampleTypeComments = sampleTypeComments;
    }

    public String getSampleTypeSpaceGroup() {
        return sampleTypeSpaceGroup;
    }

    public void setSampleTypeSpaceGroup(String sampleTypeSpaceGroup) {
        this.sampleTypeSpaceGroup = sampleTypeSpaceGroup;
    }

    public Long getOrderInGroup() {
        return orderInGroup;
    }

    public void setOrderInGroup(Long orderInGroup) {
        this.orderInGroup = orderInGroup;
    }

    public String getTypeInGroup() {
        return typeInGroup;
    }

    public void setTypeInGroup(String typeInGroup) {
        this.typeInGroup = typeInGroup;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    };

}
