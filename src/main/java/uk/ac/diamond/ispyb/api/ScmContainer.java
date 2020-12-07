/*-
 *******************************************************************************
 * Copyright (c) 2011, 2020 Diamond Light Source Ltd.
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
public class ScmContainer {
	private Long containerId;
	private Long dewarId;
    private Long sessionId;
	private Long proposalId;
	private Long ownerId;
	private String ownerUsername;
	private String name;
	private String type;
	private String barcode;
	private String beamline;
	private String location;
	private ContainerStatus status;
	private Integer capacity;
	private Float storageTemperature;
	private String proposalCode;
	private String proposalNumber;
	private Long sessionNumber;
	private String comments;
	private String experimentType;

	/**
	 * @return containerId of container
	 */
	public Long getContainerId() {
		return containerId;
	}

	/**
	 * Set containerId of container
	 *
	 * @param containerId The database primary-key value of the Container row
	 */
	public void setContainerId(Long containerId) {
		this.containerId = containerId;
	}

	/**
	 * @return dewarId of container
	 */
	public Long getDewarId() {
		return dewarId;
	}

	/**
	 * Set dewarId of container
	 *
	 * @param dewarId The database primary-key value of the Dewar row
	 */
	public void setDewarId(Long dewarId) {
		this.dewarId = dewarId;
	}

	public Long getProposalId() {
        return proposalId;
    }

    public void setProposalId(Long proposalId) {
        this.proposalId = proposalId;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
	}

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
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
	 * @param name The name of the container
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
	 * @param type The type of container
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
	 * @param barcode The unique barcode of the container
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
	 * @param beamline The beamline that the container is destined for
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
	 * @param location The current location of the container
	 */
	public void setLocation(String location) {
		this.location = location;
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
	 * @param status The current status of the container 
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
	 * @param capacity The capacity of the container (number of samples it can hold)
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
	 * @param storageTemperature The temperature at which the container should be stored
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

	public String getProposalNumber() {
		return proposalNumber;
	}

	public void setProposalNumber(String proposalNumber) {
		this.proposalNumber = proposalNumber;
	}

	public Long getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(Long sessionNumber) {
		this.sessionNumber = sessionNumber;
	}

	/**
	 * @return container comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * Set container comments
	 *
	 * @param comments Free-text comments about the container
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return experimentType of container
	 */
	public String getExperimentType() {
		return experimentType;
	}

	/**
	 * Set experimentType for container
	 *
	 * @param experimentType The experiment type to be used on the samples in the container
	 */
	public void setExperimentType(String experimentType) {
		this.experimentType = experimentType;
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

	public String getOwnerUsername() {
		return ownerUsername;
	}

	public void setOwnerUsername(String ownerUsername) {
		this.ownerUsername = ownerUsername;
	}
}
