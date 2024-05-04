package com.dev.sample;

public class NewProduct {

    private int no;
	private String productName;
	private String productType;
	private double price;

	

	public NewProduct(int no, String productName, String productType, double price) {
		this.no = no;
		this.productName = productName;
		this.productType = productType;
		this.price = price;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
