package Assignment3;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> t1=new TreeSet<>();
Scanner s=new Scanner(System.in);
System.out.print("Enter the 5 String");
for(int i=0;i<5;i++)
{
	t1.add(s.next());
}
System.out.println("Entere the query to be searched");
String q=s.next();
boolean a=false;
Iterator<String> it=t1.iterator();
	while(it.hasNext()) {
	if(it.next().equals(q)) {
		a=true;
		//System.out.println(a);
		break;
	}else {
		a=false;
		//break;
	}
	}
	if(a)
	System.out.println(q+"exist");
	else
		System.out.println(q+" don't exist");
	}

}
