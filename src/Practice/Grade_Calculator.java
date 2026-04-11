package Practice;
import java.util.Scanner;
public class Grade_Calculator
{	public static void main(String[] args) 
{	//Take marks as input and print the grade (A, B, C, D, Fail).
	Scanner sc=new Scanner(System.in);
	System.out.println("Total Marks are 100");
	System.out.println("Grade A is for Marks>85");
	System.out.println("Grade B is for 70<Marks=<85");
	System.out.println("Grade C is for 55<Marks<=70");
	System.out.println("Grade D is for 40=<Marks=<55");
	System.out.println("Fail if Marks<40");
	System.out.println("Enter the Marks :");
	int Marks=sc.nextInt();		//Marks---m1,m2.....
	if(Marks>=85)
	{
		System.out.println("Grade : A");
	} else if(Marks>70 && Marks<=85)
	{
		System.out.println("Grade : B");
	} else if(Marks>55 && Marks<=70)
	{
		System.out.println("Grade : C");
	} else if(Marks>=40 && Marks<=55)
	{
		System.out.println("Grade : D");
	} else if(Marks<40)
	{
		System.out.println("Fail");
	}
}

}
