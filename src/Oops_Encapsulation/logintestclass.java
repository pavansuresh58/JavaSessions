package Oops_Encapsulation;

public class logintestclass {

	public static void main(String[] args) 
	{
		loginpage1 user1 = new loginpage1();
		user1.setUsername("Amit");
		user1.setPassword("amit123");
		user1.doLogin(user1.getUsername(), user1.getPassword()); 

		System.out.println("******************************************************");
		
		loginpage1 user2 = new loginpage1();
		user2.setUsername("Pooja");
		user2.setPassword("pooja123");
		user2.doLogin(user2.getUsername(),user2.getPassword());
		
		

	}

}
