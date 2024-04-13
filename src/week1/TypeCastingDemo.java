package week1;

public class TypeCastingDemo {
 
	public static void main (String[] args) {
		
		
	/* 
	 * Primitive to Primitive
	 *  1.Implicit
	 *  
	 *  2.Explicit
	 *
	 */
		
	// 1. Implicit small size ---> large size
	// byte -->char-->short--->int--->long--->float---->double		
			int x=89;
			long l1=x;
			System.out.println(l1);
			
			char c1='B';
			int y=c1;
			System.out.println(y);
			
			int z=7898;
			float f1=z;
			System.out.println(f1);
			
			long l2=67786887655L;
			float f2=12;
			System.out.println(f2);
			
	// 2. Explicit Manual casting --->casting operator
	// double--->float--->long--->int--->short--->char--->byte		
		double d1=787655.5677;
		float f3 =(float)d1;
		System.out.println(f3);
		
		int a=(int)d1;
		System.out.println(a);
		
		int b=97;
		char c5=(char) b;
		System.out.println(c5);
		byte b1=(byte) d1;
		System.out.println(b1);
		
		
		
		
		
	}
}
