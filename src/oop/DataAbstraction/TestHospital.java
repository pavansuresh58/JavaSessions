package oop.DataAbstraction;

public class TestHospital {

	public static void main(String[] args) 
	{
		//CHILD CLASS REF AND CHILD CLASS OBJECT
		NobleHs h1=new NobleHs();
		h1.cardio(); //Inherited abstract
		h1.dental();
		h1.medicalService(); //Individual
		h1.nero();
		h1.physio();
		h1.covid19Test();
		
		System.out.println("********************************************");
		
		//parent CLASS REF AND CHILD CLASS OBJECT
		IMA i1 = new NobleHs();
		i1.cardio();
		i1.dental();
		i1.covid19Test();
		
		
System.out.println("********************************************");
		
		//parent CLASS REF AND CHILD CLASS OBJECT
		USMA u1= new NobleHs();
		u1.nero();
		u1.physio();
		u1.covid19Test();
		
		
		
		

	}

}
