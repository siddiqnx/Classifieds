package com.classifieds.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;

import com.classifieds.bean.Item;

@WebServlet("/ItemSelectDAO")
public class ItemSelectDAO {
	public Item returnItem(int itemId) {
		
		String url = "jdbc:mysql://localhost:3306/cityclassifieds";
		String user = "siddiqnx";
		String password = "password";
		String query = "select * from items where item_id=" + itemId;
		
		Item item = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			resultSet.next();
			item = new Item(
							resultSet.getInt("item_id"),
							resultSet.getString("item_category"),
							resultSet.getString("item_title"),
							resultSet.getString("short_description"),
							resultSet.getString("long_description"),
							resultSet.getFloat("item_price"),
							resultSet.getString("item_poster"),
							resultSet.getString("address"),
							resultSet.getLong("contact")				
							);
		} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
		}
		return item;
	}
}
