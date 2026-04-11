package Day16;
interface Shape
{
	int length=10;  // the variable is final & static variable
	int width=20;   // final & static variable
	
	void circle();				 //Abstract Method   here access modifier for circle is public
	
	default void square()		 //Default Method
	{
		System.out.println("This is a Square...");
	}
	static void rectangle()		//static Method
	{
		System.out.println("This is Rectangle...");
	}
}
public class InterfaceDemo implements Shape 
{
	public void circle()   //Here the access modifier if we dont specify will be default which will be an error so we 
	{					   // have to specify the circle method as public. As default << public
		System.out.println("This is Circle...Abstract Method");
	}
	void triangle()
	{
		System.out.println("This is a Triangle...");
	}
	int x=100,y=200;
public static void main(String[] args) 
{	//Scenario 1
	InterfaceDemo idobj=new InterfaceDemo();
	idobj.circle();			//Abstract
	idobj.square();			//default
	Shape.rectangle();		//static method can be directly accessed from interface
	idobj.triangle();
	System.out.println(idobj.x+idobj.y);
	//Scenario 2
	// Shape sh=new Shape(); This is not possible this is instantiation, object creation process
//In interface object cannot be created but reference variable can be created
	Shape sh= new InterfaceDemo();//Variable of interface can hold the object of class which have implemented the class
//here object of the class we are storing into the interface it is possible as this class has implemented this interface
	sh.circle();	//abstract
	sh.square();	//default
	Shape.rectangle();   //static method can directly accessed from interface
	//sh.triangle(); we cannot access as triangle method actually belongs to this class and not of interface
	System.out.println(Shape.length*Shape.width);  //accessing static variables directly
	//System.out.println(sh.x+sh.y);  we cannot access

}
}
