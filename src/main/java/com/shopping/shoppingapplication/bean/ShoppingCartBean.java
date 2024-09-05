package com.shopping.shoppingapplication.bean;

public class ShoppingCartBean {

	private Integer shoppingCartKey;
	private Integer productInventoryKey;
	private Integer quantity;

	public Integer getShoppingCartKey() {
		return shoppingCartKey;
	}

	public void setShoppingCartKey(Integer shoppingCartKey) {
		this.shoppingCartKey = shoppingCartKey;
	}

	public Integer getProductInventoryKey() {
		return productInventoryKey;
	}

	public void setProductInventoryKey(Integer productInventoryKey) {
		this.productInventoryKey = productInventoryKey;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
