package com.ciandt.hackathon.resources;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.ProdutoDAO;
import com.ciandt.hackathon.entity.Produto;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class CadastroProdutosServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException,
			ServletException {

		String nome = req.getParameter("nome");
		String descricao = req.getParameter("descricao");
		String preco = req.getParameter("preco"); 
		String pontos = req.getParameter("pontos");

		Produto p = new Produto();
		p.setDescricao(descricao);
		p.setPreco(Double.parseDouble(preco));
		p.setPontos(Integer.parseInt(pontos));
		p.setNome(nome);

		ProdutoDAO dao = new ProdutoDAO();
		dao.inserir(p);
		resp.sendRedirect("listaProdutos.jsp");

	}
}
