 package Day11PartOneStringop;

public class FindStringCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
findstrcod("WORLD");
	}
	public static void findstrcod(String str2)
	{
		int sum=0;
	String an="";
		String str1 = "";
		
str1 = str2.toLowerCase();
String st[] = str1.split(" ");
for(String s:st) {
sum=0;

	for(int i=0;i<s.length()/2;i++) {
		
//		System.out.println(s.charAt(s.length()-i-1));
		int a = toCharNum(s.charAt(i)) - toCharNum(s.charAt(s.length()-1-i));
				//System.out.println(toCharNum(s.charAt(i)) - toCharNum(s.charAt(s.length()-i-1)));
	sum+=Math.abs(a);
	}
	if(s.length()%2!=0) {
		sum+=s.charAt(s.length()/2);
	}
	System.out.print(an);
	an+=sum;	
}

//int ans = Integer.parseInt(an);
	System.out.print(an);
	}
	public static int toCharNum(char a) {
		int lt = 0;
		if(a>=97 && a<=122) {
			lt+=a-96;
		}
	return lt;}
}
