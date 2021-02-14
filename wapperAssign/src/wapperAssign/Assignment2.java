package wapperAssign;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
//int a=s.nextInt();
int a=Integer.parseInt(args[0]);

System.out.println("Binary Number " + Integer.toBinaryString(a));
System.out.println("Octal Number " + Integer.toOctalString(a));
System.out.println("Hexadecimal Number " + Integer.toHexString(a));

	}

}
