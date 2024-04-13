package week1;

public class ConstructorWithThis 
{
	//instance
	int id;
	String name;
	
	//constructor --->parameterized 
	public ConstructorWithThis(int id,String name) //local variable
	{
		//name conflict 
		this.id =id;
		this.name = name;
		
	}
	
	public void show()
	{
		System.out.println("Student id is :"+id);
		System.out.println("Student name: "+name);
	}

	public static void main(String[] args) 
	{
		ConstructorWithThis c1 = new ConstructorWithThis(101,"Parang");
		c1.show();

	}

}
