package InsertExe;
import java.sql.*;


public class JInsert {
	public static void main(String args[]){
        try {jdbcCall e = new jdbcCall();
        e.insert(args);}
        catch(SQLException e) {
            System.out.println(e.toString());}
	}
}
