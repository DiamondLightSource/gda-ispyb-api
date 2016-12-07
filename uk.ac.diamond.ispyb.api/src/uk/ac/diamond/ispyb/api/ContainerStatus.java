package uk.ac.diamond.ispyb.api;

public enum ContainerStatus {
	IN_STORAGE("in_storage"),
	IN_LOCALSTORAGE("in_localstorage"),
	PROCESSING("processing"),
	DISPOSED("disposed"),
	IN_TRANSIT_TO_LOCAL_STORAGE("in_transit_to_localstorage"),
	IN_TRANSIT_TO_STORAGE("in_transit_to_storage"),
	IN_TRANSIT_LOADING("in_transit_loading"),
	IN_TRANSIT_UNLOADING("in_transit_unloading");

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
		throw new IllegalArgumentException("no container status for " + status);
	}

}
