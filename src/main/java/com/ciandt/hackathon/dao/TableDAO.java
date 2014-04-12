package com.ciandt.hackathon.dao;

import com.ciandt.hackathon.entity.Table;

public interface TableDAO {
	
	public void saveOrUpdate(Table table);
	
	public void deleteAll();

}
