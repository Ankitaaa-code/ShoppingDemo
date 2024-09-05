package com.shopping.shoppingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.shoppingapplication.bean.ProductInventoryBean;
import com.shopping.shoppingapplication.service.ProductInventoryService;

@RestController
public class ProductInventoryController {

	@Autowired
	private ProductInventoryService productInventoryService;

//	This API's Manages the inventory
	@PostMapping(value = "/product/add"/**, consumes = MediaType.APPLICATION_JSON_VALUE**/)
    public ResponseEntity<ProductInventoryBean>  addProductinventory(@RequestBody ProductInventoryBean productInventoryBean)
    {
    	ProductInventoryBean response = productInventoryService.addProductinventory(productInventoryBean);
    	
    			return new ResponseEntity<> (response, HttpStatus.OK);
    }
	
	@PutMapping(value = "/product/update")
	public  String updateProductInventory(@RequestParam String generatedId,@RequestParam Long quantity)
	{
	  productInventoryService.updateProductInventory(generatedId,quantity);
		
		return "Success";
		
	}
	
	@GetMapping(value = "/product/getbyid")
	public ResponseEntity<ProductInventoryBean> getProductInventoryById(@RequestParam String generatedId)
	{  
        ProductInventoryBean response = productInventoryService.getProductInventoryById(generatedId);
		
        return new ResponseEntity<> (response, HttpStatus.OK);
	}
	
	@GetMapping(value = "/product/getall")
	public List<ProductInventoryBean> getAllProductInventory() 
	{
		List<ProductInventoryBean> listProductInventory = productInventoryService.getallProductInventory();
		return listProductInventory;
		
	}
}
