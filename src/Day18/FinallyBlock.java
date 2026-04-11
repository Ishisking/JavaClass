package Day18;

public class FinallyBlock {
public static void main(String[] args) {
	String s="welcome";
	try
	{
		System.out.println(s.length());
	}
	catch(NumberFormatException e)
	{
		System.out.println("Catch Block Handled exception...");
		System.out.println(e.getMessage());
	}
/*	catch(NullPointerException e)
	{
		System.out.println("Catch Block Handled exception..."); //String s="null";
		System.out.println(e.getMessage());
	}  */ /*catch(Exception e)
	{
		System.out.println("Handled exception...");				String s="null";
		System.out.println(e.getMessage());
	} */
	finally
	{
		System.out.println("You entered into finally block");
	}
	
	System.out.println("Program has Finished...");

	}

}
