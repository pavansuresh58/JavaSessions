package Collection1;

import java.util.LinkedList;

public class LinkenListDemo {
	
	/*
	* LinkedList is class implements List interface
	* Under line data structure is doubly LinkedList
	* LinkedList is non synchronize.
	* Frequent operation is data insertion and deletion
	*/

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		
		System.out.println("Is linkenlist empty: "+l1.isEmpty());
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(20);
		
		System.out.println(l1.size());
				
		System.out.println(l1);
		
		System.out.println(l1.contains(100));
		
		System.out.println(l1.contains(20));
		
		
		//addFirst()    addLast()   getFirst()   and getLast()
		
		l1.addFirst(50);
		l1.addLast(50);
		
		System.out.println(l1);
		
		System.out.println(l1.getFirst());
		
		System.out.println(l1.getLast());
		
		l1.remove(5);
		System.out.println(l1);
		
		
		System.out.println("****************************Iteration****************");
		
		for(Integer i:l1)
		{
			System.out.println(i);
		}
		}

}
