package com.ciandt.hackathon.resources;

import com.ciandt.hackathon.MyStorage;
import com.ciandt.hackathon.entity.Table;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by rjfonseca on 12/04/14.
 */
@SuppressWarnings("serial")
@Singleton
public class SignTableServlet extends HttpServlet {

    @Inject
    private Logger logger;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/sign.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tableNumber = req.getParameter("table");
        Integer tableId = Integer.valueOf(tableNumber);
        logger.info(tableNumber);

        Table table = MyStorage.getInstance().tableMap.get(tableId);
        if (table == null) {
            table = new Table(tableId);
            MyStorage.getInstance().addTable(table);
        }
        String password = req.getParameter("password");
        if ("123".equals(password)) {
            req.getSession().setAttribute("table", table);
            resp.sendRedirect("/table");
        } else {
            doGet(req, resp);
        }
    }
}
