package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.ProductDAO;
import com.ciandt.hackathon.dao.TableDAO;
import com.ciandt.hackathon.dao.UserDAO;
import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.entity.Table;
import com.ciandt.hackathon.entity.User;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class SetupServlet extends HttpServlet {

	@Inject
	private ProductDAO productDao;

	@Inject
	private TableDAO tableDao;

	@Inject
	private UserDAO userDao;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		mockProducts();
		mockTable();
		mockUsers();
		resp.getWriter().write("OK");
	}

	private void mockUsers() {

		userDao.deleteAll();

		User user = new User();
		user.setId(1l);
		user.setTableId(1l);


		userDao.saveOrUpdate(user);
	}

	private void mockTable() {

		tableDao.deleteAll();

		Table table = new Table();
		table.setId(1l);

		User user = new User();
		user.setId(1l);
		// user.setProducts(new ArrayList<PurchaseProduct>());

		table.setUserIds(new ArrayList<Long>());
		table.getUserIds().add(1l);

		tableDao.saveOrUpdate(table);
	}

	private void mockProducts() {

		productDao.deleteAll();

		Product product = new Product();

		product.setDescription("Balao 1");
		product.setImageURL("http://uol.com.br/image/gif");
		product.setPrice(10.0);
		product.setPoints(0);
		product.setType("A");

		productDao.insert(product);
	}
}
