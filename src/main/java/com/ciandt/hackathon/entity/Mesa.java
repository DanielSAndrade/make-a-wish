package com.ciandt.hackathon.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Entidade referente a uma mesa no evento
 * @author roger
 *
 */
public class Mesa {
    
    private String nome;
    
	private List<Compra> comprasEfetuadas = new ArrayList<Compra>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	private List<Medalha> medalhas = new ArrayList<Medalha>();

	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public List<Compra> getComprasEfetuadas() {
		return comprasEfetuadas;
	}

	public void adicionarCompraEfetuada(Compra compraEfetuada) {
		this.comprasEfetuadas.add(compraEfetuada);
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void adicionarPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	public List<Medalha> getMedalhas() {
		return medalhas;
	}

	public void adicionarMedalhas(Medalha medalha) {
		medalhas.add(medalha);
	}
	
	/**
	 * Retorna os pontos que uma mesa fez
	 * @return
	 */
	public Long getPontos() {

		if (true) {
			// Mock para pontuacao dinamica
			long pontosMock = (long) (Math.random() * 10);
			return pontosMock;
		}
		
		@SuppressWarnings("unused")
		long pontos = 0;
		
		List<Compra> comprasEfetuadas = this.getComprasEfetuadas();
		
		for (Compra compra : comprasEfetuadas) {
			List<Produto> produtosComprados = compra.getProdutos();

			pontos += compra.getBonus();
			
			for (Produto produto : produtosComprados) {
				pontos += produto.getPontos();
			}
		}
		
		return pontos;
	}

}
