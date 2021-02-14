import java.util.Scanner;
public class StringPalli8 {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);

String a=s.next();
int in=a.indexOf('*');

//System.out.print(in);}
if(a.charAt(0) == '*')
{
	String an = a.substring(in+1);
	System.out.print(an);
}
else if(a.charAt(a.length()-1)=='*')
{
	String an= a.substring(0,a.length()-1);
	System.out.print(an);
}

else {
	String an = a.substring(0,in-1) + a.substring(in+2);
	
	System.out.print(an);
	
}
}
}
