package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Table;

public interface TableDAO {
	
	public List<Table>findTables(); 
	public Long insert( Table table );
	public void delete(Table table); 
	public void update(Table table);
	public void deleteAll();
	

}
