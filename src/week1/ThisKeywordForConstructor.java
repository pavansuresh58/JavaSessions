package week1;

public class ThisKeywordForConstructor 
{
	//to call constructor we use this()
	
	public ThisKeywordForConstructor()
	{
		this(100);
		System.out.println("This is default constructor calling ...");
	}
	
	public ThisKeywordForConstructor(int number)
	{
		//this(); // default 
		System.out.println("This is parameterized constructor calling ..."+number);
		

	}
	
	public static void main(String[] args) 
	{
		ThisKeywordForConstructor t1 = new ThisKeywordForConstructor();
	}

}
