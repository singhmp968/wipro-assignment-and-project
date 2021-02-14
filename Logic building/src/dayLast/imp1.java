package dayLast;

import java.util.ArrayList;
import java.util.List;

public class imp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[4];
		int arr1[] = {3,10,5,6,11};
		int arr2 []= {1,10,3,11};
		 arr = abd(5,arr1,4,arr2);
		 for(Integer l:arr) {
			 System.out.print(l + " ");
	}}
	public static int [] abd(int ip1,int[] ip2,int ip3,int ip4 []) {
		int k=0;
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> li2 = new ArrayList<Integer>();
		for(int i=0;i<ip4.length;i++) {
			for(int j=0;j<ip2.length;j++) {
				if(ip4[i]>=ip2[j]) {
				k++;	
					
					}
				li.add(k);	
			}
				
k=0;		}
	
		int arr[]=new int[4];
		arr[0]=li.get(4);
		arr[1]=li.get(8);
		arr[2]=li.get(12);
		arr[3]=li.get(19);
	
return arr;
	}
//System.out.println(li);
//for(Integer l:arr) {
//System.out.print(l + " ");

	
}

