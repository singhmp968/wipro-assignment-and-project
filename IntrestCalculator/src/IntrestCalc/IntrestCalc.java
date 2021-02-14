package IntrestCalc;
import SupportClass.FDAccount;
import SupportClass.SBAccount;
import SupportClass.Account;
import SupportClass.*;

import java.util.InputMismatchException;
import java.util.Scanner;
public class IntrestCalc {
public static void main(String args[])
{
//	SBAccount f=new SBAccount(1,10000,"normal");
//	System.out.println(f.calculateIntrest());
	try {
	SBAccount sb=new SBAccount();
	FDAccount fd=new FDAccount();
	RDintrest rd=new RDintrest();
	
	Scanner s=new Scanner(System.in);
int a=0;
do {System.out.println("");
	System.out.println("MAIN MENU");
	System.out.println("----------");
	System.out.println("1.Intrest Calculator-SB\n2.Intrest Calculator-FD\n3.Intrest Calculator-RD\n4.Exit\nEnter your Choice");
	
	 a=s.nextInt();
switch(a)
{
case 1:
	
	System.out.println("Enter the Average amount in your account:");
	double amt=s.nextDouble();
	while(amt<100)
	{
		System.out.println("Invalid amount please enter more 100");
		amt=s.nextDouble();
	}

sb.setAmount(amt);
System.out.println("Enter type of account normal or nri");
String tyoFacc=s.next();
sb.setTypeOfAcc(tyoFacc);
System.out.println("Interest gained: " + sb.calculateIntrest());
break;
case 2:
	System.out.println("Enter the FD Amount:");
	double amtfd=s.nextDouble();
	while(amtfd<100)
	{
		System.out.println("Invalid amount please enter more 100");
		amtfd=s.nextDouble();
	}
	fd.setAmt(amtfd);
	System.out.println("Enter the no of Days:");
	int days=s.nextInt();
	while(days<0)
	{
		System.out.println("Invalid Number Of days.please enter Non Negative Value");
		
		days=s.nextInt();
	}
	
	
	fd.setDays(days);
	
	System.out.println("Enter the Age:");
	int age=1;
	
	age=s.nextInt();
	while(age<18)
	{
		System.out.println("age must be greater then 18");
		age=s.nextInt();
	}
	fd.setAge(age);
	System.out.println("Intrest gained is: Rs." +fd.calculateIntrest());

		
	break;
case 3:
	System.out.println("Enter the RD Amount:");
	double amtrd=s.nextDouble();
	while(amtrd<100)
	{
		System.out.println("Invalid amount please enter more 100");
		amtfd=s.nextDouble();
	}

	rd.setamt(amtrd);
	System.out.println("Enter The age of Account Holder:");

	
	rd.setageACHol(s.nextInt());
	System.out.println("Enter Number of Months:");
	rd.setmonthlyAmount(s.nextDouble());
	System.out.println("Intrest gained is: Rs." + rd.calculateIntrest());
	
	
	
	break;	
case 4:
	System.out.println("Thank You");
	break;
	default:
		break;
}
}while(a!=4);
 
}
catch(InputMismatchException e) {
	System.out.println("Input mismatch");
}catch(NumberFormatException nf)
	{
	System.out.println("Number Format exception");
	}
	catch(Exception e) {
		System.out.println("Some problem has occoured");
	}
	
}
}
