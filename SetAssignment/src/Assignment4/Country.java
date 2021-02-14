package Assignment4;

import java.util.Iterator;
import java.util.TreeSet;

public class Country {
TreeSet<String> t1=new TreeSet<>();
public TreeSet<String> saveCountry(String CountryName)
{
	t1.add(CountryName);
	return t1;
}
public void getCountry(String CountryName)
{
	Iterator<String> it=t1.iterator();
boolean a=true;
	while(it.hasNext())
	{
		if(it.next().equals(CountryName))
		{a=true;
				break;	}
	
	
	else {
		a=false;
	}
}
if(a==true)
{
	System.out.println("true");
}else {
	System.out.println("false");
}
}
}
