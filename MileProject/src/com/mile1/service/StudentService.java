package com.mile1.service;

import com.mile1.bean.Student1;

public class StudentService {
public  int findNumberOfNullMarks(Student1 data[]) {
 int nullMark=1;
for(int i=0;i<data.length;i++)
{
try {
	data[i].getMarks();
}catch(Exception a) {
	nullMark++;
}
}
return nullMark;}

public  int findNumberOfNullNames(Student1 data[]) {
	int nullName=0;
	for(int i=0;i<data.length;i++)
	{
		try {
			data[i].getName();
		}catch(Exception e) {
			nullName++;
		}
	}
return nullName++;}


public  int findNumberOfNullObject(Student1 data[]) {
	int nullObj=0;
	for(int i=0;i<data.length;i++) {
		if(data[i]==null)
			nullObj++;
	}
return nullObj;}
}