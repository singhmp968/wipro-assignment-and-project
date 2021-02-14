package SupportClass;

import java.util.ArrayList;
import java.util.Iterator;

public class Class1 {
ArrayList<String> a=new ArrayList<>();


public boolean insert(String it)
{
	if(!a.contains(it)) {
		a.add(it);
		//System.out.println(a);
	return true;}
	
		return false;
}

	public boolean Search(String it)
	{//String ans="";
		Iterator i=a.iterator();
	while(i.hasNext())
	{
	if(i.next().equals(it))
		return true;
	
	}

	return false;}
	
	public boolean Delete(String it)
	{
	if(a.contains(it)) {
		a.remove(it);
		return true;
		
	}
	return false;
	}
	
	public void display() {
		for(String s:a) {
			System.out.println(s);
		}
	}
}
