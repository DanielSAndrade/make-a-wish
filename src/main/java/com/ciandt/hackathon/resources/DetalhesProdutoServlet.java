package com.ciandt.hackathon.resources;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.ProdutoDAO;
import com.ciandt.hackathon.entity.Produto;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class DetalhesProdutoServlet extends HttpServlet {

	@Inject
	private ProdutoDAO produtoDAO;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		String idProduto = req.getParameter("idProduto");
		Produto produto = produtoDAO.findById(idProduto);
		
        req.setAttribute("produto", produto);
		
        req.getRequestDispatcher("/produto/detalhes").forward(req, resp);		
		
	}
}
