package week1;

public class Employee_Details {
	
	//data 
	int id;
	String name;
	String location;
	
	//Function
	
	public void display()
	{
		System.out.println("Employee_ID is :"+id);
		System.out.println("Employee_Name is :"+name);
		System.out.println("Employee_Location is :"+location);
		
		System.out.println("***********************************************");
		
	}

	public static void main(String[] args) 
	{
		Employee_Details e1 = new Employee_Details();
		e1.id =101;
		e1.name ="Suresh";
		e1.location ="Hyderabad";
		e1.display();
		
		
		
		Employee_Details e2 = new Employee_Details();
		e2.id=102;
		e2.name="Ramesh";
		e2.location="Gujarat";
		e2.display();
		
		
		Employee_Details e3 = new Employee_Details();
		e3.id=103;
		e3.name="VaraLakshmi";
		e3.location="Badava";
		e3.display();
		
		Employee_Details e4 = new Employee_Details();
		e4.id=104;
		e4.name="JayaSri";
		e4.location="Chinamamidipalli";
		e4.display();
		
		Employee_Details e5 = new Employee_Details();
		e5.id=105;
		e5.name="Pavani";
		e5.location="Hyderabad";
		e5.display();
		
		Employee_Details e6 = new Employee_Details();
		e6.id=106;
		e6.name="Shanumuk";
		e6.location="Newzealand";
		e6.display();
		
		

	}

}
