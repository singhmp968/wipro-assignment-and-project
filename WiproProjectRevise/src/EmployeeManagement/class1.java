package EmployeeManagement;

public class class1 implements Comparable<class1>{
	private String FirstName; 
	private String LastName; 
	private int MobileNumber;
	private String Email; 
	private String Address;

class1(String fName,String lName,int mob,String email,String Add){
	this.FirstName=fName;
	this.LastName=lName;
	this.MobileNumber=mob;
	this.Email=email;
	this.Address=Add;
}
public String getfName()
{return FirstName;
	
}
public void setfName(String fn) {
	this.FirstName=fn;

}
public String getlName()
{return LastName;
	
}
public void setName(String ln) {
	this.LastName=ln;
}

public int getMob()
{return MobileNumber;
	
}
public void setMob(int mob) {
	this.MobileNumber=mob;
}
public String getEmail()
{return Email;
	
}
public void setEmail(String email) {
	this.Email=email;
}
public String getAdd()
{return Address;
	
}
public void setAdd(String add) {
	this.Address=add;
}


@Override
public int compareTo(class1 o) {
	// TODO Auto-generated method stub
	//return (this.getfName()< o.getfName() ? -1 :  (this.getfName()==o.getfName() ? 0 : 1));
	return this.FirstName.compareTo(o.getfName()) * -1;

}
public String toString(){
	return "Name: " +this.FirstName + "LastName " + this.LastName + " mobile" + this.MobileNumber + "Email " + this.Email + " Address " + this.Address;
}


}
