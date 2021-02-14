package SupportClass;

public class SBAccount extends Account {

	private double intrestRate;
	private double amount;
	private String typeOfAcc;
//	public SBAccount(int in,double acc,String toA){
//		this.interestRate=in;
//		this.amount=acc;
//		this.typeOfAcc=toA;
//	}
	public double calculateIntrest()
	{
		double normal,nri;
		if(typeOfAcc.equals("normal")) {
			intrestRate=4;
		}else if(typeOfAcc.equals("nri"))
			{
				intrestRate=6;
			}
		else {
			System.out.println("please enter valid number");
		}
	return amount*intrestRate/100;
	}
	public void setIntrate(double rate)
	{
		this.intrestRate=rate;
	}
	public double getIntrate()
	{
		return intrestRate;
	}
	public void setAmount(double atm)
	{
		this.amount=atm;
	}
	public double getAmount()
	{
		return intrestRate;
	}
public String getTypeOfAcc()
{
	return typeOfAcc;
}
public void setTypeOfAcc(String acc)
{
	this.typeOfAcc=acc;
}


}
