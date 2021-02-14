package ListAssign;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {
ArrayList<Employee> list1 = new ArrayList<>();
public boolean addEmployee(Employee e) {
	
		return list1.add(e);
	
}

public boolean deleteEmployee(int empId) {
	Iterator<Employee> it =list1.iterator();
	while(it.hasNext())
	{Employee emp=it.next();
		if(emp.getempID()== empId)
			it.remove();
	return true;
	}
return false;}

public String paySlip(int empid) {
	String str1="";
	Iterator<Employee> it1=list1.iterator();
	while(it1.hasNext()) {
		Employee a=it1.next();
		if(a.getempID()==empid) {
			str1+=a.getSalary();
		}
	}
	return str1;}
}
