package collection;

import java.util.Vector;

public class VectorDemo {
	
	/*
	 * Vector is class implements List interface
	 * Under line data structure is Dynamic array
	 * Vector is synchronizes
	 * Performance wise vector is slow so we don't follow in real time
	 */

	public static void main(String[] args) {
		
		Vector<Integer>v1=new Vector<Integer>();
		
		System.out.println(v1.isEmpty());
		
		if(v1.isEmpty())
		{
			v1.add(80);
			v1.add(10);
			v1.add(30);
			v1.add(20);
			v1.add(80);
			v1.add(50);
		}
		System.out.println(v1);
		System.out.println(v1.size());

	}

}
