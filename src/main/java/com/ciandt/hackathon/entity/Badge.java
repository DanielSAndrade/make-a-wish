package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Embed;
import com.googlecode.objectify.annotation.Id;

@Embed
public class Badge {
	@Id
	private Long id;

	private String nome;
	private String urlImagem;

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

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

}
