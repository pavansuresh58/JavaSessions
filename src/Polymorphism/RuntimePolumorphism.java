package Polymorphism;

public class RuntimePolumorphism {

	public static void main(String[] args) 
	{
		//Parent class ref and parent class object ===>parent
		
		Parent p1=new Parent();
		p1.color(); //red
		
		
		//Child class ref and child class object ===>parent+child
		
		Child c1=new Child();
		c1.color(); //Yellow
		
		//Parent ref and child object -----> ref matter (parent)
		
		//Parent class method is overrided by child
		Parent p2=new Child();
		p2.color(); //Yellow

	}

}
