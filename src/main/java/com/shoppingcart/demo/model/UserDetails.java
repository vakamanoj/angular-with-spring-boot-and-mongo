package com.shoppingcart.demo.model;

public class UserDetails {

	String firstName;
	String lastName;
	Address address;
	
	protected UserDetails(){}

    public UserDetails(String firstName, String lastName,Address address) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.address = address;
        
    }
    
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Address getAddress() {
		return address;
	}
}
