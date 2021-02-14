package Day11PartOneStringop;

import java.util.ArrayList;
import java.util.Iterator;

public class dpsequebnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,3,1,4,7,8,12,2,3,7};
		dpSeq(arr);

	}

	
	public static void dpSeq(int arr[]) {
	int c=1;
	ArrayList<Integer> li = new ArrayList<Integer>();
	
		for(int i=1;i<arr.length;i++) {
		int k=0;	
		
		if(arr[i-1]>arr[i]) {
	c++;
}else {
	if(li.contains(1))
	li.add(c);
	
	c=1;
	k++;
}
	}
		Iterator itr = li.iterator(); 
        while (itr.hasNext()) 
        { int x = (Integer)itr.next(); 
        if (x == 1) 
            itr.remove(); 
    } 
		
System.out.print(li);
}
}