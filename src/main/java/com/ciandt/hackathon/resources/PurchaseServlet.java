package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.ProductDAO;
import com.ciandt.hackathon.entity.Product;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class PurchaseServlet extends HttpServlet {

	
	@Inject
	private ProductDAO productDao;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		// read products
		List<Product> products = productDao.findAllProducts();
		req.setAttribute("products", products);
		System.out.println("Products Size:" + products.size());

		req.getRequestDispatcher("/page/purchase.jsp").forward(req, resp);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		

		String listaProdutos = req.getParameter("listaProdutos");
		
		listaProdutos.split(";");
		listaProdutos = "cod,qtd;cod,qtd";

		req.getRequestDispatcher("/page/purchase.jsp").forward(req, resp);
	}


}
