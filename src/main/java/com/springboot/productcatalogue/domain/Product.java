package com.springboot.productcatalogue.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private String productId;
	private String productName;
	private int price;
	private ProductType productType;
	
	public Product() {}
	
	public Product(String productId, String productName, int price, ProductType productType) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.productType = productType;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

}
