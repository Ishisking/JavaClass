package Day15;

public class Animal
{
	String color="white";
	void eat()
	{
		System.out.println("White Animal is Cow....");
	}
}

class Dog extends Animal
{
	String color="Black";
	void displayColor()
	{
		System.out.println(color);  //Black
		System.out.println(super.color);	//white
	}
	void eat()
	{
		System.out.println("Black Animal is Cat/Dog...");
		super.eat();
	}
	
	
}
