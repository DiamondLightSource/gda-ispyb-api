package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Details of each entry in local storage queue
 */
public class ContainerLSQueueEntry {
	private String barcode;
	private String location;
	private Timestamp added;

	public ContainerLSQueueEntry() {
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getAdded() {
		return added;
	}

	public void setAdded(Timestamp added) {
		this.added = added;
	}

	@Override
	public String toString() {
		return "ContainerLSQueueEntry [barcode=" + barcode + ", location=" + location + ", added=" + added + "]";
	}
}
