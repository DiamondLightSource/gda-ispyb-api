package uk.ac.diamond.ispyb.dao;

public class PlateQueryBean {
	private String barcode;
	
	public PlateQueryBean(String barcode) {
		this.barcode = barcode;
	}

	public String getBarcode() {
		return barcode;
	}
	
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
}
