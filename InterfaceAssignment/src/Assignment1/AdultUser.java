package Assignment1;

public class AdultUser implements LibraryUser{
private int age;
private String bookType;
public void setAge(int age)
{
	this.age=age;
}

public void setBookname(String name)
{
	this.bookType=name;
}
public int getAge(int age)
{
	return age;
}
public String getBookName()
{
	return bookType;
}
public void registerAccount() {
	if(age>12)
	{
		System.out.println("Register sucessfully under kids" );
	}
	else {
		System.out.println("Sorry age must be greater then 12");
	}
}

public void requestBook () {
	if(bookType.equals("Fiction"))
	{
		System.out.println("book issued sucessfully under Adults category" );
	}else 
	{
		System.out.println("not allowed for Adults" );
	}
	}

}
