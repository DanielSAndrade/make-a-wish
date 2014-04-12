package com.ciandt.hackathon.utils;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.hackathon.dao.ProdutoDAO;
import com.ciandt.hackathon.entity.Compra;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Pessoa;
import com.ciandt.hackathon.entity.Produto;

public class MesasMocker {

	public Mesa mockMesa1() {

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
	
	public Mesa mockMesa2() {

		List<Produto> produtos = new ProdutoDAO().listarProdutos();
		
		Mesa mesa = new Mesa();
		
		mesa.setNome("Andar de aviao");
		
		Compra compra1 = new Compra();
		Pessoa daniel = new Pessoa();
		daniel.setNome("Jose Pereira");

		Pessoa carlos = new Pessoa();
		carlos.setNome("Mariana Pe");
		
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

	public Mesa mockMesa3() {

		List<Produto> produtos = new ProdutoDAO().listarProdutos();
		
		Mesa mesa = new Mesa();
		
		mesa.setNome("Disney");
		
		Compra compra1 = new Compra();
		Pessoa daniel = new Pessoa();
		daniel.setNome("Joelho Andrade");

		Pessoa carlos = new Pessoa();
		carlos.setNome("Josefina Esqueleto");
		
		compra1.setPessoa(daniel);
		compra1.setBonus(5000);
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

	public Mesa mockMesa4() {
		List<Produto> produtos = new ProdutoDAO().listarProdutos();
		
		Mesa mesa = new Mesa();
		
		mesa.setNome("XBox");
		
		Compra compra1 = new Compra();
		Pessoa daniel = new Pessoa();
		daniel.setNome("Marina Joelita");

		Pessoa carlos = new Pessoa();
		carlos.setNome("Juliana Fontes");
		
		compra1.setPessoa(daniel);
		compra1.setBonus(500);
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
	
	public Mesa mockMesa5() {
		List<Produto> produtos = new ProdutoDAO().listarProdutos();
		
		Mesa mesa = new Mesa();
		
		mesa.setNome("Playstation");
		
		Compra compra1 = new Compra();
		Pessoa daniel = new Pessoa();
		daniel.setNome("Fernando Neves");

		Pessoa carlos = new Pessoa();
		carlos.setNome("Joao Esteves");
		
		compra1.setPessoa(daniel);
		compra1.setBonus(0);
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

	public Mesa mockMesa6() {
		// TODO Auto-generated method stub
		return null;
	}

	public Mesa mockMesa7() {
		// TODO Auto-generated method stub
		return null;
	}

	public Mesa mockMesa8() {
		// TODO Auto-generated method stub
		return null;
	}	
	
	public Mesa mockMesa9() {
		// TODO Auto-generated method stub
		return null;
	}	
	
	public Mesa mockMesa10() {
		// TODO Auto-generated method stub
		return null;
	}	
	
	
}
