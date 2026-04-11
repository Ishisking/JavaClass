package Day18;

public class MultipleCatchBlocks {
public static void main(String[] args) {
		System.out.println("Program has Started...");
		System.out.println("\n");
		String s=null;	
		
		try
		{
		System.out.println(s.length());		//NullPointerException
		}
/*		catch(ArithmeticException e)
		{
			System.out.println("Handled Exception......");
			System.out.println("Invalid Data");
		}
		catch(NullPointerException e)
		{
			System.out.println("Handled Exception......");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Handled Exception......");
			System.out.println(e.getMessage());
		}
*/		catch(Exception e)	//Exception is parent class of all other Exceptions
		{
			System.out.println("Handled Exception....");
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n");
		System.out.println("Program finished.......");
	
	}

}
