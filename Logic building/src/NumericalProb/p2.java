package NumericalProb;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	an(582109);
}
public static void an(int a) {

String st="";
st+=a;
//String ll="";
//ll=st.substring(1, st.length());
//System.out.println(ll);
int temp=a;
int arr[]=new int[st.length()];
int sum=0;
int k=0;
int op=1;
for(int i=0;i<st.length();i++) {
		sum=0;
	while(temp!=0) {
		int rem = temp%10;
	sum+=rem;
	
	temp/=10;
	}
	arr[k]=sum;
	k++;
	String ak=""; 
	String z=""+st;
	
ak=z.substring(op, st.length());
op++;
	
if(i!=st.length()-1) {
int temp1 = Integer.parseInt(ak);
temp=temp1;}
}
int pon=0;
for(int i=0;i<arr.length;i++) {
	pon+=arr[i];
}
System.out.println(pon);

}
}

