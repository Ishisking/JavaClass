package Day7;
import java.util.Scanner;
public class TakinginputatRuntime 
{	 public static void main(String[] args) 
{
	//int num=20; // hard coded value
	Scanner sc=new Scanner(System.in);
	//Input the number
	System.out.println("Enter a number :");
	int num=sc.nextInt();
	System.out.println("Given number is:"+num);
	
	System.out.println("Enter decimal number:");
	double dec=sc.nextDouble();
	System.out.println("Givem value is:"+dec);
	
	System.out.println("Enter your city:");
	String city=sc.next();
	System.out.println("Your City is :"+city);
	
	
}	
}
