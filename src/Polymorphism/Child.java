package Polymorphism;

public class Child extends Parent
{
	
	//@ -Rule (Annotation)
	@Override
	public void color()
	{
		System.out.println("Color is Yellow from child");
	}
	
	/*
	 * Child override parent class method
	 */

}
