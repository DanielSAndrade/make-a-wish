package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.ItemDAO;
import com.ciandt.hackathon.entity.Item;
import com.ciandt.hackathon.entity.ItemType;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class ItemServlet extends HttpServlet {

	@Inject
	private ItemDAO ItemDao;

	@Inject
	private Logger logger;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {

		logger.info("Executing ItemServlet");

		final Item item = new Item("Meus baloes", new Double(50), 5, ItemType.BALLOON);
		ItemDao.insert(item);
		
		logger.info("Item salvo: " + item.getId() );
		
		// read Items
		List<Item> Items = ItemDao.findItens();
		req.setAttribute("items", Items);
		req.setAttribute("itemsSize", Items.size());
		logger.info("Putting " + Items.size() + " Items in memory");

		// //read user context
		// UserService userService = UserServiceFactory.getUserService();
		// User user = userService.getCurrentUser();
		// if (user != null) {
		// req.setAttribute("userAuthenticated", "true");
		// req.setAttribute("nickname", user.getNickname());
		// req.setAttribute("logoutURL",
		// userService.createLogoutURL(req.getRequestURI()));
		// } else {
		// req.setAttribute("userAuthenticated", "false");
		// req.setAttribute("loginURL",
		// userService.createLoginURL(req.getRequestURI()));
		// }

		req.getRequestDispatcher("/items.jsp").forward(req, resp);
	}
}
