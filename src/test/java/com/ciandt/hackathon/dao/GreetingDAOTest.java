package com.ciandt.hackathon.dao;

import org.junit.Test;

import com.ciandt.hackathon.test.AbstractTestClass;

public class GreetingDAOTest extends AbstractTestClass {
	
	@Override
	public void setup() {
		dao = super.getInstance(ObjectifyGreetingDAO.class);
	}

	private GreetingDAO dao;

	@Test
	public void shouldBeAbleToInsertAGreeting() {
//		final Greeting greeting = new Greeting( new User("foo@ciandt.com", "ciandt.com"),
//				"Testing", new Date());
//		Long id = dao.insert(greeting);
//		Assert.assertNotNull(id);
	}

}
