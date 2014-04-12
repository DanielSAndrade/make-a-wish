package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.ProductDAO;
import com.ciandt.hackathon.dao.UserDAO;
import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.entity.PurchaseProduct;
import com.ciandt.hackathon.entity.User;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class PurchaseServlet extends HttpServlet {

	
	@Inject
	private ProductDAO productDao;
	
	@Inject
	private UserDAO userDao;

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
		
		Long userId = Long.valueOf(req.getParameter("userId"));
		String productList = req.getParameter("productList");
		
		//fixme remover
		//productList = "1,1;10,2";
		//userId = 1l;
		
		User foundUser = userDao.findById(userId);
			
		for (String product: productList.split(";")) {
			
			String id = product.split(",")[0];
			String qty = product.split(",")[1];
			PurchaseProduct pp = new PurchaseProduct();
			
			pp.setProductId(Long.valueOf(id));
			pp.setQuantity(Integer.valueOf(qty));
			
			userDao.savePurchaseProduct(pp);
			
			if (foundUser.getPurchaseProductIds()==null)
				foundUser.setPurchaseProductIds(new ArrayList<Long>());
			
			foundUser.getPurchaseProductIds().add(pp.getId());
		}
		
		userDao.saveOrUpdate(foundUser);
		
		req.getRequestDispatcher("/page/purchase.jsp").forward(req, resp);
	}


}
