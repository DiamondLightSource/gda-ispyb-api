package uk.ac.diamond.ispyb.api;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * General information about container
 */
public class ContainerInfo {
	
	private String name;
	private String type;
	private String barcode;
	private String beamline;
	private String location;
	private String imagerName;
	private String imagerSerialNumber;
	private ContainerStatus status;
	private long capacity;
	private float storageTemperature;
	
	public ContainerInfo() {
	}

	/**
	 * @return name of container
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set name of container
	 * @param name
	 */
	public void setName_v(String name) {
		this.name = name;
	}

	/**
	 * @return type of container
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set type of container
	 * @param type
	 */
	public void setType_v(String type) {
		this.type = type;
	}

	/**
	 * @return barcode of container
	 */
	public String getBarcode() {
		return barcode;
	}

	/**
	 * Set barcode of container
	 * @param barcode
	 */
	public void setBarcode_v(String barcode) {
		this.barcode = barcode;
	}

	/**
	 * @return beamline that the container is destined for
	 */
	public String getBeamline() {
		return beamline;
	}

	/**
	 * Set beamline for container
	 * @param beamline
	 */
	public void setBeamline_v(String beamline) {
		this.beamline = beamline;
	}

	/**
	 * @return location of container
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Set location of container
	 * @param location
	 */
	public void setLocation_v(String location) {
		this.location = location;
	}

	/**
	 * @return imager name
	 */
	public String getImagerName() {
		return imagerName;
	}

	/**
	 * Set imager name
	 * @param imagerName
	 */
	public void setImagerName_v(String imagerName) {
		this.imagerName = imagerName;
	}

	/**
	 * @return imager serial number
	 */
	public String getImagerSerialNumber() {
		return imagerSerialNumber;
	}

	/**
	 * Set imager serial number
	 * @param imagerSerialNumber
	 */
	public void setImagerSerialNumber_v(String imagerSerialNumber) {
		this.imagerSerialNumber = imagerSerialNumber;
	}

	/**
	 * @return container staus
	 */
	public ContainerStatus getStatus() {
		return status;
	}

	/**
	 * Set container status
	 * @param imagerName
	 */
	public void setStatus_v(String status) {
		this.status = ContainerStatus.convert(status);
	}

	/**
	 * @return capacity of container
	 */
	public long getCapacity() {
		return capacity;
	}

	/**
	 * Set capacity of container
	 * @param capacity
	 */
	public void setCapacity_i(long capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return storage temperature of container
	 */
	public float getStorageTemperature() {
		return storageTemperature;
	}

	/**
	 * Set storage temperature of container
	 * @param storageTemperature
	 */
	public void setStorageTemperature_f(float storageTemperature) {
		this.storageTemperature = storageTemperature;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
	public boolean equals(Object that) {
		return EqualsBuilder.reflectionEquals(this, that);
	};
}
