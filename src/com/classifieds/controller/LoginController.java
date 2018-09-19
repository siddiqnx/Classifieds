package com.classifieds.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.classifieds.dao.UserDAO;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		if(session.getAttribute("userEmail") != null) {
			response.sendRedirect("logout.jsp");
		}
		else {
			String userEmail = request.getParameter("user_email");
			String userPassword = request.getParameter("user_password");
			response.getWriter().println(userEmail);
			response.getWriter().println(userPassword);
			UserDAO userDAOObject = new UserDAO();
			boolean check = userDAOObject.checkUser(userEmail, userPassword);
			
			if(check) {
				session = request.getSession();
				session.setAttribute("userEmail", userEmail);
				response.sendRedirect("ClassifiedServlet");
			}
			else {
				response.sendRedirect("login.jsp");
			}
		}
	}
	
	
}
