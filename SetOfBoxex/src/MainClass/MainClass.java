package MainClass;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import SupportClass.Box;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
		Set<Box> set = new TreeSet<>();
		System.out.println("Enete the Number of Box");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			Box b=new Box();
			System.out.println("Enter " + (i+1) + " box");
			System.out.println("Enter length");
			double l=s.nextDouble();
			b.setLength(l);
			System.out.println("Enete the width");
double w=s.nextDouble();
b.setwidth(w);
System.out.println("Enete Height");
double h=s.nextDouble();
b.setHeight(h);
set.add(b);
		}
		System.out.println("Unique Boxes in set are");
		for(Box bo:set) {
			System.out.println(bo);
		}
	}

}
