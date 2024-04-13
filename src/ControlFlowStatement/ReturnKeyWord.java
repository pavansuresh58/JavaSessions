package ControlFlowStatement;

public class ReturnKeyWord {
	
	//method without return
	public void add() {
		
		int a=100,b=100; //local to add
		System.out.println("Addition is: "+(a+b));
	}
	
	//method with return
	public int  sub() {
		int a = 100,b=50; //local to sub
		return a-b; //return data to calling method
	}
	
	public String msg() {
		String m="Hello All";
		return m;
	}

	public static void main(String[] args) {
		
		//calling method
		ReturnKeyWord r1=new ReturnKeyWord();
		
		//calling add  method
		r1.add();

		int result = r1.sub();
		System.out.println("Substraction is: "+result);
		
		//or
		
		System.out.println("Substraction is: "+r1.sub());
		
		String res=r1.msg();
		System.out.println(res);
		
		
		
		
		
		
		
		
	}

}
