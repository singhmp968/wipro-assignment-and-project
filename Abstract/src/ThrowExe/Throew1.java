package ThrowExe;
import java.io.*;
public class Throew1 {
	 static void throwOne() 
			    throws FileNotFoundException{
			        System.out.println("Inside throwOne.");
			        throw new FileNotFoundException();}
			        public static void main(String args[]) {
			            try{throwOne();}
			            catch (FileNotFoundException e){
			                System.out.println("Caught " + e);}}}

