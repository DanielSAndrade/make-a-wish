package com.ciandt.hackathon.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import junit.framework.Assert;

import org.junit.Test;

import com.ciandt.hackathon.entity.Greeting;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.test.AbstractTestClass;
import com.google.appengine.api.users.User;
import com.google.appengine.api.utils.SystemProperty;

public class GreetingDAOTest extends AbstractTestClass {
	
	@Override
	public void setup() {
		dao = super.getInstance(ObjectifyGreetingDAO.class);
	}

	private GreetingDAO dao;

	@Test
	public void shouldBeAbleToInsertAGreeting() {
		final Greeting greeting = new Greeting( new User("foo@ciandt.com", "ciandt.com"),
				"Testing", new Date());
		Long id = dao.insert(greeting);
		Assert.assertNotNull(id);
	}
	

}
