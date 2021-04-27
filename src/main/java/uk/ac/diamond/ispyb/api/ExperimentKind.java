package uk.ac.diamond.ispyb.api;

public enum ExperimentKind {
    DEFAULT("Default"),
    MXPRESSE("MXPressE"),
    MXPRESSO("MXPressO"),
    MXPRESSE_SAD("MXPressE_SAD"),
    MXSCORE("MXScore"),
    MXPRESSM("MXPressM"),
    MAD("MAD"),
    SAD("SAD"),
    FIXED("Fixed"),
    LIGAND_BINDING("Ligand binding"),
    REFINEMENT("Refinement"),
    OSC("OSC"),
    MAD_INVERSE_BEAM("MAD - Inverse Beam"),
    SAD_INVERSE_BEAM("SAD - Inverse Beam"),
    MESH("MESH"),
    XFE("XFE"),
    STEPPED_TRANSMISSION("Stepped transmission"),
    XCHEM_HIGH_SYMMETRY("XChem High symmetry"),
    XCHEM_LOW_SYMMETRY("XChem Low Symmetry"),
    COMMISIONING("Commissioning"),
    INVALID("INVALID");

    private final String experimentKind;

    ExperimentKind(String experimentKind) {
        this.experimentKind = experimentKind;
    }

    public String getExperimentKind() {
        return experimentKind;
    }

    public static ExperimentKind convert(String experimentKind) {
        for (ExperimentKind e : ExperimentKind.values()) {
            if (e.getExperimentKind().equals(experimentKind)) {
                return e;
            }
        }
        return INVALID;
    }
}