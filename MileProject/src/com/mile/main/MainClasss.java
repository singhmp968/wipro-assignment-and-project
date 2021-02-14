package com.mile.main;

import com.mile.exception.NullMarksException;
import com.mile.exception.NullNameException;
import com.mile.exception.NullStudentException;
import com.mile1.bean.Student1;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class MainClasss {
static Student1[] data=new Student1[10];
	static {
		for (int i = 0; i < data.length; i++) 
			data [i]= new Student1(); 
		
		data [0] = new Student1("rahul", new int[] {30, 25, 80});
		data [1] = new Student1("sur", new int[] {100, 40, 0});
		data [2] = new Student1("singh", null);
		data [3] =null; 
		
		data [4] = new Student1("jeevan", new int[] {60,60,60}); // TC1
		data [5] = new Student1("pankaj", new int[] {50, 90, 100}); // TC2
		data [6] = new Student1("Anurag", new int[] {75, 50, 12}); // TC3
		data [7] = null; // TC4
		data [8] = new Student1(null, new int[] {89, 9, 2}); // TC5
		data [9] = new Student1("Abhishek", null); // TC6
		
	}
	
	public static void main(String[] args) throws NullStudentException {
		// TODO Auto-generated method stub
StudentReport sr=new StudentReport();
StudentService ss=new StudentService();
System.out.println("Grad calculate");
String a=null;
for(int i=0;i<data.length;i++) {
	try {
		a=sr.validate(data[i]);
	}catch(NullNameException e) {
		a="NullNameException";
	}
	catch(NullMarksException e) {
		a="NullMarksException";
	}

System.out.println("Grade  + "+ a);
}




System.out.println("Number of Objects with Marks array as null = " +
		ss.findNumberOfNullMarks(data));
System.out.println("Number of Objects with Name as null = " +
		ss.findNumberOfNullNames(data));
System.out.println("Number of Objects that are entierly null = " +
		ss.findNumberOfNullObject(data));

// TC7
System.out.println("TC7: Number of Objects with Name as null = " +
ss.findNumberOfNullNames(data));		
// TC8
System.out.println("TC8: Number of Objects that are entierly null = " +
ss.findNumberOfNullObject(data));
// TC9
System.out.println("TC9: Number of Objects with Marks array as null = " +
ss.findNumberOfNullMarks(data));
}


	
	}




