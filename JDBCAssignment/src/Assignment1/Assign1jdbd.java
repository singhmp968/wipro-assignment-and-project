package Assignment1;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Assign1jdbd {
public static void main(String args[]) throws SQLException {
String url="jdbc:oracle:thin:@localhost:1521:XE";
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("drive loaded");
	Connection conn = DriverManager.getConnection(url,"system","root");
	System.out.println("connection established sucessfully");
conn.close();
}catch(ClassNotFoundException e) {
	System.out.println("Connection not Established Successfully");
	
}catch(SQLException e) {
	System.out.println("2Connection not Established Successfully");
	
}
}
}
