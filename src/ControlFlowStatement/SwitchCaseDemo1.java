package ControlFlowStatement;

import java.util.Scanner;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
	switch (num) {
	case 0:
		System.out.println("Zero");
		
		break;
	case 1:
		System.out.println("one");
		
		break;
	case 2:
		System.out.println("Two");
		
		break;
	case 3:
		System.out.println("Three");
		
		break;
	case 4:
		System.out.println("Four");
		
		break;
	case 5:
		System.out.println("five");
		
		break;

	default:
		System.out.println("Please provide appropriate number!");
	}

	}

}
