package oop.DataAbstraction;

public class axis implements RBI
{
	public void custDetails()
	{
		System.out.println("Axis .... customerDetails() ");
	}

	@Override
	public void deposit() {
		System.out.println("Axis....deposit() ");
		
		
	}

	@Override
	public void withdraw() {
		System.out.println("Axis....withdrawn() ");
		
	}

	@Override
	public void rateOfInterest() {
		
		System.out.println("Axis....Rate of interest is 9% ");
		
	}
}
