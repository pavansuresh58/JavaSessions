package week1;

public class StudentData{
	
	//data
	int id;
	String name;
	
	//function 
	public void show()
	{
		System.out.println("Student Id is: "+id);
		System.out.println("Student Name is: "+name);
		
		System.out.println(" ");
	}
	
	public static void main(String [] args)
	{
		StudentData s1 = new StudentData();
		//initialize data 
		s1.id=101;
		s1.name="Seema";
		s1.show();
		
		StudentData s2  = new StudentData();
		s2.id = 102;
		s2.name = "Amit";
		s2.show();
		
		StudentData s3 = new StudentData();
		s3.id=103;
		s3.name="Suresh";
		s3.show();
		
		StudentData s4 =new StudentData();
		s4.id = 104;
		s4.name="Ramesh";
		s4.show();
		
		StudentData s5 = new StudentData();
		s5.id=105;
		s5.name="Naresh";
		s5.show();
		
	}
	
	
}





