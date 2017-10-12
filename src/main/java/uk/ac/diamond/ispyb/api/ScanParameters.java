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

public class ScanParameters {
	private String scanParamServiceName;
	private String scanParamServiceDesc;	
	private Integer scanParamSequenceNumber;
	private Double scanParamModelStart;
	private Double scanParamModelStop;
	private Double scanParamModelStep;
	private String scanParamModelArray;
	public String getScanParamServiceName() {
		return scanParamServiceName;
	}
	public void setScanParamServiceName(String scanParamServiceName) {
		this.scanParamServiceName = scanParamServiceName;
	}
	public String getScanParamServiceDesc() {
		return scanParamServiceDesc;
	}
	public void setScanParamServiceDesc(String scanParamServiceDesc) {
		this.scanParamServiceDesc = scanParamServiceDesc;
	}
	public Integer getScanParamSequenceNumber() {
        return scanParamSequenceNumber;
    }
    public void setScanParamSequenceNumber(Integer scanParamSequenceNumber) {
        this.scanParamSequenceNumber = scanParamSequenceNumber;
    }
	public Double getScanParamModelStart() {
		return scanParamModelStart;
	}
	public void setScanParamModelStart(Double scanParamModelStart) {
		this.scanParamModelStart = scanParamModelStart;
	}
	public Double getScanParamModelStop() {
		return scanParamModelStop;
	}
	public void setScanParamModelStop(Double scanParamModelStop) {
		this.scanParamModelStop = scanParamModelStop;
	}
	public Double getScanParamModelStep() {
		return scanParamModelStep;
	}
	public void setScanParamModelStep(Double scanParamModelStep) {
		this.scanParamModelStep = scanParamModelStep;
	}
	public String getScanParamModelArray() {
		return scanParamModelArray;
	}
	public void setScanParamModelArray(String scanParamModelArray) {
		this.scanParamModelArray = scanParamModelArray;
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
	}

}
