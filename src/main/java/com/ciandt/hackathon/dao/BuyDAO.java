package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.entity.Table;

public interface BuyDAO {
	
	Long insertBuy(Product product, Table table);
	
	Table findTable(String table);
	
	
	
	

}
