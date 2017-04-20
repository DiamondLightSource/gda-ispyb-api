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
