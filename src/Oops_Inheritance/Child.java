package Oops_Inheritance;

public class Child extends Parent
{
	int cid=101;
	
	public void childIncome()
	{
		System.out.println("Parent id is: "+super.pid);
		super.parentIncome();
		
		System.out.println("Child id is: "+cid);
		System.out.println("Child Income is $90000");
	}
	
	public Child()
	{
		super(); //super constructor
		System.out.println("This is default constructor from Child");
	}

	public static void main(String[] args) {
		
		Child c1=new Child();
		c1.childIncome();

	}

}
