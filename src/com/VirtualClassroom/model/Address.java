package com.VirtualClassroom.model;

public class Address {
	private String houseNum;
	private String street;
	private String city;
	private String state;
	private String country;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param houseNum
	 * @param street
	 * @param city
	 * @param state
	 * @param country
	 */
	public Address(String houseNum, String street, String city, String state, String country) {
		super();
		this.houseNum = houseNum;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
