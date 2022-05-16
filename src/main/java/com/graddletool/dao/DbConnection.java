package com.graddletool.dao;


import java.sql.Connection;
//import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	public Connection connect() {
		java.sql.Connection conn = null;

		try {

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=newdb";
			String user = "Anemoi";
			String pass = "Anemoi@123";
			conn = DriverManager.getConnection(dbURL, user, pass);

			if (conn != null) {
				System.out.println("Connected");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}


}
