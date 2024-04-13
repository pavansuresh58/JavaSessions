package ControlFlowStatement;

import java.util.Scanner;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String data = sc.nextLine();
		char ch =data.charAt(0);
		//char ch='r';
		switch(ch)
		{
		case 'a':
		
			System.out.println(ch+ " is a vowel");
			break;
		case 'e':
			
			System.out.println(ch+ " is a vowel");
			break;
		case 'i':
			
			System.out.println(ch+ " is a vowel");
			break;
		case 'o':
			
			System.out.println(ch+ " is a vowel");
			break;
		case 'u':
			
			System.out.println(ch+ " is a vowel");
			break;
		default:
			System.out.println(ch+ " is not a vowel");
		
		}

	}

}
