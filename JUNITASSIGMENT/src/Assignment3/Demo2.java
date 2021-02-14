package Assignment3;

public class Demo2 {

	public static boolean palindrome(String a)
	{String arev="";
		for(int i=a.length()-1;i>=0;i--)
		{
			arev +=a.charAt(i);
		
		}
		int f=0;
		for(int i=0;i<a.length();i++)
		if(a.charAt(i)==arev.charAt(i))
		{
			f=1;
		}
		else {
			f=0;
			break;
		}
		
		if(f==1)
			return true;
		
		else 
			return false;
		
	}
	
	public static void main(String args[])
	{
		System.out.println(palindrome("yadav"));
	}
	
}
