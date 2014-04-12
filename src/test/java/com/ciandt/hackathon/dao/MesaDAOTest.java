package com.ciandt.hackathon.dao;

import junit.framework.Assert;

import org.junit.Test;

public class MesaDAOTest {

	@Test
	public void getMesasTest() {
		
		MesaDAO mesaDAO = new MesaDAO();
		Assert.assertNotNull(mesaDAO.getMesas());
		
	}
	
}
