package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Badge {
	@Id
	private Long id;
	private String nome;
	private Long pontuacao;
	
	public Badge() {
		super();
	}

	public Badge(String nome, Long pontuacao) {
		super();
		this.nome = nome;
		this.pontuacao = pontuacao;
	}
	
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
	public Long getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(Long pontuacao) {
		this.pontuacao = pontuacao;
	}
	
}
