package Assignment1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the numver of elemenet in array");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("Eneter the number of Element");
for(int i=0;i<arr.length;i++)
{
	arr[i]=s.nextInt();
	
}
System.out.println("Eneter the Index of Element");

int a;
try {
	a=s.nextInt();
	System.out.println("Enter the index of the array element you want to access");
	System.out.println(arr[a]);
}catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("java.lang.ArrayIndexOutOfBoundsException");
}
catch(InputMismatchException m)
{System.out.println("java.lang.NumberFormatException");
	
}
	}

}
