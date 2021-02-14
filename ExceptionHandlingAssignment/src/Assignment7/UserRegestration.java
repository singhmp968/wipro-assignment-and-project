package Assignment7;

public class UserRegestration {
public void registerUser(String username,String userCountry) throws InvalidCountryException
{
	if(userCountry.equals("India"))
	{
		System.out.println("User registration done successfully");
	} else {
		throw new InvalidCountryException();
	}
}

public static void main(String[] args)  {
		// TODO Auto-generated method stub
	UserRegestration u=new UserRegestration();
	try {
		u.registerUser("Rahul","India");
	} catch (InvalidCountryException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
	}

}
