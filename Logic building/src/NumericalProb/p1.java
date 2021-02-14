package NumericalProb;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
an(582109);
	}
public static void an(int a) {
	int temp=a;
	String st ="";
	st+=a;
	int arr[] =new int[st.length()];
	int k=arr.length-1;
	while(temp!=0) {
		int rem = temp%10;
		arr[k]=rem;
		k--;
		temp/=10;
	}
	double powSum=0;
	for(int i=1;i<arr.length;i++) {
		//System.out.print(i);
	powSum += Math.pow(arr[i-1],arr[i]);
	
	}
System.out.print((int) powSum);
}
}
