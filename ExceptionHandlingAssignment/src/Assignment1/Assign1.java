package Assignment1;
import java.util.Scanner;
public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter an Integer:");
Scanner s=new Scanner(System.in);
String a1=s.next();
int sq=1;
try {
	int num=Integer.parseInt(a1);
sq=num*num;;
	System.out.println("the Square value is : "+sq);
	System.out.println("The Work is done Sucessfully");
}
catch(NumberFormatException e)
{
	System.out.println("Enter input is not valid format for an Integer");
}
	}

}
