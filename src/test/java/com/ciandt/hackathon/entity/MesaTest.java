package com.ciandt.hackathon.entity;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

import com.ciandt.hackathon.dao.ProdutoDAO;

public class MesaTest {

	@Test
	@Ignore
	public void getPontosTest() {
		Long pontos = mockMesa().getPontos();
		Long pontosEsperados = 1010l;
		Assert.assertEquals(pontosEsperados, pontos);
	}
	
	private Mesa mockMesa() {

		List<Produto> produtos = new ProdutoDAO().listarProdutos();
		
		Mesa mesa = new Mesa();
		
		mesa.setNome("SmartPhone");
		
		List<Compra> comprasEfetuadas = new ArrayList<Compra>();

		Compra compra1 = new Compra();
		Pessoa daniel = new Pessoa();
		daniel.setNome("Daniel da Silva");

		Pessoa carlos = new Pessoa();
		carlos.setNome("Carlos Pereira");
		
		compra1.setPessoa(daniel);
		
		compra1.setProdutos(produtos);
		compra1.setPessoa(daniel);
		comprasEfetuadas.add(compra1);
		
		mesa.adicionarCompraEfetuada(compra1);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(carlos);
		pessoas.add(daniel);
		
		mesa.adicionarPessoa(carlos);
		mesa.adicionarPessoa(daniel);
		return mesa;
	}	
	
}
