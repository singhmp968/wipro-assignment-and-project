package Support;

public class Employee implements Comparable<Employee> {
	private String firstName; 
	private String lastName;
	private long mobileNumber; 
	private String emailId;	
	private String address;
	
	public Employee(String firstName,String lastName,long mobileNumber,String email,String address) {
		// TODO Auto-generated constructor stub
		this.firstName=firstName;
		this.lastName=lastName;
		this.mobileNumber=mobileNumber;
		this.emailId=emailId;
		this.address=address;

	}
	public String getFname() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public long getMobNum() {
		return mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getAdd() {
		return address;
	}
public String toString() {
	return "Employee[firstName" + firstName +
			",Last Name"+ lastName + ",Mobile Num"
			+ mobileNumber + ", Email "+ emailId +", Address " + address +"]";
}

@Override
public int compareTo(Employee emp) {
	return this.firstName.compareTo(emp.getFname()) * -1;
}

}
