package Day9;
import java.util.Scanner;
public class AssignmentCheckStringisPallindrome 
{

public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	//input the String
	System.out.println("Enter the String :");
	String s=sc.nextLine();	// Use nextLine() to allow spaces in the string
	
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}

	if(rev.equals(s))
	{
		System.out.println("String is Pallindrome : "+s);
	}	else
		System.out.println("String is not a Pallindrome");
}

}
