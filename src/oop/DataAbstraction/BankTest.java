package oop.DataAbstraction;

public class BankTest {

	public static void main(String[] args) 
	{
			hdfc h1=new hdfc();
			h1.customerDetails(); //individual 
			h1.deposit(); //inherited abstract
			h1.withdraw();  //inherited abstract
			h1.rateOfInterest();  //inherited abstract
		
			
			System.out.println("*********************");
			 
			RBI r1=new hdfc();
			r1.deposit();
			r1.withdraw();
			r1.rateOfInterest();
			
			
			System.out.println("*********************");
			
			
			axis a1 =new axis();
			a1.custDetails();
			a1.deposit();
			a1.withdraw();
			a1.rateOfInterest();
			

	}

}
