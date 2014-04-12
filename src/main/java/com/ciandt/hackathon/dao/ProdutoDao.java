/**
 * 
 */
package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Produto;

/**
 * @author Amanda
 * 
 */
public interface ProdutoDao {

	List<Produto> findProdutos();

	void insert(Produto produto);

	void delete(Produto produto);

	Produto findByNome(String nome);

	Produto findById(Long id);

}
