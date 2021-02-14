import java.util.Scanner;
public class StringPalli7 {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String a = s.next();
	String ans="";
	if(a.charAt(0) == 'x')
			a = a.substring(1,a.length());
	
	if(a.charAt(a.length()-1) == 'x')
	
		a=a.substring(0,a.length()-1);
		

	System.out.print(a);
}
}
