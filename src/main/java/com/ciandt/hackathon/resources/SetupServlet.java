package com.ciandt.hackathon.resources;

import java.io.IOException;

import javax.annotation.PostConstruct;
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
public class SetupServlet extends HttpServlet {

	@PostConstruct
	private void setup() {
		mockProducts();
	}

	@Inject
	private ProductDAO productDao;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		mockProducts();
		resp.getWriter().write("OK");
	}

	private void mockProducts() {
		Product product = new Product();

		product.setDescription("Balao 1");
		product.setImageURL("http://uol.com.br/image/gif");
		product.setPrice(10.0);
		product.setPoints(0);
		product.setType("A");

		productDao.insert(product);
	}
}
