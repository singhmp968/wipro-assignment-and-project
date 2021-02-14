package Assignment6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assign6 {
public static void main(String args[]) throws NegativeExceptionHandler, ValuesOutOfRange
{
	String str="";
	Scanner s=new Scanner(System.in);
	int arr[]=new int[3];
	try {
			
	for(int i=0;i<2;i++)
	{
		System.out.println("Enter the Student " + i);

		str=s.next();
		System.out.println("Enter the Marks " + i);
	
		for(int j=0;j<arr.length;j++)
		{
			
			arr[j]=s.nextInt();
		
		}
		for(int j=0;j<arr.length;j++) {
		if(arr[j]<0) {
			throw new NegativeExceptionHandler();
		}
		if(arr[j]>100)
		{
			throw new ValuesOutOfRange();
		}
		}
		System.out.println("Name ="+str);
		
		for(int j=0;j<arr.length;j++)
		System.out.println("marks" + j + " "+arr[j]);
		
	}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}catch(InputMismatchException m)
	{System.out.println("java.lang.NumberFormatException");
	
	}catch (ArithmeticException e) {
		System.out.println(e.getMessage());}
}
}
