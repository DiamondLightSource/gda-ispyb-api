package uk.ac.diamond.ispyb.api;

public enum ContainerStatus {

	LOCAL_STORAGE("in_localstorage"),
	TRANSIT("In transit"),
	IMAGER("in_storage");

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
