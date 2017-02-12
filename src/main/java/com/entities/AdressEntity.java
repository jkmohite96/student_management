package com.entities;

import javax.persistence.*;

@Embeddable
public class AdressEntity {
	
	@Column(name = "STREET")
	private String street;
	
	
	@Column(name = "CITY")
	private String city;
	
	
	@Column(name = "STATE")
	private String state;
	
	
	@Column(name = "ZIP")
	private int zip;


	public AdressEntity() {
		
	}

	public AdressEntity(String street, String city, String state, int zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	
	

}
