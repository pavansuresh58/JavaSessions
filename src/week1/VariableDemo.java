package week1;

public class VariableDemo {
	/*
	 * instance variable and instance method will get the memory
	 * Object creation
	 * for every new object instance variable get new memory
	 * 
	 * Static variable will get the memory only one time inside class load area and 
	 * same copy of memory will get shared with every object
	 */
	int id;
	static String cName = "StarAgile";
	
	public void display()
	{
		int marks =90; //local 
		System.out.println("student id is :"+id);
		System.out.println("Marks from display(): "+marks);
		System.out.println("Comapny name :"+cName);
	}
	

	public static void main(String[] args) 
	
	{
		int marks = 100; //local variable
		System.out.println("Marks from main(): "+marks);
		
		
		//create object to call anything from class
		VariableDemo v1 = new VariableDemo();
		v1.display();
		v1.id=101;
		System.out.println("Id is :"+v1.id);
		
		
	}
}
