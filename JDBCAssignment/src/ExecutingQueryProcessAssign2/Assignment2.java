package ExecutingQueryProcessAssign2;
import java.sql.*;
public class Assignment2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
String url = "jdbc:oracle:thin:@localhost:1521:XE";
Connection conn =null;
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
System.out.println("*******************************************************************************");


String sql = null;
sql = "select * from emp where sal>1000 and sal<2000";
Statement stmt=null;
stmt =conn.createStatement();
ResultSet rs;
rs= stmt.executeQuery(sql);
while(rs.next()) {
	System.out.println("empId " + rs.getInt("empno") + " ename-" + rs.getString("ename") + " job -" + rs.getString("job"));
}

if (stmt != null) stmt.close();	
if (conn != null) conn.close();
	}

}