package Day11PartOneStringop;

import java.util.ArrayList;

public class DecresingSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {11,3,1,4,7,8,12,2,3,7};
		dpSeq(arr);
	}
public static void dpSeq(int arr[]) {
	ArrayList<Integer> li = new ArrayList<Integer>();
	
	int prev=arr[0]-arr[1];
	int c=1;	
	for(int i=2;i<arr.length;i++) {
		int a = arr[i-1] -arr[i];
		System.out.print(a +" " );
		
	if(prev==a) {
		prev = a;
		c++;
	}else {
		prev = a;
	}
	}
System.out.print(c);
}
}
