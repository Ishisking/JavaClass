package Day3;

public class IncrementOperator {

	public static void main(String[] args) 
	{
		// ++ is called increment operator
		 int a = 10;
		System.out.println(a);		//10
		a++;   //a=a+1;
		System.out.println(a);		//11
			
		
		//Case2
			
		 int c = 50;
		int res = c++;            //Post Increment Operator
		System.out.println( res);  //50
		System.out.println(c);		//51
		
		
		//case 3
		
		int b = 20;				
		int ans=++b;				//Pre Increment Operator
		System.out.println(ans);	//21
				
	}

}
