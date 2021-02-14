package SupportClass;

public class RDintrest extends Account {
private double intrestRate;
private double amount;
private int noOfMonths;
private double monthlyAmount;
private int ageOfACHolder;

public double calculateIntrest()
{
	double intrest;
	if(ageOfACHolder<=59) {
	if(noOfMonths>=6&&noOfMonths<9) {
		intrestRate=7.50;
	}
	if(noOfMonths>=9&&noOfMonths<12) {
		intrestRate=7.75;
	}
	if(noOfMonths>=12 && noOfMonths<15) {
		intrestRate=8.00;
	}
	if(noOfMonths>=15 && noOfMonths<18) {
		intrestRate=8.25;
	}
	if(noOfMonths>=18 && noOfMonths<21) {
		intrestRate=8.50;
	}
	if(noOfMonths>=21) {
		intrestRate=8.75;
	}
	}
	else if(ageOfACHolder>=60)
	{
		if(noOfMonths>=6.&&noOfMonths<9) {
			intrestRate=8.00;
		}
		if(noOfMonths>=9&&noOfMonths<12) {
			intrestRate=8.25;
		}
		if(noOfMonths>=12 && noOfMonths<15) {
			intrestRate=8.50;
		}
		if(noOfMonths>=15 && noOfMonths<18) {
			intrestRate=8.75;
		}
		if(noOfMonths>=18 && noOfMonths<21) {
			intrestRate=9.00;
		}
		if(noOfMonths>=21) {
			intrestRate=9.25;
		
}
	}
intrest =amount*intrestRate/100;
return intrest;
}
public void setamt(double amt)
{
	this.amount=amt;
}
public double getamt()
{
	return amount;
}
public void setNomOfmon(int mon)
{
	this.noOfMonths=mon;
}
public int getNomOfmon()
{
	return noOfMonths;
}
public void setmonthlyAmount(double monamt)
{
	this.monthlyAmount=monamt;
}
public double getmonthlyAmount()
{
	return monthlyAmount;
}

public void setageACHol(int age) {
	this.ageOfACHolder=age;
}
public int getageAVHol()
{
	return ageOfACHolder;
}

public double getInterestRate() {
	return interestRate;
}

public void setInterestRate(int interestRate) {
	this.interestRate = interestRate;
}

}
