package ControlFlowStatement;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		//Question 1 ) check two numbers which is greater 
		/*
		int a = sc.nextInt();
		int b = sc.nextInt();
		//int a=100, b=90;
		
		if(a>b)
		{
			System.out.println(a+" is greater than "+ b);
		}
		else
		{
			System.out.println(b+" is greater than "+a);
		}
	*/
		//HomeWork
		//Question 2) Accept a number from user and test number is even or odd
		
		/*
		int a=sc.nextInt();
		//int b=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println(a+" is even number");
		}
		else
		{
			System.out.println(a+ " is odd number");
		}
		*/
		//Question 3) Accept a number from user and test number is positive or negative
		
		int a=sc.nextInt();
		
		if(a>=0)
		{
			System.out.println(a+" is positive number");
		}
		else
		{
			System.out.println(a+ " is negative number");
		
		}
		
	}

}
