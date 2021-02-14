package Assignment1;

import java.util.HashSet;
import java.util.Iterator;

public class Class1 {


HashSet<String> h=new HashSet<>();

public HashSet<String> saveCountry(String CountryName)
{
	h.add(CountryName);
	return h;
}
boolean a=false;
public void getCountry(String CountryName) {
	Iterator<String> it = h.iterator();
	while(it.hasNext()) {
		if(it.next().equals(CountryName)) {
		 a=true;
		System.out.println(a);
		break;
	}
		else {
		a=false;	
			System.out.println(a);
			break;
		}
		}
}

}
