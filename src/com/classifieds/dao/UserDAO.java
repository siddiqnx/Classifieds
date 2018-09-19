package com.classifieds.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.classifieds.bean.User;

public class UserDAO {
	String url = "jdbc:mysql://localhost:3306/cityclassifieds";
	String user = "siddiqnx";
	String password = "password";
	
	public boolean checkUser(String userEmail, String userPassword) {
		try {
			String query = "select * from users where user_email=? and user_password=?";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setString(1, userEmail);
			statement.setString(2, userPassword);
			ResultSet resultSet = statement.executeQuery();
			if(resultSet.next()) {
				return true;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}