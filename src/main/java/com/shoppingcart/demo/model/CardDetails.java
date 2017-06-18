package com.shoppingcart.demo.model;

public class CardDetails {
	private String cardNumber;
	private ExpiryDate expiryDate;
	private String cvv;
	

	protected CardDetails(){}

    public CardDetails(String cardNumber, ExpiryDate expiryDate,String cvv) {
    	this.cardNumber = cardNumber;
    	this.expiryDate = expiryDate;
    	this.cvv = cvv;
    }
    
	public String getCardNumber() {
		return cardNumber;
	}
	
	public ExpiryDate getExpiryDate() {
		return expiryDate;
	}

	public String getCvv() {
		return cvv;
	}
}
