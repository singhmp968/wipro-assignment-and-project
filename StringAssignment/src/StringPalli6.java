import java.util.Scanner;
public class StringPalli6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String a = s.next();
String b=s.next();
String c;
if(a.length()<b.length())
{
	c= a+b+a;

}else {
	c=b+a+b;
}
System.out.print(c);
	}

}
