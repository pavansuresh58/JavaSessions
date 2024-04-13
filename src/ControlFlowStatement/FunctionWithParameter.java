package ControlFlowStatement;

public class FunctionWithParameter {
	/*
	 * Parameter always represent variables
	 * Arguments represent real data
	 */
	
	public void loginToGmail()  //function with 0 parameter
	{ 
		String email="test@gmail.com";
		String pass="test123";
		
		System.out.println("Email id is: "+email);
		System.out.println("Password id: "+pass);
	}

	
	public void loginToAmazon(String email, String pass)  //function with 2 parameters(email,pass)
	{
		System.out.println("User Email  is: "+email);
		System.out.println("User Password is: "+pass);
	}
	
	public static void main(String[] args) {
		
		//function with argument
		FunctionWithParameter f1 =new FunctionWithParameter();
		f1.loginToAmazon("pooja@gmail.com", "test123");
		
		//function without argument
		f1.loginToGmail();
		

	}

}
