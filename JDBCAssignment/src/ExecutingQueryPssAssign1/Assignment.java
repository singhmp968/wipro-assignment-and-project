package ExecutingQueryPssAssign1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment {
	public static void main(String args[]) throws SQLException {
String url ="jdbc:oracle:thin:@localhost:1521:XE";
Connection conn = null;
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("drive is loaded Sucessfully");
conn = DriverManager.getConnection(url,"hr12","root");
System.out.println("connection established sucessfully");


}catch(ClassNotFoundException e) {
	System.out.println("Connection not Established Successfully");
	
	}catch(SQLException e) {
		System.out.println("2 ndConnection not Established Successfully");
		
	}
String sql = null;
sql = "select empno,ename from emp";
Statement stmt=null;
stmt=conn.createStatement();

	ResultSet rs;
	rs=stmt.executeQuery(sql);
	while(rs.next()) {
		System.out.println("empId "+rs.getInt(1) + " ename " + rs.getString("ename"));
		
	}
	if (stmt != null) stmt.close();		
	if (conn != null) conn.close();
	}
}
