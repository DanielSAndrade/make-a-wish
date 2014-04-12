package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Compras;

public interface ComprasDAO {
	
	/**
	 * List all greetings
	 * @return All compras
	 */
	public List<Compras> findCompras();
	
	/**
	 * Insert a new greeting into datastore
	 * @param greeting Greeting to be inserted
	 * @return the generated id
	 */
	public Long insert( Compras compra );
	
	/**
	 * Remove a specific greeting from the datastore
	 * @param compra to be removed
	 */
	public void delete( Compras compra );

}
