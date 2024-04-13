package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo3 {
	
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
		
		ArrayList<Integer> a1=new ArrayList<Integer> ();
		
		a1.add(100);
		a1.add(40);
		a1.add(20);
		a1.add(30);
		a1.add(10);
		a1.add(30);
		
		System.out.println("***************");
		
		for(int i=0;i<a1.size(); i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("***************");
		
		
		
		for(Integer i:a1)
		{
			System.out.println(i);
		}
		
		System.out.println("*************************************");

		
		Iterator<Integer> ir=a1.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		//before sort
		System.out.println(a1);
		
		Collections.sort(a1);
		
		//after sort
		System.out.println(a1);
		
	}

}
