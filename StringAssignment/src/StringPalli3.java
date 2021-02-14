import java.util.Scanner;

public class StringPalli3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String s1 = s.next();
int l = s1.length();
String ans1 = s1.substring(0,2);
for(int i=0;i<l;i++)
{
	System.out.print(ans1);
}
	}

}
