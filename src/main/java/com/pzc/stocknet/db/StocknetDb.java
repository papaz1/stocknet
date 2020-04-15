package com.pzc.stocknet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StocknetDb {
	private static final String url = "jdbc:mysql://localhost";
	private static final String id = "root";
	private static final String sql = "CREATE DATABASE IF NOT EXISTS Screenet";
	private static final String username = "root";
	private static final String password = "root";

	public static void createDatabase() {

		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			try (PreparedStatement statement = conn.prepareStatement(sql)) {
				statement.execute();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
