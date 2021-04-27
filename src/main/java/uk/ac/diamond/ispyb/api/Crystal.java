package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;

public class Crystal {
    private long crystalId;
    private long diffractionPlanId;
    private long proteinId;
    private String crystalUUID;
    private String name;
    private String spaceGroup;
    private String morphology;
    private String color;
    private double size_x;
    private double size_y;
    private double size_z;
    private double cell_a;
    private double cell_b;
    private double cell_c;
    private double cell_alpha;
    private double cell_beta;
    private double cell_gamma;
    private String comments;
    private String pdbFileName;
    private String pdbFilePath;
    private Timestamp recordTimeStamp;
    private double abundance;
    private double theoreticalDensity;

    public long getCrystalId() {
        return crystalId;
    }

    public void setCrystalId(long crystalId) {
        this.crystalId = crystalId;
    }

    public long getDiffractionPlanId() {
        return diffractionPlanId;
    }

    public void setDiffractionPlanId(long diffractionPlanId) {
        this.diffractionPlanId = diffractionPlanId;
    }

    public long getProteinId() {
        return proteinId;
    }

    public void setProteinId(long proteinId) {
        this.proteinId = proteinId;
    }

    public String getCrystalUUID() {
        return crystalUUID;
    }

    public void setCrystalUUID(String crystalUUID) {
        this.crystalUUID = crystalUUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpaceGroup() {
        return spaceGroup;
    }

    public void setSpaceGroup(String spaceGroup) {
        this.spaceGroup = spaceGroup;
    }

    public String getMorphology() {
        return morphology;
    }

    public void setMorphology(String morphology) {
        this.morphology = morphology;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize_x() {
        return size_x;
    }

    public void setSize_x(double size_x) {
        this.size_x = size_x;
    }

    public double getSize_y() {
        return size_y;
    }

    public void setSize_y(double size_y) {
        this.size_y = size_y;
    }

    public double getSize_z() {
        return size_z;
    }

    public void setSize_z(double size_z) {
        this.size_z = size_z;
    }

    public double getCell_a() {
        return cell_a;
    }

    public void setCell_a(double cell_a) {
        this.cell_a = cell_a;
    }

    public double getCell_b() {
        return cell_b;
    }

    public void setCell_b(double cell_b) {
        this.cell_b = cell_b;
    }

    public double getCell_c() {
        return cell_c;
    }

    public void setCell_c(double cell_c) {
        this.cell_c = cell_c;
    }

    public double getCell_alpha() {
        return cell_alpha;
    }

    public void setCell_alpha(double cell_alpha) {
        this.cell_alpha = cell_alpha;
    }

    public double getCell_beta() {
        return cell_beta;
    }

    public void setCell_beta(double cell_beta) {
        this.cell_beta = cell_beta;
    }

    public double getCell_gamma() {
        return cell_gamma;
    }

    public void setCell_gamma(double cell_gamma) {
        this.cell_gamma = cell_gamma;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPdbFileName() {
        return pdbFileName;
    }

    public void setPdbFileName(String pdbFileName) {
        this.pdbFileName = pdbFileName;
    }

    public String getPdbFilePath() {
        return pdbFilePath;
    }

    public void setPdbFilePath(String pdbFilePath) {
        this.pdbFilePath = pdbFilePath;
    }

    public Timestamp getRecordTimeStamp() {
        return recordTimeStamp;
    }

    public void setRecordTimeStamp(Timestamp recordTimeStamp) {
        this.recordTimeStamp = recordTimeStamp;
    }

    public double getAbundance() {
        return abundance;
    }

    public void setAbundance(double abundance) {
        this.abundance = abundance;
    }

    public double getTheoreticalDensity() {
        return theoreticalDensity;
    }

    public void setTheoreticalDensity(double theoreticalDensity) {
        this.theoreticalDensity = theoreticalDensity;
    }
}
