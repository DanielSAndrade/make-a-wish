package com.ciandt.hackathon.entity;

import java.util.List;

public class Produto {
	private int id;
	private int peso;
	private int valor;
	private List<AssetsProduto> assets[];
	private String urlImagem;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public List<AssetsProduto>[] getAssets() {
		return assets;
	}

	public void setAssets(List<AssetsProduto>[] assets) {
		this.assets = assets;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
}
