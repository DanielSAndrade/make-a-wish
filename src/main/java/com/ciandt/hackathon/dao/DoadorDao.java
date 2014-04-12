/**
 * 
 */
package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Doador;
import com.ciandt.hackathon.entity.Mesa;

/**
 * @author Amanda
 * 
 */
public interface DoadorDao {

	List<Doador> findDoadores();

	void insert(Doador doador);

	void delete(Doador doador);

	Doador findDoador(String nome);

	List<Doador> findByMesa(Mesa mesa);

	Doador findByEmail(String email);

}
