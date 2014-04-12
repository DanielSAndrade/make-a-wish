package com.ciandt.hackathon.dao;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.ciandt.hackathon.entity.Greeting;
import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.entity.Table;
import com.ciandt.hackathon.test.AbstractTestClass;
import com.google.appengine.api.users.User;

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

}
