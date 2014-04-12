package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Id;

public class Produto {
	@Id
	private Long id;

	private String nome;
	private String urlImagem;
	private String tipoLance;
	private String categoria;
	private String descricao;

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

	public String getTipoLance() {
		return tipoLance;
	}

	public void setTipoLance(String tipoLance) {
		this.tipoLance = tipoLance;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
