package Day19;
class Parent
{
String name="John";
void m1()
{
System.out.println("This is m1 from Parent class");	
}
}
class Child extends Parent
{
	int id=101;
	void m2()
	{
		System.out.println("This is m2 from Child class");
	}
}
public class TypeCastingObjects1 {
public static void main(String[] args) {
	Child c=new Child();
			c.m1();
			c.m2();
	Parent p=new Child(); //upcasting  child object is being stored in parent.only parent methods & variables can be accessed
	System.out.println(p.name);  //parent								as the variable is of parent
	p.m1(); //parent
	//System.out.println(p.id);  //child    we cannot access
	//p.m2();		//we cannot access anything from child class
	//downcasting
	Parent pt=new Parent();
	Child cd=(Child) pt;
	System.out.println(cd.name);
	System.out.println(cd.id);
	cd.m1();
	cd.m2();
}

}
