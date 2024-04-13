package Array_Dem;

public class Array1D_Demo {

	public static void main(String[] args) 
	{
		/*
		//array - 1D new keyword
		
		int sid[] = new int[5];
		
		//index = 0 to 4
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		sid[3]=104;
		sid[4]=105;
		*/
		
		int sid[] = {101,102,103,104,105};
		
		System.out.println("Length of array: "+sid.length);
		
		System.out.println(sid[3]);
		System.out.println(sid[2]);
		System.out.println(sid[4]);
		
		// System.out.println(sid[5]); //ArrayIndexOutOfBoundsException
		
		
		System.out.println("**********************Iterate array using simple for loop***********");
		
		
		for(int i=0;i<5;i++) {
			System.out.println(sid[i]);
		}
		
		System.out.println("**********************Iterate array using  for each loop***********");
		
		for(int i:sid) {
			System.out.println(i);
		}
		
		String Studentname[] =new String[3];
		Studentname[0]="Mohit";
		Studentname[1]="Smita";
		Studentname[2]="Abhi";
		
		System.out.println("Total students : "+Studentname.length);
		System.out.println(Studentname[0]);
		
		for(int i=0;i<Studentname.length;i++) {
			System.out.println(Studentname[i]);
		}
		
		System.out.println("************************************");
		
		for(String i:Studentname) {
			System.out.println(i);
		}
		
		System.out.println("************************************");
		
		double marks[]=new double[3];
		
		marks[0]=67.69;
		marks[1]=45.78;
		marks[2]=34.78;
		
		System.out.println("Length of array "+marks.length);
		System.out.println("Total marks are: "+(marks[0]+marks[1]));
		
		for(int i=0;i<3;i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("************************************");
		
		for(double i:marks) {
			System.out.println(i);
		}
		
		
		System.out.println("************************************");
		
		//Literal way
		
		Object empdata[] = {"Sarang","Pune",'M',40,9866578765L,89.78};
		
		System.out.println("Length is: "+empdata.length);
		
		System.out.println(empdata[4]);
		
		
		System.out.println("************************************");
		
		for(Object i:empdata) {
			System.out.println(i);
		}
		
		
	}

}
