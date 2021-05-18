package uk.ac.diamond.ispyb.api;

public enum CentringMethod {
    XRAY("xray"),
    LOOP("loop"),
    DIFFRACTION("diffraction"),
    OPTICAL("optical"),
    INVALID("INVALID");

    private final String centeringMethod;
    CentringMethod(String centeringMethod){
        this.centeringMethod = centeringMethod;
    }

    public String getCenteringMethod(){
        return centeringMethod;
    }

    public static CentringMethod convert(String centeringMethod){
        for (CentringMethod e : CentringMethod.values()){
            if (e.centeringMethod.equals(centeringMethod)){
                return e;
            }
        }
        return INVALID;
    }
}
