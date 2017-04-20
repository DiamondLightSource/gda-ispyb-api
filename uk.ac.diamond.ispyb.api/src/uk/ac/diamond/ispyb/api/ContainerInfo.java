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

/**
 * General information about container
 */
public class ContainerInfo {

	private String name;
	private String type;
	private String barcode;
	private String beamline;
	private String location;
	private String imagerName;
	private String imagerSerialNumber;
	private ContainerStatus status;
	private Integer capacity;
	private Float storageTemperature;
	private String proposalCode;
	private Integer proposalNumber;
	private Integer sessionNumber;

	public ContainerInfo() {
	}

	/**
	 * @return name of container
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set name of container
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return type of container
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set type of container
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return barcode of container
	 */
	public String getBarcode() {
		return barcode;
	}

	/**
	 * Set barcode of container
	 * 
	 * @param barcode
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	/**
	 * @return beamline that the container is destined for
	 */
	public String getBeamline() {
		return beamline;
	}

	/**
	 * Set beamline for container
	 * 
	 * @param beamline
	 */
	public void setBeamline(String beamline) {
		this.beamline = beamline;
	}

	/**
	 * @return location of container
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Set location of container
	 * 
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return imager name
	 */
	public String getImagerName() {
		return imagerName;
	}

	/**
	 * Set imager name
	 * 
	 * @param imagerName
	 */
	public void setImagerName(String imagerName) {
		this.imagerName = imagerName;
	}

	/**
	 * @return imager serial number
	 */
	public String getImagerSerialNumber() {
		return imagerSerialNumber;
	}

	/**
	 * Set imager serial number
	 * 
	 * @param imagerSerialNumber
	 */
	public void setImagerSerialNumber(String imagerSerialNumber) {
		this.imagerSerialNumber = imagerSerialNumber;
	}

	/**
	 * @return container staus
	 */
	public String getStatus() {
		return status.getStatus();
	}

	/**
	 * Set container status
	 * 
	 * @param imagerName
	 */
	public void setStatus(String status) {
		this.status = ContainerStatus.convert(status);
	}

	/**
	 * @return capacity of container
	 */
	public Integer getCapacity() {
		return capacity;
	}

	/**
	 * Set capacity of container
	 * 
	 * @param capacity
	 */
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return storage temperature of container
	 */
	public Float getStorageTemperature() {
		return storageTemperature;
	}

	/**
	 * Set storage temperature of container
	 * 
	 * @param storageTemperature
	 */
	public void setStorageTemperature(Float storageTemperature) {
		this.storageTemperature = storageTemperature;
	}
	
	public String getProposalCode() {
		return proposalCode;
	}

	public void setProposalCode(String proposalCode) {
		this.proposalCode = proposalCode;
	}

	public Integer getProposalNumber() {
		return proposalNumber;
	}

	public void setProposalNumber(Integer proposalNumber) {
		this.proposalNumber = proposalNumber;
	}

	public Integer getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(Integer sessionNumber) {
		this.sessionNumber = sessionNumber;
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
