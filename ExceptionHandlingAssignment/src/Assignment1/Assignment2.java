package Assignment1;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of element in the array");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter the element in the array");
int a=0;
for(int i=0;i<arr.length;i++)
{
	arr[i]=s.nextInt();
	
}
System.out.println("Enter the array element you want to access");
try {
	 a=s.nextInt();
		System.out.println("The array element at index " + a+ "= " + arr[a]);
		System.out.println("The array element successfully accessed");
	
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("wrong");
}
	}

}
