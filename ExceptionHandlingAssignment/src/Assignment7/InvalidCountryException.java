package Assignment7;

public class InvalidCountryException extends Exception {
	InvalidCountryException()
	{super();
		System.out.println("InvalidCountryException has occourde");
		System.out.println("User outside of India is not allowed");
	}
	
	
}
