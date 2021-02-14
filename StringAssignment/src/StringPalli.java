import java.util.Scanner;
class StringPalli {

public static void main(String args[]) {
Scanner s=new Scanner(System.in);
System.out.println("Enete the string");
String str1=s.nextLine();
String input1 = new String();

boolean b=false;
System.out.print(input1);
int len = str1.length();
for(int i=0;i<len/2;i++)

if(str1.charAt(i) == str1.charAt(len-1))
{
	b=true;
}
else {
	//System.out.println("No");
	b=false;
	break;
}
if(b)
{
	System.out.print("Yes");
}else
	
{
	System.out.print("No");
}



}
}
