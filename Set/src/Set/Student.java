package Set;

public class Student implements Comparable{

	int rollno; 
	String name; 
	int marks; 
	Student(int rollno,String name,int marks){ 
	    this.rollno=rollno; 
	    this.name=name; 
	    this.marks=marks; }
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
	
		Student student=(Student) obj; 
		if(marks==student.marks) 
		return 0;
		else if(marks>student.marks)
		return 1;
		else 
		return -1;	
	
	}

}
