package ControlFlowStatement;

public class ForLoopScenarios {

	public static void main(String[] args) 
	{
		//for loop with if
		/*
		 * print all even numbers till 20
		 */
		/*
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number : "+i);
			}
		}
		
		System.out.println("***************************************");
		
		//Nested for loop
		//print table of 2 
		
		for(int i=1; i<=10;i++)
		{
			System.out.println(2*i);
		}
		
		System.out.println("***************************************");
		*/
		/*
		for(int i=1; i<=10; i++) 
		{
			for(int j=1; j<=10; j++) 
			{
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
		*/
		
		int i=123,r,sum=0;
		while(i>0) 
		{
			r=i%10;
			i=i/10;
			sum=sum*10+r;
		}
		System.out.println(sum);
		System.out.println("**************");
		
		
		
		int a=10,b=20;
		
		System.out.println("Before swapping a="+a+ " & b="+b);
		
		//int temp=a;
		//a=b;
		//b=temp;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping a="+a+ " & b="+b);
		
	}

}
