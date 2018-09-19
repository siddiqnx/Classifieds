package com.classifieds.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddItemController")
public class AddItemController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddItemController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String url = "jdbc:mysql://localhost:3306/cityclassifieds";
		String username = "siddiqnx";
		String password = "password";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			
			PreparedStatement ps = conn.prepareStatement("insert into items values(?,?,?,?,?,?,?,?,?)");
			
			ps.setNull(1, java.sql.Types.INTEGER);
			ps.setString(2, request.getParameter("item_title"));
			ps.setString(3, request.getParameter("item_short_description"));
			ps.setString(4, request.getParameter("item_long_description"));
			ps.setString(5, "Ron");
			ps.setFloat(6, Float.parseFloat(request.getParameter("item_price")));
			ps.setString(7, request.getParameter("poster_address"));
			ps.setLong(8, Long.parseLong(request.getParameter("poster_contact")));
			ps.setString(9, request.getParameter("item_category"));
			
			ps.executeUpdate();
			
			response.sendRedirect("ClassifiedServlet");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
