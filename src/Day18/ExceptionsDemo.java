package Day18;
import java.util.Scanner;
public class ExceptionsDemo {
public static void main(String[] args) {
	System.out.println("Program has Started...");
	Scanner sc=new Scanner(System.in);
	// Example 1
/*	System.out.println("Enter a Number :");
	int num=sc.nextInt();
	System.out.println(100/num);	//Arithmetic Exception
*/ //Example 2
	int a[]=new int[5];
	System.out.println("Enter the position(0-4):");
	int pos=sc.nextInt();
	System.out.println("Enter the value :");
	int value=sc.nextInt();
	a[pos]=value;						// pos=5  ArrayIndexOutofBoundsException
	System.out.println("a["+pos+"] : "+a[pos]);
	System.out.println("\n");
	//Example 3
	String s="12345";
	int n=Integer.parseInt(s);
	System.out.println(n);
	
/*	String t="welcome";		//NumberFormatException
	int o=Integer.parseInt(t);
	System.out.println(o);
*/	//Example 4
	String f="Welcome";
	System.out.println(f.length());
	System.out.println("Program is completed...");
	System.out.println("Program is exited...........");
	
	
	
}

}
