package Oops_Inheritance;


	
	class A
	{
		public void m1()
		{
			System.out.println("M1() calling from A class");
		}
	}
	
	class B extends A //A is a parent
	{
		public void m2()
		{
			System.out.println("M2() calling from B class");
		}
	}
	
	class C extends B //A is a parent
	{
		public void m3()
		{
			System.out.println("M3() calling from C class");
		}
	}
	
	class D extends A //A is a parent
	{
		public void m4()
		{
			System.out.println("M4() calling from D class");
		}
	}
	
	public class Inheritance_demo {
		
	public static void main(String[] args) {
		
		
		//Parent class ref and Parent class object
		A a1=new A();
		a1.m1();  //Individual Method
		
		System.out.println("*************************");
		// Child class ref and child class object
		B b1=new B();
		b1.m2(); //Individual Method
		b1.m1(); //Inherited Method
		
		System.out.println("*************************");
		
		C c1=new C();
		c1.m3();   //Individual Method
		c1.m1();  //Inherited Method
		c1.m2();  //Inherited Method
		
		System.out.println("*************************");
		

		D d1=new D();
		d1.m1();  //Inherited Method
		d1.m4();  //Individual Method
		
		

	}

}
