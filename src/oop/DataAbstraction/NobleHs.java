package oop.DataAbstraction;

//Multiple inheritance in java - interface
public class NobleHs implements IMA,USMA
{
	public void medicalService()
	{
		System.out.println("NobleHs .... Medical");
	}

	@Override
	public void cardio() 
	{
		System.out.println("NobleHs .... CardioService");
		
	}

	@Override
	public void dental() 
	{
		System.out.println("NobleHs .... DentalService");
		
	}

	@Override
	public void nero() {
		System.out.println("NobleHs .... NeroService");
		
	}

	@Override
	public void physio() {
		System.out.println("NobleHs .... physioService");
		
	}

	@Override
	public void covid19Test() 
	{
		System.out.println("NobleHs ........Covid19Test()");
		
	}

}
