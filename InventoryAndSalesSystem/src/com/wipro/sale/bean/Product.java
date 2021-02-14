package com.wipro.sale.bean;

public class Product {

	
	private String ProductId;
	private String ProductName;
	private int QuantityOnHand;
	private int ProductUnitPrice;
	private int recordLevel;
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getQuantityOnHand() {
		return QuantityOnHand;
	}
	public void setQuantityOnHand(int quantityOnHand) {
		QuantityOnHand = quantityOnHand;
	}
	public int getProductUnitPrice() {
		return ProductUnitPrice;
	}
	public void setProductUnitPrice(int productUnitPrice) {
		ProductUnitPrice = productUnitPrice;
	}
	public int getRecordLevel() {
		return recordLevel;
	}
	public void setRecordLevel(int recordLevel) {
		this.recordLevel = recordLevel;
	}
	
}
