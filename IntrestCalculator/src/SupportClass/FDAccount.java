package SupportClass;

public class FDAccount extends Account {
private double intrestRate;
private double amount;
private int noOfDays;
private int ageOfACHolder;

//public FDAccount(int noOfDays,double amount,int ageOfACHolder)
//{
//	this.noOfDays=noOfDays;
//	this.amount=amount;
//	this.ageOfACHolder=ageOfACHolder;
//}
public double calculateIntrest()
{
	intrestRate = 0;
	if(amount<10000000 && ageOfACHolder<=59)
	{
		if(noOfDays>=7 && noOfDays<=14)
		{
			intrestRate = 4.50;
		}
		if(noOfDays>=15 && noOfDays<=29)
		{
			intrestRate = 4.75;
		}
		if(noOfDays>=30 && noOfDays<=45)
		{
			intrestRate = 5.50;
		}
		if(noOfDays>=46 && noOfDays<=60)
		{
			intrestRate = 7;
		}
		if(noOfDays>=61 && noOfDays<=184)
		{
			intrestRate = 7.50;
		}
		if(noOfDays>=185 && noOfDays<=366)
		{
			intrestRate = 8.00;
		}
	
	}
	else if(amount<10000000 && ageOfACHolder>=60)
	{
		if(noOfDays>=7 && noOfDays<=14)
		{
			intrestRate = 5.00;
		}
		if(noOfDays>=15 && noOfDays<=29)
		{
			intrestRate = 5.25;
		}
		if(noOfDays>=30 && noOfDays<=45)
		{
			intrestRate = 6.00;
		}
		if(noOfDays>=46 && noOfDays<=60)
		{
			intrestRate = 7.50;
		}
		if(noOfDays>=61 && noOfDays<=184)
		{
			intrestRate = 8.00;
		}
		if(noOfDays>=185 && noOfDays<=366)
		{
			intrestRate = 8.50;
		}
			
		
}else if(amount>10000000) {
	if(noOfDays>=7 && noOfDays<=14)
	{
		intrestRate = 6.50;
	}
	if(noOfDays>=15 && noOfDays<=29)
	{
		intrestRate = 6.75;
	}
	if(noOfDays>=30 && noOfDays<=45)
	{
		intrestRate = 6.75;
	}
	if(noOfDays>=46 && noOfDays<=60)
	{
		intrestRate = 8;
	}
	if(noOfDays>=61 && noOfDays<=184)
	{
		intrestRate = 8.50;
	}
	if(noOfDays>=185 && noOfDays<=366)
	{
		intrestRate = 10.00;
	}
	
}
	double total = amount*intrestRate/100;
	
	return total;
		
	
	
}
public int getAge()
{
	return ageOfACHolder;
}
public void setAge(int age)
{
	this.ageOfACHolder=age;
}
public void setDays(int days)
{
	this.noOfDays=days;
}

public int getDay()
{
	return noOfDays;
}
public double getAmt()
{
	return amount;
}
public void setAmt(double amt)
{
	this.amount=amt;
}
}
