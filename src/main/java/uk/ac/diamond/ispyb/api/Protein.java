package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;

public class Protein {
    private Long proteinId;
    private Long proposalId;
    private String name;
    private String acronym;
    private String description;
    private int hazardGroup;
    private int containmentLevel;
    private SafetyLevel safetyLevel;
    private double molecularMass;
    private String proteinType;
    private long personId;
    private Timestamp blTimeStamp;
    private int isCreatedBySampleSheet;
    private String sequence;
    private String MOD_ID;
    private long componentTypeId;
    private long concentrationTypeId;
    private int global;
    private long externalId;
    private double density;
    private double abundance;
    private Isotropy isotropy;

    public Long getProteinId() {
        return proteinId;
    }

    public void setProteinId(Long proteinId) {
        this.proteinId = proteinId;
    }

    public Long getProposalId() {
        return proposalId;
    }

    public void setProposalId(Long proposalId) {
        this.proposalId = proposalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHazardGroup() {
        return hazardGroup;
    }

    public void setHazardGroup(int hazardGroup) {
        this.hazardGroup = hazardGroup;
    }

    public int getContainmentLevel() {
        return containmentLevel;
    }

    public void setContainmentLevel(int containmentLevel) {
        this.containmentLevel = containmentLevel;
    }

    public SafetyLevel getSafetyLevel() {
        return safetyLevel;
    }

    public void setSafetyLevel(SafetyLevel safetyLevel) {
        this.safetyLevel = safetyLevel;
    }

    public double getMolecularMass() {
        return molecularMass;
    }

    public void setMolecularMass(double molecularMass) {
        this.molecularMass = molecularMass;
    }

    public String getProteinType() {
        return proteinType;
    }

    public void setProteinType(String proteinType) {
        this.proteinType = proteinType;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public Timestamp getBlTimeStamp() {
        return blTimeStamp;
    }

    public void setBlTimeStamp(Timestamp blTimeStamp) {
        this.blTimeStamp = blTimeStamp;
    }

    public int getIsCreatedBySampleSheet() {
        return isCreatedBySampleSheet;
    }

    public void setIsCreatedBySampleSheet(int isCreatedBySampleSheet) {
        this.isCreatedBySampleSheet = isCreatedBySampleSheet;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getMOD_ID() {
        return MOD_ID;
    }

    public void setMOD_ID(String MOD_ID) {
        this.MOD_ID = MOD_ID;
    }

    public long getComponentTypeId() {
        return componentTypeId;
    }

    public void setComponentTypeId(long componentTypeId) {
        this.componentTypeId = componentTypeId;
    }

    public long getConcentrationTypeId() {
        return concentrationTypeId;
    }

    public void setConcentrationTypeId(long concentrationTypeId) {
        this.concentrationTypeId = concentrationTypeId;
    }

    public int getGlobal() {
        return global;
    }

    public void setGlobal(int global) {
        this.global = global;
    }

    public long getExternalId() {
        return externalId;
    }

    public void setExternalId(long externalId) {
        this.externalId = externalId;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getAbundance() {
        return abundance;
    }

    public void setAbundance(double abundance) {
        this.abundance = abundance;
    }

    public Isotropy getIsotropy() {
        return isotropy;
    }

    public void setIsotropy(Isotropy isotropy) {
        this.isotropy = isotropy;
    }
}
