package Set;
import java.util.*;
import java.io.*;
import java.util.Iterator;
public class Test {
public static void main(String args[])
{	TreeSet treeset=new TreeSet();
	treeset.add(new Student(1,"Ajay",66)); 
	treeset.add(new Student(2,"Abhi",96));
	treeset.add(new Student(3,"Sanjai",45));
	Iterator itr=treeset.iterator();
	while(itr.hasNext()){ 
	    Student st=(Student)itr.next(); 
	    System.out.println(st.rollno+":"+st.name+":"+st.age); } 
	}

}