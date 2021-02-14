package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mostFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =mostfreq(123,234,345,345);
	}
	public static int mostfreq(int ip1,int ip2,int ip3,int ip4) {
		ArrayList<Integer> li=new ArrayList<Integer>();
		int temp1=ip1;
		while(temp1!=0) {
			int rem=temp1%10;
			li.add(rem);
		temp1/=10;
		}
		
		int temp2=ip2;
		while(temp2!=0) {
			int rem=temp2%10;
			li.add(rem);
		temp2/=10;
		}
		
		int temp3=ip3;
		while(temp3!=0) {
			int rem=temp3%10;
			li.add(rem);
		temp3/=10;
		}
		
		int temp4=ip4;
		while(temp4!=0) {
			int rem=temp4%10;
			li.add(rem);
		temp4/=10;
		}
		
//		for(Integer i:li) {
//			System.out.println(i);
//		}
		Integer[] arr = new Integer[li.size()];
		arr = li.toArray(arr);
//		for(Integer i:arr) {
//			System.out.println(i);
//		}
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		for(int i=0;i<li.size();i++) {
			int k = arr[i];
			if(mp.containsKey(k)) {
				int fe = mp.get(k);
			fe++;
				mp.put(k,fe);
			}else {
				mp.put(k,1);
			}
			
		}
		
		int mc= 0,res=-1;
	
		for(Entry<Integer,Integer> val:mp.entrySet()) {
			if(mc<val.getValue()) {
				res = val.getKey();
				mc = val.getValue();
			}
		}
		System.out.println(mc);
	return mc;}

}
