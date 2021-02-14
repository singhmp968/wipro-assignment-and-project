package ListAssign;

public class Employee {

	private int empID;
	String empName;
	String Email;
	String gender;
	String salary;
	
	public int getempID() {
		return empID;}
	public void setempID(int empID) {
		this.empID=empID;}
	
	public String getempName() {
		return empName;}
	public void setempName(String empName) 
	{
		this.empName=empName;}
	public String getEmail() {
		return Email;}
	public void setEmail(String Email) {
		this.Email=Email;}
	public String getGender() {
		return gender;}
	public void setSalary(String salary) {
		this.salary=salary;}
	public String getSalary() {
		return salary;
	}
	public void getEmployeeDetails() {
		System.out.println("Employee ID" + empID + "Employee Name" +
	empName+"Email " + Email + "Geneder "+ gender + "Salary " + salary);
	}
}
