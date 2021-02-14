import java.util.Scanner;
public class StringPalli10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String a=s.next();
String b=s.next();
String c="";
for(int i=0;i<a.length();i++)
{
	if(i!=0 && i!=a.length()-1) {
	if(a.charAt(i)==b.charAt(0))
	{
		c = c+ a.charAt(i-1);
	}
	if(a.charAt(i) == b.charAt(1))
	{
		c+=a.charAt(i+1);
	}
	}
	
	
	}
	
System.out.println(c);
}
}