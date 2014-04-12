package com.ciandt.hackathon.dao;

import org.junit.Assert;
import org.junit.Test;

import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.entity.Tweety;
import com.ciandt.hackathon.test.AbstractTestClass;

public class TweetyDAOTest extends AbstractTestClass {

	@Override
	public void setup() {
		dao = super.getInstance(ObjectfyTweetyDAO.class);
	}

	private TweetyDAO dao;

	@Test
	public void shouldBeAbleToInsertAGreeting() {
		final Tweety tweety = new Tweety();

		Long id = dao.insert(tweety);
		Assert.assertNotNull(id);
	}	

}
