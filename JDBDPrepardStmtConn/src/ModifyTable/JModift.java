package ModifyTable;
import java.sql.*;
public class JModift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
		    jdbcCallModify e= new jdbcCallModify();
		    e.modify(args);}
		    catch(SQLException e)
		    {System.out.println(e);}
	}

}
