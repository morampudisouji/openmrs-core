package org.openmrs;

import java.util.Date;

/**
 * PatientAddress 
 */
public class PatientAddress implements java.io.Serializable {

	public static final long serialVersionUID = 1L;

	// Fields

	private Integer patientAddressId;
	private String address1;
	private String address2;
	private String cityVillage;
	private String stateProvince;
	private String country;
	private String latitude;
	private String longitude;
	private Date dateCreated;
	private Patient patient;
	private User user;

	// Constructors

	/** default constructor */
	public PatientAddress() {
	}

	/** constructor with id */
	public PatientAddress(Integer patientAddressId) {
		this.patientAddressId = patientAddressId;
	}

	// Property accessors

	/**
	 * 
	 */
	public Integer getPatientAddressId() {
		return this.patientAddressId;
	}

	public void setPatientAddressId(Integer patientAddressId) {
		this.patientAddressId = patientAddressId;
	}

	/**
	 * 
	 */
	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * 
	 */
	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * 
	 */
	public String getCityVillage() {
		return this.cityVillage;
	}

	public void setCityVillage(String cityVillage) {
		this.cityVillage = cityVillage;
	}

	/**
	 * 
	 */
	public String getStateProvince() {
		return this.stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	/**
	 * 
	 */
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * 
	 */
	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * 
	 */
	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * 
	 */
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * 
	 */
	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * 
	 */
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}