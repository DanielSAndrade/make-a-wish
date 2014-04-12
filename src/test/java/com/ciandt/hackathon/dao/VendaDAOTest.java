package com.ciandt.hackathon.dao;

import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.ciandt.hackathon.entity.Produto;
import com.ciandt.hackathon.entity.Venda;
import com.ciandt.hackathon.test.AbstractTestClass;

public class VendaDAOTest extends AbstractTestClass {
	
	@Override
	public void setup() {
		dao = super.getInstance(ObjectifyVendaDAO.class);
	}

	private VendaDAO dao;

	@Test
	public void shouldBeAbleToInsertAProduct() {
		Venda venda = createVendaMock();
		Long id = dao.insert(venda);
		Assert.assertNotNull(id);
	}
	
	private Venda createVendaMock(){
		final Produto produto  = new Produto("Livro muito legal",50.30,"Livro");
		final Long numeroMesa = 1l;
		final Date dataRegistro = new Date();
		final Long idComprador = 1l;
		final Venda venda = new Venda(produto,numeroMesa, dataRegistro, idComprador);
		return venda;
	}
	
	@Test
	public void shouldBeAbleToListVendas() {
		List<Venda> listaVendas = dao.findVendas();
		Assert.assertNotNull(listaVendas);
	}

	@Test
	public void shouldBeAbleToReturnExactCountOfVendas() {
		dao.insert(createVendaMock());
		dao.insert(createVendaMock());
		List<Venda> listaVendas = dao.findVendas();
		Assert.assertEquals(2, listaVendas.size());
	}
	
}
