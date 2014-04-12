package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.entity.User;

public interface BuyDAO {
	
	Long insertBuy(Product product, String tableName);
	
	Long inserTable(User table);
	
	User findTable(String table);
	
	
	
	
	
	

}
