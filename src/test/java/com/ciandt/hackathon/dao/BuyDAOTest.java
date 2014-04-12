package com.ciandt.hackathon.dao;

import junit.framework.Assert;

import org.junit.Test;

import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.entity.Table;
import com.ciandt.hackathon.test.AbstractTestClass;

public class BuyDAOTest extends AbstractTestClass {

	@Override
	public void setup() {
		dao = super.getInstance(ObjectfyBuyDAO.class);
	}

	private BuyDAO dao;

	@Test
	public void shouldBeAbleToInsertTable() {
		final Table table = new Table("teste", "Teste", 100L, null);
		Long id = dao.inserTable(table);
		Assert.assertNotNull(id);
	}

	@Test
	public void shouldBeAbleToInsertProduct() {

		final Table table = new Table("teste", "Teste", 100L, null);
		Long idInsertTable = dao.inserTable(table);
		Assert.assertNotNull(idInsertTable);
		final Product product = new Product(1L, "teste", "teste", 10L, 10L);

		Long id = dao.insertBuy(product, "teste");
	}

}
