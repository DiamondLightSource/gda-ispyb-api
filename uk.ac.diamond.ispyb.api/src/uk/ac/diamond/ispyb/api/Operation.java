package uk.ac.diamond.ispyb.api;

import java.util.Arrays;
import java.util.List;

public enum Operation {
	INSERT, UPSERT, UPDATE, COMPOSITE;
	
	public static List<Operation> ends() {
		return Arrays.asList(INSERT, UPSERT, UPDATE); // Order matters
	}
}

