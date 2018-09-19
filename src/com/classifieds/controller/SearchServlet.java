package com.classifieds.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.classifieds.bean.Item;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/home");
		
		String searchString = request.getParameter("search_string");
		String url = "jdbc:mysql://localhost:3306/cityclassifieds";
		String user = "siddiqnx";
		String password = "password";
		String query = "select * from items where UPPER(item_title) like \"%"+searchString.toUpperCase()+"%\"";
		response.getWriter().println("hello");
		List<Item> items = new ArrayList<>();
		response.getWriter().println("hello");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			response.getWriter().println("hello");
			Statement statement = conn.createStatement();
			response.getWriter().println("hello");
			response.getWriter().println("%"+searchString.toUpperCase()+"%");
			response.getWriter().println("hello");
			ResultSet resultSet = statement.executeQuery(query);
			
			response.getWriter().println("hello");
			
			while (resultSet.next()) {
				items.add(new Item(
							resultSet.getInt("item_id"),
							resultSet.getString("item_category"),
							resultSet.getString("item_title"),
							resultSet.getString("short_description"),
							resultSet.getString("long_description"),
							resultSet.getFloat("item_price"),
							resultSet.getString("item_poster"),
							resultSet.getString("address"),
							resultSet.getLong("contact")				
							)
						);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("item_list", items);
		dispatcher.forward(request, response);
	}
}
