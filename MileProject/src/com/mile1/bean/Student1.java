package com.mile1.bean;

public class Student1 {
private String name;
private int marks[];
public Student1() {
	
}
public Student1(String name,int marks[]) {
	this.name=name;
	this.marks=marks;
}

public int[] getMarks()
{
	return marks;
}
public void setMarks(int marks[]) {
	this.marks=marks;
}

public String getName()
{
	return name;
}
public void setName(String name) {
	this.name=name;
}

}
