package Day3;

public class DecrementOperator {

	public static void main(String[] args) {
		//Case 1
		int a = 10;
			a--;			//a=a-1;
		System.out.println(a);  //9
		
	//Case 2
		int b = 20;
		int res = --b;				//pre Decreement Operator
		System.out.println(res);	//19
		
	
		//Case 3
		int c = 100;
		int ans = c--;			// post decreement Operator
		System.out.println(ans);	//100
		System.out.println(c);
		
	}

}
