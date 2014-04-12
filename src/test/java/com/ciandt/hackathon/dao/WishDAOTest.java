package com.ciandt.hackathon.dao;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.ciandt.hackathon.entity.Wish;
import com.ciandt.hackathon.test.AbstractTestClass;
import com.google.appengine.api.users.User;
import com.ciandt.hackathon.dao.ObjectifyWishDAO;

public class WishDAOTest extends AbstractTestClass {
	
	@Override
	public void setup() {
		dao = super.getInstance(ObjectifyWishDAO.class);
	}

	private ObjectifyWishDAO dao;

	@Test
	public void shouldBeAbleToInsertAGreeting() {
		final Wish wish = new Wish("john", 10, "cancer", "space travel");
		Long id = dao.insert(wish);
		Assert.assertNotNull(id);
	}

}
