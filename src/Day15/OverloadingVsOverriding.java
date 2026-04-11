package Day15;
class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
}
class XYZ extends ABC
{
	void m1(int a)		//Overriding
	{
		System.out.println(a*a);  //Implementation only is being changed here
	}
	void m2(int a, int b)    //Overloading
	{
		System.out.println(a+b);   
	}
}
public class OverloadingVsOverriding 
{
public static void main(String[] args)
{
	XYZ xyzobj=new XYZ();
	xyzobj.m1(10);		//OVERRIDED METHOD
	xyzobj.m2(20);		//INHERITED METHOD
	xyzobj.m2(1000,2000);	//OVERLOADED METHOD

}

}
