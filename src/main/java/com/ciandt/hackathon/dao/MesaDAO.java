package com.ciandt.hackathon.dao;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.hackathon.entity.Compra;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Pessoa;
import com.ciandt.hackathon.entity.Produto;

public class MesaDAO {

	public List<Mesa> getMesas() {
		
		Mesa mesa1 = mockMesa1();
		Mesa mesa2 = mockMesa2();
		
		List<Mesa> mesas = new ArrayList<Mesa>();
		mesas.add(mesa1);
		mesas.add(mesa2);
		
		return mesas;
		
	}

	private Mesa mockMesa1() {

		List<Produto> produtos = new ProdutoDAO().listarProdutos();
		
		Mesa mesa = new Mesa();
		
		mesa.setNome("SmartPhone");
		
		Pessoa daniel = criaPessoa("Daniel da Silva");
		
		Pessoa carlos = criaPessoa("Carlos Pereira");
		
		addCompra(produtos, mesa, daniel);
		
		addMedalhas(mesa);

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(carlos);
		pessoas.add(daniel);
		
		mesa.adicionarPessoa(carlos);
		mesa.adicionarPessoa(daniel);
		return mesa;
	}

    private void addMedalhas(Mesa mesa) {
		//mesa.adicionarMedalhas(medalha);
    }

    private Pessoa criaPessoa(String nome) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        return pessoa;
    }

    private void addCompra(List<Produto> produtos, Mesa mesa, Pessoa pessoa) {

		Compra compra1 = new Compra();
		compra1.setPessoa(pessoa);
		
		compra1.setProdutos(produtos);
		compra1.setPessoa(pessoa);
		
		mesa.adicionarCompraEfetuada(compra1);
    }
	
	private Mesa mockMesa2() {

		List<Produto> produtos = new ProdutoDAO().listarProdutos();
		
		Mesa mesa = new Mesa();
		
		Compra compra1 = new Compra();
		Pessoa daniel = new Pessoa();
		daniel.setNome("Daniel da Silva");

		Pessoa carlos = new Pessoa();
		carlos.setNome("Carlos Pereira");
		
		compra1.setPessoa(daniel);
		compra1.setBonus(2000);
		compra1.setProdutos(produtos);
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
