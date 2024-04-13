package collection;

import java.util.HashSet;

public class HashSetDemo {
	
	/*
	 * HashSet is class implements set interface
	 * Under line data structure is HashTable
	 * HashTable maintains data as per Hash function()
	 * Initially total 16 segments
	 * 
	 * Unordered collection
	 * Unique Objects it maintains
	 * Node
	 * ======
	 * Key|HashCOde|value|next element address|
	 * 
	 */

	public static void main(String[] args) {
		HashSet<Integer> hs =new HashSet<Integer>();
		System.out.println(hs.isEmpty());
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(20);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs );
		
		
		
		
		

	}

}
