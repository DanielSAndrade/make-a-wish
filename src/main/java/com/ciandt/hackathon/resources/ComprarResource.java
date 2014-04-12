package com.ciandt.hackathon.resources;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.RequisicaoDeCompraDAO;
import com.ciandt.hackathon.entity.RequisicaoDeCompra;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ComprarResource extends HttpServlet {

	private static final long serialVersionUID = -2800214424568495924L;
	private RequisicaoDeCompraDAO requisicaoDecompraDAO;

	@Inject
	public ComprarResource(RequisicaoDeCompraDAO requisicaoDecompraDAO) {
		super();
		this.requisicaoDecompraDAO = requisicaoDecompraDAO;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse responses) throws ServletException, IOException {
		int codProduto = Integer.parseInt(request.getParameter("codProduto"));
		int numeroDaMesa = Integer.parseInt(request.getParameter("numeroDaMesa"));

		RequisicaoDeCompra requisicaoDeCompra = new RequisicaoDeCompra();
		requisicaoDeCompra.setCodProduto(codProduto);
		requisicaoDeCompra.setNumeroDaMesa(numeroDaMesa);

		requisicaoDecompraDAO.insert(requisicaoDeCompra);
	}
}
