package com.shoppingcart.demo.model;

public class ExpiryDate {
	
	private Integer year;
	private Integer month;
	
	protected ExpiryDate(){}

    public ExpiryDate(Integer year, Integer month) {
    	this.year = year;
    	this.month = month;
    }
    
	public Integer getYear() {
		return year;
	}
	
	public Integer getMonth() {
		return month;
	}
}
