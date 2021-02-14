package Assign8;
import java.util.Scanner;
public class Assign1 {

	public static void main(String[] args) throws InvalidAge {
		// TODO Auto-generated method stub
//int age=Integer.parseInt(args[0]);
//String name=args[1];
Scanner s=new Scanner(System.in);
		int age=s.nextInt();

String name="rahul";
	if(age<18 || age>=60)
	
		throw new InvalidAge();
	
	System.out.println("age " + age + "name " + name );
		
	}

	}


