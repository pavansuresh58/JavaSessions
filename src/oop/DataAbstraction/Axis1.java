package oop.DataAbstraction;

public class Axis1 implements RBI1
{
	public void custDetails()
	{
		System.out.println("Axis ..... customerDetails()");
		
	}

	@Override
	public void deposite() 
	{
		System.out.println("Axis ..... deposite()");
	}

	@Override
	public void withdraw() 
	{
		System.out.println("Axis ..... withdraw()");
	}

	@Override
	public void rateofInterest() 
	{
		System.out.println("Axis ..... rateofInterest is 9% ()");
		
	}

}
