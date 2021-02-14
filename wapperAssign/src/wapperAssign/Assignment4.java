package wapperAssign;
import java.util.Scanner;
public class Assignment4 implements Cloneable{
	private String id;
	public Assignment4(String id)
	{
		this.id=id;
	}
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	
Assignment4 clon() {
	try {
		return (Assignment4) super.clone();
	}catch(CloneNotSupportedException e)
	{
		System.out.println("Cloning Not Allowed");
		return this;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Assignment4 agm=new Assignment4("145");
Assignment4 a1=agm.clon();
a1.setId("698");
System.out.println(a1.getId());
System.out.println(agm.getId());
	}

}
