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

public class Component {
    private Long componentId;
    private String componentName;
    private Double componentDensity;
    private String componentContent;
    private Double componentMolecularMass;
    private Double componentAbundance;

    public Long getComponentId() {
        return componentId;
    }

    public void setComponentId(Long componentId) {
        this.componentId = componentId;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public Double getComponentDensity() {
        return componentDensity;
    }

    public void setComponentDensity(Double componentDensity) {
        this.componentDensity = componentDensity;
    }

    public String getComponentContent() {
        return componentContent;
    }

    public void setComponentContent(String componentContent) {
        this.componentContent = componentContent;
    }

    public Double getComponentMolecularMass() {
        return componentMolecularMass;
    }

    public void setComponentMolecularMass(Double componentMolecularMass) {
        this.componentMolecularMass = componentMolecularMass;
    }

    public Double getComponentAbundance() {
        return componentAbundance;
    }

    public void setComponentAbundance(Double componentAbundance) {
        this.componentAbundance = componentAbundance;
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
