package Day13;

public class StaticMain {

	public static void main(String[] args)
	{	//(1)Static methods can access static stuff directly (without creating object).
		System.out.println(StaticDemo.a);
		StaticDemo.m1();
//		System.out.println(b); //cannot access, b is non-static
//		m2();   //Non-static methods cannot access non static stuff directly
//		(2) Static methods can access non-static stuff through object
		StaticDemo sd=new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		
		System.out.println("\n");
	//  (3) Non-Static methods can access everything directly.
		sd.m();
		
			
	}
}
