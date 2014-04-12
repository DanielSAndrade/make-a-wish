package com.ciandt.hackathon.api;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
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

@Path("/vendas")
//@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
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
		listVendas.add(createVendaMock("Livro 1",1.10));
		listVendas.add(createVendaMock("Livro 2",2.20));
		listVendas.add(createVendaMock("Livro 3",3.30));
		return listVendas;
	}
	
	private Venda createVendaMock(String descProduto, Double preco){
		final Produto produto  = new Produto(descProduto,preco,"Livro");
		final Long numeroMesa = 1l;
		final Date dataRegistro = new Date();
		final Long idComprador = 1l;
		final Venda venda = new Venda(produto,numeroMesa, dataRegistro, idComprador);
		return venda;
	}
	
	
	@GET
	@Path("/test")
	public String test(){
		return "ff";
	}
	
}
