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

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ScmSample {
    private Long sampleId;
    private Long materialId;
    private Long containerId;
    private Long planId;
    private Long sessionId;
    private Long proposalId;
    private String sampleName;
    private String sampleCode;
    private Float sampleVolume;
    private Double sampleThickness;
    private String sampleComments;
    private String sampleLocation;
    private String sampleSubLocation;
    private String sampleStatus;
    private String materialName;
    private String materialAcronym;
    private String materialFormula;
    private Float materialDensity;
    private String materialSafetyLevel; // enum(GREEN, YELLOW, RED)
    private String materialChemicalDescription;
    private Double materialMolecularMass;
    private String materialConcentrationType;
    private String materialType; // protein, DNA, RNA, small molecule, ...
    private String materialIsotropy; // enum('isotropic','anisotropic')
    private List<String> materialSubTypes; // will be hard to populate ...
    private String planExperimentType;
    private String planPurificationColumn;
    private Float planRobotPlateTemperature;
    private Float planExposureTemperature;
    private Float planTransmission;
    private String proposalCode;
    private String proposalNumber;
    private Long sessionNumber;

    // Getters and setters

    public Long getSampleId() {
        return sampleId;
    }

    public void setSampleId(Long sampleId) {
        this.sampleId = sampleId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public Long getContainerId() {
        return containerId;
    }

    public void setContainerId(Long containerId) {
        this.containerId = containerId;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
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

    public String getSampleStatus() {
        return sampleStatus;
    }

    public void setSampleStatus(String sampleStatus) {
        this.sampleStatus = sampleStatus;
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

    public Float getSampleVolume() {
        return sampleVolume;
    }

    public void setSampleVolume(Float sampleVolume) {
        this.sampleVolume = sampleVolume;
    }

    public Double getSampleThickness() {
        return sampleThickness;
    }

    public void seSampleThickness(Double sampleThickness) {
        this.sampleThickness = sampleThickness;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialAcronym() {
        return materialAcronym;
    }

    public void setMaterialAcronym(String materialAcronym) {
        this.materialAcronym = materialAcronym;
    }

    public String getMaterialFormula() {
        return materialFormula;
    }

    public void setMaterialFormula(String materialFormula) {
        this.materialFormula = materialFormula;
    }

    public Float getMaterialDensity() {
        return materialDensity;
    }

    public void setMaterialDensity(Float materialDensity) {
        this.materialDensity = materialDensity;
    }

    public String getMaterialSafetyLevel() {
        return materialSafetyLevel;
    }

    public void setMaterialSafetyLevel(String materialSafetyLevel) {
        this.materialSafetyLevel = materialSafetyLevel;
    }

    public String getMaterialChemicalDescription() {
        return materialChemicalDescription;
    }

    public void setMaterialChemicalDescription(String materialChemicalDescription) {
        this.materialChemicalDescription = materialChemicalDescription;
    }

    public Double getMaterialMolecularMass() {
        return materialMolecularMass;
    }

    public void setMaterialMolecularMass(Double materialMolecularMass) {
        this.materialMolecularMass = materialMolecularMass;
    }

    public String getMaterialConcentrationType() {
        return materialConcentrationType;
    }

    public void setMaterialConcentrationType(String materialConcentrationType) {
        this.materialConcentrationType = materialConcentrationType;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getMaterialIsotropy() {
        return materialIsotropy;
    }

    public void setMaterialIsotropy(String materialIsotropy) {
        this.materialIsotropy = materialIsotropy;
    }

    public List<String> getMaterialSubType() {
        return materialSubTypes;
    }

    public void setMaterialSubType(List<String> materialSubType) {
        this.materialSubTypes = materialSubType;
    }

    public String getPlanExperimentType() {
        return planExperimentType;
    }

    public void setPlanExperimentType(String planExperimentType) {
        this.planExperimentType = planExperimentType;
    }

    public String getPlanPurificationColumn() {
        return planPurificationColumn;
    }

    public void setPlanPurificationColumn(String planPurificationColumn) {
        this.planPurificationColumn = planPurificationColumn;
    }

    public Float getPlanRobotPlateTemperature() {
        return planRobotPlateTemperature;
    }

    public void setPlanRobotPlateTemperature(Float planRobotPlateTemperature) {
        this.planRobotPlateTemperature = planRobotPlateTemperature;
    }

    public Float getPlanExposureTemperature() {
        return planExposureTemperature;
    }

    public void setPlanExposureTemperature(Float planExposureTemperature) {
        this.planExposureTemperature = planExposureTemperature;
    }

    public Float getPlanTransmission() {
        return planTransmission;
    }

    public void setPlanTransmission(Float planTransmission) {
        this.planTransmission = planTransmission;
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
