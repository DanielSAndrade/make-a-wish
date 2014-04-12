package com.ciandt.hackathon.entity;

import java.util.ArrayList;
import java.util.List;

import com.googlecode.objectify.annotation.Embed;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Participante {

	@Id
	private Long id;
	
	private String nome;
	private Integer rank;
	private Integer delta;
	private String urlImagem;
	private Long dataUltimaCompra;
	
	private List<Badge> badge = new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public Integer getDelta() {
		return delta;
	}
	public void setDelta(Integer delta) {
		this.delta = delta;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public List<Badge> getBadge() {
		return badge;
	}
	public void setBadge(List<Badge> badge) {
		this.badge = badge;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getDataUltimaCompra() {
		return dataUltimaCompra;
	}
	public void setDataUltimaCompra(Long dataUltimaCompra) {
		this.dataUltimaCompra = dataUltimaCompra;
	}
	

}