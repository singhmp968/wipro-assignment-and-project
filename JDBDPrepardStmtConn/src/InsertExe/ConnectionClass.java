package InsertExe;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {

	
	Connection conn;
	String url="jdbc:oracle:thin:@localhost:1521:XE";

	
	Connection 	connectionFactory() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"hr12","root");
		}catch(Exception e) {
			System.out.println("asda");
		}
		return conn;
		}
	
}
