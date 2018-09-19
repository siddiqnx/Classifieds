package com.classifieds.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddUsersController")
public class AddUsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "jdbc:mysql://localhost:3306/cityclassifieds";
		String user = "siddiqnx";
		String password = "password";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = conn.prepareStatement("insert into users values(?,?,?,?,?,?,?)");
			ps.setNull(1, java.sql.Types.INTEGER);
			ps.setString(2, request.getParameter("user_name"));
			ps.setString(3, request.getParameter("user_email"));
			ps.setString(4, request.getParameter("user_password"));
			ps.setInt(5, Integer.parseInt(request.getParameter("user_age")));
			ps.setLong(6, Long.parseLong(request.getParameter("user_contact")));
			ps.setString(7, request.getParameter("user_picture_url"));
			
			ps.executeUpdate();
			
			response.sendRedirect("login.jsp");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
