package Oops_Encapsulation;

public class LoginPageTest {
	
	

	public static void main(String[] args) {
		
		LoginPage user1=new LoginPage();
		user1.setUsername("Amit");
 		user1.setPassword("amit123");
		user1.doLogin(user1.getUsername(), user1.getPassword());
		
		LoginPage user2=new LoginPage();
		user2.setUsername("Pooja");
		user2.setPassword("Pooja123");
		user2.doLogin(user2.getUsername(), user2.getPassword());

	}

}
