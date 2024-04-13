package Array_Dem;

import week1.AccessModifierDemo;

public class DifferentPackage extends AccessModifierDemo 
{

	public static void main(String[] args) {
		
		AccessModifierDemo a3 = new AccessModifierDemo();
		
		System.out.println(a3.Name);
		
		DifferentPackage d = new DifferentPackage();
		System.out.println(d.acno);

	}

}
