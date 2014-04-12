package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Product;

public interface ProductDAO {
	
	/**
	 * List all product
	 * @return All product
	 */
	public List<Product> findProduct();
	
	
	public Long insert( Product product );
	
	
	public void delete( Product product);
	
	public List<Product> findByTable(String tableName);
	
	

}
