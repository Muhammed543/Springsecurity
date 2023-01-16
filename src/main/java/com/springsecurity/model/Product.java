package com.springsecurity.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {

	private String name;
	private String category;
	private String quantity;
	private String price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}