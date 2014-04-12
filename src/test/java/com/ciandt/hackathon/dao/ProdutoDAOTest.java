package com.ciandt.hackathon.dao;

import junit.framework.Assert;

import org.junit.Test;

import com.ciandt.hackathon.entity.Produto;
import com.ciandt.hackathon.test.AbstractTestClass;

public class ProdutoDAOTest extends AbstractTestClass {
	
	@Override
	public void setup() {
		dao = super.getInstance(ObjectifyProdutoDAO.class);
	}

	private ProdutoDAO dao;

	@Test
	public void shouldBeAbleToInsertAProduct() {
		final Produto produto  = new Produto("Livro muito legal",50.30,"Livro");
		Long id = dao.insert(produto);
		Assert.assertNotNull(id);
	}
}
