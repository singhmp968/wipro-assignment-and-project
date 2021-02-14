package Displaying;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JddcCalls {
Connection conn;
 JddcCalls(){
	ConnectionClass x=new ConnectionClass();
	conn = x.connectionFactory();
	
}

void display(String[] args) throws SQLException {
	String tablename = args[0];
	PreparedStatement pst = conn.prepareStatement("select *from" + tablename);
ResultSet rs=pst.executeQuery();
while(rs.next()) {
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getFloat(5)); }
	conn.close();} }


