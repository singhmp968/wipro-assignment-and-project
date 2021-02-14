package Assignment1;
import java.util.Scanner;
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
try {
	
	int ans=div(a,b);
System.out.println(ans);
}catch(ArithmeticException e)
{
	System.out.println(e);
}
	}
	public static int div(int a,int b) throws ArithmeticException
	{
		int gan=a/b;
		return gan;
	}

}
