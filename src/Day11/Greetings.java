package Day11;

public class Greetings 
{	 //(1) No Params  No Return Value
	void m1()
	{
		System.out.println("Hello...");
	}
	//(2)  No Parameters  but Returns Some Value
	String m2()
	{
		return ("Hello how are you");
	}
	// (3) Take Parameters  No Return Value
	void m3(String name)
	{
		System.out.println("Hello to java "+name);
	}
	//(4) Takes Parameters and Returns a Value
	String m4(String name)
	{
		return("Hello "+name);
		
	}
}
