package uk.ac.diamond.ispyb.api;

public enum ContainerStatus {

	LOCAL_STORAGE("In local storage"),
	TRANSIT("In transit"),
	IMAGER("In imager"),
	INVALID("Invalid");

	String status;
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
