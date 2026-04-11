package Day12;

public class Adder 
{	//Method Overloading
	int a=10, b=20;
	void sum()         // 1
	{
		System.out.println(a+b);
	}
	void sum(int x, int y)     // 2	Number of parameters should be different.
	{
		System.out.println(x+y+3);
	}
	void sum(int x, double y)     // 3   Data type of parameters should be different.
	{
		System.out.println(x+y+0.5);
	}
	void sum(double x, int y)     // 4     Order of parameters should be different.
	{
		System.out.println(x+y);
	}
	void sum(int a, int b, int c)		// 5
	{
		System.out.println(a+b+c);
	}
}
