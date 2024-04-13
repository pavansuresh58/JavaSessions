package collection;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		 ArrayList<Integer> a1 = new ArrayList<Integer>();
		 a1.add(10);
		 a1.add(20);
		 a1.add(30);

		 System.out.println(a1);
		 System.out.println(a1.size());
		 System.out.println(a1.get(0));
		 
		 System.out.println("Iteration *********************************");
		 
		 for(Integer i:a1)
		 {
			 System.out.println(i);
		 }
		 
		 
		 
		 System.out.println("*******************************");
		 
		 ArrayList<Double> ad = new ArrayList<Double>();
		 ad.add(90.67);
		 ad.add(34.88);
		 ad.add(68.45);
		 
		 System.out.println(ad);
		 System.out.println(ad.size());
		 
		 
		 System.out.println("Iteration********************");
		 
		 for(Double i:ad)
		 {
			 System.out.println(i);
		 }
		 
		 System.out.println("**************************************");
		 
		 
		 ArrayList<String> name = new ArrayList<String>();
		 name.add("Kumar");
		 name.add("Smita");
		 name.add("Pranita");
		 
		 System.out.println(name);
		 
		 System.out.println("Iteration****************");
		 for(String i:name)
		 {
			 System.out.println(i);
		 }
		 
		 
		 System.out.println("********************************************");
		 
		 ArrayList<Object> list = new ArrayList<Object>();
		 list.add(101);
		 list.add("Sarang");
		 list.add("M");
		 list.add(89.78);
		 list.add(989709876L);
		 
		 System.out.println(list);
		 System.out.println(list.get(0));
		 
		 
		 System.out.println("Iteration**************************");
		 
		 for(Object i:list)
		 {
			 System.out.println(i);
		 }
		 
	}

}
