package Collection1;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	/*
	 * LinkedHashSet is implements Set Interface
	 * Underline data structure is Doubly linked list
	 * It has features of List (It is ordered collection) and Set (It maintains unique elements)
	 * It child class for HashSet
	 */
 	
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(30);
		ls.add(40);
		
		System.out.println(ls.isEmpty());
	}
	}