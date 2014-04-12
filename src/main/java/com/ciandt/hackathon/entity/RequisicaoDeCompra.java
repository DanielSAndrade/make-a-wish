package com.ciandt.hackathon.entity;

import java.util.Date;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Ignore;
import com.googlecode.objectify.annotation.Index;

@Entity
public class RequisicaoDeCompra implements Comparable<RequisicaoDeCompra> {

	@Id
	private Long codigo;
	private int codProduto;
	@Ignore
	private String nomeProduto;
	private int numeroDaMesa;
	@Index
	private Date dataDoPedido;

	public RequisicaoDeCompra() {
		dataDoPedido = new Date();
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public int getNumeroDaMesa() {
		return numeroDaMesa;
	}

	public void setNumeroDaMesa(int numeroDaMesa) {
		this.numeroDaMesa = numeroDaMesa;
	}

	public Date getDataDoPedido() {
		return dataDoPedido;
	}

	public void setDataDoPedido(Date dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}

	@Override
	public int compareTo(RequisicaoDeCompra o) {
		return -this.getDataDoPedido().compareTo(o.getDataDoPedido());
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
}
