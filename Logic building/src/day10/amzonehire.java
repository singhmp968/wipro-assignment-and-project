package day10;

public class amzonehire {

	public static void main(String[] args) {
		int arr[]= {1,3,6,1,0,9,8,7,6};
		// TODO Auto-generated method stub
		int n=arr.length;
		int a = minJumps(arr,n);
System.out.println(a);
	}

	private static int minJumps(int[] arr, int n) 
    { 
        int jumps[] = new int[n]; 
        int i, j; 
  
        if (n == 0 || arr[0] == 0) 
            return Integer.MAX_VALUE; 
          jumps[0] = 0; 
        for (i = 1; i < n; i++) { 
            jumps[i] = Integer.MAX_VALUE; 
            for (j = 0; j < i; j++) { 
                if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) { 
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1); 
                    break; 
                } 
            } 
        } 
        return jumps[n - 1]; 
    } 
  }

	


