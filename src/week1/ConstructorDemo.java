package week1;

public class ConstructorDemo 
{
	//data --instance - current class variable
	int id;
	String name;
	
	//constructor - default
	public ConstructorDemo()
	{
		System.out.println("Student id is :"+id);
		System.out.println("Student name is: "+name);
	}
	
	//parameterized constructor
	public ConstructorDemo(int i, String n) //2 parameters
	{ //set the data to instance variable
		id =1;
		name = n;
		System.out.println("id: "+id);
		System.out.println("name: "+name);
	}
	

	public static void main(String[] args) 
	{
		//calling - real data 
		//object 
		ConstructorDemo c1 = new ConstructorDemo(); //default constructor
		//c1.function1();
		
		ConstructorDemo c2 = new ConstructorDemo(101,"Amit");
		
		
		
		

	}

}
