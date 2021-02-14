package Assignment1;

import java.io.*;

public class Employee implements Serializable{
private String name;
private String dob;
private String dept;
private String desi;
private double sal;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getDesi() {
	return desi;
}
public void setDesi(String desi) {
	this.desi = desi;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}


public String toString() {
	return "Employee ( name " + name+ " Date Of Birth " + dob + " Department "+ dept + " desiganation " + desi + " Salary" + sal +")";
}

}
