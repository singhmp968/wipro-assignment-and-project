package com.mile1.service;

import com.mile.exception.NullMarksException;
import com.mile.exception.NullNameException;
import com.mile1.bean.Student1;

public class StudentReport {
public String findGrade(Student1 so) {
	int marks[]=so.getMarks();
	int marksSum=0;
	for(int i=0;i<marks.length;i++)
	{
		if(marks[i]<35) {
			return "F";
		}else {
			marksSum+=marks[i];
		}
	}
	if(marksSum<=150) { 
		return "d";}
	else if(marksSum>150 && marksSum<=200)
	{
		return "C";
	}
	else if(marksSum>200 && marksSum<=250)
	{
		return "b";
	}
	else if(marksSum>250 && marksSum<=300)
	{
		return "a";
	}
	else 
		return "d";
}


public  String validate(Student1 studentObject) throws NullNameException, NullMarksException {
	if(studentObject ==null) {
		throw new NullNameException();
	}
	else if (studentObject.getName() == null) { 
		throw new NullNameException();
		
	}
	
	else if (studentObject.getMarks() == null) {
		throw new NullMarksException();
		}
return findGrade(studentObject);
}

}
