package JDelete;

import java.sql.SQLException;

import ModifyTable.jdbcCallModify;

public class Jdelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		    jdbcDelete e= new jdbcDelete();
		    e.delete(args);}
		    catch(SQLException e)
		    {System.out.println(e);}
	}
	}


