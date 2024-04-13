package Array_Demo;

public class array_2D {

	public static void main(String[] args) {
		
		
	int arr [][]=new int[2][3];
	arr[0][0]=10;
	arr[0][1]=20;
	arr[0][2]=30;
	
	arr[1][0]=40;
	arr[1][1]=50;
	arr[1][2]=60;
	
	System.out.println(arr.length);
	System.out.println(arr[0].length);
	
	//single data
	System.out.println(arr[0][1]);
	System.out.println(arr[1][2]);
	//System.out.println(arr[1][3]);
	
	for(int i=0;i<arr.length;i++)
	{
		for(int c=0;c<arr[i].length;c++)
		{
			System.out.print(arr[i][c]+" ");
		}
		System.out.println();
	}
	
	for(int i[]:arr) //[10,20,30] row
	{
		for(int c:i)
		{
			System.out.print(c+" ");
		}
		System.out.println();
	}
	
	//literal way
	int sid[][]= {{10,20},{30,40},{50,60}};
			System.out.println(sid[0].length);
			System.out.println(sid[1][0]);
			

			for(int i[]:sid) //[10,20,30] row
			{
			for(int c:i)
			{
				System.out.print(c+" ");
			}
			System.out.println();
	}
			
			String loc[][]= {{"pune","vimanNagar"},{"Nagpur","location"},{"Mumbai","Virar"}};
			
			for(String i[]:loc)
			{
				for(String c:i)
				{
					System.out.print(c+"\t");
				}
				System.out.println(); 
			}
			

		StringBuilder sb=new StringBuilder("Hello");
		
		//StringBuffer b="Hello";
		
		sb.append("All");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		String s="Java Selenium";
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res=res+s.charAt(i);
		}
		System.out.print(res);
}
}
