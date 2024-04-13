package week1;

public class WrapperClass {
	public static void main(String args[]) {
		/*
		 * To store primitive data in the form of object(Collection Framework).
		 * &
		 * To convert object into primitive we use wrapper class
		 */

			String s1="100";
			System.out.println(s1+100);
			
		//string to int --> Integer wrapper class
			int num =Integer.parseInt(s1);
			System.out.println(num+100);
			
			String s2="22.39";
			System.out.println(s2+11.11);
		//string to double 
		    double d=Double.parseDouble(s2);
		    System.out.println(d+11.11);
		    
		    String s3="True";
		    boolean b=Boolean.parseBoolean(s3);
		    System.out.println(b);
		    
		    
	/*
	 * String is class in java
	 * String is collection of characters
	 * String class have inbuilt methods
	 * Specific character from string use - charAt(index)
	 */
		    
		    String s4="Rohit";
		    char c=s4.charAt(4);
		    System.out.println(c);
		    System.out.println("**************");
		
	     
	//primitive to object(String ---valueOf())
		    
		    int x=200;
		    System.out.println(x+100);
		   // int into string 
		    String ss1 =String.valueOf(x);
		    System.out.println(ss1+100);
		    
		    float f=23.56f;
		    System.out.println(f+11.11f);
		    //float --> string 
		    String ss2=String.valueOf(f);
		    System.out.println(ss2+11.11f);
		
		
	}

}
