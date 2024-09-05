package com.shopping.shoppingapplication.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.shopping.shoppingapplication.bean.ProductInventoryBean;

@Component
public interface ProductInventoryService {

	ProductInventoryBean addProductinventory(ProductInventoryBean productInventoryBean);

	ProductInventoryBean getProductInventoryById(String generatedId);

	List<ProductInventoryBean> getallProductInventory();

	String updateProductInventory(String generatedId, Long quantity);

	
	
}
