package com.ciandt.hackathon.resources;

import java.io.IOException;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.dao.MesaRankDAO;
import com.ciandt.hackathon.dao.RequisicaoDeCompraDAO;
import com.ciandt.hackathon.entity.MesaRank;
import com.ciandt.hackathon.entity.Produto;
import com.ciandt.hackathon.entity.Produtos;
import com.ciandt.hackathon.entity.RequisicaoDeCompra;
import com.google.inject.Inject;
import com.google.inject.Singleton;


@Singleton
public class ComprarResource extends HttpServlet {

	private static final long serialVersionUID = -2800214424568495924L;
	private RequisicaoDeCompraDAO requisicaoDecompraDAO;
	private MesaRankDAO mesaRankDAO;

	@Inject
	public ComprarResource(RequisicaoDeCompraDAO requisicaoDecompraDAO, MesaRankDAO mesaRankDAO) {
		super();
		this.requisicaoDecompraDAO = requisicaoDecompraDAO;
		this.mesaRankDAO = mesaRankDAO;
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException {

		if (request.getRequestURI().contains("comprar")) {
		
			int codProduto = Integer.parseInt(request.getParameter("codProduto"));
			int numeroDaMesa = Integer.parseInt(request.getParameter("numeroDaMesa"));
	
			RequisicaoDeCompra requisicaoDeCompra = new RequisicaoDeCompra();
			requisicaoDeCompra.setCodProduto(codProduto);
			requisicaoDeCompra.setNumeroDaMesa(numeroDaMesa);
	
			requisicaoDecompraDAO.insert(requisicaoDeCompra);
			
		} else if (request.getRequestURI().contains("aprovar")) {
		
			int codRequisicao = Integer.parseInt(request.getParameter("codRequisicao"));
			
			RequisicaoDeCompra reqCompra = requisicaoDecompraDAO.get((long)codRequisicao);
			
			if (reqCompra != null) {
				
				MesaRank mesaRank =  mesaRankDAO.get(reqCompra.getNumeroDaMesa());
				
				if (mesaRank == null) {
					mesaRank = new MesaRank();
				}
				
				Produto produto = Produtos.get(reqCompra.getCodProduto());
				
				if (produto != null) {
					mesaRank.acumulaValor(produto.getValor());
				}
				
				mesaRankDAO.insert(mesaRank);
				requisicaoDecompraDAO.delete((long) reqCompra.getNumeroDaMesa());
			}
		}
	}
}
