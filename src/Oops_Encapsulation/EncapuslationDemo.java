package Oops_Encapsulation;


class Employee
{
	//data
	private int id =101;
	private String name ="Meeta";
	private String loc="Hyderabad";
	
	//access - public method for data getter and setter

	public void show()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(loc);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getloc() {
		return loc;
	}
	
	public void setloc(String loc) {
		this.loc=loc;
	}
}

public class EncapuslationDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();
		e1.show();
		e1.setId(201);
		e1.setName("Arti");
		e1.setloc("Bangalore");
		System.out.println(e1.getId() +" "+e1.getName());
		e1.show();
 
	}

}
