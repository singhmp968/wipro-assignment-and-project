package Assignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String url = "jdbc:oracle:thin:@localhost:1521:XE";
try {
	Connection conn = DriverManager.getConnection(url,"system","root");
	System.out.println("Connection Established Sucessfully");
	
	}catch(SQLException e) {
		System.out.println("2Connection not Established Successfully");
	}

}
	}
