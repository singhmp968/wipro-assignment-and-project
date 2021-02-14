package Assignment1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> h1 = new HashSet<>();
Scanner s=new Scanner(System.in);

//	h1.add("das");
//	h1.add("asds");
//	h1.add("sdcds");
for(int i=0;i<5;i++)
{
	h1.add(s.next());
}


Iterator<String> it=h1.iterator();
	
while(it.hasNext())
{
	System.out.println(it.next());
}
	
	}

}
