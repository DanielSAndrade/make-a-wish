package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.entity.Table;

public interface BuyDAO {
	
	void insertBuy(Product product, Table table);
	
	List<Object> findBuy();
	
	List<Object> findByTable(String table);
	
	

}
