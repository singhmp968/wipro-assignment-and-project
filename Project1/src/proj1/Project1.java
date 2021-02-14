package proj1;
import java.util.Scanner;
public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] emplname=new String[]{"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		String[] Joindate=new String[]{"01/04/1999","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};
		String[] Dept=new String[]{"R&D","PM","Accounts","Front Desk","Engineering","Manufacturing","PM"};
		int[] empNo=new int[] {1001,1002,1003,1004,1005,1006,1007};
		int[] hra=new int[]{8000,12000,8000,6000,20000,9000,12000};
		int[] it=new int[]{3000,9000,1000,20000,4400,10000};
		int[] basic=new int[]{20000,30000,10000,12000,50000,23000,29000};
	int empId = Integer.parseInt(args[0]);
char[] dc = new char[]{'e','c','k','r','m','e','c'};	
	int inc1 =-1;
	
	boolean flag = false;
//	for(Integer i:empNo)
//	{ int a=-1;
//	a++;
//	//System.out.println(inc1);
//		if(empId==i) {
//			flag=true;
//		inc1=a;	
//			break;
//	}
//		
//			//else {
////			flag =false;
////		}
		
	//}
	
	
	for(int i=0;i<empNo.length;i++)
	{
		if(empId==empNo[i])
		{
			inc1=i;
			flag=true;
			break;
		}
		}

	
	if(flag = true && inc1!=-1) {
	int eId = empNo[inc1];
	String eName = emplname[inc1];
	String eDept = Dept[inc1];
	int sal = (basic[inc1]+hra[inc1]) - it[inc1];
	String design = "";
	switch(dc[inc1]) {
	case 'e':
		design = "Engineer";
		sal = sal+20000;
		break;
	case 'c':
		design = "Consultant";
		sal = sal+32000;
		break;
	case 'k':
		design = "Clerk";
		sal = sal+12000;
		break;
	case 'r':
		design = "Receptionist";
		sal = sal+15000;
		break;
	case 'm':
		design = "Manager";
		sal = sal+40000;
		break;
	}
	System.out.println("empno \t Name \t Department \t Designation \t Salary");
	System.out.println(eId+"\t "  +eName+"\t" + eDept+"\t   "  +design+"\t  " +sal);
   
	}else if(flag==false) {
		System.out.println("There is no employee with empid : " +empId);

	}
	}
	}



