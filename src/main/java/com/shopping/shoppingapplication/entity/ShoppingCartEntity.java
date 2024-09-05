package com.shopping.shoppingapplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="shopping_cart", schema="Public")
public class ShoppingCartEntity {

	@ID
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long shoppingcartkey;
	private long quantity;
	private long productinventorykey;
	
	
	public long getShoppingcartkey() {
		return shoppingcartkey;
	}
	public void setShoppingcartkey(long shoppingcartkey) {
		this.shoppingcartkey = shoppingcartkey;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public long getProductinventorykey() {
		return productinventorykey;
	}
	public void setProductinventorykey(long productinventorykey) {
		this.productinventorykey = productinventorykey;
	}
	
}
