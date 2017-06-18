package com.shoppingcart.demo.model;

public class Address {
	
	private String street;
	private String streetExtension;
	private String city;
	private String state;
	private String zipCode;
	
	 protected Address(){}

	    public Address(String street, String streetExtension,String city, String state,String zipCode) {
	    	this.street = street;
	    	this.streetExtension = streetExtension;
	    	this.city = city;
	        this.state = state;
	        this.zipCode = zipCode;
	    }
	    public String getStreet() {
			return street;
		}

		public String getStreetExtension() {
			return streetExtension;
		}
		
		public String getCity() {
	        return city;
	    }
		
		public String getState() {
			return state;
		}	

		public String getZipCode() {
			return zipCode;
		}
	    
}
