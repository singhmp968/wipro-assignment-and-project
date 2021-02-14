package InsertExe;
import java.sql.*;

import Exempe1.ConnectionClass;
public class jdbcCall {

	Connection con;
	public jdbcCall(){
		ConnectionClass x= new ConnectionClass();
		con=x.connectionFactory();
	}
	public void insert(String[] args) throws SQLException {
		String tablename = args[0];
		int empid = Integer.parseInt(args[1]);
		String empname = args[2];
		String dept = args[3];
		String dat = args[4];
		Float salary = Float.parseFloat(args[5]);
		PreparedStatement pst = con.prepareStatement("insert into "+ tablename + " values(?,?,?,?,?) ");

	pst.setInt(1, empid);
	pst.setString(2, empname);
	pst.setString(3, dept);
	pst.setString(4,dat);
	pst.setFloat(4, salary);
	pst.executeUpdate();
	System.out.println("Record inserted Sucessfully");
	}
	
}
