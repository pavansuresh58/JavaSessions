package Collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
	/*
	 * ArrayList is class implements List interface
	 * Under line data structure is Dynamic array
	 * Frequent operation for ArrayList is data retrieval
	 * List is Ordered collection
	 * List allowed duplication
	 * 
	 * Default capacity is 10 virtual segment.
	 * ArrayList is non synchronized class
	 * Methods:
	 * add(),get(index),size(),add(index,value),remove(index),isEmpty()
	 * Clear(),contains()
	 * 
	*/

	public static void main(String[] args) 
	{
		//List with Interface
		
		List<Integer> l1 =new ArrayList<Integer>();
		
		
		//Generic way - type safe and no type casting required
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(70);
		a1.add(20);
		
		System.out.println(a1);
		
		int num = a1.get(0);
		System.out.println(num);
		
		
		System.out.println("**********************************");
		
		ArrayList<String> loc = new ArrayList<String>();
		loc.add("Pune");
		loc.add("Mumbai");
		loc.add("Nagpur");
		
		System.out.println(loc);
		
		
		
		
		
		
		/*
		//Non Generic way -1.It is not type safe 2.It need type casting
		ArrayList a1 = new ArrayList();
		a1.add(100);
		a1.add('M');
		a1.add("Sarang");
		a1.add(89.78);
		
		//ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		
		System.out.println(a1);
		
		int num =(int) a1.get(0);
		
		System.out.println(num);
		*/

	}

}
