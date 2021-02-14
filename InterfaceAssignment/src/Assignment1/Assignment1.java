package Assignment1;
import java.util.Scanner;
public class Assignment1 {
public static void main(String args[])
{System.out.println("enter he book for kids");
Scanner s=new Scanner(System.in);
String a1=s.next();
System.out.println("enter the book category i.e Fiction or kids");
String cate = s.next();	
KidUser k=new KidUser(cate,10);
	k.registerAccount();
	k.requestBook();
	AdultUser a=new AdultUser();
	a.setAge(35);
	a.setBookname("Fiction");
	a.registerAccount();
	a.requestBook();
	
	
	
}
}
