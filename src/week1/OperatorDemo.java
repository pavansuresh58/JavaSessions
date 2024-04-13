package week1;

public class OperatorDemo {

	public static void main(String[] args) 
	{
		//Arithmetic operators +,-,*,/,%

		int a = 20, b=10;
		System.out.println("Addition is :"+(a+b));
		System.out.println("Substraction is :"+(a-b));
		System.out.println("Division is :"+(a/b));
		System.out.println("Multiplication is :"+(a*b));
		System.out.println("Modulus is :"+(a%b));
		
		/*
		 * Increment and decrement 
		 * ++
		 * 
		 * post increment
		 * a++
		 * 
		 * Pre increment
		 * ++a
		 */
		
		//post increment
		System.out.println("a="+a);
		System.out.println("a++ :"+a++);
		System.out.println(a);
		
		//Pre increment
		System.out.println("b="+b);
		System.out.println(++b);
		System.out.println(b);
		
		
		int c=90;
		int d=c++;
		
		System.out.println(d);
		System.out.println(c);
		//System.out.println
		
		int e=156;
		int f=e++;
		System.out.println(f);
		System.out.println(e);
		
		int x= 46;
		int y=++x;
		
		System.out.println(y);
		System.out.println(x);
		
		int p=869;
		int q=++p;
		
		System.out.println(q);
		System.out.println(p);
		
		
		//Decrement
		int c1 = 90;
		System.out.println(c1);
		System.out.println(c1--);
		System.out.println(c1);
		
		int d1=57;
		System.out.println(d1);
		System.out.println(--d1);
		
		int a1=78;
		int b1=a1--;
		System.out.println(b1);
		System.out.println(a1);
		
		int r=138;
		int s=r--;
		System.out.println(s);
		System.out.println(r);
		
		int i=49;
		int j=--i;
		System.out.println(j);
		System.out.println(i);
		
		int u=199;
		int v=--u;
		System.out.println(u);
		System.out.println(v);
		
		
		System.out.println("*********Relational operators **********");
		
		//v & u = 198 , p & q =870 , i=48, r=137, s=138
		
		System.out.println("Less than <: "+(i<s));
		System.out.println(s<r);
		System.out.println("Greater than>: "+(q>v));
		System.out.println("Greater than and equal to: >=: "+(p>=q));
		System.out.println("Less than and equal to: <=: "+(p<=s));
		System.out.println((v<=u));
		System.out.println("equal to /comparision operator ==: "+(s==r));
		
		System.out.println("Not equal to != : "+(p!=s));
		System.out.println(u!=v);
		
		
		System.out.println((u==v) && (p==q));
		System.out.println((p<=s) && (u==v));
		System.out.println((p==q) && (p<=s));
		System.out.println((u!=v) && (p<r));
		
		System.out.println("**************************");
		
		System.out.println((u==v) || (p==q));
		System.out.println((p<=s) || (u==v));
		System.out.println((p==q) || (p<=s));
		System.out.println((u!=v) || (p<r));
		
System.out.println("**************************");
		
		System.out.println(p==q);
		System.out.println(!(p==q));
		
		int t =90;
		
		System.out.println(t>90);
		System.out.println(!(t>90));
		
		System.out.println(true);
		System.out.println(!true);
		
		
		System.out.println("*******Compound Operator**************");
		
		
		int l=90;
		System.out.println(l);
		l+=10; //l=l+10
		System.out.println(l);
		
		l-=20; //l=l-20
		System.out.println(l);
		
		l*=2; //l=l*2
		System.out.println(l);
		
		l/=2; //l=l/2
		System.out.println(l);
		
		l%=2; //l=l%2
		System.out.println(l);
		
	}

}
