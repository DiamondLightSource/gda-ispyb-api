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

import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Information about the synchrotron setup relating to a DataCollection
 */
@Generated("uk.ac.diamond.ispyb.generator.BeanGenerator")
public class DataCollectionMachine {

    private Long id; // data collection ID
    private String synchrotronMode;
    private Float undulatorGap1;
    private Float undulatorGap2;
    private Float undulatorGap3;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSynchrotronMode() {
        return this.synchrotronMode;
    }

    public void setSynchrotronMode(String synchrotronMode) {
        this.synchrotronMode = synchrotronMode;
    }

    public Float getUndulatorGap1() {
        return this.undulatorGap1;
    }

    public void setUndulatorGap1(Float undulatorGap1) {
        this.undulatorGap1 = undulatorGap1;
    }

    public Float getUndulatorGap2() {
        return this.undulatorGap2;
    }

    public void setUndulatorGap2(Float undulatorGap2) {
        this.undulatorGap2 = undulatorGap2;
    }

    public Float getUndulatorGap3() {
        return this.undulatorGap3;
    }

    public void setUndulatorGap3(Float undulatorGap3) {
        this.undulatorGap3 = undulatorGap3;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

}
