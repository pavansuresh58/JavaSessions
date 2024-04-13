package oop.DataAbstraction;

public class ChildAbstarct extends AbstractDemo
{
	public void childM()
	{
		System.out.println("Child() This is  child class individual method");
	}
	
		@Override
		public  void show()
		{
			System.out.println("Show() inherited abstract method");
			System.out.println("Show() implemented by its child class");
		}
		
		public static void main(String[] args) 
		{
			//child class ref and child class object
			
			ChildAbstarct c1 = new ChildAbstarct();
			c1.accept(); //inherited
			c1.childM(); //individual
			c1.show();  //inherited abstract method - override
			
			//parent class ref and parent class object -----> Invalid
			
			//Cannot instantiate the type AbstractDemo
			//AbstractDemo d1= new AbstractDemo();
			
			//parent class ref and child class object ------> Valid
			AbstractDemo d1= new ChildAbstarct();
			d1.accept();
			d1.show();
			
			//child class ref and parent class object -----> Invalid
		}

	

}
