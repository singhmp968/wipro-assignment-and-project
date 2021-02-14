package SupportClass;

public class InvalidAgeException extends Exception {

	public InvalidAgeException()
	{
		super();
		System.out.println("Invalid amount please enter more 100");
	}
}
