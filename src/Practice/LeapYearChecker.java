package Practice;
import java.util.Scanner;
public class LeapYearChecker 
{
public static void main(String[] args) 
{	// Determine if a given year is a leap year.
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Year ");
	int year=sc.nextInt();
	if(year%4==0)
	{
		System.out.println("The given year "+year+ " is a Leap Year");
	} else {
		System.out.println("The given year "+year+ " is not a Leap Year");
	}
		sc.close();
	

}

}
