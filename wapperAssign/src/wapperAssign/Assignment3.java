package wapperAssign;
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
String a1=Integer.toBinaryString(a);
	
String op=String.format("%8s", a1).replace(' ', '0');

System.out.println(op);
	}

}
