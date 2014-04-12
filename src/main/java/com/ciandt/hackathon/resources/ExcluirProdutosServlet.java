package com.ciandt.hackathon.resources;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.ProdutoDAO;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class ExcluirProdutosServlet extends HttpServlet { 

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,
			ServletException {
		ProdutoDAO dao = new ProdutoDAO();
		dao.removerPorKey(Long.parseLong(req.getParameter("id")));
		resp.sendRedirect("listaProdutos.jsp");
	}

}
