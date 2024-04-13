package week1;

import java.io.IOException;
import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) throws IOException 
	{
		//Scanner class
		System.out.println("Enter your age :");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		System.out.println(age);
		
		
		
		/*
		//technique 2 : BufferReader class
		System.out.println("Enter your age");
		InputStreamReader ir = new InputStreamReader(System.in);
		
		BufferedReader br =new BufferedReader(ir);
		String data = br.readLine();
		int age = Integer.parseInt(data);
		System.out.println(age);
		*/
		
		
		
		
		
		/*
		//technique 1 : read() reads single character and return int data
		System.out.println("Enter your age");
		int age = System.in.read(); //'2' as char
		System.out.println(age); //Ascii of 2 =50
		*/
	}

}
