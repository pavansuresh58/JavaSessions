package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListIteration {
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


	public static void main(String[] args) {
		 ArrayList<Integer> a1 = new ArrayList<Integer>();
		 a1.add(100);
		 a1.add(40);
		 a1.add(20);
		 a1.add(30);
		 a1.add(10);
		 a1.add(30);
		 
		 System.out.println(a1);

		 System.out.println("***********************Itheration using for loop******************");
		 
		 for(int i=0;i<a1.size();i++)
		 {
			 System.out.println(a1.get(i));
		 }
		 
		 
		 System.out.println("***********************Itheration using  For_Eachloop******************");
		 
		 for(Integer i:a1)
		 {
			 System.out.println(i);
		 }
		 
		 System.out.println("***********************Itheration using Iterator() loop******************");
		 
		 /*
		  * Iterator() is a method return Iterator interface object
		  * HasNext() ===> confirm is list contains elements?
		  * next() ===> return that element and increment counter for next element in list
		  */
		 
		 Iterator<Integer> ir =a1.iterator();
		 
		 while(ir.hasNext())
		 {
			 System.out.println(ir.next());
		 }
		 
		 
		 /*
		  * Collection is interface
		  * Collections is class in java & this class contains static method
		  * sort()
		  */
		 
		 System.out.println("************************************");
		 System.out.println("Before sort: "+a1);
		 
		 Collections.sort(a1);
		 
		 System.out.println("After sort: "+a1);
		 
	}
	
	
	

}
