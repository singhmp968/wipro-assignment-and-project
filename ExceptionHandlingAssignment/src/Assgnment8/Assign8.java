package Assgnment8;


public class Assign8 {
private int age;
private String name;
	public Assign8(int age2, String name2) {
	// TODO Auto-generated constructor stub
this.age=age;
this.name=name;
	}
public int getAge()
{
	return age;
}
public String getname()
{
	return name;
}
	public void ager() throws LowAge, highage
	{
		if(age<=18)
		{
			throw new LowAge();
		}
		if(age>=60)
		{
			throw new highage();
		}
	}
	


	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=Integer.parseInt(args[0]);
String name = args[1];
		Assign8 a=new Assign8(age,name);
	try {
		a.ager();
	} catch (LowAge e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	} catch (highage e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}	
	}

}
