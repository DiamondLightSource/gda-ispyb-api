package uk.ac.diamond.ispyb.api;

public enum CenteringMethod {
    XRAY("xray"),
    LOOP("loop"),
    DIFFRACTION("diffraction"),
    OPTICAL("optical"),
    INVALID("INVALID");

    private final String centeringMethod;
    CenteringMethod(String centeringMethod){
        this.centeringMethod = centeringMethod;
    }

    public String getCenteringMethod(){
        return centeringMethod;
    }

    public static CenteringMethod convert(String centeringMethod){
        for (CenteringMethod e : CenteringMethod.values()){
            if (e.centeringMethod.equals(centeringMethod)){
                return e;
            }
        }
        return INVALID;
    }
}
