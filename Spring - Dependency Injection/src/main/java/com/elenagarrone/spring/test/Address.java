package com.elenagarrone.spring.test;

public class Address {
	private String street;
	private String postcode;
	
	public Address(String street, String postcode) {
		super();
		this.street = street;
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}
	
	
}
