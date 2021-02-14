package day10;

public class weightOfString {

	public static int weigtOfstr(String input1,int input2) {
		 	String a ="";
		 	a=input1.toLowerCase();
		 	String str[] = a.split(" ");
		 	int sum=0;
		 	if(input2==0)
		 	for(String st : str) {
		 		for(int i=0;i<st.length();i++) {
		 			if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u') {
		 				continue;
		 			}else {
		 				sum+=numToChar(st.charAt(i));
		 			}
		 		}
		 	}
		 	if(input2==1)
			 	for(String st : str) {
			 		for(int i=0;i<st.length();i++) {
			 			
			 				sum+=numToChar(st.charAt(i));
			 			}
			 	}
			return sum;
	}
	public static int numToChar(char a) {
		int lt=0;
		if(a>=97 && a<=122)
		{
			lt=a-96;
		}
	return lt;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(weigtOfstr("hello world",1));
	}

}
