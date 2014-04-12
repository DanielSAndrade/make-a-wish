package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Product;

public interface ProductDAO {
	
	/**
	 * List all products
	 * @return All products
	 */
	public List<Product> findAllProducts();
	
	public void insert(Product product);

}
