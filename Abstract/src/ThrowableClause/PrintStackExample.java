package ThrowableClause;
import java.io.*;
public class PrintStackExample {
	 public static void main(String args[]) {
	        try {m1();}
	        catch(IOException e) {
	        	e.printStackTrace();
	        }
	            
	        }
	 static void m1() 
		        throws IOException {
		            m2();}
		            static void m2() throws IOException {
		                m3();}static void m3() throws IOException{throw new IOException();
		                    
		                }

}


