/**
 * 
 */
package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.DoadorProduto;

/**
 * @author Amanda
 * 
 */
public interface DoadorProdutoDao {

	List<DoadorProduto> findDoadorProdutos();

	void insert(DoadorProduto doadorProduto);

	void delete(DoadorProduto doadorProduto);

}
