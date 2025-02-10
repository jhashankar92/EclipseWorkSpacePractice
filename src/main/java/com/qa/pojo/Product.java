package com.qa.pojo;

import org.apache.juneau.annotation.Beanc;

public class Product {
	//POJO : Plain Old java object
	private String name;
	private int price;
	private String colour;
	private String [] sellerNames;
	
    @Beanc (properties="name,price,colour,sellerNames")
	public Product(String name, int price, String colour, String[] sellerNames) {
		super();
		this.name = name;
		this.price = price;
		this.colour = colour;
		this.sellerNames = sellerNames;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String[] getSellerNames() {
		return sellerNames;
	}

	public void setSellerNames(String[] sellerNames) {
		this.sellerNames = sellerNames;
	}

	
}
