package Oops_Inheritance;

class A
{
	public void m1() 
	{
		System.out.println("M1() calling from A class");
	}	
}

class B extends A //A is parent for B-Single level Inheritance
{
	public void m2()  
	{
		System.out.println("M2() calling from B class");
	}	
}
class C extends B //B is a parent for C-Multilevel Inheritance
{
	public void m3()  
	{
		System.out.println("M3() calling from C class");
	}	
}


class D extends A //A is a parent for D-Heirarchical  Inheritance
{
	public void m4()  
	{
		System.out.println("M4() calling from C class");
	}	
}

//class X extends B,D 
/*
 * Multiple Inheritance not supported in java directly
 * Solution is Interface
 */


public class Inheritance_demo1 {

	public static void main(String[] args) 
	{
		//Parent class ref and Parent class object
		System.out.println("Parent class ref and Child class Object ");
		A a1 =new A();
		a1.m1(); //Individual Method

		System.out.println("********************************************");
		
		
		//Child class ref and Child class object
		System.out.println("Child class ref and Parent class Object");
		B b1=new B();
		b1.m2(); //Individual Method
		b1.m1(); //Inherited Method
		
		System.out.println("********************************************");
		
		System.out.println("Parent class ref and Child class Object =(ref)");
		A a2=new B();
		a2.m1();
		
		System.out.println("********************************************");
		
		System.out.println("Child class ref and Parent class Object =(Invalid)");
		//B b2=new A(); // Type Mismatch : Cannot convert from A to B
		
		
		
		/*
		
		System.out.println("********************************************");
		
		C c1=new C();
		c1.m1();  //Inherited Method
		c1.m2();  //Inherited Method
		c1.m3();  //Individual Method
		
		System.out.println("********************************************");
		
		D d1=new D();
		d1.m1();  //Inherited Method
		d1.m4();   //Individual Method
		*/

	}

}
