package Day6;

public class Assignment_SumofElements
{
public static void main(String[] args) 
{
	int a[]= {1,2,3,4,5};
	int sum=0;
	for(int i=0;i<=a.length;i++)
	{
		sum+=i;
	}
	System.out.println("Sum of Elements in an Array : "+sum);
}

}
