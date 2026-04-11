package Day14;

class A
{
	int a;		//int a=100;
	void display()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b; 			//int b=200;
	void show()
	{
		System.out.println(b);
	}
}
class C extends B
{
	int c; 				//int c=300;
	void print()
	{
		System.out.println(c);
	}
}
public class InheritanceTypes 
{
public static void main(String[] args) 
{
/*	B bobj=new B();
	
	System.out.println(bobj.a);
	System.out.println(bobj.b);
	
	bobj.display();
	bobj.show();				*/	// single inheritance
	
	C obj=new C();
	
	obj.a=100;
	obj.b=200;
	obj.c=300;
	
	obj.display();
	obj.show();
	obj.print();


}

}
