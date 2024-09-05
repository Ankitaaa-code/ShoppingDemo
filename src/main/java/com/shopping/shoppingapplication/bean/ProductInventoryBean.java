package com.shopping.shoppingapplication.bean;

public class ProductInventoryBean {

	private Integer productInventoryKey;
	private String generatedId;
	private String productName;
	private String brandName;
	private Long quantity;
	private Double price;

	public Integer getProductInventoryKey() {
		return productInventoryKey;
	}

	public void setProductInventoryKey(Integer productInventoryKey) {
		this.productInventoryKey = productInventoryKey;
	}

	public String getGeneratedId() {
		return generatedId;
	}

	public void setGeneratedId(String generatedId) {
		this.generatedId = generatedId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
