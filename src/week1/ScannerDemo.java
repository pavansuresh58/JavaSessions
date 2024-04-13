package week1;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("Enter your phone number");
		long phno = sc.nextLong();
		
		System.out.println("Enter your current location");
		String loc = sc.nextLine();
		
		
		System.out.println(name);
		System.out.println(phno);
		System.out.println(loc);

	}

}
