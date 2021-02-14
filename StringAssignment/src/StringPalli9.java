import java.util.Scanner;
public class StringPalli9 {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String a=s.next();
	String b=s.next();
	String str1="";
	int l=a.length() + b.length();
	char ch[] =new char[l];
	System.out.print(l);
	StringBuffer sb = new StringBuffer();

String lon;
if(a.length()>b.length())
{
	lon=a;
}else {
	lon=b;
}

String small;
if(a.length()<b.length())
{
	small = a;
}
else {
	small = b;
}
//for (int i = 0; i < small.length(); i++) {
//	sb.append(a.charAt(i)).append(b.charAt(i));
//}
//sb.append(lon.substring(small.length(),lon.length()));
//
//System.out.print(sb);

for(int i=0;i<small.length();i++)
{
	if(i%2==0)
	{
		ch[i] = a.charAt(i);
	}else {
		ch[i]=b.charAt(i);
	}
	
}

System.out.print(ch);

}
}
