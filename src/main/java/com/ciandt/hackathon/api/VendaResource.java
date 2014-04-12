package com.ciandt.hackathon.api;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import com.ciandt.hackathon.dao.ProdutoDAO;
import com.ciandt.hackathon.dao.VendaDAO;
import com.ciandt.hackathon.entity.Produto;
import com.ciandt.hackathon.entity.Venda;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/vendas")
//@ThreadSafe
//@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class VendaResource {

	private VendaDAO vendaDAO;

	private ProdutoDAO produtoDAO;

	@Inject
	public VendaResource(VendaDAO vendaDAO,ProdutoDAO produtoDAO) {
		super();
		this.vendaDAO = vendaDAO;
		this.produtoDAO = produtoDAO;
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
	
	@GET
	@Path("/listVendas")
	public List<Venda> listVendas(@Context HttpServletRequest request) {
		List<Venda> listVendas= vendaDAO.findVendas();
		return listVendas;
	}
	
	@GET
	@Path("/test")
	public String test(){
		return "ff";
	}
	
}
