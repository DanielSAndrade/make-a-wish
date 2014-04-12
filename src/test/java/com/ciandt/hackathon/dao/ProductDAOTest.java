package com.ciandt.hackathon.dao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.test.AbstractTestClass;

public class ProductDAOTest extends AbstractTestClass {
	
	@Override
	public void setup() {
		dao = super.getInstance(ObjectifyProductDAO.class);
		
		Product product = new Product();
		
		product.setDescription("Balao 1");
		product.setImageURL("http://uol.com.br/image/gif");
		product.setPrice(10.0);
		product.setPoints(0);
		product.setType("A");
		
		dao.insert(product);
	}

	private ProductDAO dao;

	@Test
	public void shouldBeAbleToFindAllProducts() {
		List<Product> list = dao.findAllProducts();
		Assert.assertEquals(1, list.size());
	}

}
