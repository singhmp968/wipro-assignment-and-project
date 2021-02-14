package Assignment1;

public class KidUser implements LibraryUser{
private int age;
private String book;
public KidUser(String book,int age)
{
	this.age=age;
	this.book=book;
}
public void registerAccount() {
	if(age<=12)
	{
		System.out.println("Register sucessfully under kids" );
	}
	else {
		System.out.println("age should be greater then 12");
	}
	
}

public void requestBook () {
	if(book.equals("kids"))
	{
		System.out.println("book issued sucessfully under kids" );
	}else 
	{
		System.out.println("not allowed for kids" );
	}
	}
}

