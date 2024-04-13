package oop.DataAbstraction;

public class hdfc implements RBI
{
	public void customerDetails()
	{
		System.out.println("HFDC ....Customer details() ");
	}

	@Override
	public void deposit() {
		
		System.out.println("HDFC....deposit() ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		
		System.out.println("HDFC....withdrawn() ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rateOfInterest() {
		
		System.out.println("HDFC....rateofinterest is 8%  ");
		// TODO Auto-generated method stub
		
	}
}
