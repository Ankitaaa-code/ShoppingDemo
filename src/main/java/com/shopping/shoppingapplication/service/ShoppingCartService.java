package com.shopping.shoppingapplication.service;

import org.springframework.stereotype.Component;

import com.shopping.shoppingapplication.bean.ShoppingCartBean;

@Component
public interface ShoppingCartService {

	ShoppingCartBean addItemsToCart(ShoppingCartBean shoppingCartBean);

}
