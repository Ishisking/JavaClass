package Day5;

public class WhileLoopDemo {

	public static void main(String[] args) 
	{
		//Example1: Print 1........10 numbers
	/*	int i=1;   //initialization
		while(i<=10)		//condition
		{
			System.out.println(i);
			i++;		//incrementation
		}	*/
		//Example 2: Print Hello message 10 times
	/*	int a=1;	//initialization
		while(a<=10)	//condition
		{
			System.out.println("Hello");
			a++;	//incrementation
		}	*/
		//Example 3: Print Even numbers between 1....10
	/*	int b=1, c;	//initialization
		while(b<=10)
		{
			c =( b%2 == 0?0:1);
			if(c==0)		//if(b%2==0)
			{
			System.out.println(+b);
			}	
			b++;  } */
	/*	int d=2;
		while(d<=10)
		{
			System.out.println(+d);
			d+=2;		//d=d+2;
		}   */
		//Example4: 1......10 1-Odd, 2--Even
/* 		int e=1;
		while(e<=10)
		{
			if(e%2==0)
			{
			System.out.println(e+" Even");
			} else
				System.out.println(e+" Odd");
			e++;
		}		*/
		//Example5 :Print 10........1
		int f=10;
		while(f>0)
		{
			System.out.println(+f);
			f--;
		}
		
	}

}
