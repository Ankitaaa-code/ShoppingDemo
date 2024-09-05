package com.shopping.shoppingapplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.shoppingapplication.bean.ShoppingCartBean;
import com.shopping.shoppingapplication.entity.ShoppingCartEntity;
import com.shopping.shoppingapplication.repository.ProductInventoryRepository;
import com.shopping.shoppingapplication.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

	@Autowired
	ProductInventoryRepository productInventoryRepository;
	
	@Override
	public ShoppingCartBean addItemsToCart(ShoppingCartBean shoppingCartBean) {
		
		 ShoppingCartEntity ShoppingCartEntityRequest = new ShoppingCartEntity();
		 ShoppingCartEntityRequest.setQuantity(shoppingCartBean.getQuantity());
		 ShoppingCartEntityRequest.setProductinventorykey(shoppingCartBean.getProductInventoryKey());
		 
	    ShoppingCartEntity response = productInventoryRepository.save(ShoppingCartEntityRequest);
	    
	    ShoppingCartBean shoppingCartResponseBean = new ShoppingCartBean();
		return shoppingCartResponseBean;
	}

	
	
}
