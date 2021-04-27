package uk.ac.diamond.ispyb.api;

public enum Isotropy {
    ISOTROPIC("isotropic"),
    ANISOTROPIC("anisotropic"),
    INVALID("INVALID");

    private final String isotropy;
    Isotropy(String isotropy) {
        this.isotropy = isotropy;
    }

    public String getIsotropy() {
        return isotropy;
    }

    public Isotropy convert(String isotropy){
        for (Isotropy e : Isotropy.values()){
            if (e.isotropy.equals(isotropy)) {
                return e;
            }
        }
        return INVALID;
    }
}
