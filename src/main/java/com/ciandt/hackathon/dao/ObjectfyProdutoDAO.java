package com.ciandt.hackathon.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.ciandt.hackathon.entity.Produto;

public class ObjectfyProdutoDAO implements ProdutoDAO {

	@Override
	public List<Produto> obterProdutos() {
		List<Produto> lstProdutos = new ArrayList<Produto>();
		lstProdutos.add(obterProduto(1));
		lstProdutos.add(obterProduto(2));
		lstProdutos.add(obterProduto(3));
		return null;
	}

	public Produto obterProduto(int numero) {
		switch (numero) {
		case 1:
			return obterProduto(1, 50, "/imagens/balao.jpg", "Balão");
		case 2:
			return obterProduto(2, 100, "/imagens/livro.jpg", "Livro");
		case 3:
			return obterProduto(3, 200, "/imagens/sonho.jpg", "Sonho");
		default:
			return obterProduto(3, 200, "/imagens/sonho.jpg", "Sonho");
		}

	}

	private Produto obterProduto(int numero, int peso, String urlImagem,
			String nome) {
		Produto prod = new Produto();
		prod.setId(numero);
		prod.setPeso(peso);
		prod.setUrlImagem(urlImagem);
		return prod;
	}

	@Override
	public List<Produto> obterProdutosMesa(int numeroMesa) {
		List<Produto> lstProdutos = new ArrayList<Produto>();

		Random r = new Random();
		int qtd = r.nextInt(10);

		Random randomProduto = new Random();

		for (int i = 0; i < qtd; i++) {
			int idProduto = randomProduto.nextInt(3);
			if (idProduto == 0) {
				idProduto++;
			}
			Produto p = obterProduto(idProduto);
			lstProdutos.add(p);
		}
		return lstProdutos;
	}
}
