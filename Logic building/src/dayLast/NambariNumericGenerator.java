package dayLast;

import java.util.ArrayList;
import java.util.Collections;

public class NambariNumericGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
abc("9860857152");

	}

	private static void abc(String str) {
		// TODO Auto-generated method stub
		long i=Long.parseLong(str);
		//long arr[]=new long[str.length()+1];
		ArrayList<Long> li = new ArrayList<Long>();
		int k=0;
		long temp=i;
		int s=0;
		while(temp!=0) {
			long rem = temp%10;
			li.add(rem);
			
			temp/=10;
		}
		
		
		long sum=0;
		String ans="";
		int p=0;
		Collections.reverse(li);
		sum+=li.get(0);
		//System.out.println(sum);
	if(li.get(0)%2!=0) {
		
		for(int j=1;j<li.size();j++)	
	{
	//System.out.println(li.get(j));
		if(sum%2!=0) {
			
				sum+=li.get(j);
				//System.out.println(li.get(j));
				System.out.println(sum);
			p=j;
			
		}
	else if(sum%2==0){
		ans+=sum;
		sum=li.get(p);
			sum=li.get(j);
			}
		
	}
	}		
		System.out.println(p);
		System.out.println(sum);
		System.out.println(ans);
	

	}
}
	

