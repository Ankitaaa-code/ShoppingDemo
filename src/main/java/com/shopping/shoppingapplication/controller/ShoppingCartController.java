package com.shopping.shoppingapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.shoppingapplication.bean.ShoppingCartBean;
import com.shopping.shoppingapplication.service.ShoppingCartService;

@RestController
public class ShoppingCartController {

	@Autowired
	private ShoppingCartService shoppingCartService;
	
	@PostMapping(value = "/cart/add")
	private ResponseEntity<ShoppingCartBean> addItemsToCart(ShoppingCartBean shoppingCartBean)
	{
		ShoppingCartBean ShoppingCartResponseBean = shoppingCartService.addItemsToCart(shoppingCartBean);
		return new ResponseEntity<> (ShoppingCartResponseBean, HttpStatus.OK);
	}
	
}
