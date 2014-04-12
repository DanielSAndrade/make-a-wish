package com.ciandt.hackathon.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Sonho {

	@Id
	private Long id;

	private String foto;

	private String descricao;

	private Crianca crianca;

	private Float valor;

	private Long idTipoDoacao;

	
	public Sonho(){}
	
	public Sonho(Crianca crianca, String descricao) {
		this.crianca = crianca;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Long getIdTipoDoacao() {
		return idTipoDoacao;
	}

	public void setIdTipoDoacao(Long idTipoDoacao) {
		this.idTipoDoacao = idTipoDoacao;
	}

	public Crianca getCrianca() {
		return crianca;
	}

	public void setCrianca(Crianca crianca) {
		this.crianca = crianca;
	}

}
