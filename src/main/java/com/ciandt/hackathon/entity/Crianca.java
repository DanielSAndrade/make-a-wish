package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Embed;

@Embed
public class Crianca {

	private Long id;

	private String nome;

	private String foto;
	
	
	public Crianca() {
	}
	
	public Crianca(String nome) {
		this.nome = nome;
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

}
