package com.ciandt.hackathon.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Entidade referente a uma mesa no evento
 * @author roger
 *
 */
public class Mesa {

	private List<Compra> comprasEfetuadas = new ArrayList<Compra>();

	private List<Medalha> medalhas = new ArrayList<Medalha>();

	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public List<Compra> getComprasEfetuadas() {
		return comprasEfetuadas;
	}

	public void setComprasEfetuadas(List<Compra> comprasEfetuadas) {
		this.comprasEfetuadas = comprasEfetuadas;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void adicionarPessoa(Pessoa pessoa) {
		if (pessoas == null) {
			pessoas = new ArrayList<Pessoa>();
		}
		pessoas.add(pessoa);
	}
	
	public List<Medalha> getMedalhas() {
		return medalhas;
	}

	public void setMedalhas(List<Medalha> medalhas) {
		this.medalhas = medalhas;
	}

	/**
	 * Retorna os pontos que uma mesa fez
	 * @return
	 */
	public Long getPontos() {
		long pontos = 0;
		
		List<Compra> comprasEfetuadas = this.getComprasEfetuadas();
		
		for (Compra compra : comprasEfetuadas) {
			List<Produto> produtosComprados = compra.getProdutos();

			for (Produto produto : produtosComprados) {
				pontos += produto.getPontos();
			}
		}
		
		return pontos;
	}
	
}
