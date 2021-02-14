package MainClass;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import Support.Employee;

import Support.Employee;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

List<Employee> ali=new ArrayList<>();
System.out.println("Enter the Number of Employee");
	int empNo=s.nextInt();
	for(int i=1;i<=empNo;i++)
	{
		System.out.println("Enter the First name Employee of " + i);
		String fname=s.next();
		System.out.println("Enter The LastName");
		String lName=s.next();
		System.out.println("Enter the mobile Number");
		long num=s.nextLong();
		System.out.println("Enter the email");
		String email=s.next();
		System.out.println("Enter Address");
		String add=s.next();
		//Employee e=new Employee(fname,lName,num,email,add);
		
		ali.add(new Employee(fname,lName,num,email,add));
	}
	Collections.sort(ali);
	
	System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
	
	Iterator<Employee> it=ali.iterator();
	while(it.hasNext())
	{
		Employee emp=it.next();
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n", 
				emp.getFname(), emp.getlastName(), emp.getMobNum(), 
				emp.getEmailId(), emp.getAdd());	
	}
	
	}

}
