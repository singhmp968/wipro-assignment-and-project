import java.util.Scanner;
public class StringPalli4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String a1=s.next();
int l = a1.length();
if(l%2==0)
{
	int mid = l/2;
	System.out.print(a1.substring(0,mid));
}else {
	System.out.print("null");
}
	}

}
