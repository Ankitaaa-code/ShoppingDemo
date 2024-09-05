package com.shopping.shoppingapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shopping.shoppingapplication.entity.ProductInventoryEntity;

import jakarta.transaction.Transactional;

@Repository
public interface ProductInventoryRepository extends JpaRepository<ProductInventoryEntity, Integer>{
	@Transactional
	@Modifying
	  @Query(nativeQuery = true,
	           value = "update product_inventory " +
	                   "SET quantity = :quantity " +
	        		   "Where generatedid = :generatedId")
	void updateQuantityById(String generatedId, Long quantity);

//	@Query(nativeQuery = true,
//	           value = "select * " +
//	                   "from product_inventory " +
//	        		   "Where generatedid = :generatedId")
//	void getById(String generatedId); 
	
	 ProductInventoryEntity findByGeneratedid(String generatedId);
	 
}
