package com.ciandt.hackathon.dao;

import junit.framework.Assert;

import org.junit.Test;

import com.ciandt.hackathon.entity.Item;
import com.ciandt.hackathon.entity.ItemType;
import com.ciandt.hackathon.test.AbstractTestClass;

public class ItemDAOTest extends AbstractTestClass {
	
	private ItemDAO dao;
	
	@Override
	public void setup() {
		dao = super.getInstance(ObjectfyItemDAO.class);
	}


	@Test
	public void shouldBeAbleToInsertAItem() {
		final Item item = new Item("Meus baloes", new Double(50), 5, ItemType.BALLOON); 
				
		Long id = dao.insert(item);
		Assert.assertNotNull(id);
	}
	
}
