package IDENTIFYpOSSIBLEwORD;

public class EncodingThreeCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
abc("john","Johny","janardhan");
	}
public static void abc(String a,String b,String c) {
	
	String f="";
	String s="";
	String t="";
	
String []c1=new String[3];
String []c2=new String[3];
String []c3=new String[3];

String[] an = new String[3];
an[0]=a;an[1]=b; an[2]=c;

for(String i: an) {
	if(i.length()%3==0) {
	int k=i.length()/3;
		f=i.substring(0, k);
		int l=k+k;
		s=i.substring(k, l);
		int m=l+k;
		t=i.substring(l, m);
		c1[0]=f;
		c1[1]=s;
		c1[2]=t;
	}
	if(i.length()%3==1) {
		f="";
		s="";
		t="";
		int g=i.length()/2;
		f=i.substring(0,1);
		s=i.substring(g-1,g+1);
		t=i.substring(g+1, i.length());
	c2[0]=f;
	c2[1]=s;
	c2[2]=t;
	}
	if(i.length()%3==2) {
	f="";
	s="";
	t="";
	f=i.substring(0, 2);
	s=i.substring(2, 3);
	t=i.substring(3,i.length());
	c3[0]=f;
	c3[1]=s;
	c3[2]=t;
	}
}	
String op1=c2[0]+c3[0] + c1[0];

String op2=c2[1]+c3[1] + c1[1];

String op3=c2[2]+c3[2] + c1[2];

}
}
