package Assignment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the input file ");
String inpFile = s.nextLine();
System.out.println("Enter the output file ");
String outFile = s.nextLine();

File fin = new File("C:\\Users\\DELL\\eclipse-workspace\\IOstreamAssignment\\src\\Assignment2\\Input.txt");
File fout = new File("C:\\Users\\DELL\\eclipse-workspace\\IOstreamAssignment\\src\\Assignment2\\Output.txt");

FileReader fr =null;
FileWriter fw =null;
try {
fr = new FileReader(fin);
fw=new FileWriter(fout);

int co;
while((co= fr.read())!=-1) {
	fw.write(co);
}
//s.close();
	}finally {



	}
fr.close();
fw.close();

	}
	}
