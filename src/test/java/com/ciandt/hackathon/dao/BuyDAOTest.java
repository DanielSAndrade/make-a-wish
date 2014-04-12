package com.ciandt.hackathon.dao;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.ciandt.hackathon.entity.Greeting;
import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.test.AbstractTestClass;
import com.google.appengine.api.users.User;

public class BuyDAOTest extends AbstractTestClass {
	
	@Override
	public void setup() {
		dao = super.getInstance(ObjectfyBuyDAO.class);
	}

	private BuyDAO dao;

	@Test
	public void shouldBeAbleToInsertAGreeting() {
		final Product product = new Product();
//		Long id = dao.insert(greeting);
//		Assert.assertNotNull(id);
	}

}
