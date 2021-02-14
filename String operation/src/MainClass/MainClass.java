package MainClass;
import java.util.Scanner;

import SupportClass.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s=new Scanner(System.in);
	Class1 cl=new Class1();
	int c=0;
	do {
		
		System.out.println("1.Insert\n2.Search\n3.Delete\n4.Display\n5Exit");
		c=s.nextInt();
		
		switch(c)
		{
		case 1:
			System.out.println("Enter the name element");
			String it=s.next();
			if(cl.insert(it) == true) {
				System.out.println("inserted Sucess fully");
			}
			else {
				System.out.println("already inserted");
							
			}
			break;
		case 2:
			System.out.println("Enter the name element you want to search");
			String it2=s.next();
			if(cl.Search(it2) == true) {
				System.out.println("element is present");
			}
			else {
				System.out.println("Not present");
			
		
		}
			break;
		case 3:
			System.out.println("Enter the name element to be deleted");
			String it3=s.next();
			if(cl.Delete(it3) == true) {
				System.out.println("Deleted  Sucess fully");
			}
			else {
				System.out.println("Not Present");
			}
			break;
		case 4:
			cl.display();
		break;
		}	
			
	}while(c!=5);
	}

}
