package Collection1;

import java.util.ArrayList;

public class CollectionMethods {
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
	 ArrayList<Integer> a1 = new ArrayList<Integer>();
	 
	 
	 System.out.println("Is list empty?: "+a1.isEmpty());
	 a1.add(80);
	 a1.add(20);
	 a1.add(30);
	 a1.add(70);
	 a1.add(20);
	 a1.add(60);
	 
	 System.out.println("After adding the elements Is list empty?: "+a1.isEmpty());
	 
	 System.out.println("Total elements are: "+a1.size());
	 System.out.println(a1);
	 
	 //insert the element at 0th position
	 
	 a1.add(0, 10);
	 System.out.println(a1);
	 
	 //remove the element from 3rd position
	 
	 a1.remove(3);
	 System.out.println(a1);
	 
	 //to remove all the elements
	 
	 //a1.clear();
	 //System.out.println(a1);

	 a1.add(90);
	 a1.add(100);
	 a1.add(10);
	 System.out.println(a1);
	 
	 
	 a1.add(null);
	 a1.add(null);
	 //null is unknown value
	 System.out.println(a1);
	 
	 
	 System.out.println("Check for 100? "+a1.contains(100));
	 System.out.println(a1.contains(160));
	
	 System.out.println(a1.get(0));
	 
	}
	
	

}
