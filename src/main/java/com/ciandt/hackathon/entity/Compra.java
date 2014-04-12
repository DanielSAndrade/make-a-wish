package com.ciandt.hackathon.entity;

public class Compra {
	private Long id;
	private Pessoa pessoa;
	private Item item;
	private Long numeroPontos;
	private Boolean aprovada;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Long getNumeroPontos() {
		return numeroPontos;
	}

	public void setNumeroPontos(Long numeroPontos) {
		this.numeroPontos = numeroPontos;
	}

	public Boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(Boolean aprovada) {
		this.aprovada = aprovada;
	}

}
