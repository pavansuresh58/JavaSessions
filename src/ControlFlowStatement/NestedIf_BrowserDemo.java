package ControlFlowStatement;

import java.util.Scanner;

public class NestedIf_BrowserDemo {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter browser name");
		
	//	String bname = sc.nextLine();
		
		/*
		 * String is class in java so to perform operation on string
		 * we don't use operator
		 * In string class we have ready made methods
		 * 
		 * For testing equality between two strings
		 * 
		 * 1.equals(): exact match the string but it is case sensitive
		 * 
		 * 2.equalsIgnoreCase(): exact match the string but it is not case sensitive
		 */
		/*
		String act = "Hello All";
		String exp = "Hello all";
		
		System.out.println(act.equals(exp)); 
		
		System.out.println(act.equalsIgnoreCase(exp));
		*/
		 /*
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test is executing on chrome!");
		}
		else if(bname.equalsIgnoreCase("firebox"))
		{
			System.out.println("Test is executing on firebox!");
		}
		else if(bname.equalsIgnoreCase("edge"))
		{
			System.out.println("Test is executing on egde!");
		}
		else
		{
			System.out.println("Write valid name for browser!");
		}
*/
		
		Scanner sc = new Scanner(System.in);
		
		String data = sc.nextLine();
		char ch = data.charAt(0);
		/*
		if(ch=='a')
		{
			System.out.println(ch+"  is a vowel");
		}
		else if(ch=='e')
		{
			System.out.println(ch+"  is a vowel");
		}
		else if(ch=='i')
		{
			System.out.println(ch+"  is a vowel");
		}
		else if(ch=='o')
		{
			System.out.println(ch+"  is a vowel");
		}
		else if(ch=='u')
		{
			System.out.println(ch+"  is a vowel");
		}
		else
		{
			System.out.println(ch+" is not a vowel");
		}
		*/
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println(ch+" is  a vowel");
		}
		else
		{
			System.out.println(ch+" is not a vowel");
		}
			
	}

}
