package com.ciandt.hackathon.comparator;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.ciandt.hackathon.dao.MesaDAO;
import com.ciandt.hackathon.dao.ProdutoDAO;
import com.ciandt.hackathon.entity.Compra;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Pessoa;
import com.ciandt.hackathon.entity.Produto;

public class PontosMesaComparatorTest {

	MesaDAO mesaDAO = new MesaDAO();
	
	@Test
	public void compareTest() {
		Mesa mesa1 = mockMesa1();
		Mesa mesa2 = mockMesa2();
		
		new PontosMesaComparator().compare(mesa1, mesa2);
		Assert.assertEquals(mesa1.getPontos(), mesa2.getPontos());
		
	}
	
	private Mesa mockMesa1() {

		List<Produto> todosProdutos = new ProdutoDAO().listarProdutos();
		
		Mesa mesa = new Mesa();
		
		mesa.setNome("SmartPhone");
		
		List<Compra> comprasEfetuadas = new ArrayList<Compra>();

		Compra compra1 = new Compra();
		Pessoa daniel = new Pessoa();
		daniel.setNome("Daniel da Silva");

		Pessoa carlos = new Pessoa();
		carlos.setNome("Carlos Pereira");
		
		compra1.setPessoa(daniel);
		
		compra1.setProdutos(todosProdutos);
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
	
	private Mesa mockMesa2() {

		List<Produto> todosProdutos = new ProdutoDAO().listarProdutos();
		
		List<Produto> produtosComprados = new ArrayList<Produto>();
		
		Mesa mesa = new Mesa();
		
		Compra compra1 = new Compra();
		Pessoa daniel = new Pessoa();
		daniel.setNome("Daniel da Silva");

		Pessoa carlos = new Pessoa();
		carlos.setNome("Carlos Pereira");
		
		compra1.setPessoa(daniel);
		
		compra1.setProdutos(produtosComprados);
		compra1.setPessoa(daniel);
		
		mesa.adicionarCompraEfetuada(compra1);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(carlos);
		pessoas.add(daniel);
		
		mesa.adicionarPessoa(carlos);
		mesa.adicionarPessoa(daniel);
		return mesa;
	}	
	
}
