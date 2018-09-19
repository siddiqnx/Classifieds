package com.classifieds.controller;	

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.classifieds.bean.Item;
import com.classifieds.dao.ItemSelectDAO;


@WebServlet("/ItemDetails")
public class ItemDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int itemId = Integer.parseInt(request.getParameter("currentItemId"));
		
		ItemSelectDAO itemSelect = new ItemSelectDAO();
		Item currentItem = itemSelect.returnItem(itemId);
		
//		response.getWriter().println(currentItem.getLongDescription());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("itemdetails.jsp");
		request.setAttribute("item", currentItem);
		dispatcher.forward(request, response);
	}
}
