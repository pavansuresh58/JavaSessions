package Array_Dem;

public class Array2D_Demo {

	public static void main(String[] args) 
	{
	  //using new keyword
		int arr[][] = new int[2][3];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		System.out.println("Total rows are: "+arr.length);		
		System.out.println("Total coloums are: "+arr[0].length);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][2]);  
		
		// System.out.println(arr[1][3]); //java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println("**********************for loop***************************************");
		
		for(int i=0;i<arr.length;i++) { //rows
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("**********************for each loop*************************************");
		
		for(int i[]:arr) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		System.out.println("********************Literal Way*******************************************");
		
		//literal way
		
		int sid[][]= {{10,20},{30,40},{50,60}};
		System.out.println("Total rows are: "+sid.length);
		System.out.println("Total coloums are: "+sid[0].length);
		
		System.out.println(sid[1][0]);
		
		System.out.println("************************for each loop******************************************");
		for(int i[]:sid) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		
		System.out.println("*****************String *************************");
		
		String loc[][]= {{"pune","vimanNagar"},{"Nagpur","location"},{"Mumbai","Virat"}};
		
		for(String i[]:loc) {
			for(String j:i) {
				System.out.print(j+"\t");
			}
			System.out.println("");
		}
		
		
		System.out.println("*************************Assignment*****************");
		
		String ass[][]= {{"Admin","admin123"},{"Pranali","test123"},{"Suresh","srkuna123"},{"pavan","Ramesh@1610"},{"Ramesh","123456"}};
		
		for(String[] i:ass) {
			for(String j:i) {
				System.out.print(j+"\t");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
	}

}
