package uk.ac.diamond.ispyb.api;

public enum SafetyLevel {
    GREEN("GREEN"),
    YELLOW("YELLOW"),
    RED("RED"),
    INVALID("INVALID");

    private final String safetyLevel;

    SafetyLevel(String status){
        this.safetyLevel = status;
    }

    public String getSafetyLevel(){
        return safetyLevel;
    }

    public static SafetyLevel convert (String safetyLevel) {
        for (SafetyLevel e : SafetyLevel.values()) {
            if (e.safetyLevel.equals(safetyLevel)) {
                return e;
            }
        }
        return INVALID;
    }
}
