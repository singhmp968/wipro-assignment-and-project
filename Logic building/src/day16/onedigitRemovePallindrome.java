package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class onedigitRemovePallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
abc(251532);
	}
public static  void abc(int a) {
	ArrayList<Integer> li = new ArrayList<Integer>();
	ArrayList<Integer> li2 = new ArrayList<Integer>();
	String str = "";
	str+=a;
	int arr[]=new int[256];
	Arrays.fill(arr,0);
	for (int i = 0; i <str.length(); i++) {
		int c=str.charAt(i);
		arr[c]++;
		
	}int o=0;
	for(int i=0;i<256;i++) {
		if((arr[i] & 1) == 1) {
			o++;
		}
	if(o!=0) {
			li.add(arr[i]);
	}}
	
for(int i=0;i<li.size();i++) {
	if(li.get(i)!=0) {
		if(li.get(i)==1) {
	li2.add(li.get(i));
			
		}
	}}
	for(int i=0;i<li2.size();i++) {
	
		System.out.println(li2.get(i));
}
int ans = Collections.max(li2);
}
}
