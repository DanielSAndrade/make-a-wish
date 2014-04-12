package com.ciandt.hackathon.api;

import java.util.Date;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.dao.ProdutoDAO;
import com.ciandt.hackathon.dao.VendaDAO;
import com.ciandt.hackathon.entity.Produto;
import com.ciandt.hackathon.entity.Venda;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/api")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class VendaResource {

	private VendaDAO vendaDAO;

	@Inject
	private ProdutoDAO produtoDAO;

	@Inject
	public VendaResource(VendaDAO vendaDAO) {
		super();
		this.vendaDAO = vendaDAO;
	}

	@POST
	@Path("/insertVenda")
	public Venda insertVenda(@Context HttpServletRequest request,
			@FormParam("idProd") Long idProd,
			@FormParam("precoProd") Double precoProd,
			@FormParam("tipoProd") String tipoProd,
			@FormParam("numMesa") Long numMesa,
			@FormParam("codComp") Long codComp) {

		Produto produto = produtoDAO.findById(idProd);

		Venda venda = new Venda(produto, numMesa, new Date(), codComp);
		vendaDAO.insert(venda);
		return venda;
	}
}
