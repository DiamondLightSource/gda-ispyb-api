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

/**
 * the current status of the container
 */
public enum ContainerStatus {
	IN_STORAGE("in_storage"),
	IN_LOCALSTORAGE("in_localstorage"),
	PROCESSING("processing"),
	DISPOSED("disposed"),
	IN_TRANSIT_TO_LOCAL_STORAGE("in_transit_to_localstorage"),
	IN_TRANSIT_TO_STORAGE("in_transit_to_storage"),
	IN_TRANSIT_LOADING("in_transit_loading"),
	IN_TRANSIT_UNLOADING("in_transit_unloading"),
  IN_LOADLOCK("in_loadlock"),
  IN_TRANSIT_TO_LOADLOCK("in_transit_to_loadlock"),
	INVALID("invalid")
	;

	private final String status;
	ContainerStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public static ContainerStatus convert(String status) {
		for (ContainerStatus e : ContainerStatus.values()) {
			if (e.status.equals(status)) {
				return e;
			}
		}
		return INVALID;
	}

}
