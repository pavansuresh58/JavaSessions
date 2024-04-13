package week1;

public class AccesModifier_Demo {
	

	int id =101; //default  // default
	public String name ="Sarang"; //public
	private long phno =979790077L; //private
	protected int acno =979789978; //protected
	
	

	public static void main(String[] args) {
		
		AccesModifier_Demo a1 =new AccesModifier_Demo();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);

	}

}
