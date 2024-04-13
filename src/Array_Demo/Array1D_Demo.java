package Array_Demo;

public class Array1D_Demo {

	private static int i;

	public static void main(String[] args) {
		/*
		int sid[]=new int[5];
		
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		sid[3]=104;
		sid[4]=105;
		System.out.println(sid.length);
		System.out.println(sid[3]);
		
		for(int i=0;i<5;i++)
		{
			System.out.println(sid[i]);
		}
		*/
		String studentName[]=new String[3];
		studentName[0]="Mohit";
	    studentName[1]="Smita";
	    studentName[2]="Abhi";
	    
	    System.out.println(studentName.length);
	    System.out.println(studentName[0]);
	    
	    for(int i=0;i<studentName.length;i++) 
	    {
			System.out.println(studentName[2]);
	    } 
	    
	    for(int i=0;i<studentName.length;i++)
	    {
			System.out.println(studentName[i]);
	    }
	    
	    int sid[] = {10,20,30};
	    for(int i:sid) {
	    	System.out.println(i);
	    }
	    
	}

}
