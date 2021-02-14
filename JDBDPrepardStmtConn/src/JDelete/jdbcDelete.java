package JDelete;
import java.sql.*;

import Displaying.ConnectionClass;
public class jdbcDelete {
Connection conn;
jdbcDelete()
{
ConnectionClass x=new ConnectionClass();
conn = x.connectionFactory();
}

void delete(String args[]) throws SQLException {
	String tablename = args[0];
	int empid = Integer.parseInt(args[1]);
	PreparedStatement pst = conn.prepareStatement("delete from " + tablename + " where empid=" + empid);
	int i=pst.executeUpdate();
	conn.close();
}
}
