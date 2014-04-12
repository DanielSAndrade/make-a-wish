package com.ciandt.hackathon.dao;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.hackathon.entity.Compra;
import com.ciandt.hackathon.entity.Medalha;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Pessoa;
import com.ciandt.hackathon.entity.Produto;

public class MesaDAO {

	private Mesa mesa;
	
	public List<Mesa> listarRanking() {
		
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
		
		mesa.setComprasEfetuadas(comprasEfetuadas);
		
		List<Medalha> medalhas = new ArrayList<Medalha>();
		
		mesa.setMedalhas(medalhas);

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(carlos);
		pessoas.add(daniel);
		
		mesa.adicionarPessoa(carlos);
		mesa.adicionarPessoa(daniel);
		
		List<Mesa> mesas = new ArrayList<Mesa>();
		mesas.add(mesa);
		
		return mesas;
		
	}
	
	public void adicionaPessoa(Pessoa pessoa) {
		mesa.adicionarPessoa(pessoa);
	}
	
}
