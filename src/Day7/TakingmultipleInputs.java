package Day7;
import java.util.Scanner;
public class TakingmultipleInputs
{	public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
		//Example 1
	//Give Multiple Inputs
/*	System.out.println("Enter First Number :");
	int num1=sc.nextInt();
	System.out.println("Enter Second Number :");
	int num2=sc.nextInt();
	
	System.out.println("Addition of Two Numbers :"+(num1+num2));
*/	//Example 2
	//Give various data types as Input
	System.out.println("Enter House No :");
	int hno=sc.nextInt();
	// System.out.println("Your House Number is: " + hno);
     sc.nextLine(); // Consume newline left by nextInt()
	
     System.out.println("Enter your Name :");
	String name=sc.nextLine();	// Use nextLine() to allow spaces in the name
	//System.out.println("Your Name is : "+name);
	
	System.out.println("Enter Your Age :");
	int age=sc.nextInt();			
	//System.out.println("Your Age is : "+age);
	 sc.nextLine(); // Consume newline left by nextInt()
	
	System.out.println("Enter Landmark :");
	String landmark=sc.nextLine();
	//System.out.println("Landmark: " + landmark);

	System.out.println("Enter Disrict/City Name :");
	String city=sc.next();
	//System.out.println("District/City Name: " + city);
	  sc.nextLine(); // Consume newline left by nextInt()
	System.out.println("Enter Unknown value :");
	Object value=sc.nextLine();	// Use nextLine() to allow spaces in the name
	//System.out.println("unknown value : "+value);
	
	System.out.println("Your House Number is: " + hno);
	System.out.println("Your Name is : "+name);
	System.out.println("Your Age is : "+age);
	System.out.println("Landmark: " + landmark);
	System.out.println("District/City Name: " + city);
	System.out.println("unknown value : "+value);

    sc.close(); // Close the scanner to prevent resource leak
}

}
