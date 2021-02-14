package com.wipro.sale.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static Connection conn = null;
	public static Connection getDBConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr12","root");
		}catch(Exception e) {
			System.out.println("Could not establshed connection");
		}
		return conn;
		}
}
