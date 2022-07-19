package com.example.demo.model;

import java.util.Objects;

public class Product implements Comparable<Product>{
	
	private Integer productID;
	private String productName;
	private double productPrice;
	private String productColor;
	private String productDetails;

	
	public Product(int productID, String productName, double productPrice, String productColor, String productDetails) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productColor = productColor;
		this.productDetails = productDetails;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(productName);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(productName, other.productName);
	}



	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	public String getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}



	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.productID.compareTo(o.getProductID());
	}
	
	
	

}
