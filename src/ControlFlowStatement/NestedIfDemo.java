package ControlFlowStatement;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		//a=10,b=20,c=30
		
		if(a>b && a>c)
		{
			System.out.println(a+" is greater than "+b+ " & "+c);
		}
		else if(b>c && b>a)
		{
			System.out.println(b+" is greater than "+c+ " & "+a);
		}
		else
		{
			System.out.println(c+" is greater");
		}

	}

}
