package com.ciandt.hackathon.dao;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.hackathon.entity.Produto;
import com.ciandt.hackathon.enums.CategoriaEnum;

public class ProdutoDAO {

	public List<Produto> listarProdutos() {
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		Produto produto1 = new Produto();
		produto1.setDescricao("Balao comemorativo do evento mais esperado do ano!");
		produto1.setCategoria(CategoriaEnum.BALOES);
		produto1.setNome("Balao Comemorativo");
		produto1.setFoto("static/assets/balao.jpeg");
		produto1.setPontos(1000);
		produto1.setPreco(2000);
		
		produtos.add(produto1);

		Produto produto2 = new Produto();
		produto2.setDescricao("Livro sobre a historia do Google");
		produto2.setCategoria(CategoriaEnum.LIVRO);
		produto2.setNome("Livro do Google");
		produto2.setFoto("static/assets/livro.jpg");
		produto2.setPontos(5);
		produto2.setPreco(20);
		
		produtos.add(produto2);
		
		Produto sonho = new Produto();
		sonho.setDescricao("Joao gostaria de conhecer a Valesca Popozuda");
		sonho.setCategoria(CategoriaEnum.ADOTE_UM_SONHO);
		sonho.setNome("Conhecer Valesca Popozuda");
		sonho.setFoto("static/assets/sonho1.jpg");
		sonho.setPontos(1000);
		sonho.setPreco(2000);
		
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
