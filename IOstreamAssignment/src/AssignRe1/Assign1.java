package AssignRe1;
import java.io.*;
import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

System.out.println("Enter the File Name");
String filename = s.nextLine();
System.out.println("Enter the character");
char ch1=s.nextLine().charAt(0);

File file = new File("C://Users//DELL//eclipse-workspace//IOstreamAssignment//bin//AssignRe1//Input.txt");
BufferedReader br=new BufferedReader(new FileReader(file));
int charCount = 0;
int chch;
do {
	chch = br.read();
	if(chch>=65&&chch<=90) 
		chch+=32;
	if(ch1>=65&&ch1<=90)
		ch1+=32;
	if(chch == ch1)
		charCount++;
	
}while(ch1!=-1);

System.out.println("File '" + filename + "' has " +
		charCount + " instances of letter '" + ch1 + "'.");

br.close();
s.close();
}

}
