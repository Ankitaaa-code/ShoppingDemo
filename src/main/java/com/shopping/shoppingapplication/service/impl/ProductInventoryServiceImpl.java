package com.shopping.shoppingapplication.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.shoppingapplication.bean.ProductInventoryBean;
import com.shopping.shoppingapplication.entity.ProductInventoryEntity;
import com.shopping.shoppingapplication.repository.ProductInventoryRepository;
import com.shopping.shoppingapplication.service.ProductInventoryService;

@Service
public class ProductInventoryServiceImpl implements ProductInventoryService {

	@Autowired
	private ProductInventoryRepository productInventoryRepository;

	@Override
	public ProductInventoryBean addProductinventory(ProductInventoryBean productInventoryBean) {
		ProductInventoryEntity productInventoryEntity = new ProductInventoryEntity();
		String uniqueID = UUID.randomUUID().toString();
		productInventoryEntity.setGeneratedid(uniqueID);
		productInventoryEntity.setPrice(productInventoryBean.getPrice());
		productInventoryEntity.setBrandname(productInventoryBean.getBrandName());
		productInventoryEntity.setQuantity(productInventoryBean.getQuantity());
		productInventoryEntity.setProductname(productInventoryBean.getProductName());

		ProductInventoryEntity ProductInventoryEntityResponse = productInventoryRepository.save(productInventoryEntity);

		ProductInventoryBean productInventoryBeanresponse = new ProductInventoryBean();
		productInventoryBeanresponse.setBrandName(ProductInventoryEntityResponse.getBrandname());
		productInventoryBeanresponse.setGeneratedId(ProductInventoryEntityResponse.getGeneratedid());
		productInventoryBeanresponse.setPrice(ProductInventoryEntityResponse.getPrice());
		productInventoryBeanresponse.setQuantity(ProductInventoryEntityResponse.getQuantity());
		productInventoryBeanresponse.setProductInventoryKey(ProductInventoryEntityResponse.getProductinventorykey());
		productInventoryBeanresponse.setProductName(ProductInventoryEntityResponse.getProductname());

		return productInventoryBeanresponse;
	}

	

	@Override
	public ProductInventoryBean getProductInventoryById(String generatedId) {
		ProductInventoryBean productInventoryBean = new ProductInventoryBean();
		
		ProductInventoryEntity productInventoryEntityResponse = productInventoryRepository.findByGeneratedid(generatedId);
		return productInventoryBean;
	}

	@Override
	public List<ProductInventoryBean> getallProductInventory() {
		
		List<ProductInventoryBean> getProductInventoryBeanList = new  ArrayList<>();
		List<ProductInventoryEntity> getProductInventoryList = productInventoryRepository.findAll();
		for(ProductInventoryEntity itr: getProductInventoryList ) 
		{
			ProductInventoryBean productInventoryBean = new ProductInventoryBean();
			productInventoryBean.setBrandName(itr.getBrandname());
			productInventoryBean.setGeneratedId(itr.getGeneratedid());
			productInventoryBean.setPrice(itr.getPrice());
			productInventoryBean.setProductInventoryKey(itr.getProductinventorykey());
			productInventoryBean.setProductName(itr.getProductname());
			productInventoryBean.setQuantity(itr.getQuantity());
			getProductInventoryBeanList.add(productInventoryBean);
		}
		return getProductInventoryBeanList;
	
	}

	@Override
	public String updateProductInventory(String generatedId, Long quantity) {
		ProductInventoryEntity productInventoryEntity = new ProductInventoryEntity();
	
		productInventoryRepository.updateQuantityById(generatedId, quantity);
		
		return "Successs";
	}
	
	
	
	
	
	
}
