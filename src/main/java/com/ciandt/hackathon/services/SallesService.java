package com.ciandt.hackathon.services;

import java.util.List;

import com.ciandt.hackathon.entity.Product;

public interface SallesService {

	public void save(String name, Product product);
	
	public List<Product> sallesByTable(String table);
}
