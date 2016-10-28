package uk.ac.diamond.ispyb.api;

public enum RotationAxis {
	OMEGA("Omega"),KAPPA("Kappa"),PHI("Phi");
	
	private String value;

	private RotationAxis(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
