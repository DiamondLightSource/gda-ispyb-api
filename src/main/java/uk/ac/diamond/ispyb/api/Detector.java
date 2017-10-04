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

public class Detector {
    
	private Long detectorId;

	private String type;
	private String manufacturer;
	private String model;
	private Double pixelSizeHorizontal;  
	private Double pixelSizeVertical; 
	private Double distanceMin; 
	private Double distanceMax;  
    private Long trustedPixelValueRangeLower; 
    private Long trustedPixelValueRangeUpper;  
    private Double sensorThickness; 
    private Double overload; 
	
    public Long getDetectorId() {
        return detectorId;
    }

    public void setDetectorId(Long detectorId) {
        this.detectorId = detectorId;
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getmanufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getmodel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getPixelSizeHorizontal() {
		return pixelSizeHorizontal;
	}

	public void setPixelSizeHorizontal(Double pixelSizeHorizontal) {
		this.pixelSizeHorizontal = pixelSizeHorizontal;
	}

	public Double getPixelSizeVertical() {
		return pixelSizeVertical;
	}

	public void setPixelSizeVertical(Double pixelSizeVertical) {
		this.pixelSizeVertical = pixelSizeVertical;
	}

	public Double getDistanceMin() {
		return distanceMin;
	}

	public void setDistanceMin(Double distanceMin) {
		this.distanceMin = distanceMin;
	}

	public Double getDistanceMax() {
		return distanceMax;
	}

	public void setDistanceMax(Double distanceMax) {
		this.distanceMax = distanceMax;
	}

	public Long getTrustedPixelValueRangeLower() {
		return trustedPixelValueRangeLower;
	}

	public void setTrustedPixelValueRangeLower(Long trustedPixelValueRangeLower) {
		this.trustedPixelValueRangeLower = trustedPixelValueRangeLower;
	}

	public Long getTrustedPixelValueRangeUpper() {
		return trustedPixelValueRangeUpper;
	}

	public void setTrustedPixelValueRangeUpper(Long trustedPixelValueRangeUpper) {
		this.trustedPixelValueRangeUpper = trustedPixelValueRangeUpper;
	}

	public Double getSensorThickness() {
		return sensorThickness;
	}

	public void setSensorThickness(Double sensorThickness) {
		this.sensorThickness = sensorThickness;
	}

	public Double getOverload() {
		return overload;
	}

	public void setOverload(Double overload) {
		this.overload = overload;
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
