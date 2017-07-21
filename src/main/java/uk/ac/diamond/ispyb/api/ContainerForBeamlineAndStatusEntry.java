/*-
 *******************************************************************************
 * Copyright (c) 2011, 2017 Diamond Light Source Ltd.
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

/**
 * Details of each entry in local storage queue
 */
public class ContainerForBeamlineAndStatusEntry {
	private String barcode;
	private String location;
	private Timestamp added;

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Timestamp getAdded() {
		return added;
	}

	public void setAdded(Timestamp added) {
		this.added = added;
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
