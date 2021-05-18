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

public class MxSample {
    private Long sampleId;
    private Long containerId;
    private Long dataCollectionPlanId;
    private Long crystalId;
    private Long positionId;
    private Long sessionId;
    private Long proposalId;
    private String sampleName;
    private String sampleCode;
    private String sampleComments;
    private String publicationComments;
    private String sampleLocation;
    private String sampleSubLocation;
    private Boolean isInSampleChanger;
    private String lastKnownCenteringPosition;
    private Double holderLength;
    private Double loopLength;
    private String loopType;
    private Double wireWidth;
    private String sampleStatus;
    private String completionStage;
    private String structureStage;
    private String publicationStage;
    private String proposalCode;
    private String proposalNumber;
    private Long sessionNumber;

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

    public Long getDataCollectionPlanId() {
        return dataCollectionPlanId;
    }

    public void setDataCollectionPlanId(Long dataCollectionPlanId) {
        this.dataCollectionPlanId = dataCollectionPlanId;
    }

    public Long getCrystalId() {
        return crystalId;
    }

    public void setCrystalId(Long crystalId) {
        this.crystalId = crystalId;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public Long getProposalId() {
        return proposalId;
    }

    public void setProposalId(Long proposalId) {
        this.proposalId = proposalId;
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

    public String getPublicationComments() {
        return publicationComments;
    }

    public void setPublicationComments(String publicationComments) {
        this.publicationComments = publicationComments;
    }

    public String getSampleLocation() {
        return sampleLocation;
    }

    public void setSampleLocation(String sampleLocation) {
        this.sampleLocation = sampleLocation;
    }

    public String getSampleSubLocation() {
        return sampleSubLocation;
    }

    public void setSampleSubLocation(String sampleSubLocation) {
        this.sampleSubLocation = sampleSubLocation;
    }

    public Boolean getInSampleChanger() {
        return isInSampleChanger;
    }

    public void setInSampleChanger(Boolean inSampleChanger) {
        isInSampleChanger = inSampleChanger;
    }

    public String getLastKnownCenteringPosition() {
        return lastKnownCenteringPosition;
    }

    public void setLastKnownCenteringPosition(String lastKnownCenteringPosition) {
        this.lastKnownCenteringPosition = lastKnownCenteringPosition;
    }

    public Double getHolderLength() {
        return holderLength;
    }

    public void setHolderLength(Double holderLength) {
        this.holderLength = holderLength;
    }

    public Double getLoopLength() {
        return loopLength;
    }

    public void setLoopLength(Double loopLength) {
        this.loopLength = loopLength;
    }

    public String getLoopType() {
        return loopType;
    }

    public void setLoopType(String loopType) {
        this.loopType = loopType;
    }

    public Double getWireWidth() {
        return wireWidth;
    }

    public void setWireWidth(Double wireWidth) {
        this.wireWidth = wireWidth;
    }

    public String getSampleStatus() {
        return sampleStatus;
    }

    public void setSampleStatus(String sampleStatus) {
        this.sampleStatus = sampleStatus;
    }

    public String getCompletionStage() {
        return completionStage;
    }

    public void setCompletionStage(String completionStage) {
        this.completionStage = completionStage;
    }

    public String getStructureStage() {
        return structureStage;
    }

    public void setStructureStage(String structureStage) {
        this.structureStage = structureStage;
    }

    public String getPublicationStage() {
        return publicationStage;
    }

    public void setPublicationStage(String publicationStage) {
        this.publicationStage = publicationStage;
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
