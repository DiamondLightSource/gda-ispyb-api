package uk.ac.diamond.ispyb.dao;

public class BarcodeQuery {
	private final String barcode;
	private Integer position;
	private String status;
	private String error;
	private Integer severity;
	private String stackTrace;

	public BarcodeQuery(String barcode, int position) {
		this.barcode = barcode;
		this.position = position;
	}

	public BarcodeQuery(String barcode, String status) {
		this.barcode = barcode;
		this.status = status;
	}

	public BarcodeQuery(String barcode, String error, int severity, String stackTrace) {
		this.barcode = barcode;
		this.error = error;
		this.severity = severity;
		this.stackTrace = stackTrace;
	}
	
	public String getBarcode() {
		return barcode;
	}
	public String getError() {
		return error;
	}
	public Integer getPosition() {
		return position;
	}
	public Integer getSeverity() {
		return severity;
	}
	public String getStackTrace() {
		return stackTrace;
	}
	public String getStatus() {
		return status;
	}
}
