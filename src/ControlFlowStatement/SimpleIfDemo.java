package ControlFlowStatement;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		
		int age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Valid age!");
		}
		System.out.println("Not a valid age");
	}

}
