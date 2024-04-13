
package oop.DataAbstraction;

public class BankTest1 {

	public static void main(String[] args)
	{
		HDFC1 h1=new HDFC1();
		h1.customerDetails(); //individual
		h1.deposite(); //inherited abstract
		h1.withdraw(); //inherited abstract
		h1.rateofInterest(); //inherited abstract
		
		
		System.out.println("******************************************************************");
		//RBI1 r1=new RBI1(); //Cannot instantiate the type RBI1
		
		RBI1 r1 = new HDFC1();
		r1.deposite();
		r1.withdraw();
		r1.rateofInterest();
		
		System.out.println("******************************************************************");
		
		Axis1 a1 = new Axis1();
		a1.custDetails();
		a1.deposite();
		a1.withdraw();
		a1.rateofInterest();
		
		
	}
}
