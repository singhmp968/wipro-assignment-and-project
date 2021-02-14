import java.util.Scanner;
public class StringPalli2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String a1=s.next();
String a2=s.next();
a1=a1.toLowerCase();
a2=a2.toLowerCase();
String ans = a1+a2;
int a = ans.indexOf(',');
String ans2 = ans.substring(0,a) + ans.substring(a+1);
	System.out.print(ans2);
	}
}