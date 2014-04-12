package com.ciandt.hackathon.dao;

import java.util.List;

public interface BuyDAO {
	
	void insertBuy(Object product);
	
	List<Object> findBuy();
	
	List<Object> findByTable(String table);
	
	

}
