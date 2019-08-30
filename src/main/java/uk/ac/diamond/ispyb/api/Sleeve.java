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

import java.sql.Timestamp;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Sleeve {
    private Byte id;
    private Byte location;
    private Timestamp lastMovedToFreezer;
    private Timestamp lastMovedFromFreezer;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public Byte getLocation() {
        return location;
    }

    public void setLocation(Byte location) {
        this.location = location;
    }

    public Timestamp getLastMovedToFreezer() {
        return lastMovedToFreezer;
    }

    public void setLastMovedToFreezer(Timestamp lastMovedToFreezer) {
        this.lastMovedToFreezer = lastMovedToFreezer;
    }

    public Timestamp getLastMovedFromFreezer() {
        return lastMovedFromFreezer;
    }

    public void setLastMovedFromFreezer(Timestamp lastMovedFromFreezer) {
        this.lastMovedFromFreezer = lastMovedFromFreezer;
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
