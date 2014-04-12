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
		
		Pessoa daniel = criaPessoa("Daniel da Silva");
		
		Pessoa carlos = criaPessoa("Carlos Pereira");
		
		addCompra(produtos, mesa, daniel);
		
		addMedalhas(mesa);

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(carlos);
		pessoas.add(daniel);
		
		mesa.adicionarPessoa(carlos);
		mesa.adicionarPessoa(daniel);
		
		List<Mesa> mesas = new ArrayList<Mesa>();
		mesas.add(mesa);
		
		return mesas;
		
	}

    private void addMedalhas(Mesa mesa) {
        List<Medalha> medalhas = new ArrayList<Medalha>();
		
		mesa.setMedalhas(medalhas);
    }

    private Pessoa criaPessoa(String nome) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        return pessoa;
    }

    private void addCompra(List<Produto> produtos, Mesa mesa, Pessoa pessoa) {
        List<Compra> comprasEfetuadas = new ArrayList<Compra>();

		Compra compra1 = new Compra();
		compra1.setPessoa(pessoa);
		
		compra1.setProdutos(produtos);
		compra1.setPessoa(pessoa);
		comprasEfetuadas.add(compra1);
		
		mesa.setComprasEfetuadas(comprasEfetuadas);
    }
	
	public void adicionaPessoa(Pessoa pessoa) {
		mesa.adicionarPessoa(pessoa);
	}
	
}
