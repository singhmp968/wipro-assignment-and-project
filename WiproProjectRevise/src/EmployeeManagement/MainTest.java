package EmployeeManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enete the number of Employeee");
Scanner s=new Scanner(System.in);
int n=s.nextInt();

List<class1> li = new ArrayList<class1>();
for(int i=0;i<n;i++)
{
	System.out.println("Enter Employee" +(i+1) +" Details");
	System.out.println("Enter First Name");
	String fname=s.next();
	//emp.setfName(fname);
	System.out.println("Enter Last Name");
	String lname=s.next();
//emp.setName(lname);
	System.out.println("Enter Mob Number");
	int mob=s.nextInt();
	//emp.setMob(mob);
	System.out.println("Enter Email");
	String Email=s.next();
	//emp.setEmail(Email);
	System.out.println("Enter Address");
	String add=s.next();
	//emp.setAdd(add);
	
	class1 emp=new class1(fname,lname,mob,Email,add);	
	li.add(emp);
	
}
	Collections.sort(li);
System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");

Iterator<class1> it=li.iterator();
	
	while(it.hasNext()) {
		class1 em=it.next();
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n", 
				em.getfName(), em.getlName(), em.getMob(), 
				em.getEmail(), em.getAdd());	
	
	
	}

//	for(class1 p:li)
//	{
//		System.out.println(p);
//	}
	}

}
