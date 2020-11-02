package com.example.helloworldspring;

public class Address {
	private String city;
	private String pinCode;
	
	public Address() {
		super();
	}
	
	public Address(String city, String pinCode) {
		this();
		setCity(city);
		setPinCode(pinCode);
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getPinCode() {
		return pinCode;
	}
	
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return "Address(city="+ city + ", pinCode="+ pinCode + ")";
	}
}
