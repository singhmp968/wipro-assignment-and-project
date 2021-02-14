package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class mapPallind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abc(251532);
	}
public static  void abc(int a) {
String str="";
str+=a;
if(ispalind(str)==true)
{	System.out.println("-1");
return ;
}
Map<Character,Integer> mp = new HashMap<Character,Integer>();
List<Character> li = new ArrayList<Character>();
char[] strary=str.toCharArray();
for(char c:strary) {
	if(mp.containsKey(c)) {
		mp.put(c,mp.get(c) + 1);
	}
	else {
		mp.put(c, 1);
	}
}
for(Map.Entry entry : mp.entrySet()) {
if(entry.getValue().equals(1)){
	li.add((Character) entry.getKey());
}
	//System.out.println(entry.getKey() + " " + entry.getValue());
}

int ans = Character.getNumericValue(Collections.max(li));
//for(Character i:li) {
//	System.out.println(i);
//}
System.out.println(ans);
}

public static boolean ispalind(String a) {
	int dc = a.length();
	boolean isPalind=true;
	int range = dc/2;
	if(dc%2==0) range--;
	for(int i=0;i<=range;i++) {
		if(a.charAt(i)!=a.charAt(dc -i -1))
			isPalind = false;
	}
	return isPalind;


}



}
