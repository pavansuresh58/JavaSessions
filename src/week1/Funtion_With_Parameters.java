package week1;

public class Funtion_With_Parameters {
	/*parameter represent variables
	 * Arguments represent real data
	 */
	
	public void loginToGmail() 
	{
		String email="test@gmail.com";
		String pass = "test123";
		System.out.println("Password is: "+email);
		System.out.println("Password is: "+pass);
	}
	public void loginToAmazon(String email,String pass) //function with 2 parameters
	{
		System.out.println("Password is: "+email);
		System.out.println("Password is: "+pass);
	}
	
	
	public static void main(String[] args)
	{
		Funtion_With_Parameters f1 =new Funtion_With_Parameters ();
		//function with argument
		f1.loginToAmazon("pooja@gmail.com", "test123");
		//function without argument
		f1.loginToGmail();
	}

} 
