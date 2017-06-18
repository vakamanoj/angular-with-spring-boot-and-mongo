package com.shoppingcart.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CheckoutDetails")
public class Checkout {

	@Id
	private String id;
	@Indexed(direction = IndexDirection.ASCENDING)
	private Double totalPrice;
	private UserDetails userDetails;
	private CardDetails cardDetails;
	private List<Product> productList;

	protected Checkout() {
	}

	public Checkout(String id, Double totalPrice, UserDetails userDetails, CardDetails cardDetails, List<Product> productList) {
		this.id = id;
		this.totalPrice = totalPrice;
		this.userDetails = userDetails;
		this.cardDetails = cardDetails;
		this.productList = productList;
	}

	public String getId() {
		return id;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public CardDetails getCardDetails() {
		return cardDetails;
	}

	public List<Product> getProductList() {
		return productList;
	}
}
