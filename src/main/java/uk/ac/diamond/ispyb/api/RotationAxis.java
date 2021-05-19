/*-
 *******************************************************************************
 * Copyright (c) 2011, 2016 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    See git history
 *******************************************************************************/
package uk.ac.diamond.ispyb.api;

public enum RotationAxis {
	OMEGA("Omega"),KAPPA("Kappa"),PHI("Phi"),INVALID("INVALID");
	
	private final String value;

	RotationAxis(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	public static RotationAxis convert(String rotationAxis){
		for(RotationAxis e : RotationAxis.values()){
			if (e.getValue().equals(rotationAxis)){
				return e;
			}
		}
		return INVALID;
	}
}
