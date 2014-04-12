package com.ciandt.hackathon.dao;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.hackathon.entity.Produto;
import com.ciandt.hackathon.enums.CategoriaEnum;

public class ProdutoDAO {

	private static ArrayList<Produto> produtos;

	public List<Produto> listarProdutos() {
		
		if (produtos == null || produtos.isEmpty()){
			
			produtos = criarListaInicial();
		}
		
		return produtos;
		
	}

	private ArrayList<Produto> criarListaInicial() {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		Produto produto1 = new Produto();
		produto1.setDescricao("Balao comemorativo do evento mais esperado do ano!");
		produto1.setCategoria(CategoriaEnum.BALOES);
		produto1.setNome("Balao Comemorativo");
		produto1.setPontos(1000);
		produto1.setPreco(2000);
		
		produtos.add(produto1);

		Produto produto2 = new Produto();
		produto1.setDescricao("Livro sobre a historia do Google");
		produto2.setCategoria(CategoriaEnum.LIVRO);
		produto2.setNome("Livro do Google");
		produto2.setPontos(5);
		produto2.setPreco(20);
		
		produtos.add(produto2);
		
		Produto produto3 = new Produto();
		produto1.setDescricao("Livro Um sonho para recomeçar");
		produto3.setCategoria(CategoriaEnum.LIVRO);
		produto3.setNome("Livro dos sonhos");
		produto3.setPontos(5);
		produto3.setPreco(20);
		
		produtos.add(produto3);
		
		Produto produto4 = new Produto();
		produto1.setDescricao("Livro A vida por Daniel Andrade");
		produto4.setCategoria(CategoriaEnum.LIVRO);
		produto4.setNome("Livro Pensamentos");
		produto4.setPontos(5);
		produto4.setPreco(20);
		
		produtos.add(produto4);
		
		Produto produto5 = new Produto();
		produto5.setDescricao("Livro Uma cilada por Roger Rabbit");
		produto5.setCategoria(CategoriaEnum.LIVRO);
		produto5.setFoto("/static/assets/rogerrabbit");
		produto5.setNome("Livro Desenhos");
		produto5.setPontos(5);
		produto5.setPreco(20);
		
		produtos.add(produto5);
		
		Produto produto6 = new Produto();
		produto6.setDescricao("Livro Back to the Future");
		produto6.setCategoria(CategoriaEnum.LIVRO);
		produto6.setFoto("/static/assets/backthefuture.jpg");
		produto6.setNome("Livro Ficção");
		produto6.setPontos(5);
		produto6.setPreco(20);
		
		produtos.add(produto6);
		
		Produto sonho = new Produto();
		sonho.setDescricao("Sonho conhecer minha amigas virtuais");
		sonho.setCategoria(CategoriaEnum.ADOTE_UM_SONHO);
		sonho.setFoto("/static/assets/sonho2.jpg");
		sonho.setNome("Um mundo distante");
		sonho.setPontos(10);
		sonho.setPreco(25);
		
		produtos.add(produto2);
		return produtos;
	}

    public Produto findById(String produto) {
        
        
        // TODO Auto-generated method stub
        Produto produto2 = new Produto();
        produto2.setPontos(10);
        return produto2;
    }

    public void darBaixa(String produto) {
        
    }
	
}
