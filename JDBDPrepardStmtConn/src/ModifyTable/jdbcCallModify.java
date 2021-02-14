package ModifyTable;
import java.sql.*;

import Displaying.ConnectionClass;

public class jdbcCallModify {

	Connection conn;
	jdbcCallModify(){
		ConnectionClass	 x=new ConnectionClass();
		conn = x.connectionFactory();
	}
	public void modify(String[] args) throws SQLException {
		String tablename = args[0];
		int empid = Integer.parseInt(args[1]);
		Float sal = Float.parseFloat(args[2]);
		PreparedStatement pst = conn.prepareStatement("update " + tablename + " set salary =" + sal + "where empid=" + empid);
	
	int i=pst.executeUpdate();
	conn.close();
	}
	
}
