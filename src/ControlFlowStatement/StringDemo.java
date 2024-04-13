package ControlFlowStatement;

public class StringDemo {

	public static void main(String[] args)
	{
		String s1="Hello"; //literal way ----1 object SCP
		String s2= new String("Hello");   //new keyword way 2 object

		System.out.println(s1==s2); //false
		
		String s3="Hello";
		System.out.println(s1==s3);
		
		//String is immutable
		
		s1=s1+"All";
		
		System.out.println(s1==s3);
		
		System.out.println("***************String Methods************************");
		
		//Length()
		String ss1 ="Hello Everyone!";
		System.out.println("Length of the string is: "+ss1.length());
		
		//to get any character from string - charAt(index)
		
		System.out.println("Character at index 8: "+ss1.charAt(8));
		
		/*
		 * equality between string
		 * 1.Exact matching - equals()
		 * 2. equalsIgnoreCase()
		 */
		
		String act = "Selenium WebDriver is WebUI API";
		String exp = "Selenium WebDriver is WebUI api";
		
		System.out.println("With equals(): "+act.equals(exp));
		System.out.println("With equalsIgnoreCase(): "+act.equalsIgnoreCase(exp));
		
		
		//TO UpperCase() to LowerCase()
		
		System.out.println(ss1.toUpperCase());
		System.out.println(ss1.toLowerCase());
		
		
		//partial string match - contains()
		
		System.out.println("Test for API?: "+act.contains("API"));
		System.out.println("Test for api?: "+act.contains("api"));
		
		System.out.println("Test for library?: "+act.contains("library"));
		
		//trim() --> Ignores white space before and after the string
		
		String ss2 ="      welcome all    ";
		System.out.println(ss2.trim());
		
		
		//Start with (Prefix) and ends with (Suffix)
		
		String msg = "Appium is mobile application testing tool";
		System.out.println(msg.startsWith("Appium"));
		System.out.println(msg.startsWith("App"));
		System.out.println(msg.startsWith("A"));
		System.out.println(msg.startsWith("selenium"));
		System.out.println(msg.startsWith("awt"));
		
		System.out.println(msg.endsWith("tool"));
		System.out.println(msg.endsWith("l"));
		System.out.println(msg.endsWith("t"));
		
		//split (Regular expression) RE - pattern matching
		
		String tools = "Selenium,Appium,Postman,API,Jmeter";
		System.out.println(tools);
		
		String arr[] = tools.split(",");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("***************************");
		
		String  cMonth ="Nov 2023";
		String data[] =cMonth.split(" ");
		
		System.out.println(data[0]);
		System.out.println(data[1]);
		/*
		for(int i=0;i<=1;i++) {
			System.out.println(data[i]);
		}
		*/
		
		for(String i:data) {
			System.out.println(i);
		}
		
		System.out.println("******************************************");
		
		/*
		 * Java provides two defined mutable class
		 * String Buffer 		String Builder
		 */
		
		StringBuilder sb = new StringBuilder("Hello");
		
		//StringBuffer b="Hello";
		
		sb.append("All");
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		System.out.println("********************");
		
		StringBuilder b= new StringBuilder("Suresh love some girl but he didn't get due to his career not settled");
		
		System.out.println(b.reverse());
		
		System.out.println("*************************");
		
		String s="Java";
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res =res+s.charAt(i);
			
		}
		System.out.println(res);
		
		
	}

}
