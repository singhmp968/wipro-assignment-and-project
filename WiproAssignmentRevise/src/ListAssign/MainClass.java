package ListAssign;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDB db=new EmployeeDB();
Employee emp1 =new Employee();

Employee emp2 =new Employee();
Employee emp3 =new Employee();
emp1.setempID(1);
emp1.setempName("rahul");
emp1.setEmail("dsa@45");
emp1.setSalary("1200");
db.addEmployee(emp1);
emp2.setempID(2);
emp2.setempName("pankah");
emp2.setEmail("dsa@iop");
emp2.setSalary("12000");
db.addEmployee(emp2);
emp3.setempID(1);
emp3.setempName("yadava");
emp3.setEmail("dpoi@45");
emp3.setSalary("14500");
db.addEmployee(emp3);


	
for (Employee emp : db.list1())
	System.out.println(emp.getEmployeeDetails());
}

}
