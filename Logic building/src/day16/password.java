package day16;

import java.util.ArrayList;

public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
abcde(12,1313,122,678,898);
	}
public static void abcde(int i,int j,int k,int l,int m) {
int stbl=0;
int unstbl=0;
	 if(stable(i) == 1)
	 {
		 stbl+=i;
	 }else {
		 unstbl+=i;
	 }
		
	 if(stable(j) == 1)
	 {
		 stbl+=j;
	 }else {
		 unstbl+=j;
	 }
	 if(stable(k) == 1)
	 {
		 stbl+=k;
	 }else {
		 unstbl+=k;
	 }
	 
	 if(stable(l) == 1)
	 {
		 stbl+=l;
	 }else {
		 unstbl+=l;
	 }
	 
	 if(stable(m) == 1)
	 {
		 stbl+=m;
	 }else {
		 unstbl+=m;
	 }
	 System.out.println(stbl);
	 System.out.println(unstbl);
	 System.out.println(stbl-unstbl);

}
public static int stable(int ip) {
	ArrayList<Integer> li=new ArrayList<Integer>();
	String a = "";
	int arr[] =new int[10];
	int l=0;
	a+=ip;
	int cc[] = new int[256];
	for(int i=0;i<a.length();i++) {
		cc[a.charAt(i)]++;
		
	}
	int g=1;
for(int j=0;j<cc.length;j++) {

	if(cc[j]!=0) {
li.add(cc[j]);
	}
	}

	for(int i=0;i<li.size()-1;i++) {
		if(li.get(i) != li.get(i+1)) {
			return 2;
		}
		//System.out.print("one");	

	}
	return 1;
	
	
}
}
