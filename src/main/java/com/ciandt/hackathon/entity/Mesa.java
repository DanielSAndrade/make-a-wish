package com.ciandt.hackathon.entity;

import java.util.List;

/**
 * Entidade referente a uma mesa no evento
 * @author roger
 *
 */
public class Mesa {

	private List<Compra> comprasEfetuadas;

	private List<Medalha> medalhas;

	private List<Pessoa> pessoas;

	public List<Compra> getComprasEfetuadas() {
		return comprasEfetuadas;
	}

	public void setComprasEfetuadas(List<Compra> comprasEfetuadas) {
		this.comprasEfetuadas = comprasEfetuadas;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public List<Medalha> getMedalhas() {
		return medalhas;
	}

	public void setMedalhas(List<Medalha> medalhas) {
		this.medalhas = medalhas;
	}

}
