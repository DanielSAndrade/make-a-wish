package com.ciandt.hackathon.entity;

public class Badge {

	private Long id;
	private String nome;
	private Long pontuacaoMinima;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getPontuacaoMinima() {
		return pontuacaoMinima;
	}

	public void setPontuacaoMinima(Long pontuacaoMinima) {
		this.pontuacaoMinima = pontuacaoMinima;
	}
}
