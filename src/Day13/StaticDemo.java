package Day13;

public class StaticDemo 
{		static int a=10;	//static variable
			   int b=20;	//NON-STATIC VARIABLES
	static void m1()	//static method
	{
		System.out.println("this is m1 static method...");
	}
	void m2()		//non-static method
	{
		System.out.println("this is m2 non-static method...");
	}
	void m()	//non-static method
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
public static void main(String[] args)
{	//(1)Static methods can access static stuff directly (without creating object).
	System.out.println(a);
	m1();
//	System.out.println(b); //cannot access, b is non-static
//	m2();   //Non-static methods cannot access non static stuff directly
//	(2) Static methods can access non-static stuff through object
	StaticDemo sd=new StaticDemo();
	System.out.println(sd.b);
	sd.m2();
	
	System.out.println("\n");
//  (3) Non-Static methods can access everything directly.
	sd.m();
	
		
}
}
