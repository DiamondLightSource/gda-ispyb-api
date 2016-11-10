package uk.ac.diamond.ispyb.api;

public enum Schema {
	ISPYBSTAGE,
	ISPYB;

	public static Schema convert(String label) {
		for (Schema s : Schema.values()) {
			if (s.toString().equals(label)) {
				return s;
			}
		}
		throw new IllegalArgumentException();
	}

	@Override
	public String toString(){
		return this.name().toLowerCase();
	}
}
