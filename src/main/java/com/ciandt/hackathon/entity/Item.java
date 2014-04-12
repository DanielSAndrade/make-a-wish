package com.ciandt.hackathon.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

	private Long id;

	private String nome;

	private Double preco;

	private String descricao;

	private String path;

	@Id
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
