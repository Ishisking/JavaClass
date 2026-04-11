package Day4;
/*
 a>b and a>c ---a is largest
b>c and b>a ---- b is largest
c>a and c>b ---- c is largest
 */
public class FindingLargestNumber {

	public static void main(String[] args) 
	{
	int a=100, b=200, c=300;
		if(a>b && a>c)
		{
			System.out.println("a is Largest Number: "+a);
		}  else if(b>a && b>c)
		{
			System.out.println("b is Largest Number: "+b);
		}	else								// if (c>a && c>b)
		{
			System.out.println("c is Largest Number: "+c);
		}
		
	}

}
