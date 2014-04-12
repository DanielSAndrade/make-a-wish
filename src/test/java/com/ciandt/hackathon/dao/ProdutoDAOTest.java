package com.ciandt.hackathon.dao;

import java.util.List;

import junit.framework.Assert;

import com.ciandt.hackathon.entity.Produto;

public class ProdutoDAOTest {

	public void listarProdutosTest() {
		List<Produto> listarProdutos = new ProdutoDAO().listarProdutos();
		Assert.assertNotNull(listarProdutos);
	}
	
}
