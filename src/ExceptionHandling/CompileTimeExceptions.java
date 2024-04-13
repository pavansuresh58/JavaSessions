package ExceptionHandling;

import java.io.IOException;

public class CompileTimeExceptions {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.out.println("Program started!...");
		
		Thread.sleep(2000);
		
		System.out.println("Program Ends!...");
		
		System.in.read();
		
		Thread.sleep(2000);

	}

}
