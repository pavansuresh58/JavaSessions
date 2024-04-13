package Polymorphism;

public class compileTimePoly   {
	
	public void add() // 0 parameter
	{
		System.out.println("Addtion is: "+(100+200));
	}
	
	// 1.number of parameter
	public void add(int a , int b) // 2 parameter
	{
		System.out.println("Addtion is: "+(a+ b));
	}
	
	public void add(int a , int b, int c) // 3 parameter
	{
		System.out.println("Addtion is: "+(a+b+c));
	}
	
	//2.change different type of parameter
	public void add(double a , int b) // 2 parameter
	{
		System.out.println("Addtion is: "+(a+b));
	}
	
	public void add(int a , double b) // 2 parameter
	{
		System.out.println("Addtion is: "+(a+b));
	}
	
	//constructor overloading
	
	compileTimePoly()
	{
		System.out.println("This is default constructor");
	}
	
	compileTimePoly(int id)
	{
		System.out.println("This is Parameterized constructor: "+id);
	}
	
	compileTimePoly(String name)
	{
		System.out.println("This is Parameterized constructor: "+name);
	}
	
	compileTimePoly(int id,String name)
	{
		System.out.println("This is Parameterized constructor: "+id+" & "+name);
	}
	
	compileTimePoly(String name,int id)
	{
		System.out.println("This is Parameterized constructor: "+id+" & "+name);
	}
	
	
	public static void main(String[] args) 
	{ 
			compileTimePoly c1=new compileTimePoly();
			c1.add();
			c1.add(100.11, 200);
			c1.add(10, 100);
			c1.add(10, 210.9);
			c1.add(20,30,40);
			
			compileTimePoly c2=new compileTimePoly(89);
			
			compileTimePoly c3=new compileTimePoly("Reema");
			
			compileTimePoly c4=new compileTimePoly(89,"Reema");
			
			compileTimePoly c5=new compileTimePoly();
			
			compileTimePoly c6=new compileTimePoly("Reema",89);
			

	}

}
