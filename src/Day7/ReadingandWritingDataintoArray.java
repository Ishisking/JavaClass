package Day7;
import java.util.Scanner;
import java.util.Arrays;
public class ReadingandWritingDataintoArray 
{

public static void main(String[] args) 
{
	int a[]=new int[5];
																			/*	a[0]=100;
																			    a[1]=200;
	
																				a[]= {100,200,300};	*/
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println("Enter a Number for the position "+i+":");
		 a[i]=sc.nextInt();
	}
																			/* for(int i=0;i<=a.length-1;i++)
																			{    System.out.println(a[i]);   } */
	System.out.println("Printing Array Elements....:");
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
}

}
