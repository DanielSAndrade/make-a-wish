package com.ciandt.hackathon.api;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.business.ContabilPontuacao;
import com.ciandt.hackathon.business.Visualizador;
import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.entity.Compra;
import com.ciandt.hackathon.entity.Item;
import com.ciandt.hackathon.entity.Pontuacao;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/api")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class CommonResource {

	private final GreetingDAO greetingDAO;

	@Inject
	public Visualizador visualizador;

	@Inject
	public ContabilPontuacao contabilPontuacao;

	@Inject
	public CommonResource(GreetingDAO greetingDAO) {
		super();
		this.greetingDAO = greetingDAO;
	}

	@GET
	@Path("/listGreetings")
	public List<Item> listGreetings(@Context HttpServletRequest request) {
		List<Item> listItens = new ArrayList<Item>();

		listItens.add(this.createMockItem(1L, "Bicicleta", new Double(200),
				"Descrição da bicicleta", "/bicicleta.jpg"));
		listItens.add(this.createMockItem(2L, "PlayStation", new Double(4000),
				"Descrição do playstation", "/playstation.jpg"));
		listItens.add(this.createMockItem(3L, "Disney", new Double(3000),
				"Descrição da Disney", "/disney.jpg"));

		return listItens;
	}

	@GET
	@Path("/listItems")
	public List<Item> listItems(@Context HttpServletRequest request) {
		List<Item> listItens = new ArrayList<Item>();
		listItens = visualizador.findItens();
		return listItens;
	}

	@GET
	@Path("/listPontuacao")
	public List<Pontuacao> listPontuacoes(@Context HttpServletRequest request) {
		List<Pontuacao> listPontuacaos = new ArrayList<Pontuacao>();
		listPontuacaos = visualizador.findPontuacoes();
		return listPontuacaos;
	}

	@GET
	@Path("/comprarItem")
	public void efetuaCompra(@Context HttpServletRequest request) {
		Long idPessoa = 0l;
		Long idItem = 0l;
		contabilPontuacao.criaCompra(idItem, idPessoa);
	}

	private Item createMockItem(Long id, String nome, Double preco,
			String descricao, String path) {
		Item item = new Item();
		item.setId(id);
		item.setNome(nome);
		item.setPreco(preco);
		item.setDescricao(descricao);
		item.setPath(path);
		return item;
	}

}
