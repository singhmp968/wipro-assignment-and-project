import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=0;
try{
 n=Integer.parseInt(args[0]);

}
catch(NumberFormatException g)
{
	System.out.println("Enter input is not valid format for an Integer");
return;
}
	

Scanner s=new Scanner(System.in);
try {
int sum=0;
int avg=1;
if(n!=0){
System.out.println("Eneter the number of Element");
int arr[]=new int[n];

	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
	sum=sum+arr[i];
	}
	avg=sum/n;

System.out.println("Sum = " + sum + " " + "Average =" + avg);
}
}catch(ArithmeticException e) {
	System.out.println("java.lang.ArithmeticException");
}catch(InputMismatchException m)
{
	System.out.println("java.lang.InputMismatchException");
}
	
}


}