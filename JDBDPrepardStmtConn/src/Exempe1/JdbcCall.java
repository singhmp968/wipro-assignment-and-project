package Exempe1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcCall {
Connection conn;

public JdbcCall(){

ConnectionClass x=new ConnectionClass();
conn = x.connectionFactory();
	

}


void create(String [] args) throws SQLException {
	String tablename = args[0];
	PreparedStatement pst = conn.prepareStatement("Create Table" + tablename +"(empId number(4),empname varchar(20),dept varchar2(20),joindate date,salary(number(10,2)))");
pst.executeUpdate();
}


}