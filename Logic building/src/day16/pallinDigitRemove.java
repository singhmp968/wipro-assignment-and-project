package day16;

import java.util.ArrayList;
import java.util.List;

public class pallinDigitRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPallindrome("123654123");
		isPallindrome("123123");

	}
	public static void isPallindrome(String a) {
	List<Character> li=new ArrayList<Character>();
	for(int i=0;i<a.length();i++) {
		if(li.contains(a.charAt(i))) {
			li.remove((Character)a.charAt(i));
		}else {
			li.add(a.charAt(i));
		}
	}
	
	if(a.length()%2==0 && li.isEmpty() || a.length()==1 && li.size()==1)
	{
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
	}

}
