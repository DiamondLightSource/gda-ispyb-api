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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DataCollectionPlanInfo {
	private String name;
	private Double energy;
	private Double preferredBeamSizeX;
	private Double preferredBeamSizeY;
	private Double monoBandwidth;

	private List<ScanParameters> scanParameters = new ArrayList<>();
	private List<DetectorConfiguration> detectorConfigurations = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getEnergy() {
		return energy;
	}

	public void setEnergy(Double energy) {
		this.energy = energy;
	}

	public Double getPreferredBeamSizeX() {
		return preferredBeamSizeX;
	}

	public void setPreferredBeamSizeX(Double preferredBeamSizeX) {
		this.preferredBeamSizeX = preferredBeamSizeX;
	}

	public Double getPreferredBeamSizeY() {
		return preferredBeamSizeY;
	}

	public void setPreferredBeamSizeY(Double preferredBeamSizeY) {
		this.preferredBeamSizeY = preferredBeamSizeY;
	}

	public Double getMonoBandwidth() {
		return monoBandwidth;
	}

	public void setMonoBandwidth(Double monoBandwidth) {
		this.monoBandwidth = monoBandwidth;
	}
	
	public List<ScanParameters> getScanParameters() {
		return scanParameters;
	}

	public void addScanParameter(ScanParameters... scan) {
		this.scanParameters.addAll(Arrays.asList(scan));
	};

	public List<DetectorConfiguration> getDetectorConfigurations() {
		return detectorConfigurations;
	}

	public void addDetectorConfiguration(DetectorConfiguration... detectorConfigurations) {
		this.detectorConfigurations.addAll(Arrays.asList(detectorConfigurations));
	};

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
