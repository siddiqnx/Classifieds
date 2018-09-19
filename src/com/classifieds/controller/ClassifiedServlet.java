package com.classifieds.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.classifieds.bean.Item;
import com.classifieds.dao.ItemDAO;

@WebServlet("/ClassifiedServlet")	
public class ClassifiedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ClassifiedServlet() {
        super();
    }

    ItemDAO itemDAOObject = new ItemDAO();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ItemDAO itemDAOObject = new ItemDAO();
		RequestDispatcher dispatcher = request.getRequestDispatcher("/home");

		response.setContentType("text/html");

		List<Item> items = itemDAOObject.retuenItemList();
		
		request.setAttribute("item_list", items);
		dispatcher.forward(request, response);
	}
}