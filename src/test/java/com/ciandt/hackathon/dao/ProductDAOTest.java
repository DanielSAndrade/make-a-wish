package com.ciandt.hackathon.dao;

import org.junit.Assert;
import org.junit.Test;

import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.test.AbstractTestClass;

public class ProductDAOTest extends AbstractTestClass {

	@Override
	public void setup() {
		dao = super.getInstance(ObjectfyProductDAO.class);
	}

	private ProductDAO dao;

	@Test
	public void shouldBeAbleToInsertAGreeting() {
		final Product product = new Product();

		product.setName("Balao");
		Long id = dao.insert(product);
		Assert.assertNotNull(id);
	}	

}
