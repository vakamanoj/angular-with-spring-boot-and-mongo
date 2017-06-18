package com.shoppingcart.demo.model;

public class Product {

	private String id;
	private String name;
	private String price;
	private String thumbnail;
	private String description;

	protected Product() {
	}

	public Product(String id, String name, String price, String thumbnail, String description) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.thumbnail = thumbnail;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPrice() {
		return price;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public String getDescription() {
		return description;
	}

}
