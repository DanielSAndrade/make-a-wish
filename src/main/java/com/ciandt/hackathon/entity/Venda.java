package com.ciandt.hackathon.entity;

import java.util.Date;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
@Cache
public class Venda {
	@Id
	private Long id;
	private Produto produto;
	private Long numeroMesa;
	private Date dataRegistro;
	private Long idComprador;

	public Venda(Produto produto, Long numeroMesa, Date dataRegistro,
			Long idComprador) {
		super();
		this.produto = produto;
		this.numeroMesa = numeroMesa;
		this.dataRegistro = dataRegistro;
		this.idComprador = idComprador;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Long getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(Long numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public Long getIdComprador() {
		return idComprador;
	}

	public void setIdComprador(Long idComprador) {
		this.idComprador = idComprador;
	}

}
