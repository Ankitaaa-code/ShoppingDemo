package com.shopping.shoppingapplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_inventory", schema = "public")
public class ProductInventoryEntity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productinventorykey;
	private String generatedid;
	private String productname;
	private String brandname;
	private Long quantity;
	private Double price;
	
	public Integer getProductinventorykey() {
		return productinventorykey;
	}
	public void setProductinventorykey(Integer productinventorykey) {
		this.productinventorykey = productinventorykey;
	}
	public String getGeneratedid() {
		return generatedid;
	}
	public void setGeneratedid(String generatedid) {
		this.generatedid = generatedid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
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
