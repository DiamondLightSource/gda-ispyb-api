package uk.ac.diamond.ispyb.api;

public enum Schema {
	ISPYBSTAGE, ISPYB;
	
	@Override
	public String toString(){
		return this.name().toLowerCase();
	}
}
