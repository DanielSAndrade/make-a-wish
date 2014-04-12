package com.ciandt.hackathon.dao;

import java.util.List;

public interface ProductDAO {
	
	/**
	 * List all product
	 * @return All product
	 */
	public List<Object> findProduct();
	
	
	public Long insert( Object product );
	
	
	public void delete( Object product);
	
	public List<Object> findByTable(String tableName);
	
	

}
