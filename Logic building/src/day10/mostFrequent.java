package day10;

public class mostFrequent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =mostfreq(233,233,253,345);
	}
	public static int mostfreq(int ip1,int ip2,int ip3,int ip4) {
		
		String str = "";
		str+=ip1;
				str+=ip2;
				str+=ip3;
				str+=ip4;
		System.out.println(str);
	
		int[] count = new int[256];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
			System.out.println(count[i]);
		}
		int max1=-1;
		char res = 0;
		for(int i=0;i<str.length();i++) {
			if(max1<count[str.charAt(i)]) {
				max1=count[str.charAt(i)];
			res=str.charAt(i);
			}
		}
		
		System.out.println(res);
	return 1;
		}

}
