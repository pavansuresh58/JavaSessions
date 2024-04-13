package oop.DataAbstraction;

public class HDFC1 implements RBI1
{
	public void customerDetails()
	{
		System.out.println("HDFC ....  Customers details()");
	}

	@Override
	public void deposite() 
	{
		System.out.println("HDFC ..... deposite()");
	}

	@Override
	public void withdraw() 
	{
		System.out.println("HDFC ..... withdraw()");
	}

	@Override
	public void rateofInterest() 
	{
		System.out.println("HDFC ..... rateofInterest is 8%()");
	}

}
